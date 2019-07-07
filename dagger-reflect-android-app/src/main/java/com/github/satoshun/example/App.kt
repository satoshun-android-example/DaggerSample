package com.github.satoshun.example

import android.app.Application
import dagger.Dagger
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class App : Application(), HasAndroidInjector {
  @Inject lateinit var androidInjector: DispatchingAndroidInjector<Any>

  override fun androidInjector(): AndroidInjector<Any> {
    Dagger.create(AppComponent::class.java).inject(this)
    return androidInjector
  }
}
