package com.exampleone.nicoin.di

import android.app.Application

class CoinApp : Application() {

    val component by lazy {
        DaggerApplicationComponent.factory().create(this)

    }
}
