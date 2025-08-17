package com.example.myapplication.`3_CoreComponent`



import androidx.compose.foundation.basicMarquee
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
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



@Composable
fun textColor(){
    val rainbowcolor=listOf(

        Color.Cyan,
        Color.Blue,
        Color.Yellow
    )

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Text(text = buildAnnotatedString

        {

            append("Do not allow")

            withStyle(SpanStyle(

                brush = Brush.linearGradient(
                    colors = rainbowcolor

                )
            )
            ){
                append("\nBecause they are bliend")
            }
            append("\n tell them to put")

        }
        , fontSize = 21.sp
            )
    }





}


@Composable
fun marquText(){

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Text(
            text = "Wellcome Omi You are started jetpack compose".repeat(10),
            maxLines = 2,
            fontSize = 20.sp,
            overflow = TextOverflow.Ellipsis

        )
    }


}



@Preview(showSystemUi = true)
@Composable
fun showDisplay(){
   // textColor()
    marquText()
}
