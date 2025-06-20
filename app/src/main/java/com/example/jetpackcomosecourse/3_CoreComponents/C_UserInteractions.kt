package com.example.jetpackcomosecourse

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextLinkStyles
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withLink
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun PartialComposableText() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        SelectionContainer {
            Column {
                Text(text = "This is a text")
                Text("This is one too ")
                Text("This is three")
                DisableSelection {
                    Text("But not this one ")
                    Text("this is not selectable text ")
                }
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun previewSelectable() {
    PartialComposableText()
}

@Composable
fun AnnotatedStringWithListenerSimple() {

    val urlHandler = LocalUriHandler.current

    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
        Text(
            buildAnnotatedString {
                append("Build better apps faster than")
                val link = LinkAnnotation.Url(
                    "https://m3.material.io/blog/material-3-compose-stable",
                    TextLinkStyles(
                        SpanStyle(color = Color.Blue)
                    )
                ){
                    val uri = (it as LinkAnnotation.Url).url
                    urlHandler.openUri(uri)
                }
                withLink(link){
                    append("Material Design ")
                }
            }
        )
    }



}

@Preview(showSystemUi = true)
@Composable
fun previewAnnotated(){
    AnnotatedStringWithListenerSimple()
}

