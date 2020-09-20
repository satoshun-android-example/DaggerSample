package com.github.satoshun.example.main

import android.app.Activity
import com.github.satoshun.example.ActivityScope
import com.github.satoshun.example.common.CommonDialogFragmentModule
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector

@Module(
  includes = [CommonDialogFragmentModule::class]
)
interface MainActivityModule {
  companion object {
    @ActivityScope
    @Provides
    fun provideMainActivityCounter(activity: MainActivity): MainActivityCounter =
      MainActivityCounter(activity)
  }

  @ContributesAndroidInjector
  fun contributeMainFragment(): MainFragment
}

class MainActivityCounter(
  private val activity: Activity,
  var count: Int = 0
)
