package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import com.example.myapplication.ui.theme.MyApplicationTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class BasicTextActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    TextViewContainer()
                }
            }
        }
    }
}

@Composable
fun SizeModifier(label: String, size: TextUnit, textModifier: Modifier) {
    Text(label, fontSize = size, modifier = textModifier)
}
@Composable
fun ColorText() {
    Text("Text in Red Color", color = Color.Red ,  modifier = Modifier
        .padding(8.dp) // margin
        .padding(8.dp) // padding
    )
}
@Composable
fun BoldText() {
    Text("Text in Bold", fontWeight = FontWeight.Bold,  modifier = Modifier
        .padding(8.dp) // margin
        .padding(8.dp)) // padding
}

@Composable
fun ItalicText() {
    Text("Italic Text", fontStyle = FontStyle.Italic,  modifier = Modifier
        .padding(8.dp) // margin
        .padding(8.dp)) // padding
}
@Composable
fun MaxLines() {
    Text("Text with Max line 2 ".repeat(50), maxLines = 2, modifier = Modifier
        .padding(8.dp) // margin
        .padding(8.dp)) // padding
}

@Composable
fun OverflowedText() {
    Text("Text with three dot at end, Text Overflow  ".repeat(150),
        maxLines = 3, overflow = TextOverflow.Ellipsis,
        modifier = Modifier
            .padding(8.dp)) // margin
}
@Composable
fun SelectableText() {
    SelectionContainer {
        Text("This text is selectable",  modifier = Modifier
            .padding(8.dp) // margin
            .padding(8.dp)) // padding
    }
}
@Composable
fun TextViewContainer() {
    Column {
        SizeModifier("Big text", size = 40.sp,  textModifier = Modifier
            .padding(8.dp) // margin
            .padding(8.dp)) // padding
        ColorText()
        BoldText()
        ItalicText()
        OverflowedText()
        SelectableText()
        MaxLines()
    }
}

val  redTextStyle = TextStyle(color = Color.Red,fontSize = 30.sp)
@Preview( showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    Row {
        TextViewContainer()
    }
}