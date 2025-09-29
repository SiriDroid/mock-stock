package com.timidgiraffe.mock_stock.data


data class StockDataResponse(
    val symbol: String,
    val name: String,
    val currency: String,
    val exchange: String,
    val mic_code: String,
    val country: String,
    val type: String,
    val figi_code: String,
    val cfi_code: String,
    val isin: String,
    val cusip: String,
    val access: Access
)

data class Access(
    val global: String,
    val plan: String
)
