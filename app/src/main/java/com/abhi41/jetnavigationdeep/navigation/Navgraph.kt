package com.abhi41.jetnavigationdeep.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.abhi41.jetnavigationdeep.screen.detail.detailRoute

import com.abhi41.jetnavigationdeep.screen.home.homeRoute
import com.abhi41.jetnavigationdeep.screen.overview.overviewRoute

@Composable
fun SetupNavgraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route,
    ) {
        homeRoute(
            onNavigateListener = { id ->
                navController.navigate(Screen.Detail.passId(id))
            }
        )
        detailRoute(
            onBackNavigation = {
                navController.navigate(Screen.Home.route) {
                    popUpTo(Screen.Home.route) {
                        inclusive = true
                    }
                }
            },
            onNavigateToOverview = { id, name ->
                //this 1st navigation will require mandetory arguments
               // navController.navigate(Screen.OverviewScreen.passRequiredIdAndName(id = id,name = name))
                //this 2nd navigation is optional parameter
                navController.navigate(Screen.OverviewScreen.passOptionalIdAndName(id = id,name = name))
            }
        )

        overviewRoute(
            onBackNavigation = {
                navController.popBackStack()
            },
            onNavigateToMetaInfo = {

            }
        )
    }

}