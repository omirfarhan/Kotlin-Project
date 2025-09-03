package com.example.myapplication.`4LayoutComposable`

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlin.coroutines.coroutineContext


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun partialbottomsheet(){

    var context=LocalContext.current

    var showBottomsheet by remember{
        mutableStateOf(false)
    }

    var sheetState = rememberModalBottomSheetState(
        skipPartiallyExpanded = false
    )

    Column(

        modifier = Modifier.fillMaxSize().background(color = Color.LightGray),
        horizontalAlignment = Alignment.CenterHorizontally


    ) {

        Button(

            onClick = {
                showBottomsheet=true

            },
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.White,
                containerColor = Color.Magenta
            )

        ) {

            Text("Bottom sheet open")

        }

        if (showBottomsheet){
            ModalBottomSheet(
                modifier = Modifier.fillMaxHeight(),
                sheetState = sheetState,
                onDismissRequest = {
                    showBottomsheet=false
                }
            ) {

                Text("This is Bottom sheet",
                    modifier = Modifier.padding(16.dp))

            }
        }



    }




}


@Preview(showSystemUi = true)
@Composable
fun displaybottomsheet(){
    partialbottomsheet()
}

