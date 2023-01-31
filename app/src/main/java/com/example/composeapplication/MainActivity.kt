package com.example.composeapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.composeapplication.ui.theme.ComposeApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeApplicationTheme {
                primaryScreen()
            }
        }
    }

    @Composable
    fun primaryScreen() {
        Scaffold(
            topBar = {
                TopAppBar(
                    backgroundColor = Color.Blue
                ) {
                    Text(
                        text = "Primeiro TopBar",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                }
            }
        ) { padding ->
            Column(
                modifier = Modifier
                    .padding(padding)
                    .background(Color.White)
                    .fillMaxWidth()
                    .fillMaxHeight()
            ) {
                Text("Text 1")
                Text("Text 2")
                Text("Text 3")
            }
        }
    }

    @Preview
    @Composable
    fun ScreenPreview() {
        primaryScreen()
    }
}