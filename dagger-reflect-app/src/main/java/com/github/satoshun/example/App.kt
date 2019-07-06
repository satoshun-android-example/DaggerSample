package com.github.satoshun.example

import android.app.Application
import dagger.Dagger

class App : Application() {
  lateinit var appComponent: AppComponent

  override fun onCreate() {
    super.onCreate()
    appComponent = Dagger.create(AppComponent::class.java)
  }
}
