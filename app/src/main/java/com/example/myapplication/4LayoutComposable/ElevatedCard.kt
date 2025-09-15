package com.example.myapplication.`4LayoutComposable`

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.myapplication.R

@Composable
fun ElevatedCard(){

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){

        ElevatedCard(

            elevation = CardDefaults.cardElevation(
                2.dp
            ),

            modifier = Modifier.size(height = 100.dp, width = 200.dp),



        ){
            Column(
                modifier = Modifier.fillMaxSize(),

            ) {

                ConstraintLayout(

                    modifier = Modifier.fillMaxSize().background(Color.Yellow)

                ){

                    val (text1,image,button)=createRefs()

                    Text("Play Relaxing Song",
                        modifier = Modifier.constrainAs(text1){
                            top.linkTo(parent.top, margin = 5.dp)
                            start.linkTo(parent.start)
                            end.linkTo(parent.end)
                        },
                        fontSize = 20.sp,
                        fontStyle = FontStyle.Italic
                        )


                    Image(
                        modifier = Modifier
                            .clip(CircleShape)
                            .size(50.dp)

                            .constrainAs(image){
                            start.linkTo(parent.start)
                            top.linkTo(parent.top)
                            end.linkTo(parent.end)
                            bottom.linkTo(parent.bottom)
                        },
                        alignment = Alignment.Center,

                        painter = painterResource(R.drawable.islam),
                        contentScale = ContentScale.Crop,
                        contentDescription = "image is islam"

                    )

                }
            }


        }


    }


}


@Preview(showSystemUi = true)
@Composable
fun showelevatedcard(){
    ElevatedCard()
}
