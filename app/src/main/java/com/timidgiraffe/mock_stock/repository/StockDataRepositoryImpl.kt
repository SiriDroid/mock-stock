package com.timidgiraffe.mock_stock.repository

class StockDataRepositoryImpl {
}

interface StockDataRepository {
    suspend fun getStockData(): List<StockData>
}

data class StockData(
    val symbol: String,
    val price: Double,
    val change: Double,
    val changePercent: Double)