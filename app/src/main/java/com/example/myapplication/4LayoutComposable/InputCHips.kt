package com.example.myapplication.`4LayoutComposable`

import android.graphics.drawable.Icon
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.InputChip
import androidx.compose.material3.InputChipDefaults
import androidx.compose.material3.SegmentedButtonDefaults.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import java.nio.file.WatchEvent


@Composable
fun Inputchips(){

    var enable by remember {
        mutableStateOf(true)
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        if (enable){

            InputChip(
                onClick = {
                    enable=!enable
                },
                label = {
                    Text("Enabled")
                },
                selected = enable,
                avatar = {
                    Icon(Icons.Filled.Person,
                        contentDescription = null,
                        Modifier.size(InputChipDefaults.AvatarSize)
                    )


                },
                trailingIcon = {

                    Icon(Icons.Filled.Close,
                        contentDescription = null,
                        Modifier.size(InputChipDefaults.AvatarSize)

                    )

                }
            )

        }

        var enable2 by remember {
            mutableStateOf(true)
        }

        if (enable2){

            InputChip(
                onClick = {
                    enable2=!enable2
                },
                selected = enable2,
                label = {
                    Text("CLick")
                },
                avatar = {
                    Icon(Icons.Filled.Call,
                        contentDescription = "call option",
                        modifier = Modifier.size(InputChipDefaults.AvatarSize)

                    )
                },
                trailingIcon = {
                    Icon(
                        Icons.Filled.Check,
                        contentDescription = "check item"
                    )
                }

            )


        }




    }





}

@Preview(showSystemUi = true)
@Composable
fun showinputchip(){
    Inputchips()
}

