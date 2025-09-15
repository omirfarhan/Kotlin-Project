package com.example.myapplication.`4LayoutComposable`

import android.graphics.drawable.Icon
import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import org.w3c.dom.Text

@Composable
fun floatingButton(){

    val context= LocalContext.current

   Scaffold(
       floatingActionButton = {
           ExtendedFloatingActionButton(
               onClick = {
                   Toast.makeText(context,"Its floating action button", Toast.LENGTH_SHORT).show()
               },
               icon= { Icon(Icons.Default.Add, contentDescription = "Add") },
               text = {Text("Add icon")}

           )
       }
   ) { innerPadding->
       Box(modifier = Modifier.padding(innerPadding)){
           Text("Heeloo")
       }

   }

}




@Preview(showSystemUi = true)
@Composable
fun displayinshowssdata(){
    floatingButton()
}

