package com.example.myapplication.`4LayoutComposable`

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
fun modifiers(){


    Box(
        modifier = Modifier.size(200.dp).background(Color.Blue),
        contentAlignment = Alignment.Center
    ) {

        Text("this is text1",
            modifier = Modifier.background(color = Color.Yellow),
            )

    }
}

@Preview(showSystemUi = true)
@Composable
fun showdisplaysass(){
    modifiers()
}

