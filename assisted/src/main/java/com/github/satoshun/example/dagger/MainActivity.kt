package com.github.satoshun.example.dagger

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.lifecycleScope
import com.github.satoshun.example.dagger.databinding.MainActBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
  private lateinit var binding: MainActBinding

  //  @Inject lateinit var counter: Counter
  @Inject lateinit var factory: CounterFactory

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this, R.layout.main_act)
    setSupportActionBar(binding.toolbar)

    supportFragmentManager.beginTransaction()
      .add(MainFragment(), "main")
      .commit()

    val counter = factory.create(initialValue = 100)
    counter.count
      .onEach {
        binding.counter.text = it.toString()
      }
      .launchIn(lifecycleScope)

    lifecycleScope.launch {
      while (true) {
        delay(2000)
        counter.countUp()
      }
    }
  }
}
