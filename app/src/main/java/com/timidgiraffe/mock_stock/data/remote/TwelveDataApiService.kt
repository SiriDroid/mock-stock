package com.timidgiraffe.mock_stock.data.remote

import com.timidgiraffe.mock_stock.data.StockDataResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface TwelveDataApiService {

    @GET("stocks")
    suspend fun getStockData(
        @Query("apikey") apiKey: String
    ): List<StockDataResponse>


}