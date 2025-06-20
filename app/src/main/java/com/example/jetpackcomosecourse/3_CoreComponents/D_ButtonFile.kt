package com.example.jetpackcomosecourse

import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview

//1.Filled Button
@Composable
fun FilledButtonWithSample() {
    val context = LocalContext.current

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Button(onClick = {
            Toast.makeText(context, "THis is a filled button clicked ", Toast.LENGTH_SHORT).show()
        }) {
            Text("Filled Button")
        }
        FilledTonalButton()
        OutlinedButton()
        ElecatedButton()
    }

}

//2.Tonal Button
@Composable
fun FilledTonalButton() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        androidx.compose.material3.FilledTonalButton(onClick = {
            //  Toast.makeText(LocalContext.current, "THis is a filled button clicked ", Toast.LENGTH_SHORT).show()


        }) {
            Text("Toned Button")

        }
    }
}

//3.Elevated Button
@Composable
fun ElecatedButton() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        ElevatedButton(onClick = {}) {
            Text("This is Elelvated Button ")

        }
    }
}


//3.Outlined Button
@Composable
fun OutlinedButton() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        ElevatedButton(onClick = {}) {
            Text("This is Outlined Button ")

        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun previewButton() {
    FilledButtonWithSample()
}