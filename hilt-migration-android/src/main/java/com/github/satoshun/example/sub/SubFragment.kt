package com.github.satoshun.example.sub

import android.os.Bundle
import android.view.View
import com.github.satoshun.example.R
import dagger.android.support.DaggerFragment
import javax.inject.Inject

class SubFragment : DaggerFragment(R.layout.main_frag) {
  @Inject lateinit var counter: SubActivityCounter

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)

    println("TESTTESTTEST SubFragment $counter")
  }
}
