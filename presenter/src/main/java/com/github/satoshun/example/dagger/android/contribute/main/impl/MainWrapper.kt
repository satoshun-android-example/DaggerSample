package com.github.satoshun.example.dagger.android.contribute.main.impl

import com.github.satoshun.example.dagger.android.contribute.main.domain.MainContract
import com.google.auto.factory.AutoFactory
import com.google.auto.factory.Provided

@AutoFactory
class MainWrapper(
  val num: Int,
  @Provided val view: MainContract.View,
  @Provided val presenter: MainContract.Presenter
)
