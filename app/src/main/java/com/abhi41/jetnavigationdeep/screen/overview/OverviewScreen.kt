package com.abhi41.jetnavigationdeep.screen.overview

import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.abhi41.jetnavigationdeep.util.Constants

@Composable
fun OverviewScreen(
    onBackNavigation: ()-> Unit,
    onNavigateToMetaInfo: () -> Unit
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
                text = "NavigateBack To DetailScreen",
                color = MaterialTheme.colors.primary,
                fontWeight = FontWeight.Bold,
                fontSize = MaterialTheme.typography.h5.fontSize
            )
            Spacer(modifier = Modifier.height(12.dp))

            Text(
                modifier = Modifier.clickable {
                    onNavigateToMetaInfo()
                },
                text = "Navigate to MetaInfo (4th Screen)",
                color = MaterialTheme.colors.primary,
                fontWeight = FontWeight.Bold,
                fontSize = MaterialTheme.typography.h5.fontSize
            )
        }
    }
}