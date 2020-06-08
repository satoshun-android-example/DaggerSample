package com.github.satoshun.example

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class App : Application() {
  @Inject lateinit var simpleGreeter: SimpleGreeter
  @Inject lateinit var simpleGreeter2: SimpleGreeter2
}
