package com.github.satoshun.example.common

import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@InstallIn(ActivityComponent::class)
@Module
interface CommonDialogFragmentModule {
  @ContributesAndroidInjector
  fun contributeCommonDialogFragment(): CommonDialogFragment
}
