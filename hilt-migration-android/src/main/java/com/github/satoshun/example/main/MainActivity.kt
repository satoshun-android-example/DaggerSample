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
import dagger.Module
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.ContributesAndroidInjector
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainActivity : AppCompatActivity(R.layout.main_act) {
  private lateinit var binding: MainActBinding

  @Inject lateinit var simpleGreeter: SimpleGreeter
  @Inject lateinit var singletonGreeter: SingletonGreeter

  @Inject lateinit var mainActivityCounter: MainActivityCounter

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    AndroidInjection.inject(this)
    binding = MainActBinding.bind(findViewById<ViewGroup>(android.R.id.content)[0])
    setSupportActionBar(binding.toolbar)

    lifecycleScope.launch {
      while (true) {
        delay(1000)
        println(simpleGreeter.countUp())
      }
    }

    binding.edit.setOnClickListener {
    }
  }
}
