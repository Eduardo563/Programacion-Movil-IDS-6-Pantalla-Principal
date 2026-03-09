package com.example.pantallaprincipal.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.pantallaprincipal.screens.HomeScreen
import com.example.pantallaprincipal.screens.LoginScreen
import com.example.pantallaprincipal.screens.SignUpScreen

@Composable
fun AppNavigation(){

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "welcome"
    ){
        composable("welcome"){
            HomeScreen(navController)
        }
        composable("login"){
            LoginScreen(navController)
        }
        composable("signup"){
            SignUpScreen(navController)
        }
    }
}