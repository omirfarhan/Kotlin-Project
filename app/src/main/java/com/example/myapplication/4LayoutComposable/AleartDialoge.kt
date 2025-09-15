package com.example.myapplication.`4LayoutComposable`

import android.media.tv.AdRequest
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import com.example.myapplication.R
import java.nio.file.WatchEvent

@Composable
fun dialogeImage(



){

    val context= LocalContext.current
    var showDismiss by remember {
        mutableStateOf(true)
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Red),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        if (showDismiss){
            Dialog(
                onDismissRequest={
                   showDismiss=false
                }
            ) {

                Card(
                    modifier = Modifier

                        .fillMaxWidth()
                        .height(350.dp)
                        .padding(8.dp),
                    shape = RoundedCornerShape(16.dp),

                    ) {

                    Image(
                        painter = painterResource(R.drawable.islam),
                        contentDescription = "image islam",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .height(260.dp)
                            .fillMaxWidth()
                    )

                    Text("This is Dialoge",
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top=3.dp, start = 5.dp),
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold

                    )

                    Row(
                        modifier =Modifier.fillMaxWidth(),


                        ){
                        TextButton(
                            onClick = {
                                Toast.makeText(context,"This is Confirm Button", Toast.LENGTH_SHORT).show()
                            },

                            ) {

                            Text("Confirm",
                                fontSize = 18.sp
                            )

                        }

                        TextButton(
                            onClick = {
                                showDismiss=false

                            },

                            ) {

                            Text("End",
                                fontSize = 18.sp,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.End
                            )

                        }

                    }

                }




            }

        }



    }
}

