package com.github.satoshun.example

import android.util.Log
import javax.inject.Inject

class Hoge @Inject constructor() {
  fun show() {
    Log.d("show", "show")
  }
}
