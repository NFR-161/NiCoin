package com.exampleone.nicoin.di

import android.app.Application
import com.exampleone.nicoin.presentation.CoinDetailFragment
import com.exampleone.nicoin.presentation.CoinPriceListActivity
import dagger.BindsInstance
import dagger.Component

 @Component(
    modules = [
        DataModule::class,
        ViewModelModule::class
    ]
)
interface ApplicationComponent {

    fun inject(activity: CoinPriceListActivity)

    fun inject(fragment: CoinDetailFragment)

    @Component.Factory
    interface Factory {

        fun create(
            @BindsInstance application: Application
        ): ApplicationComponent
    }
}
