package com.github.satoshun.example

import android.os.Bundle
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.get
import com.github.satoshun.example.databinding.MainActBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
  private lateinit var binding: MainActBinding

  @Inject lateinit var simpleGreeter: SimpleGreeter

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.main_act)
    binding = MainActBinding.bind(findViewById<ViewGroup>(android.R.id.content)[0])
    setSupportActionBar(binding.toolbar)

    simpleGreeter
  }
}
