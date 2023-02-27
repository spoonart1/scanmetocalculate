package com.spoonart.scanmecalculator.ui.screen.home

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Button
import androidx.compose.material.Divider
import androidx.compose.material.RadioButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringArrayResource
import androidx.compose.ui.unit.dp
import com.spoonart.scanmecalculator.R
import com.spoonart.scanmecalculator.data.model.ItemDisplayData

@Composable
fun HomeDisplay(
    collections: List<ItemDisplayData>,
    onPickImage: () -> Unit,
    onOpenDatabase: (() -> Unit)? = null,
) {
    var selected by rememberSaveable { mutableStateOf(0) }
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        LazyColumn(
            modifier = Modifier
                .padding(horizontal = 24.dp, vertical = 24.dp)
                .weight(1f),
            content = {
                items(collections) {
                    ItemDisplay(data = it)
                }
            })
        ButtonAction {
            if (selected == 0) {
                onPickImage()
            } else {
                onOpenDatabase?.invoke()
            }
        }
        InputOptionButton {
            selected = it
        }
    }
}

@Composable
private fun ItemDisplay(data: ItemDisplayData) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .border(
                width = 2.dp,
                color = Color.Black
            )
    ) {
        Column(
            modifier = Modifier.padding(8.dp)
        ) {
            Text(text = "Input \t\t: ${data.input}")
            Spacer(modifier = Modifier.height(2.dp))
            Text(text = "Result \t: ${data.result}")
        }
    }
}

@Composable
private fun ButtonAction(
    onClick: () -> Unit,
) {
    Box(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
    ) {
        Button(
            modifier = Modifier.align(Alignment.CenterEnd),
            onClick = onClick
        ) {
            Text(text = "Add Input")
        }
    }
}

@Composable
private fun InputOptionButton(
    selectedOption: (Int) -> Unit,
) {
    Column(
        modifier = Modifier
            .padding(8.dp)
            .border(
                width = 2.dp,
                color = Color.Black
            )
    ) {
        var selected by remember { mutableStateOf(0) }
        val options = stringArrayResource(id = R.array.input_options)
        options.forEachIndexed { i, value ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable {
                        selected = i
                        selectedOption(selected)
                    },
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = value,
                    modifier = Modifier
                        .weight(1f)
                        .padding(horizontal = 8.dp)
                        .fillMaxWidth()
                )
                RadioButton(
                    selected = selected == i,
                    onClick = {
                        selected = i
                        selectedOption(selected)
                    })
            }
            Divider(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(1.dp)
            )
        }
    }
}
