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
import dagger.hilt.InstallIn
import dagger.hilt.android.HiltAndroidApp
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@HiltAndroidApp
class App : Application(), HasAndroidInjector {
  @Inject lateinit var androidInjector: DispatchingAndroidInjector<Any>

  override fun androidInjector(): AndroidInjector<Any> {
    return androidInjector
  }
}

@InstallIn(ApplicationComponent::class)
@Module(
  includes = [
    AndroidInjectionModule::class,
    ActivityModule::class
  ]
)
interface AppModule {
  @Binds
  fun bindContext(@ApplicationContext app: Context): Context
}

@Module
interface ActivityModule {
  @ActivityScoped
  @ContributesAndroidInjector(
    modules = [MainActivityModule::class]
  )
  fun contributeMainActivity(): MainActivity
}
