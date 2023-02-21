package com.abhi41.jetnavigationdeep.screen.detail

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun DetailScreen(
    onBackNavigation: ()-> Unit
) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {

        Text(
            modifier = Modifier.clickable {
                onBackNavigation()
            },
            text = "Detail Screen Content",
            color = MaterialTheme.colors.primary,
            fontWeight = FontWeight.ExtraBold,
            fontSize = MaterialTheme.typography.h3.fontSize
        )

    }
}

@Preview(showBackground = true)
@Composable
fun DetailScreenPreview() {
    DetailScreen(onBackNavigation = {})
}