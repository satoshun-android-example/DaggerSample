package com.github.satoshun.example.dagger.android.contribute

import com.github.satoshun.example.dagger.android.contribute.main.MainActivityModule
import dagger.Module
import dagger.Provides
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@dagger.Component(
  modules = [
    AndroidInjectionModule::class,
    MainActivityModule::class,
    AppModule::class
  ]
)
interface AppComponent : AndroidInjector<App> {
  @dagger.Component.Factory
  interface Factory : AndroidInjector.Factory<App>
}

@Module
object AppModule {
  @JvmStatic
  @Provides
  fun provideFuga(): Fuga = Fuga()
}
