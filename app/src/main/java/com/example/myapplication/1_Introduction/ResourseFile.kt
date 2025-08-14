package com.example.myapplication.`1_Introduction`

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.R

@Composable
fun Resoursess(value: String){

    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center

    ){
        Text(text = "${stringResource(R.string.Wellcome_To_jetpack_compose)}$value",
            color = colorResource(R.color.black)



        )
    }


}

@Composable
fun ImageAccess(){
    Box(modifier = Modifier
        .fillMaxSize(),
        contentAlignment = Alignment.Center


        ){

        Image(painter = painterResource(R.drawable.islam), contentDescription = "Islam")


    }
}

@Preview(showSystemUi = true)
@Composable
fun seeData(){

    Resoursess(" Allhamduah")
   // ImageAccess()
}

