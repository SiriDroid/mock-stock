package com.timidgiraffe.mock_stock.repository

import android.util.Log

class ForexPairsRepositoryImpl: ForexPairsRepository {
    override suspend fun getForexPairs(): List<ForexPair> {
        Log.d("FOREX PAIRS", "getForexPairs: ")
        return emptyList()
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
