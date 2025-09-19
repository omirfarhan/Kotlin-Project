package com.example.myapplication.`5_Scaffolds`

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.`4LayoutComposable`.modifiers

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun scaffolds(){

    val context= LocalContext.current

    var preseses by remember {
        mutableStateOf(0)
    }

    Scaffold (

        topBar = {
            TopAppBar(
                colors = (
                        TopAppBarColors(
                            containerColor = MaterialTheme.colorScheme.errorContainer,
                            titleContentColor = MaterialTheme.colorScheme.error,
                            scrolledContainerColor = MaterialTheme.colorScheme.surfaceContainer,
                            navigationIconContentColor = MaterialTheme.colorScheme.primaryContainer,
                            actionIconContentColor = MaterialTheme.colorScheme.surface
                        )

                        ),
                title = { Text("This is Top app bar") }



            )
        },

        bottomBar = {
            BottomAppBar(
                containerColor = MaterialTheme.colorScheme.primaryContainer,
                contentColor = MaterialTheme.colorScheme.primary
            ) {
                Text(
                    "Bottom app bar",
                    modifier = Modifier.padding(16.dp)

                )

            }
        },

        floatingActionButton = {
            ExtendedFloatingActionButton(
                onClick = {
                   preseses++
                }
            ){
                Text("i have been click  $preseses times")
            }
        }


    ) {innerPadding->
        Box(
            modifier = Modifier.padding(innerPadding).background(Color.Black).fillMaxSize()
        ){
            Text("This is top bar under this text",
                 color =
                     Color.White,
                modifier = Modifier.padding(8.dp)


                )
        }
    }


}

@Preview(showSystemUi = true)
@Composable
fun displayshowscaffold(){
    scaffolds()
}