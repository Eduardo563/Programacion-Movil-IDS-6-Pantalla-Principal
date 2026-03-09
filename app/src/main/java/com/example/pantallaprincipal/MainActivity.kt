package com.example.pantallaprincipal



import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.pantallaprincipal.navigation.AppNavigation
import com.example.pantallaprincipal.ui.theme.PantallaPrincipalTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PantallaPrincipalTheme {
                AppNavigation()
            }
        }
    }
}


