package com.github.satoshun.example.main

import android.content.Intent
import android.os.Bundle
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.get
import androidx.lifecycle.lifecycleScope
import com.github.satoshun.example.R
import com.github.satoshun.example.SimpleGreeter
import com.github.satoshun.example.SingletonGreeter
import com.github.satoshun.example.databinding.MainActBinding
import com.github.satoshun.example.sub.SubActivity
import dagger.android.AndroidInjection
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

    binding.title.text = "INSTANCE $simpleGreeter"

    lifecycleScope.launch {
      while (true) {
        delay(1000)
        println(simpleGreeter.countUp())
      }
    }

    binding.edit.setOnClickListener {
      startActivity(
        Intent(this@MainActivity, SubActivity::class.java)
      )
    }

    println(simpleGreeter)
  }
}
