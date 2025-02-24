package com.example.queue_it.common

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.queue_it.navigation.Screen


@Composable
fun BottomNav(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavigationBar(
        modifier = modifier
            .fillMaxWidth()
            .padding(start = 8.dp, end = 8.dp)
            .wrapContentSize(align = Alignment.BottomCenter)
            .height(75.dp)
            .clip(RoundedCornerShape(16.dp)),
        containerColor = Color(0xFF222222)
    ) {
        // Home Navigation Item
        NavigationBarItem(
            icon = {
                Icon(
                    imageVector = Icons.Default.Home,
                    contentDescription = "Home",
                    modifier = Modifier.size(30.dp)
                )
            },
            label = { Text("Home") },
            selected = navController.currentDestination?.route == Screen.Home.route,
            onClick = { navController.navigate(Screen.Home.route) },
            colors = NavigationBarItemDefaults.colors(
                selectedIconColor = Color.White,
                selectedTextColor = Color(0xFF42A5F5),
                indicatorColor = Color(0xFF1E88E5)
            )
        )

        // Queues Navigation Item
        NavigationBarItem(
            icon = {
                Icon(
                    imageVector = Icons.Default.DateRange,
                    contentDescription = "Queues",
                    modifier = Modifier.size(30.dp)

                )
            },
            label = { Text("Queues") },
            selected = navController.currentDestination?.route == Screen.Queues.route,
            onClick = { navController.navigate(Screen.Queues.route) },
            colors = NavigationBarItemDefaults.colors(
                selectedIconColor = Color.White,
                selectedTextColor = Color(0xFF42A5F5),
                indicatorColor = Color(0xFF1E88E5)
            )
        )
        // Profile Navigation Item
        NavigationBarItem(
            icon = {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = "Profile",
                    modifier = Modifier.size(30.dp)
                )
            },
            label = { Text("Profile") },
            selected = navController.currentDestination?.route == Screen.Profile.route,
            onClick = { navController.navigate(Screen.Profile.route) },
            colors = NavigationBarItemDefaults.colors(
                selectedIconColor = Color.White,
                selectedTextColor = Color(0xFF42A5F5),
                indicatorColor = Color(0xFF1E88E5)
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BottomNavPreview(){
    val navController = rememberNavController()
    BottomNav(navController = navController,
        modifier = Modifier
        )
}