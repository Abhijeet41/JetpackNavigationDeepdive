package com.abhi41.jetnavigationdeep.screen.overview

import android.util.Log
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.abhi41.jetnavigationdeep.navigation.Screen
import com.abhi41.jetnavigationdeep.util.Constants.OVERVIEW_ARGUMENT_ID
import com.abhi41.jetnavigationdeep.util.Constants.OVERVIEW_ARGUMENT_NAME

private const val TAG = "OverviewNavigation"
fun NavGraphBuilder.overviewRoute(
    onBackNavigation: ()-> Unit,
    onNavigateToMetaInfo: () -> Unit
){
    composable(
        route = Screen.OverviewScreen.route,
        arguments = listOf(
            navArgument(OVERVIEW_ARGUMENT_ID){
                type = NavType.IntType
                defaultValue = 200
            },
            navArgument(OVERVIEW_ARGUMENT_NAME){
                type = NavType.StringType
                defaultValue = "Vegeta"
            }
        )
    ){

        LaunchedEffect(key1 = Unit){
            Log.d(TAG, "ID_ARGS ${it.arguments?.getInt(OVERVIEW_ARGUMENT_ID)}")
            Log.d(TAG, "Name_ARGS ${it.arguments?.getString(OVERVIEW_ARGUMENT_NAME)}")
        }
        OverviewScreen(
            onBackNavigation = onBackNavigation,
            onNavigateToMetaInfo = onNavigateToMetaInfo
        )
    }
}