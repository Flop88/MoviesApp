package ru.mvlikhachev.moviesapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import ru.mvlikhachev.moviesapp.screens.MainScreen
import ru.mvlikhachev.moviesapp.screens.SplashScreen
import ru.mvlikhachev.moviesapp.utils.Constants

sealed class Screen(val route: String) {
    object Splash: Screen(Constants.Screens.SPLASH_SCREEN)
    object Main: Screen(Constants.Screens.MAIN_SCREEN)
}

@Composable
fun SetupNavHost(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.Splash.route
    ) {
        composable(route = Screen.Splash.route) {
            SplashScreen(navController = navController)
        }
        composable(route = Screen.Main.route) {
            MainScreen(navController = navController)
        }
    }
}