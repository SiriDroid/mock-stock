package com.timidgiraffe.mock_stock

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.timidgiraffe.mock_stock.presentation.ForexViewModel
import com.timidgiraffe.mock_stock.repository.ForexPair
import jakarta.inject.Inject

@Composable
fun ForexPairsScreen(forexViewModel: ForexViewModel = hiltViewModel()) {
    val forexPairs by forexViewModel.forexPairs.collectAsState()

    LaunchedEffect(Unit) {
        forexViewModel.getForexPairs()
    }

    Column(modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
            Text("Forex Screen")
            LazyColumn {
                items(forexPairs.size) {
                    Text(forexPairs[it].symbol)
                }
            }
    }
}