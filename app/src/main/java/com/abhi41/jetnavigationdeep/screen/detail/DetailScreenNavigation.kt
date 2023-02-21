package com.abhi41.jetnavigationdeep.screen.detail

import android.util.Log
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.abhi41.jetnavigationdeep.navigation.Screen
import com.abhi41.jetnavigationdeep.util.Constants
import com.abhi41.jetnavigationdeep.util.Constants.DETAIL_ARGUMENT_ID

private const val TAG = "DetailScreenNavigation"
fun NavGraphBuilder.detailRoute(
    onBackNavigation: () -> Unit,
    onNavigateToOverview: (Int, String) -> Unit
) {
    composable(
        route = Screen.Detail.route,
        arguments = listOf(navArgument(DETAIL_ARGUMENT_ID) {
            type = NavType.IntType
        })
    ) {

        LaunchedEffect(key1 = false) {
            Log.d(TAG, "DetailScreenArg ${it.arguments?.getInt(DETAIL_ARGUMENT_ID).toString()}")
        }

        DetailScreen(
            onBackNavigation = {
                //navController.popBackStack()
                //Another way to pop backstack from home screen
                onBackNavigation()
            },
            onNavigateToOverview = {
                val id = 46
                val name = "Abhijeet Mule"
                onNavigateToOverview(id,name)
            }
        )
    }
}