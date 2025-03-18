package com.mhx.todolist.ui.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.mhx.todolist.ui.theme.staticColumn

@Composable
fun HomeContent(modifier: Modifier = Modifier) {

    Column(modifier = modifier.staticColumn()) {
        Row(verticalAlignment = Alignment.Bottom , horizontalArrangement = Arrangement.End) {
            AddToDoButton()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    HomeContent(modifier = Modifier)
}