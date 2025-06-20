package com.example.jetpackcomosecourse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.jetpackcomosecourse.`2_FundamentalConcepts`.AccessingStringResources
import com.example.jetpackcomosecourse.ui.theme.JetPackComoseCourseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetPackComoseCourseTheme {

                FilledButtonWithSample()
            }
        }
    }
}



