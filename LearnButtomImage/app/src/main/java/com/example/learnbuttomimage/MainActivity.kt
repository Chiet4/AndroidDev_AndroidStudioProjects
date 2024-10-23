package com.example.learnbuttomimage

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.learnbuttomimage.ui.theme.LearnButtomImageTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LearnButtomImageTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //LearnButton()
                    LearnImage()
                }
            }
        }
    }
}

// button e suas propriedades
//@Composable
//fun LearnButton(){
//    val context = LocalContext.current.applicationContext
//
//    Column (verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally){
//        Button(onClick = {Toast.makeText(context, "Login successfull", Toast.LENGTH_LONG ).show()},
//            shape = RoundedCornerShape(size = 16.dp), colors = ButtonDefaults.buttonColors(containerColor = Color.Blue)
//        ) {
//            Text(text= "Login")
//        }
//    }
//}

@Composable
fun LearnImage(){
    Image(painter = painterResource(R.drawable.cuidados), "image Cuidados")
}