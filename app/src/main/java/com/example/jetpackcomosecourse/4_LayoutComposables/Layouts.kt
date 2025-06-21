package com.example.jetpackcomosecourse

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

//1.Column --  It allows you to place its children in Vertically arrange

@Composable
fun ColumnExample() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Red)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("This is text1")
        Text("This is text2")
        Text("This is text3")
        Text("This is text4")
        Text("This is text5")
    }
}

//2.Row -  It allows you to place its children in Horizentally arrange
@Composable
fun RowExample() {
    Row(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Gray)
            .padding(16.dp),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically

    ) {
        Text("text1")
        Text("text2")
        Text("text3")
        Text("text4")
        Text("text5")
    }
}

//Box --

@Composable
fun BoxExample() {
    Box(
        modifier = Modifier
            .size(200.dp)
            .background(Color.Green),
        contentAlignment = Alignment.Center

    ) {
        Box(
            modifier = Modifier
                .size(150.dp)
                .background(Color.Yellow),
            contentAlignment = Alignment.Center
        ) {
            Text("text1")
            Text("text2")
            Text("text3")
            Text("text4")
            Text("text5")
        }
    }


}

//4. Constrint Layout -- Use only needed when the UI is complexed

@Composable
fun ConstraintLayoutExample() {
    Box() {
        ConstraintLayout(
            modifier = Modifier
                .fillMaxWidth()
                .height(500.dp)
                .background(Color.Magenta),


            ) {

            val (text1, text2, text3) = createRefs()

            Text("Bottom Left", modifier = Modifier.constrainAs(text1) {
                bottom.linkTo(parent.bottom, margin = 8.dp)
                start.linkTo(parent.start, margin = 8.dp)
            })

            Text("Center Left", modifier = Modifier.constrainAs(text2) {
                top.linkTo(parent.top)
                bottom.linkTo(parent.bottom)
                start.linkTo(parent.start)

            })

            Text("Center right", modifier = Modifier.constrainAs(text3) {
                top.linkTo(parent.top)
                bottom.linkTo(parent.bottom)
                end.linkTo(parent.end)
            })

            Text("Botttom Right", modifier = Modifier.constrainAs(text3) {
                bottom.linkTo(parent.bottom)
                end.linkTo(parent.end)
            })
        }

    }
}


@Preview(showSystemUi = true)
@Composable
fun previewColumn() {
    ConstraintLayoutExample()
}


//Best Practices
//1. Over Nesting