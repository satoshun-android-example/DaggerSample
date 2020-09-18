package com.github.satoshun.example.common

import android.content.Context
import dagger.android.support.DaggerDialogFragment
import dagger.hilt.android.scopes.ActivityScoped
import dagger.hilt.android.scopes.FragmentScoped
import javax.inject.Inject

class CommonDialogFragment : DaggerDialogFragment() {
  @Inject lateinit var counter: CommonDialogFragmentCounter

  override fun onAttach(context: Context) {
    super.onAttach(context)
    println("TESTTEST CommonDialogFragment $counter")
  }
}

@ActivityScoped
class CommonDialogFragmentCounter @Inject constructor()
