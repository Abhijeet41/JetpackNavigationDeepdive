package com.abhi41.jetnavigationdeep.navigation

sealed class Screen(val route: String){

    object Home: Screen("Home_Screen")

    object Detail: Screen("Detail_Screen")
}
