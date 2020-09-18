package com.github.satoshun.example.main

import android.app.Activity
import dagger.Module
import dagger.Provides

@Module
interface MainActivityModule {
  companion object {
    @Provides
    fun provideMainActivityCounter(activity: MainActivity): MainActivityCounter =
      MainActivityCounter(activity)
  }
}

class MainActivityCounter(
  private val activity: Activity,
  var count: Int = 0
)
