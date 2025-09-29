package com.timidgiraffe.mock_stock.presentation

import com.timidgiraffe.mock_stock.data.StockDataResponse
import com.timidgiraffe.mock_stock.data.repository.StockDataRepository

class StockUseCase(private val repository: StockDataRepository) {
    suspend fun getStockData(): List<StockDataResponse> {
        return repository.getStockData()
    }

}