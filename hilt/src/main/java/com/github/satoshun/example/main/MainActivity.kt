package com.github.satoshun.example.main

import android.os.Bundle
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.get
import androidx.lifecycle.lifecycleScope
import com.github.satoshun.example.FeatureCounter
import com.github.satoshun.example.R
import com.github.satoshun.example.SimpleGreeter
import com.github.satoshun.example.SingletonGreeter
import com.github.satoshun.example.databinding.MainActBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
  private lateinit var binding: MainActBinding

  @Inject lateinit var simpleGreeter: SimpleGreeter
  @Inject lateinit var featureCounter: FeatureCounter
  @Inject lateinit var singletonGreeter: SingletonGreeter

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.main_act)
    binding = MainActBinding.bind(findViewById<ViewGroup>(android.R.id.content)[0])
    setSupportActionBar(binding.toolbar)


    lifecycleScope.launch {
      while (true) {
        delay(1000)
        println(simpleGreeter.countUp())
      }
    }
  }
}
