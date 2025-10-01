package com.timidgiraffe.mock_stock.presentation

import androidx.lifecycle.ViewModel
import com.timidgiraffe.mock_stock.repository.ForexPair
import com.timidgiraffe.mock_stock.usecases.ForexPairsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import jakarta.inject.Inject

@HiltViewModel
class ForexViewModel @Inject constructor(private val forexPairsUseCase: ForexPairsUseCase): ViewModel() {
    suspend fun getForexPairs(): List<ForexPair> {
        return forexPairsUseCase.getForexPairs()
    }
}