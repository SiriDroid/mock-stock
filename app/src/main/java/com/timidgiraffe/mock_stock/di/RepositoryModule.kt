package com.timidgiraffe.mock_stock.di

import com.timidgiraffe.mock_stock.api.ApiService
import com.timidgiraffe.mock_stock.repository.ForexPairsRepository
import com.timidgiraffe.mock_stock.repository.ForexPairsRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Provides
    @Singleton
    fun provideForexPairsRepository(apiService: ApiService): ForexPairsRepository {
        return ForexPairsRepositoryImpl(apiService)
    }
}