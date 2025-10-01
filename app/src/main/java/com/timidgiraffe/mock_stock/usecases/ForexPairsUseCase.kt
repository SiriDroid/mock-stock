package com.timidgiraffe.mock_stock.usecases

import com.timidgiraffe.mock_stock.repository.ForexPair
import com.timidgiraffe.mock_stock.repository.ForexPairsRepository
import jakarta.inject.Inject

class ForexPairsUseCase @Inject constructor(private val forexPairsRepository: ForexPairsRepository) {
    suspend fun getForexPairs(): List<ForexPair> {
        return forexPairsRepository.getForexPairs()
    }
}