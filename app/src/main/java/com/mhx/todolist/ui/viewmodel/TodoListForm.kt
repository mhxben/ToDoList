package com.mhx.todolist.ui.viewmodel

import android.content.Context
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.mhx.todolist.model.todo
import com.mhx.todolist.model.utils.ValidationOfTodo

class TodoListForm : ViewModel() {

    var todo by mutableStateOf(todo("","",""))

    var showDialog by mutableStateOf(false)

    fun onSubmit(context : Context){
        if (ValidationOfTodo.validatiomTodoFields(context,todo.todo_name,todo.todo_date,todo.todo_date)){
            showDialog = true
        }
    }

    fun onDialogDismiss() {
        showDialog = false
    }
}