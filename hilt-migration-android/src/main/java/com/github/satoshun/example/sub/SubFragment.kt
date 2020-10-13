package com.github.satoshun.example.sub

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.github.satoshun.example.R
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class SubFragment : Fragment(R.layout.main_frag) {
  private val subViewModel: SubViewModel by viewModels()

  @Inject lateinit var counter: SubActivityCounter

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)

    println("TESTTESTTEST SubFragment $counter")
    println("TESTTESTTEST SubFragment $subViewModel")
  }
}

class SubViewModel @ViewModelInject constructor() : ViewModel()
