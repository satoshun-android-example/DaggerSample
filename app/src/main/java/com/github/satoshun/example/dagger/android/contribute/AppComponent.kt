package com.github.satoshun.example.dagger.android.contribute

import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@dagger.Component(
  modules = [
    AndroidSupportInjectionModule::class
  ]
)
interface AppComponent : AndroidInjector<App> {
  @dagger.Component.Builder
  abstract class Builder : AndroidInjector.Builder<App>()
}
