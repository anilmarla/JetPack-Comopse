package com.example.jetpackcomosecourse

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.outlined.AccountBox
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun DropDownMenu() {

    /* var expanded by remember {
         mutableStateOf(false)
     }
     Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.TopEnd) {
         Box(
             modifier = Modifier
                 .padding(16.dp), contentAlignment = Alignment.TopEnd
         ) {
             IconButton(onClick = { expanded = !expanded }) {
                 Icon(Icons.Default.MoreVert, "This is 3 dot")
             }
             DropdownMenu(expanded = expanded, onDismissRequest = { expanded = false }) {
                 DropdownMenuItem(
                     text = { Text("Profile") },
                     trailingIcon = { Icon(Icons.Outlined.Person, contentDescription = "Profile") },
                     onClick = {
                         //Do some actions to click
                     }
                 )
             }
             DropdownMenu(expanded = expanded, onDismissRequest = { expanded = false }) {
                 DropdownMenuItem(
                     text = { Text("Setting") },
                     trailingIcon = {
                         Icon(
                             Icons.Outlined.Settings,
                             contentDescription = "Settings"
                         )
                     },
                     onClick = {
                         //Do some actions to click
                     }
                 )
             }
             HorizontalDivider()
             DropdownMenu(expanded = expanded, onDismissRequest = { expanded = false }) {
                 DropdownMenuItem(
                     text = { Text("About") },
                     trailingIcon = {
                         Icon(
                             Icons.Outlined.AccountBox,
                             contentDescription = "Account"
                         )
                     },
                     onClick = {
                         //Do some actions to click
                     }
                 )
             }
         }
     }


 }*/
}

@Composable
fun MinimalDropdownMenu() {
    var expanded by remember { mutableStateOf(false) }
    Box(
        modifier = Modifier
            .padding(16.dp).fillMaxWidth(),
        contentAlignment = Alignment.TopEnd
    ) {
        IconButton(onClick = { expanded = !expanded }) {
            Icon(Icons.Default.MoreVert, contentDescription = "More options")
        }
        Box(
            modifier = Modifier
                .padding(16.dp).fillMaxWidth(),
            contentAlignment = Alignment.TopEnd
        ){
            DropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false }
            ) {
                DropdownMenuItem(
                    text = { Text("Option 1") },
                    onClick = { /* Do something... */ }
                )
                DropdownMenuItem(
                    text = { Text("Option 2") },
                    onClick = { /* Do something... */ }
                )
            }
        }

    }
}

@Preview(showSystemUi = true)
@Composable
fun PreviewMenus() {
    MinimalDropdownMenu()
}