package com.mhx.todolist.ui.view.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mhx.todolist.R

@Composable
fun AddNewToDo() {

}

@Composable
fun AddNewToDoButton() {
    Box(
        modifier = Modifier
            .size(56.dp)
            .clickable {  }
            .clip(CircleShape)
            .background(colorResource(id = R.color.teal_200))
        , contentAlignment = Alignment.Center
    ) {
        PrimaryText("+", colorResource(id = R.color.white))
    }
}

@Preview
@Composable
fun AddNewToDoButtonPreview() {
    AddNewToDoButton()
}