package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardTheme {
                AppBusinessCard()
            }
        }
    }
}


@Composable
fun AppBusinessCard() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        PresentationSession()
        ContactsSession()
    }
}

@Composable
fun PresentationSession() {
    Box() {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(
                    id = R.drawable.android_logo
                ),
                contentDescription = null,
                modifier = Modifier
                    .size(100.dp)
                    .background(color = Color.Black)
            )
            Text(text = "Jennifer Doe", fontSize = 32.sp)
            Text(
                text = "Android Developer Extraordinaire",
                fontSize = 11.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF3DDC84)
            )
        }
    }
}

@Composable
fun ContactsSession() {

}

@Composable
@Preview()
fun PreviewAppBusinessCard() {
    BusinessCardTheme {
        AppBusinessCard()
    }
}
