package com.github.satoshun.example.common

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface CommonDialogFragmentModule {
  @ContributesAndroidInjector
  fun contributeCommonDialogFragment(): CommonDialogFragment
}
