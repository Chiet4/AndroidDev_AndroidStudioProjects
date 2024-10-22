package com.anchietaalbano.lerntextmodifiers

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.anchietaalbano.lerntextmodifiers.ui.theme.LernTextModifiersTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            LernTextModifiersTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LernTextAndModifiers()
                }
            }
        }
    }
}

@Composable
fun LernTextAndModifiers(){
    val clickOnText = {}

    Text(
        text = stringResource(id = R.string.saudacao),
        color = Color.Red,
        fontSize = 32.sp,
        fontStyle = FontStyle.Italic,
        modifier = Modifier
            .padding(22.dp)
            .background(Color.Blue)
            .clickable(onClick = clickOnText)
    )
}

@Preview(showBackground = true)
@Composable
fun ShowPreview(){
    LernTextModifiersTheme {
        LernTextAndModifiers()
    }
}
