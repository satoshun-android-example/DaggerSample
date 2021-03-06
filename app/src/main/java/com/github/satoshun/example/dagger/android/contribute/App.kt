package com.github.satoshun.example.dagger.android.contribute

import android.app.Application
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class App : Application(),
  HasAndroidInjector {
  @Inject lateinit var androidInjector: DispatchingAndroidInjector<Any>

  override fun androidInjector(): AndroidInjector<Any> {
    DaggerAppComponent.factory().create(this).inject(this)
    return androidInjector
  }
}
