package com.example.myapplication.`11_Dropdownmenu`

import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.MoreVert
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.`4LayoutComposable`.CheckboxSystem

@Composable
fun dropdownmenu(){

   var extented by remember {
       mutableStateOf(false)
   }


    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.TopEnd
    ) {

        Box(
            modifier = Modifier

                .padding(16.dp)


        )

        {
            IconButton(
                onClick = {
                    extented = !extented
                }
            ) {

                Icon(Icons.Default.MoreVert,  contentDescription = "Icon")

            }

            DropdownMenu(
                expanded = extented,
                onDismissRequest = {extented=false}
            ){
                DropdownMenuItem(
                    text = {Text("Person")},
                    trailingIcon = {Icon(Icons.Outlined.Person, contentDescription = "Person")},
                    onClick = {
                        //
                    }
                )

                DropdownMenuItem(
                    text = {Text("Home")},
                    trailingIcon = {Icon(Icons.Outlined.Home, contentDescription = "Home")},
                    onClick = {

                    }
                )

                HorizontalDivider()
                DropdownMenuItem(
                    text = {Text("Love")},
                    trailingIcon = { Icon(Icons.Default.Favorite, contentDescription = "Love") },
                    onClick = {

                    }
                )



            }

        }

    }





}

@Preview(showSystemUi = true)
@Composable
fun showCHECKBOXs(){
    dropdownmenu()
}

