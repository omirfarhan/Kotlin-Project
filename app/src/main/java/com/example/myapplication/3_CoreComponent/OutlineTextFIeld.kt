package com.example.myapplication.`3_CoreComponent`

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Label
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun simpleoutlinetext(){

    var text = remember {
        mutableStateOf("")

    }

    val colorrgb=listOf(

        Color.Cyan,
        Color.Blue,
        Color.Yellow,
        Color.Red

    )



    var brusha=remember {

        Brush.linearGradient(
            colors = colorrgb
        )

    }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
        ){

        TextField(

            value = text.value,
            onValueChange = {
                text.value=it
            },
            label = {
                Text("Enter Password")
            },


            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password
            )


        )

    }

}

@Preview(showSystemUi = true)
@Composable
fun uicompose(){
    simpleoutlinetext()
}

