package com.github.satoshun.example

import android.content.Context
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SingletonGreeter @Inject constructor(
  @ApplicationContext private val context: Context
) {
  private var count: Int = 0

  fun countUp(): Int {
    return count++
  }
}
