package com.timidgiraffe.mock_stock.api

import com.timidgiraffe.mock_stock.repository.ForexPair
import com.timidgiraffe.mock_stock.repository.StockData
import retrofit2.http.GET

interface ApiService {
    @GET("/stocks")
    suspend fun getStockData(): List<StockData>

    @GET("/stocks/{symbol}")
    suspend fun getStockData(symbol: String): StockData

    @GET("/forex_pairs")
    suspend fun getForexPairs(): List<ForexPair>

}