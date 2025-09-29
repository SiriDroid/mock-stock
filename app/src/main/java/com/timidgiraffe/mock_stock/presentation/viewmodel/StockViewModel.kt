package com.timidgiraffe.mock_stock.presentation.viewmodel

class StockViewModel(val repository: StockDataRepository): ViewModel() {
    private val useCase = StockUseCase(repository)

    private val _stockData = MutableLiveData<List<StockDataResponse>>()
    val stockData: LiveData<List<StockDataResponse>> = _stockData
    init {
        viewModelScope.launch {
            val data = useCase.getStockData()
            _stockData.value = data
        }
    }
}