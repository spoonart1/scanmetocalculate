package com.spoonart.scanmecalculator.ui

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.viewmodel.compose.viewModel
import com.spoonart.scanmecalculator.ui.screen.Loading
import com.spoonart.scanmecalculator.ui.screen.dbviewer.DatabaseViewer
import com.spoonart.scanmecalculator.ui.screen.home.HomeDisplay
import com.spoonart.scanmecalculator.ui.screen.launchImagePicker
import com.spoonart.scanmecalculator.ui.theme.ScanMeCalculatorTheme
import com.spoonart.scanmecalculator.utility.AskPermission
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            val viewModel = viewModel<MainViewModel>()
            ScanMeCalculatorTheme {
                // A surface container using the 'background' color from the theme
                AskPermission()
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                    val error by viewModel.errorState.collectAsState(null)
                    val data by viewModel.resultState.collectAsState(null)
                    var showLoading by remember { mutableStateOf(false) }

                    val context = LocalContext.current
                    val launcher = launchImagePicker(onPicked = { imageData ->
                        imageData?.let { imageUri ->
                            showLoading = true
                            viewModel.scanImage(context, imageUri)
                        }
                    })

                    if (error != null) {
                        Toast.makeText(context, error?.message, Toast.LENGTH_SHORT).show()
                        showLoading = false
                    }

                    if (data != null) {
                        showLoading = false
                    }

                    if (showLoading) {
                        Loading()
                    }

                    var shouldOpenDBViewer by remember { mutableStateOf(false) }
                    HomeDisplay(
                        collections = data ?: listOf(),
                        onPickImage = {
                            launcher.launch("image/*")
                            shouldOpenDBViewer = false
                        },
                        onOpenDatabase = {
                            shouldOpenDBViewer = true
                        }
                    )

                    if (shouldOpenDBViewer) {
                        DatabaseViewer(
                            viewModel = viewModel,
                            onLoaded = {
                                shouldOpenDBViewer = false
                            }, onBack = {
                                shouldOpenDBViewer = false
                            }
                        )
                    }
                }
            }
        }
    }
}
