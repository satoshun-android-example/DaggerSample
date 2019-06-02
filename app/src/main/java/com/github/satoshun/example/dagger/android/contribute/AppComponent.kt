package com.github.satoshun.example.dagger.android.contribute

import com.github.satoshun.example.dagger.android.contribute.main.MainActivityModule
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@dagger.Component(
  modules = [
    AndroidSupportInjectionModule::class,
    MainActivityModule::class
  ]
)
interface AppComponent : AndroidInjector<App> {
  @dagger.Component.Builder
  abstract class Builder : AndroidInjector.Builder<App>()
}
