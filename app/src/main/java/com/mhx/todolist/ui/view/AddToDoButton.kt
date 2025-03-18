package com.mhx.todolist.ui.view

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.AlertDialog
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.mhx.todolist.R
import com.mhx.todolist.ui.view.component.PrimaryText

@Composable
fun AddToDoButton() {
    var showTodoForm by remember { mutableStateOf(false) }

    Box(modifier = Modifier.clip(CircleShape)
        .clickable {}
        .background(colorResource(id = R.color.teal_200))
        .size(56.dp),
        contentAlignment = Alignment.Center) {
        PrimaryText("+" , colorResource(id = R.color.black))
    }

    if(showTodoForm){
        AlertDialog(
            onDismissRequest = { showTodoForm = false },
            title = { PrimaryText("Create a New Todo" , colorResource(id = R.color.black))  },
            text = { TodoForm() },
            confirmButton = { /*todo*/ }
        )
    }
}