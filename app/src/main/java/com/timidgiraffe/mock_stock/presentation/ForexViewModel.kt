package com.timidgiraffe.mock_stock.presentation

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.timidgiraffe.mock_stock.repository.ForexPair
import com.timidgiraffe.mock_stock.usecases.ForexPairsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import jakarta.inject.Inject
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

@HiltViewModel
class ForexViewModel @Inject constructor(private val forexPairsUseCase: ForexPairsUseCase): ViewModel() {
    private val _forexPairs: MutableStateFlow<List<ForexPair>> = MutableStateFlow(emptyList())
    val forexPairs: StateFlow<List<ForexPair>> = _forexPairs.asStateFlow()

    suspend fun getForexPairs(): List<ForexPair> {
        return forexPairsUseCase.getForexPairs()
    }
}