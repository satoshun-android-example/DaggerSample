package com.github.satoshun.example.dagger

import dagger.assisted.Assisted
import dagger.assisted.AssistedFactory
import dagger.assisted.AssistedInject
import kotlinx.coroutines.flow.MutableStateFlow

class Counter @AssistedInject constructor(
  @Assisted private val initialValue: Int
) {
  val count = MutableStateFlow(initialValue)

  fun countUp() {
    count.value = count.value + 1
  }
}

@AssistedFactory
interface CounterFactory {
  fun create(initialValue: Int): Counter
}
