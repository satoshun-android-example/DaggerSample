package com.github.satoshun.example

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SimpleGreeter @Inject constructor() {
  private var count: Int = 0

  fun countUp(): Int {
    return count++
  }
}

class SimpleGreeter2 @Inject constructor() {
  private var count: Int = 0

  fun countUp(): Int {
    return count++
  }
}
