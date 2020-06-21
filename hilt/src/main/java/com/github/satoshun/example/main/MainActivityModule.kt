package com.github.satoshun.example.main

import android.app.Activity
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped

@Module
@InstallIn(ActivityComponent::class)
object MainActivityModule {
  @Provides
  @ActivityScoped
  fun provideMainActivityCounter(activity: MainActivity): MainActivityCounter =
    MainActivityCounter(activity)

  @Provides
  fun provideMainActivity(activity: Activity): MainActivity =
    activity as MainActivity
}

class MainActivityCounter(
  private val activity: Activity,
  var count: Int = 0
)
