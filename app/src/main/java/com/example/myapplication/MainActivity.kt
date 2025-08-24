package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.`1_Introduction`.Createfunction
import com.example.myapplication.`1_Introduction`.ImageAccess
import com.example.myapplication.`1_Introduction`.Resoursess
import com.example.myapplication.`3_CoreComponent`.annotatedstring
import com.example.myapplication.`3_CoreComponent`.marquText
import com.example.myapplication.`3_CoreComponent`.selectableoption
import com.example.myapplication.`3_CoreComponent`.simpleoutlinetext
import com.example.myapplication.`3_CoreComponent`.textstyle
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        //enableEdgeToEdge()


        setContent {

            annotatedstring()


        }


    }



}



//UI main work
@Composable
fun mainScreen(){
    Column (modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight()
        .background(Color.LightGray)
    ) {
        textcompose(" Android", shadowcolor = Color.Yellow)
        textcompose(" Kotlin", shadowcolor = Color.Black)
    }

}

@Composable
fun textcompose(main: String,shadowcolor: Color){

    val shadowoffset= Offset(x=4f,y=6f)

    Text(
        modifier = Modifier
            .fillMaxWidth()

            .height(100.dp)
            .padding(start = 10.dp, end = 10.dp)
            .background(Color.White),
        text = "${stringResource(id= R.string.Wellcome_To_jetpack_compose)}$main",


        fontStyle = FontStyle.Normal,
        style = TextStyle(
            fontSize = 22.sp,
            fontStyle = FontStyle.Normal,
            shadow = Shadow(shadowcolor,shadowoffset,4f)
        )

        )

}

@Preview(showBackground = true)
@Composable
fun Composeshow(){

    mainScreen()

}
