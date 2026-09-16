package com.andrescala.tallergithub

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.andrescala.tallergithub.ui.theme.TallerGithubTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
        }
    }
}

@Preview (showBackground = true, showSystemUi = true)
@Composable
fun Usuario() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.usuario),
            contentDescription = null,
            modifier = Modifier.size(200.dp)
        )
        Text(
            text = "Andres David",
            fontWeight = FontWeight.Bold,
            fontSize = 25.sp,
            modifier = Modifier.padding(5.dp)
            )
        Text(text = "Estudiante de Ingenieria de sistemas",
            fontSize = 15.sp,
            color = Color(39, 127, 213),
            modifier = Modifier.padding(5.dp))
        HorizontalDivider(
            thickness = 1.dp,
            color = Color.Gray,
            modifier = Modifier.padding(top = 15.dp)
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp)
        ) {
            Text(text = "Edad")
            Text(text = "21 Años")
            Text(text = "Correo")
            Text(text = "acala244@unab.edu.co")
            Text(text = "Ciudad")
            Text(text = "Bucaramanga, Colombia")
            Button(onClick = {
                // Acción que ocurre al presionar el botón (ej. un Toast o un Log)
            },
                modifier = Modifier.padding(top = 20.dp) {
                Text(text = "Contacter")
            }
        }
    }
}