package com.github.satoshun.example

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent
import dagger.hilt.android.scopes.ActivityRetainedScoped

@Module
@InstallIn(ActivityRetainedComponent::class)
object FeatureModule {
  @Provides
  @ActivityRetainedScoped
  fun provideData() = FeatureCounter(0)
}

class FeatureCounter(var count: Int)
