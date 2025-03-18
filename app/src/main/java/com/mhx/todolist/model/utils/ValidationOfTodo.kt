package com.mhx.todolist.model.utils

import android.content.Context
import android.widget.Toast

object ValidationOfTodo {

    fun validatiomTodoFields(context: Context,
                             name : String,
                             date : String,
                             time : String) : Boolean{
        return when {
            name.isBlank() -> {
                showToast(context, "Please enter your TODO name")
                false
            }
            !DateTimeUtils.isValidDate(date) -> {
                showToast(context, "Invalid date! Use format: dd/MM/yyyy")
                false
            }
            !DateTimeUtils.isValidTime(time) -> {
                showToast(context, "Invalid time! Use format: HH:mm")
                false
            }

            else -> true
        }

    }

    private fun showToast(context: Context , message : String){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}