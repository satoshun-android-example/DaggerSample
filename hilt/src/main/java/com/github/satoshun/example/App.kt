package com.github.satoshun.example

import android.app.Application
import dagger.hilt.GenerateComponents
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@GenerateComponents
@AndroidEntryPoint
class App : Application() {
  @Inject lateinit var simpleGreeter: SimpleGreeter
  @Inject lateinit var simpleGreeter2: SimpleGreeter2
}
