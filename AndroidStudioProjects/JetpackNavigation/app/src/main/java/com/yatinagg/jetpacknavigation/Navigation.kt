package com.yatinagg.jetpacknavigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.re

@Composable
fun Navigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.MainScreen)
}