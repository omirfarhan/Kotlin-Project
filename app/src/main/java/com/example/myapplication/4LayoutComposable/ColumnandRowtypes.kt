package com.example.myapplication.`4LayoutComposable`

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun lazycolumnexample(){

    Column(
        
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ) {
        Text("Lazy Column (prefered for list",
            fontSize = 18.sp,
            modifier = Modifier.padding(start = 5.dp, bottom = 5.dp)
            )
        LazyRow (
            modifier = Modifier.fillMaxWidth()
                .height(250.dp)
                .background(Color.LightGray)
        ) {

            items(100) {
                index->
                Text("Item $index in lazycolum",
                    modifier = Modifier.fillMaxWidth().padding(16.dp).background(color = Color.LightGray)
                    )
            }

        }

    }

}

@Preview(showSystemUi = true)
@Composable
fun shows(){
    lazycolumnexample()
}