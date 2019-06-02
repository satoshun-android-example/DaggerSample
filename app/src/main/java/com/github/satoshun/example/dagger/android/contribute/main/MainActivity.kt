package com.github.satoshun.example.dagger.android.contribute.main

import android.os.Bundle
import android.view.Menu
import androidx.databinding.DataBindingUtil
import com.github.satoshun.example.dagger.android.contribute.R
import com.github.satoshun.example.dagger.android.contribute.databinding.MainActBinding
import dagger.android.support.DaggerAppCompatActivity

class MainActivity : DaggerAppCompatActivity() {

  private lateinit var binding: MainActBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this, R.layout.main_act)
    setSupportActionBar(binding.toolbar)

    if (supportFragmentManager.findFragmentByTag("retain") == null) {
      supportFragmentManager.beginTransaction()
        .add(MainFragment(), "retain")
        .commit()
    }
  }

  override fun onCreateOptionsMenu(menu: Menu): Boolean {
    menuInflater.inflate(R.menu.menu_main, menu)
    return true
  }
}
