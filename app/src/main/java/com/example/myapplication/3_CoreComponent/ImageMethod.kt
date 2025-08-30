package com.example.myapplication.`3_CoreComponent`


import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ColorMatrix
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.R

@Composable

fun Imageshow() {


    val rainbowcolor= remember{

        Brush.sweepGradient(
            listOf(
                Color.Cyan,
                Color.Red,
                Color.Blue,
                Color.Magenta
            )
        )

    }

    Image(
        painter = painterResource(id= R.drawable.islam), contentDescription = "This is image",
        contentScale = ContentScale.Crop,
        modifier = Modifier.size(250.dp)
            .border(BorderStroke(4.dp, rainbowcolor))
            .clip(CircleShape),
        alignment = Alignment.Center,
        colorFilter = ColorFilter.colorMatrix(ColorMatrix().apply {
            setToSaturation(10f)
        })
    )
}

@Preview(showSystemUi = true)
@Composable
fun displays(){
    Imageshow()
}




