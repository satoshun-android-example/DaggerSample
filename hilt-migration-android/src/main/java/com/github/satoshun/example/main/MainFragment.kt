package com.github.satoshun.example.main

import android.os.Bundle
import android.view.View
import com.github.satoshun.example.R
import dagger.android.support.DaggerFragment
import javax.inject.Inject

class MainFragment : DaggerFragment(R.layout.main_frag) {
  @Inject lateinit var counter: MainActivityCounter

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)

    println("TESTTEST MainFragment $counter")
  }
}
