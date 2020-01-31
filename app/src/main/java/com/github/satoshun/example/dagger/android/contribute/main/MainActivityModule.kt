package com.github.satoshun.example.dagger.android.contribute.main

import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector

@Module
interface MainActivityModule {
  companion object {
    @Provides
    fun provideTestHoge(): TestHoge = TestHoge()
  }

  @ContributesAndroidInjector(modules = [MainFragmentModule::class])
  fun contributeMainActivity(): MainActivity
}

@Module
interface MainFragmentModule {
  @ContributesAndroidInjector
  fun contributeMainFragment(): MainFragment
}

class TestHoge
