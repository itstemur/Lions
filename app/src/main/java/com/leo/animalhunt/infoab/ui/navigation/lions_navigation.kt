package com.tz.btmonitor.ui.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.leo.animalhunt.infoab.ui.theme.LionsTheme
import com.tz.btmonitor.ui.screen.BlogListScreen
import com.tz.btmonitor.ui.screen.BlogScreen

@Composable
fun LionsNavigation() {
    LionsTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            val navController = rememberNavController()
            NavHost(navController = navController, startDestination = Screen.BlogList.route) {
                composable(Screen.BlogList.route) {
                    BlogListScreen(navController = navController)
                }
                composable(Screen.Blog.route) {
                    println(it.arguments.toString())
                    BlogScreen(navController = navController, it.arguments?.getString("index")?.toInt() ?: -1)
                }
            }
        }
    }
}

@ExperimentalComposeUiApi
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LionsNavigation()
}

sealed class Screen(val route: String) {
    object BlogList : Screen("blog_list")
    object Blog : Screen("blog/{index}")
}
