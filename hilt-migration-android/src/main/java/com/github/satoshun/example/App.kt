package com.github.satoshun.example

import android.app.Application
import android.content.Context
import com.github.satoshun.example.main.MainActivity
import com.github.satoshun.example.main.MainActivityModule
import dagger.Binds
import dagger.Module
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.ContributesAndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject
import javax.inject.Singleton

class App : Application(), HasAndroidInjector {
  @Inject lateinit var androidInjector: DispatchingAndroidInjector<Any>

  override fun androidInjector(): AndroidInjector<Any> {
    DaggerAppComponent.factory().create(this).inject(this)
    return androidInjector
  }
}

@Singleton
@dagger.Component(
  modules = [
    AndroidInjectionModule::class,
    AppModule::class
  ]
)
interface AppComponent : AndroidInjector<App> {
  @dagger.Component.Factory
  interface Factory : AndroidInjector.Factory<App>
}

@Module
interface AppModule {
  @ContributesAndroidInjector(
    modules = [MainActivityModule::class]
  )
  fun contributeMainActivity(): MainActivity

  @Binds
  fun bindContext(app: App): Context
}
