package com.github.satoshun.example.common

import android.content.Context
import dagger.android.support.DaggerDialogFragment
import javax.inject.Inject

class CommonDialogFragment : DaggerDialogFragment() {
  @Inject lateinit var counter: CommonDialogFragmentCounter

  override fun onAttach(context: Context) {
    super.onAttach(context)
    println("TESTTEST CommonDialogFragment $counter")
  }
}

class CommonDialogFragmentCounter @Inject constructor()
