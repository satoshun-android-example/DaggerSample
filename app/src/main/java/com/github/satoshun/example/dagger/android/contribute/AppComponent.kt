package com.github.satoshun.example.dagger.android.contribute

import com.github.satoshun.example.dagger.android.contribute.main.MainActivityModule
import dagger.Component
import dagger.Module
import dagger.Provides
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(
  modules = [
    AndroidInjectionModule::class,
    MainActivityModule::class,
    AppModule::class
  ]
)
interface AppComponent : AndroidInjector<App> {
  @Component.Factory
  interface Factory : AndroidInjector.Factory<App>
}

@Module
object AppModule {
  @Provides
  fun provideFuga(): Fuga = Fuga()
}
