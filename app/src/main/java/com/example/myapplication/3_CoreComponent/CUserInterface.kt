package com.example.myapplication.`3_CoreComponent`

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextLinkStyles
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.withLink
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun selectableoption(){

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center

    ){

        SelectionContainer {

            Column {

                Text("my dream is software engineer",
                    modifier = Modifier.padding(top = 10.dp)

                )
                Text("Yes this is my dream",
                    modifier = Modifier.padding(top = 10.dp)

                )
                Text("Finally decided its true"
                    ,
                    modifier = Modifier.padding(top = 10.dp))
                DisableSelection {
                    Text("This option is not work")
                    Text("Because its disableoption")
                }

            }

        }

    }

}

//==link with text

@Composable
fun annotatedstring(){

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center

    ) {


        val uriHandler = LocalUriHandler.current
        Text(

            buildAnnotatedString {
                append("This is link: ")
                val link = LinkAnnotation.Url(

                    "https://docs.google.com/spreadsheets/d/1mvlc8EYc3OVVU3X7NKoC0iZJr_45BL_pVxiJec0r94c/htmlview?usp=sharing",
                    TextLinkStyles(
                        SpanStyle(
                            color = Color.Red
                        )
                    )

                ) {
                    val url = (it as LinkAnnotation.Url).url
                    uriHandler.openUri(url)

                }

                withLink(link) {
                    append("Link")
                }

            }

        )
    }

}




@Preview(showSystemUi = true)
@Composable
fun showinui(){
    annotatedstring()
}






