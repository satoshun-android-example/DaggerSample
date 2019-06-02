package com.github.satoshun.example.dagger.android.contribute.main

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface MainActivityModule {
  @ContributesAndroidInjector(modules = [MainFragmentModule::class])
  fun contributeMainActivity(): MainActivity
}

@Module
interface MainFragmentModule {
  @ContributesAndroidInjector
  fun contributeMainFragment(): MainFragment
}
