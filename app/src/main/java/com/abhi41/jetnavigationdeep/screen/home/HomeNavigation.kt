package com.abhi41.jetnavigationdeep.screen.home

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.abhi41.jetnavigationdeep.navigation.Screen

fun NavGraphBuilder.homeRoute(
    onNavigateListener: (Int) -> Unit
) {
    composable(
        route = Screen.Home.route
    ) {
        HomeScreen(
            onNavigateListener = {
                val id = 12
                onNavigateListener(id)
            }
        )
    }
}