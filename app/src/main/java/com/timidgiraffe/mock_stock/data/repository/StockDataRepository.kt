package com.timidgiraffe.mock_stock.data.repository

import com.timidgiraffe.mock_stock.data.StockDataResponse
import com.timidgiraffe.mock_stock.data.remote.TwelveDataApiService

class StockDataRepositoryImpl(val apiService: TwelveDataApiService): StockDataRepository {
    override suspend fun getStockData(): List<StockDataResponse> {
        return apiService.getStockData(BuildConfig.apiKey)
    }
}

interface StockDataRepository {
    suspend fun getStockData(): List<StockDataResponse>
}