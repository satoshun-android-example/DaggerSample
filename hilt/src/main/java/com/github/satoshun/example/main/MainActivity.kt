package com.github.satoshun.example.main

import android.content.Intent
import android.os.Bundle
import android.view.ViewGroup
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.get
import androidx.lifecycle.ViewModel
import androidx.lifecycle.lifecycleScope
import com.example.lib1.Lib1
import com.github.satoshun.example.FeatureCounter
import com.github.satoshun.example.R
import com.github.satoshun.example.SimpleGreeter
import com.github.satoshun.example.SingletonGreeter
import com.github.satoshun.example.customcomponent.CustomComponentActivity
import com.github.satoshun.example.databinding.MainActBinding
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.scopes.ActivityRetainedScoped
import dagger.hilt.android.scopes.ActivityScoped
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

@ViewModelScoped
class ViewModelScopeTest @Inject constructor()

@ActivityRetainedScoped
class ActivityRetainedScopeTest @Inject constructor(
//  private val in1: TestViewModel
)

@ActivityScoped
class ActivityScopeTest @Inject constructor(
//  private val in1: TestViewModel
)

@HiltViewModel
class TestViewModel @Inject constructor(
  private val in1: ViewModelScopeTest
//  private val in3: ActivityRetainedScopeTest
//  private val in2: ActivityScopeTest
) : ViewModel()

@AndroidEntryPoint
class MainActivity : AppCompatActivity(R.layout.main_act) {
  private lateinit var binding: MainActBinding

  @Inject lateinit var simpleGreeter: SimpleGreeter
  @Inject lateinit var featureCounter: FeatureCounter
  @Inject lateinit var singletonGreeter: SingletonGreeter

  @Inject lateinit var mainActivityCounter: MainActivityCounter

  //  @Inject lateinit var viewModelScopeTest: ViewModelScopeTest
  @Inject lateinit var activityRetainedScopeTest: ActivityRetainedScopeTest
  @Inject lateinit var activityScopeTest: ActivityScopeTest

  @Inject lateinit var a: Lib1

  private val testViewModel by viewModels<TestViewModel>()

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = MainActBinding.bind(findViewById<ViewGroup>(android.R.id.content)[0])
    setSupportActionBar(binding.toolbar)

    testViewModel

    lifecycleScope.launch {
      while (true) {
        delay(1000)
        println(simpleGreeter.countUp())
      }
    }

    binding.edit.setOnClickListener {
      startActivity(Intent(this, CustomComponentActivity::class.java))
    }
  }
}
