package com.github.satoshun.example.dagger.android.contribute.main

import com.google.auto.factory.AutoFactory

interface MainContract {
  interface View {
    fun addTask(task: String)
    fun showMessage(message: String)
    fun showErrorMessage(errorMessage: String)
  }

  interface Presenter {
    fun doTask()
  }
}

@AutoFactory
class MainWrapper(
  val num: Int
//  @Provided val view: MainContract.View,
//  @Provided val presenter: MainContract.Presenter
)
