package com.example.businesscard

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
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
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize().background(Color(0x1F006a36))
    ) {
        Column(modifier = Modifier.weight(0.7f), verticalArrangement = Arrangement.Center) {
            PresentationSession()
        }
        Column(modifier = Modifier.weight(0.3f)) {
            ContactsSession()
        }
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
                color = Color(0xFF006a36)
            )
        }
    }
}

@Composable
fun ContactsSession() {
    Box() {
        Column {
            ContactRow(theIcon = Icons.Rounded.Call, contactDescription = "+11(123) 444 555 666")
            ContactRow(theIcon = Icons.Rounded.Share, contactDescription = "@androidDev")
            ContactRow(theIcon = Icons.Rounded.Email, contactDescription = "jen.doe@android.com")
        }
    }
}

@Composable
fun ContactRow(theIcon: ImageVector, contactDescription: String) {
    Row(
        modifier = Modifier.padding(6.dp),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = theIcon,
            contentDescription = "Phone Icon",
            tint = Color(0xFF006a36),
            modifier = Modifier.size(12.dp)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = contactDescription, fontSize = 12.sp, color = Color(0xFF006a36))
    }
}

@Composable
@Preview()
fun PreviewAppBusinessCard() {
    BusinessCardTheme {
        AppBusinessCard()
    }
}
