package com.example.myapplication.`4LayoutComposable`

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout


@Composable
fun columnExample(){

    Row (
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Cyan),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically



    ) {
        Text("First text")
        Text("Second Text")
        Text("Third Text")
    }


}

@Composable
fun examplew(){

    ConstraintLayout(
        modifier = Modifier.fillMaxWidth()
            .height(100.dp)
            .background(Color.LightGray)

    ){

        val (text1,text2,text3)= createRefs()

        Text("Bottom left",
            modifier = Modifier
                .constrainAs(text1){
                    bottom.linkTo(parent.bottom, margin = 8.dp)
                    start.linkTo(parent.start, margin = 8.dp)
                }
        )


        Text("Center",
            modifier = Modifier
                .constrainAs(text2){
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
            )


        Text("Top Right",

            modifier = Modifier.constrainAs(text3){

                top.linkTo(parent.top)
                end.linkTo(parent.end)

            }

            )


    }


}

@Preview(showSystemUi = true)
@Composable
fun ddisplayshowm(){
    examplew()
}