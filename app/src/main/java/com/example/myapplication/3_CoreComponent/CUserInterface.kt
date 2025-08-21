package com.example.myapplication.`3_CoreComponent`

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun selectableoption(){

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center

    ){

        SelectionContainer {

            Column {

                Text("my dream is software engineer")
                Text("Yes this is my dream")
                Text("Finally decided its true")
                DisableSelection {
                    Text("This option is not work")
                    Text("Because its disableoption")
                }

            }

        }

    }

}





