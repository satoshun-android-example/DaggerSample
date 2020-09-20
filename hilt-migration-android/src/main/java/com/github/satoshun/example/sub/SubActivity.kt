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
import com.github.satoshun.example.common.CommonDialogFragment
import com.github.satoshun.example.common.CommonDialogFragmentCounter
import com.github.satoshun.example.databinding.MainActBinding
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class SubActivity : AppCompatActivity(R.layout.main_act),
  HasAndroidInjector {

  private lateinit var binding: MainActBinding

  @Inject lateinit var simpleGreeter: SimpleGreeter
  @Inject lateinit var singletonGreeter: SingletonGreeter

  @Inject lateinit var subActivityCounter: SubActivityCounter
  @Inject lateinit var commonDialogFragmentCounter: CommonDialogFragmentCounter

  @Inject lateinit var androidInjector: DispatchingAndroidInjector<Any>

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

    binding.title.setOnClickListener {
      CommonDialogFragment().show(supportFragmentManager, "TEST")
    }

    if (savedInstanceState == null) {
      supportFragmentManager.commit {
        add(R.id.container, SubFragment())
      }
    }

    println("TESTTESTTEST SubActivity $subActivityCounter")
    println("TESTTESTTEST SubActivity $commonDialogFragmentCounter")
  }

  override fun androidInjector(): AndroidInjector<Any> = androidInjector
}
