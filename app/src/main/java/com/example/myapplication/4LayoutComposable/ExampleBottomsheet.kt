@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.myapplication.`4LayoutComposable`

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomSheetDefaults
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun previewbottomsheet(){

    var bottomsheet by remember {
        mutableStateOf(false)
    }

    val sheet= rememberModalBottomSheetState (
        skipPartiallyExpanded =false
    )

    Column(

        modifier = Modifier.fillMaxSize().background(Color.LightGray),
        horizontalAlignment =Alignment.CenterHorizontally

    ) {
        Button(
            onClick = {
                bottomsheet=true
            },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.DarkGray
            )
        )

        {

            Text("Bottom sheet open")

        }

        if (bottomsheet){
            ModalBottomSheet(
                modifier = Modifier.fillMaxSize(),
                sheetState = sheet,
                onDismissRequest = {
                  bottomsheet=false
                }
            ) {

                Text("This is Bottom sheet",
                    modifier = Modifier.padding(10.dp)
                )
            }
        }


    }




}

@Preview(showSystemUi = true)
@Composable
fun displayprevewbottomsheet(){
    previewbottomsheet()
}