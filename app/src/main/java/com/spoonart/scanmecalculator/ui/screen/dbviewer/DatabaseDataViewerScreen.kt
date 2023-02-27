package com.spoonart.scanmecalculator.ui.screen.dbviewer

import androidx.activity.compose.BackHandler
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.ExperimentalUnitApi
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import androidx.core.net.toUri
import com.spoonart.scanmecalculator.data.model.ItemFileData
import com.spoonart.scanmecalculator.ui.MainViewModel
import com.spoonart.scanmecalculator.ui.screen.Loading
import com.spoonart.scanmecalculator.ui.theme.ScanMeCalculatorTheme
import java.io.File


@Composable
fun DatabaseViewer(
    viewModel: MainViewModel,
    onLoaded: () -> Unit,
    onBack: () -> Unit,
) {
    BackHandler(onBack = onBack)
    val context = LocalContext.current
    ScanMeCalculatorTheme {
        Scaffold(
            modifier = Modifier.animateContentSize()
        ) {
            val dbResults by viewModel.databaseResult.collectAsState()
            dbResults?.let { list ->
                LazyColumn(content = {
                    items(list) { fileData ->
                        ItemFileDataView(itemFileData = fileData) { clickedData ->
                            val file = File(clickedData.path)
                            viewModel.loadAndScanImage(context, file.toUri())
                            onLoaded()
                        }
                    }
                })
            }
            if (dbResults == null) {
                Loading()
            }
            viewModel.loadProblemsFromDatabase()
        }
    }
}

@OptIn(ExperimentalUnitApi::class)
@Composable
private fun ItemFileDataView(
    itemFileData: ItemFileData,
    onClick: (ItemFileData) -> Unit,
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .border(1.dp, Color.LightGray)
            .clickable {
                onClick(itemFileData)
            }
    ) {
        Text(text = itemFileData.fileName, fontSize = TextUnit(16f, TextUnitType.Sp))
        Text(text = itemFileData.path, fontSize = TextUnit(10f, TextUnitType.Sp))
    }
}
