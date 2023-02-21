package com.abhi41.jetnavigationdeep.navigation

import com.abhi41.jetnavigationdeep.util.Constants.DETAIL_ARGUMENT_ID
import com.abhi41.jetnavigationdeep.util.Constants.OVERVIEW_ARGUMENT_ID
import com.abhi41.jetnavigationdeep.util.Constants.OVERVIEW_ARGUMENT_NAME


const val OPTIONAL_OVERVIEW_ARGS =
    "overview_screen?id={$OVERVIEW_ARGUMENT_ID}&name={$OVERVIEW_ARGUMENT_NAME}"

const val REQUIRED_OVERVIEW_ARGS =
    "overview_screen/{$OVERVIEW_ARGUMENT_ID}/{$OVERVIEW_ARGUMENT_NAME}"


sealed class Screen(val route: String) {
    object Home : Screen("home_screen") //1st Screen Home

    //2nd Screen Detail passing only one argument
    object Detail : Screen("detail_screen/{$DETAIL_ARGUMENT_ID}") {
        fun passId(id: Int): String {
            return "detail_screen/$id"
        }
    }

    //3rd Screen Overview Screen passing multiple argument
    object OverviewScreen : Screen(OPTIONAL_OVERVIEW_ARGS) {
        fun passRequiredIdAndName(id: Int, name: String = "Vegeta"): String {
            return "overview_screen/$id&$name"
        }
        fun passOptionalIdAndName(
            id: Int = 0,
            name: String = "Vegeta"
        ): String {
            return "overview_screen?id=$id&name=$name"
        }
    }

}
