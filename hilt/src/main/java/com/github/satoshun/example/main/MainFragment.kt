package com.github.satoshun.example.main

import androidx.fragment.app.Fragment
import com.github.satoshun.example.FeatureCounter
import com.github.satoshun.example.SimpleGreeter
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainFragment : Fragment() {
  @Inject lateinit var simpleGreeter: SimpleGreeter
  @Inject lateinit var featureCounter: FeatureCounter
}
