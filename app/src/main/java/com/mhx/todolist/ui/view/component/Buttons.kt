package com.mhx.todolist.ui.view.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.mhx.todolist.R

@Composable
fun AppButton(text: String, onClick:()->Unit ,shape: RoundedCornerShape = RoundedCornerShape(8.dp)) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.teal_200)),
        modifier = Modifier.fillMaxWidth(),
        shape = shape
    ){
        PrimaryText(text , color = colorResource(id = R.color.black))
    }
}