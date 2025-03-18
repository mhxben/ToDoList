package com.mhx.todolist.ui.view

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import com.mhx.todolist.ui.theme.staticColumn
import com.mhx.todolist.ui.view.component.MainOutlinedTextField
import com.mhx.todolist.ui.view.component.models.OutlinedTextFieldClass
import com.mhx.todolist.ui.viewmodel.TodoListForm
import androidx.lifecycle.viewmodel.compose.viewModel
import com.mhx.todolist.R
import com.mhx.todolist.ui.theme.SpacerColumn
import com.mhx.todolist.ui.view.component.AppButton
import com.mhx.todolist.ui.view.component.PrimaryText

@Composable
fun TodoForm(viewModel : TodoListForm = viewModel()){

    val context = LocalContext.current

    Column(modifier = Modifier.staticColumn()){

        PrimaryText("Create a new Todo", colorResource(id = R.color.black))

        SpacerColumn()

        MainOutlinedTextField(
            params = OutlinedTextFieldClass(
                label = "TODO List Title",
                value = viewModel.todo.todo_name,
                onValueChange = { viewModel.todo = viewModel.todo.copy(todo_name = it) }
            )
        )

        SpacerColumn()
        MainOutlinedTextField(
            params = OutlinedTextFieldClass(
                label = "TODO List Date",
                value = viewModel.todo.todo_date,
                onValueChange = { viewModel.todo = viewModel.todo.copy(todo_date = it) }
            )
        )

        SpacerColumn()
        MainOutlinedTextField(
            params = OutlinedTextFieldClass(
                label = "TODO List Time",
                value = viewModel.todo.todo_time,
                onValueChange = { viewModel.todo = viewModel.todo.copy(todo_time = it) }
            )
        )

        SpacerColumn()

        AppButton(
            "Create", onClick = {viewModel.onSubmit(context)}
        )

        SpacerColumn()

        AppButton(
            "Cancel", onClick = {viewModel.onDialogDismiss()}
        )
    }
}