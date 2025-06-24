package com.example.jetpackcomosecourse.`8_InputChips`

import android.graphics.drawable.Icon
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview

/*@Composable
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

}*/

@Composable
fun InputChipExample(
    text: String,
    onDismiss: () -> Unit,
) {
    var enabled by remember { mutableStateOf(true) }
    if (!enabled) return

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        InputChip(
            onClick = {
                onDismiss()
                enabled = !enabled
            },
            label = { Text(text) },
            selected = enabled,
            avatar = {
                Icon(
                    Icons.Filled.Person,
                    contentDescription = "Localized description",
                    Modifier.size(InputChipDefaults.AvatarSize)
                )
            },
            trailingIcon = {
                Icon(
                    Icons.Default.Close,
                    contentDescription = "Localized description",
                    Modifier.size(InputChipDefaults.AvatarSize)
                )
            },
        )
    }

}

@Preview(showSystemUi = true)
@Composable
fun PreveiwInputChip() {
    InputChipExample("Input Chip") { }
}



