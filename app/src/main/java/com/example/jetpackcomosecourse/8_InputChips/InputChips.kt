package com.example.jetpackcomosecourse

import android.graphics.drawable.Icon
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.InputChip
import androidx.compose.material3.InputChipDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun InputChipExamples() {
    var enable: Boolean by remember {
        mutableStateOf(true)
    }
    if (!enable) {
        InputChip(
            onClick = {
                enable = !enable
            },
            label = {
                Text("Enabled")
            },
            selected = enable,
            avatar = Icon(
                Icons.Filled.Person,
                contentDescription = "Localized Description ",
                modifier = Modifier.size(
                    InputChipDefaults.AvatarSize
                )
            ), trailingIcon = Icon(
                Icons.Filled.Close,
                contentDescription = "Localized Description ",
                modifier = Modifier.size(
                    InputChipDefaults.AvatarSize
                )

            )
    }

}

