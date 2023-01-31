package com.example.composeapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
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
        Column() {
            Text(
                text = "First text compose"
            )
            Text(
                text = "Giovanni Montanari"
            )
            Text(
                text = "Matheus Cunha Montanari"
            )
        }
    }

    @Preview
    @Composable
    fun ScreenPreview() {
        primaryScreen()
    }
}