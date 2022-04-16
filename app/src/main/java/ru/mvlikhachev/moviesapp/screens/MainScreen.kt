package ru.mvlikhachev.moviesapp.screens

import android.util.Log
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import ru.mvlikhachev.moviesapp.MainViewModel

@Composable
fun MainScreen(navController: NavController, viewModel: MainViewModel) {
    val allMovies = viewModel.allMovies.observeAsState(listOf()).value
    viewModel.getAllMovies()
    allMovies.forEach { Log.d("checkData", "ID: ${it.id}, name: ${it.name}") }
    Log.d("checkData1", "MainScreen Created")
    Surface(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Text(text = "Test")
    }
}