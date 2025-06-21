package com.example.jetpackcomosecourse.`7_CheckBox`

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.material3.TriStateCheckbox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.util.fastForEachIndexed

/*
@Composable
fun CheckBox() {
    var childCheckSatates = remember {
        mutableListOf(false, false, false)
    }

    var parentCheckstate = when {
        childCheckSatates.all { it } -> ToggleableState.On
        childCheckSatates.none() -> ToggleableState.Off
        else -> ToggleableState.Indeterminate
    }

    Column {
        Row(verticalAlignment = Alignment.CenterVertically) {

            Text("Select All Check Box ")
            TriStateCheckbox(
                state = parentCheckstate ,
                onClick = {
                    val newState = parentCheckstate != ToggleableState.On
                    childCheckSatates.fastForEachIndexed { index->
                        childCheckSatates[index] = newState
                    }
                }
            )

        }
        childCheckSatates.forEachIndexed { index, Checked ->

            Row (verticalAlignment = Alignment.CenterVertically){

                Text("Option ${index+1} "){
                    CheckBox(){

                    }
                }

            }
        }
    }
}*/

@Composable
fun CheckboxParentExample() {
    // Initialize states for the child checkboxes
    val childCheckedStates = remember { mutableStateListOf(false, false, false) }

    // Compute the parent state based on children's states
    val parentState = when {
        childCheckedStates.all { it } -> ToggleableState.On
        childCheckedStates.none { it } -> ToggleableState.Off
        else -> ToggleableState.Indeterminate
    }

    Column {
        // Parent TriStateCheckbox
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text("Select all")
            TriStateCheckbox(
                state = parentState,
                onClick = {
                    // Determine new state based on current state
                    val newState = parentState != ToggleableState.On
                    childCheckedStates.forEachIndexed { index, _ ->
                        childCheckedStates[index] = newState
                    }
                }
            )
        }

        // Child Checkboxes
        childCheckedStates.forEachIndexed { index, checked ->
            Row(
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text("Option ${index + 1}")
                Checkbox(
                    checked = checked,
                    onCheckedChange = { isChecked ->
                        // Update the individual child state
                        childCheckedStates[index] = isChecked
                    }
                )
            }
        }
    }

    if (childCheckedStates.all { it }) {
        Text("All options selected")
    }
}

@Preview(showSystemUi = true)
@Composable
fun previewChecBox() {
    CheckboxParentExample()
}


