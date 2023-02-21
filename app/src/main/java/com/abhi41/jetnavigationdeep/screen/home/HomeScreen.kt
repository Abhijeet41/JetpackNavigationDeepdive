package com.abhi41.jetnavigationdeep.screen.home

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.abhi41.jetnavigationdeep.navigation.Screen

@Composable
fun HomeScreen(
    onNavigateListener: () -> Unit
) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {

        Text(
            modifier = Modifier.clickable {
                onNavigateListener()
            },
            text = "Home Content",
            color = MaterialTheme.colors.primary,
            fontWeight = FontWeight.ExtraBold,
            fontSize = MaterialTheme.typography.h3.fontSize
        )

    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen(onNavigateListener = {})
}