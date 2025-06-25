package com.example.jetpackcomosecourse

import android.R.attr.onClick
import android.text.Layout
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ExtendenableFloatingActionButton() {

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {

        ExtendedFloatingActionButton(
            onClick = {},
            content = {
                Text("This is floating Action Button")
            }
        )
    }
}

@Preview(showSystemUi = true)
@Composable
fun PreviewExtendbaleFAB() {

    ExtendenableFloatingActionButton()
}