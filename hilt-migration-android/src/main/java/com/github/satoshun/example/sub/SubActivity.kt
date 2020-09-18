package com.github.satoshun.example.sub

import android.os.Bundle
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.get
import androidx.fragment.app.commit
import androidx.lifecycle.lifecycleScope
import com.github.satoshun.example.R
import com.github.satoshun.example.SimpleGreeter
import com.github.satoshun.example.SingletonGreeter
import com.github.satoshun.example.databinding.MainActBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class SubActivity : AppCompatActivity(R.layout.main_act) {
  private lateinit var binding: MainActBinding

  @Inject lateinit var simpleGreeter: SimpleGreeter
  @Inject lateinit var singletonGreeter: SingletonGreeter

  @Inject lateinit var subActivityCounter: SubActivityCounter

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = MainActBinding.bind(findViewById<ViewGroup>(android.R.id.content)[0])
    setSupportActionBar(binding.toolbar)

    title = "サブ"

    binding.title.text = "INSTANCE $simpleGreeter"

    lifecycleScope.launch {
      while (true) {
        delay(1000)
        println(simpleGreeter.countUp())
      }
    }

    if (savedInstanceState == null) {
      supportFragmentManager.commit {
        add(R.id.container, SubFragment())
      }
    }

    println("TESTTESTTEST SubActivity $subActivityCounter")
  }
}
