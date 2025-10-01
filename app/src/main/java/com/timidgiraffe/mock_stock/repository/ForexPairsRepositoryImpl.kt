package com.timidgiraffe.mock_stock.repository

import android.util.Log
import com.timidgiraffe.mock_stock.api.ApiService
import jakarta.inject.Inject

class ForexPairsRepositoryImpl @Inject constructor(private val apiService: ApiService) : ForexPairsRepository {
    override suspend fun getForexPairs(): List<ForexPair> {
        return apiService.getForexPairs()
    }
}

interface ForexPairsRepository {
    suspend fun getForexPairs(): List<ForexPair>
}

data class ForexPair(
    val symbol: String,
    val currencyGroup: String,
    val currencyBase: String,
    val currencyQuote: String
)
