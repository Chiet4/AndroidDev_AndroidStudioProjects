package com.anchietaalbano.leararrangementalignment

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
import com.anchietaalbano.leararrangementalignment.ui.theme.LearArrangementAlignmentTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LearArrangementAlignmentTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LearnAlignmentArrangement()
                }
            }
        }
    }
}

// Alignment = Cross Axis ( Row = Vertical, Column = Horizontal)
// Arrangement = Main Axis ( Row = Horizontal, Column = Vertical)

@Composable
fun LearnAlignmentArrangement(){

    //RowAlignment: Top, CenterVertically, Bottom
    //RowArrangement: Start, Center, End, SpaceBetween, SpaceAround, SpaceEvenly
                    // Absolute.Left, Absolute.Right, Absolute.Center
                    // Absolute.SpaceBetween, Absolute.SpaceAround, Absolute.SpaceEvenly

//    Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center) {
//        Text(text = "Linha Alignment e Arrangement")
//    }


    //ColumnAlignment: Start, CenterHorizontal, End
    //ColumnArrangment: Top, Center, Botton, SpaceEvenly, SpaceBetween, SpaceAround

//    Column(horizontalAlignment = Alignment.Start,
//        verticalArrangement =  Arrangement.Center
//    ) {
//        Text(text = "Coluna Alignment e Arrangement")
//    }


    // Não há arrangement em boxs
    // BoxAlignment: TopStart, TopCenter, TopEnd, BottomStart, BottomCenter, BottomEnd,
    // Center, CenterStart, CenterEnd

    Box{
        Text(text = "TopStart" , modifier = Modifier.align(Alignment.TopStart))
        Text(text = "TopCenter" , modifier = Modifier.align(Alignment.TopCenter))
        Text(text = "TopEnd" , modifier = Modifier.align(Alignment.TopEnd))
        Text(text = "BottomStart" , modifier = Modifier.align(Alignment.BottomStart))
        Text(text = "BottomCenter" , modifier = Modifier.align(Alignment.BottomCenter))
        Text(text = "BottomEnd" , modifier = Modifier.align(Alignment.BottomEnd))
        Text(text = "Center" , modifier = Modifier.align(Alignment.Center))
        Text(text = "CenterStart" , modifier = Modifier.align(Alignment.CenterStart))
        Text(text = "CenterEnd" , modifier = Modifier.align(Alignment.CenterEnd))

    }

}
