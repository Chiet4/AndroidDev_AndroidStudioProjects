package com.example.jetpackcomposeminiprojeto

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.jetpackcomposeminiprojeto.ui.theme.JetpackComposeMiniProjetoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

        }
    }
}

@Composable
@Preview
fun MainScreen(){

    val scrollState = rememberScrollState()

    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF6f2f3))
    ){

        Spacer(modifier = Modifier.height(24.dp))
        ProfileCard()
    }

}

@Composable
fun ProfileCard() {
    ConstraintLayout (
        modifier = Modifier.height(292.dp)
    ) {
        val (boxGrey, image, morning, name, favBtn, profileBtn) = createRefs()

        Box (
            modifier = Modifier
                .fillMaxWidth()
                .constrainAs(boxGrey){
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(parent.top)}
                .height(260.dp)
                .padding(horizontal = 16.dp)
                .background(colorResource(R.color.grey), shape = RoundedCornerShape(25.dp))
        ) { }

        Text(
            text = "Bem vindo",
            style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(32.dp)
                .constrainAs(morning){
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(parent.top)
                }, textAlign = TextAlign.Center)

        Image(
            painter = painterResource(R.drawable.profile),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .padding(start = 32.dp)
                .width(133.dp)
                .height(185.dp)
                .clip(RoundedCornerShape(25.dp))
                .constrainAs(image){
                    bottom.linkTo(parent.bottom)
                    start.linkTo(boxGrey.start)
                }
        )

        Text(
            text = "Sara\nAnderson",
            style = TextStyle(fontSize = 32.sp, fontWeight = FontWeight.Bold),
            modifier = Modifier
                .padding(start = 16.dp)
                .constrainAs(name){
                    start.linkTo(image.end)
                    top.linkTo(image.top)
                }
        )

        Image(
            painter = painterResource(R.drawable.profile_btn),
            contentDescription = "",
            modifier = Modifier
                .padding(end = 48.dp)
                .constrainAs(profileBtn){
                    end.linkTo(boxGrey.end)
                    top.linkTo(boxGrey.bottom)
                    bottom.linkTo(boxGrey.bottom)
                }
        )

        Image(
            painter = painterResource(R.drawable.fav),
            contentDescription = "",
            modifier = Modifier
                .constrainAs(favBtn){
                    end.linkTo(profileBtn.start)
                    top.linkTo(boxGrey.bottom)
                    bottom.linkTo(boxGrey.bottom)
                    start.linkTo(image.end)
                }
        )

    }
}
