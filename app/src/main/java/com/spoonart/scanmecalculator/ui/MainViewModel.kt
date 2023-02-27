package com.spoonart.scanmecalculator.ui

import android.content.Context
import android.net.Uri
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.spoonart.scanmecalculator.data.ProblemRepository
import com.spoonart.scanmecalculator.data.entity.ProblemEntity
import com.spoonart.scanmecalculator.data.model.ErrorData
import com.spoonart.scanmecalculator.data.model.ItemDisplayData
import com.spoonart.scanmecalculator.data.model.ItemFileData
import com.spoonart.scanmecalculator.protector.decrypt
import com.spoonart.scanmecalculator.protector.encrypt
import com.spoonart.scanmecalculator.utility.TextAnalyzer
import com.spoonart.scanmecalculator.utility.TextParserUtils
import com.spoonart.scanmecalculator.utility.toFile
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.channels.BufferOverflow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import java.io.File
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repository: ProblemRepository,
    private val textAnalyzer: TextAnalyzer,
    private val textParserUtils: TextParserUtils,
) : ViewModel() {

    private val itemDisplayDataList = mutableListOf<ItemDisplayData>()
    private val _errorState = MutableSharedFlow<ErrorData?>(
        replay = 1,
        onBufferOverflow = BufferOverflow.DROP_OLDEST
    )
    private val _resultState = MutableStateFlow<List<ItemDisplayData>?>(null)
    private val _databaseResult = MutableStateFlow<List<ItemFileData>?>(null)

    val resultState = _resultState.asStateFlow()
    val errorState = _errorState.asSharedFlow()
    val databaseResult = _databaseResult.asStateFlow()

    fun loadProblemsFromDatabase() {
        viewModelScope.launch {
            repository.getData().collect {
                val itemFileDataList = it.map { entity ->
                    ItemFileData(
                        fileName = entity.fileName.decrypt(),
                        path = entity.pathFromUri.decrypt()
                    )
                }
                _databaseResult.tryEmit(itemFileDataList)
            }
        }
    }

    fun loadAndScanImage(context: Context, uri: Uri) {
        scanImage(context, uri, false)
    }

    fun scanImage(context: Context, uri: Uri, autoSave: Boolean = true) {
        viewModelScope.launch(Dispatchers.IO) {
            _resultState.value = null
            textAnalyzer.analyzeImage(
                context = context,
                fromFile = uri,
                onSuccess = { source ->
                    calculate(source)
                    if (autoSave) {
                        val fileCopy = uri.toFile(context)
                        save(fileCopy)
                    }
                },
                onFailure = {
                    _errorState.tryEmit(ErrorData.create(it))
                }
            )
        }
    }

    private fun calculate(source: String) {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val result = textParserUtils.calculate(source)
                itemDisplayDataList.add(ItemDisplayData(input = source, result = result))
                _resultState.value = itemDisplayDataList
            } catch (e: Exception) {
                val message = "Error: ${e.localizedMessage ?: "unknown error"}"
                _errorState.tryEmit(ErrorData.create(message))

                //emit the latest data to display
                _resultState.value = itemDisplayDataList
            }
        }
    }

    private fun save(file: File) {
        viewModelScope.launch {
            val entity = ProblemEntity(
                fileName = file.name.encrypt(),
                pathFromUri = file.path.encrypt()
            )
            repository.saveData(entity).collect()
        }
    }

}
