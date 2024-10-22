package com.anchietaalbano.lernrbc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
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

    //Alinhamento e organização centralizada
    Column (horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center ) {
        Text(text = "Coluna 1")
        Text(text = "Coluna 2")
    }

}
