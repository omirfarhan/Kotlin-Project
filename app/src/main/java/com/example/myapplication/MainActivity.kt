package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



       // enableEdgeToEdge()


        setContent {

            textcompose("Android")

           /* MyApplicationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->



                }
            }

            */


        }


    }



}

@Composable
fun textcompose(value: String){

    Text(
        modifier = Modifier.
        fillMaxSize().
        fillMaxWidth().background(Color.LightGray)
        ,
        text = stringResource(R.string.Wellcome_To_jetpack_compose),
        fontSize = 18.sp,

        fontWeight = FontWeight.Black,
        color = Color.Black

    )

}

@Preview(showBackground = true)
@Composable
fun Composeshow(){
    textcompose("Android")
}




/*
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
Text(
    text = "Hello $name!",
    modifier = modifier
)
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
MyApplicationTheme {
    Greeting("Android")
}
}

*/