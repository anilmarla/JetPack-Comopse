package com.example.jetpackcomosecourse.`9_AlertDailodBox`

import android.media.tv.AdRequest
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import com.example.jetpackcomosecourse.R

@Composable
fun DialogWithImage(
    /* onDismissRequest: () -> Unit,
     onConfirmation: () -> Unit,
     painter: Painter*/
)
{
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){}
    val context = LocalContext.current
    Dialog(onDismissRequest = {

    }
    )
    {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(350.dp)
                .padding(16.dp),
            shape = RoundedCornerShape(16.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.mario),
                contentDescription = "Dailog Image ",
                contentScale = ContentScale.Fit,
                modifier = Modifier.height(150.dp)
            )
            Text("This is Alert Dailog", modifier = Modifier.padding(16.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                TextButton(
                    onClick = {
                        Toast.makeText(
                            context, "you can do anything by clicking on the button",
                            Toast.LENGTH_SHORT
                        ).show()
                    },
                    modifier = Modifier.padding(8.dp)

                ) {
                    Text("Confirm")
                }

                TextButton(
                    onClick = {
                        Toast.makeText(
                            context, "you can do anything by clicking on the button",
                            Toast.LENGTH_SHORT
                        ).show()
                    },
                    modifier = Modifier.padding(8.dp)

                ) {
                    Text("Cancel")
                }
            }


        }

    }

}

@Preview(showSystemUi = true)
@Composable
fun PreviewDailog() {
    DialogWithImage()
}






