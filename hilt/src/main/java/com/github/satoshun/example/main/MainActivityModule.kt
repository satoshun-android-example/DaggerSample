package com.github.satoshun.example.main

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent
import dagger.hilt.android.scopes.ActivityRetainedScoped

@Module
@InstallIn(ActivityRetainedComponent::class)
object MainActivityModule {
  @Provides
  @ActivityRetainedScoped
  fun provideMainActivityCounter(): MainActivityCounter =
    MainActivityCounter()
}

class MainActivityCounter(var count: Int = 0)
