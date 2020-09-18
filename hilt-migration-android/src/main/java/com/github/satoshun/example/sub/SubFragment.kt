package com.github.satoshun.example.sub

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.github.satoshun.example.R
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class SubFragment : Fragment(R.layout.main_frag) {
  @Inject lateinit var counter: SubActivityCounter

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)

    println("TESTTESTTEST SubFragment $counter")
  }
}
