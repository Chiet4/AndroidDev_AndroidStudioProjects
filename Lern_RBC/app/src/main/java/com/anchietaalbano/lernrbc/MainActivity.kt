package com.anchietaalbano.lernrbc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.anchietaalbano.lernrbc.ui.theme.LernRBCTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LernRBCTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LearnRowColumnBox()
                }
            }
        }
    }
}

@Composable
fun LearnRowColumnBox(){
    /*Text(text = "Uma coluna")
    Text(text = "Uma linha")
    Text(text = "Uma caixa") */ //Overlap

    // Elementos um abaixo do outro
    //Alinhamento e organização centralizada
//    Column (horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center ) {
//        Text(text = "Coluna 1")
//        Text(text = "Coluna 2")
//    }

    // Elementos um ao lado do outro
//    Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center) {
//        Text(text = "Linha 1")
//        Text(text = "Linha 2")
//    }

    // Elementos sobrepostos ou um cima do outro
    Box(modifier = Modifier.fillMaxSize().background(Color.Yellow), contentAlignment = Alignment.Center ){
        Box(modifier = Modifier.height(300.dp).width(300.dp).background(Color.Blue)){
            Text(text = "Uma caixa",
                modifier = Modifier.align(Alignment.Center),
                Color.White,
                fontSize = 30.sp)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ShowPreview(){
    LernRBCTheme {
        LearnRowColumnBox()
    }
}
