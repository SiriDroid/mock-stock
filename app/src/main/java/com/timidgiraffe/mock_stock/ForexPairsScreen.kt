package com.timidgiraffe.mock_stock

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.timidgiraffe.mock_stock.presentation.ForexViewModel
import jakarta.inject.Inject

@Composable
fun ForexPairsScreen(forexViewModel: ForexViewModel = hiltViewModel()) {
    Column {
        Text("Forex Screen")
        LaunchedEffect(forexViewModel) {
            forexViewModel.getForexPairs()
        }

    }
}