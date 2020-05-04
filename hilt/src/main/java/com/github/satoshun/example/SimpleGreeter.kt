package com.github.satoshun.example

import javax.inject.Inject

class SimpleGreeter @Inject constructor() {
  private var count: Int = 0

  fun countUp(): Int {
    return count++
  }
}
