package com.exampleone.nicoin.di

import android.app.Application
import com.exampleone.nicoin.data.database.AppDatabase
import com.exampleone.nicoin.data.database.CoinInfoDao
import com.exampleone.nicoin.data.repository.CoinRepositoryImpl
import com.exampleone.nicoin.domain.CoinRepository
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface DataModule {

    @Binds
    fun bindCoinRepository(impl: CoinRepositoryImpl): CoinRepository

    companion object {

        @Provides
        fun provideCoinInfoDao(
            application: Application
        ): CoinInfoDao {
            return AppDatabase.getInstance(application).coinPriceInfoDao()
        }
    }
}