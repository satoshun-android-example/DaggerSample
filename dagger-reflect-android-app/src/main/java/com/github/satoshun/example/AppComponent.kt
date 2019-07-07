package com.github.satoshun.example

import dagger.Component
import dagger.Module
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.ContributesAndroidInjector
import javax.inject.Singleton

@Singleton
@Component(
  modules = [
    AndroidInjectionModule::class,
    ActivityModule::class
  ]
)
interface AppComponent : AndroidInjector<App>

@Module
interface ActivityModule {
  @ContributesAndroidInjector(modules = [MainFragmentModule::class])
  fun contributeMainActivity(): MainActivity
}

@Module
interface MainFragmentModule {
  @ContributesAndroidInjector
  fun contributeMainFragment(): MainFragment
}
