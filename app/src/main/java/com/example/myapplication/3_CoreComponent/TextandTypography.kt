package com.example.myapplication.`3_CoreComponent`



import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp





@Composable
fun textstyle(){

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Text(text = "Al-Baqara - 116",
           fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Normal,
            color = Color.Blue,
            fontSize = 19.sp,

            style = TextStyle(
                shadow = Shadow(Color.Cyan, blurRadius = 3f)
            )


        )

    }

}

@Preview(showSystemUi = true)
@Composable
fun showDisplay(){
    textstyle()
}
