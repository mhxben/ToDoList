package com.mhx.todolist.ui.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.mhx.todolist.R
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppBar() {
    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = colorResource(id = R.color.teal_200),
                    titleContentColor = MaterialTheme.colorScheme.primary
                ),
                title = {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Text(
                            "ToDo List",
                            fontSize = 22.sp,
                            color = colorResource(id = R.color.black)
                        )
                    }
                }
            )
        }
    ) { paddingValues ->
        HomeContent(modifier = Modifier.padding(paddingValues))
    }
}