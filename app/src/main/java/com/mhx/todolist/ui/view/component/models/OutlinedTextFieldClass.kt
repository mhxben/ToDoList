package com.mhx.todolist.ui.view.component.models

import androidx.compose.ui.text.input.KeyboardType

data class OutlinedTextFieldClass (
    val label: String,
    var value: String,
    val onValueChange: (String) -> Unit,
    val keyboardType: KeyboardType = KeyboardType.Text

)