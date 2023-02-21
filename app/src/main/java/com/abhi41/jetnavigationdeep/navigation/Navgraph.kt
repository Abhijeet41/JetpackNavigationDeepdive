package com.abhi41.jetnavigationdeep.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.abhi41.jetnavigationdeep.screen.detail.DetailScreen
import com.abhi41.jetnavigationdeep.screen.home.HomeScreen

@Composable
fun SetupNavgraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route,
    ) {
        composable(
            route = Screen.Home.route
        ){
            HomeScreen(
                onNavigateListener = {
                    navController.navigate(Screen.Detail.route)
                }
            )
        }

        composable(
            route = Screen.Detail.route
        ){
            DetailScreen(
                onBackNavigation = {
                    //navController.popBackStack()

                    //Another way to pop backstack from home screen
                    navController.navigate(Screen.Home.route){
                        popUpTo(Screen.Home.route){
                            inclusive = true
                        }
                    }

                }
            )
        }
    }

}