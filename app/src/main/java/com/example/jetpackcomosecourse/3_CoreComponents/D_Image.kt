package com.example.jetpackcomosecourse

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable

fun ImageShow() {

    val rainbowColors = Brush.sweepGradient(
        listOf(
            Color.Blue,
            Color.Red,
            Color.Green,
            Color.Yellow,
            Color.Magenta
        )

    )
    val borderWidhth = 8.dp
    Image(
        painter = painterResource(R.drawable.mario),
        contentDescription = "This is mario",
        contentScale = ContentScale.Crop,
//Circle shape--> Modifier.clip(CircleShape)
        modifier = Modifier
            .size(300.dp)
            .border(BorderStroke(borderWidhth, rainbowColors)),
        alignment =
            Alignment.Center

    )

}


@Preview(showSystemUi = true)
@Composable
fun ImagePreview() {
    ImageShow()
}