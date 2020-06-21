package com.github.satoshun.example.dagger.android.contribute

import android.util.Log
import com.github.satoshun.example.dagger.android.contribute.main.MainActivity
import javax.inject.Inject

class Hoge @Inject constructor(
  private val mainActivity: MainActivity
) {
  fun show() {
    Log.d("show", "show")
  }
}
