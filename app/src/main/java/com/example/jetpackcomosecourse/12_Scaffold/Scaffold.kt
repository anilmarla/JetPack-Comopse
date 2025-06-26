package com.example.jetpackcomosecourse

import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable

fun ScaffoldExample(){
    var presses by remember {
        mutableStateOf(value = 0)
    }

    Scaffold(
        topBar = {
            TopAppBar(colors = )
        }
    ) { innerPadding ->

    }
}