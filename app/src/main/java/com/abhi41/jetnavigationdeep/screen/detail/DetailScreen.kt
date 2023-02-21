package com.abhi41.jetnavigationdeep.screen.detail

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun DetailScreen(
    onBackNavigation: () -> Unit,
    onNavigateToOverview: () -> Unit,
    viewModel: DetailViewModel = hiltViewModel()
) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {

        Column(modifier = Modifier.fillMaxWidth()) {
            Text(
                modifier = Modifier.clickable {
                    onBackNavigation()
                },
                text = "NavigateBack To Home",
                color = MaterialTheme.colors.primary,
                fontWeight = FontWeight.Bold,
                fontSize = MaterialTheme.typography.h4.fontSize
            )
            Spacer(modifier = Modifier.height(12.dp))
            Text(
                modifier = Modifier.clickable {
                    onNavigateToOverview()
                },
                text = "Navigate to Overview (3rd Screen)",
                color = MaterialTheme.colors.primary,
                fontWeight = FontWeight.Bold,
                fontSize = MaterialTheme.typography.h4.fontSize
            )
        }

    }
}

@Preview(showBackground = true)
@Composable
fun DetailScreenPreview() {
    DetailScreen(
        onBackNavigation = {},
        onNavigateToOverview = {}
    )
}