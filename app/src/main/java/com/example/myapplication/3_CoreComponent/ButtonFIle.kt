package com.example.myapplication.`3_CoreComponent`

import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun filledbutton(){

    val context= LocalContext.current

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center

    ){
        FilledTonalButton(
            onClick = {

                Toast.makeText(context,"THis is button", Toast.LENGTH_LONG).show()

            }
        ) {

            Text("Tonal button")
        }
    }



}

@Composable
@Preview(showSystemUi = true)
fun display(){
    filledbutton()
}

