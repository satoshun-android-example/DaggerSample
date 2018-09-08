package com.github.satoshun.example.dagger.android.contribute.main

import java.util.Random

import javax.inject.Inject

class MainPresenter @Inject constructor(
  private val view: MainContract.View
) : MainContract.Presenter {
  override fun doTask() {
    if (Random().nextInt(2) == 0) {
      view.addTask("TASK")
      view.showMessage("SUCCESS")
    } else {
      view.showErrorMessage("ERROR")
    }
  }
}
