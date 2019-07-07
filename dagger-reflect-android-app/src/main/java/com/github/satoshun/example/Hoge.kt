package com.github.satoshun.example

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Hoge @Inject constructor() {
  private var count = 1

  fun show(source: String) {
    Log.d("show", "$source ${count++}")
  }
}
