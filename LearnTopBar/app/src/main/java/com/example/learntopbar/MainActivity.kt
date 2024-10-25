package com.example.learntopbar

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.learntopbar.ui.theme.GreenJC
import com.example.learntopbar.ui.theme.LearnTopBarTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LearnTopBarTheme {
                Surface(
                    //modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LearnTopBar()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LearnTopBar(){

    val context = LocalContext.current.applicationContext
    TopAppBar(title = {
        Text(text = "WhatsApp") },
        navigationIcon = {
            IconButton(onClick = {Toast.makeText(context, "WhatsApp", Toast.LENGTH_LONG).show()}
            ){
                Icon(painter = painterResource(R.drawable.baseline_whatsapp_24), contentDescription = "WhatsApp icon")
            }
        }, colors = TopAppBarDefaults.topAppBarColors(
            containerColor = GreenJC,
            titleContentColor = Color.White,
            navigationIconContentColor = Color.White
        ), actions = {
            IconButton(onClick = {
                Toast.makeText(context, "Profile", Toast.LENGTH_LONG).show()}) {
                Icon(imageVector = Icons.Filled.Person, contentDescription = "Profile", tint = Color.White)
            }
            IconButton(onClick = {
                Toast.makeText(context, "Search", Toast.LENGTH_LONG).show()}) {
                Icon(imageVector = Icons.Filled.Search, contentDescription = "Search", tint = Color.White)
            }
            IconButton(onClick = {
                Toast.makeText(context, "Menu MoreVert", Toast.LENGTH_LONG).show()}) {
                Icon(imageVector = Icons.Filled.MoreVert, contentDescription = "Menu", tint = Color.White)
            }

        }
    )
}

@Preview(showBackground = true)
@Composable
fun ShowPreview(){
    LearnTopBarTheme {
        LearnTopBar()
    }
}

