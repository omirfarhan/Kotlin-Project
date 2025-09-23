package com.example.myapplication.`8_NavigationDRawer`

import android.icu.text.CaseMap
import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.`4LayoutComposable`.modifiers
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NavigationExample(){

    val context= LocalContext.current

    val drawerstate= rememberDrawerState(
        initialValue = DrawerValue.Closed
    )

    val scope= rememberCoroutineScope()


    ModalNavigationDrawer(
        drawerContent = {
            ModalDrawerSheet(
                modifier = Modifier.fillMaxWidth(0.5f)
            ) {
                Column(
                    modifier = Modifier.padding().verticalScroll(
                        rememberScrollState()
                    )

                ){
                    Text("Drawer Header")
                    HorizontalDivider()
                    Text("All information")

                    NavigationDrawerItem(
                        icon = {
                            Icon(imageVector = Icons.Default.Home, contentDescription = "Home")
                        },

                        label = {
                            Text("Home")
                        },
                        selected = false,
                        onClick = {
                            scope.launch {
                                drawerstate.close()
                            }

                            Toast.makeText(context,"Home", Toast.LENGTH_SHORT).show()
                        }
                    )

                    NavigationDrawerItem(
                        icon = {
                            Icon(imageVector = Icons.Default.Person, contentDescription = "Home")
                        },

                        label = {
                            Text("Profile")
                        },
                        selected = false,
                        onClick = {
                            Toast.makeText(context,"Home", Toast.LENGTH_SHORT).show()
                        }
                    )


                    NavigationDrawerItem(
                        //Icon(Icons.Default.Email, contentDescription = "message"),
                        icon = {Icon(Icons.Default.Email, contentDescription = "message")},
                        label = {
                            Text("Message")
                        },
                        selected = false,
                        onClick = {

                        }
                    )


                }


            }



        },
        drawerState =drawerstate

    ) {

        Scaffold(
            topBar = {
                TopAppBar(
                    title = {Text("Navigation Drawer")},
                    navigationIcon = {
                        IconButton(
                            onClick = {

                                scope.launch {
                                    if (drawerstate.isClosed){
                                        drawerstate.open()
                                    }else{
                                        drawerstate.close()
                                    }
                                }

                            }
                        ) {
                            Icon(Icons.Default.Menu, contentDescription = "menu")
                        }
                    }

                )

            }
        ) { paddingValues ->
            Column (
                modifier = Modifier.padding(paddingValues)
            )
            {

            }
        }

    }


}




@Preview(showSystemUi = true)
@Composable

fun mainDisplay(){
    NavigationExample()
}

