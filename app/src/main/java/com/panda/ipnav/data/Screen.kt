package com.panda.ipnav.data

sealed class Screen(val route:String)
{
    object MainScreen: Screen("map_screen")
    object DetailsList: Screen("details")
}
