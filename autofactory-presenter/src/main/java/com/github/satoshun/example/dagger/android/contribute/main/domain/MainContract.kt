package com.github.satoshun.example.dagger.android.contribute.main.domain

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
