package com.github.satoshun.example.dagger.android.contribute.main

import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.github.satoshun.example.dagger.android.contribute.Hoge
import com.github.satoshun.example.dagger.android.contribute.R
import com.github.satoshun.example.dagger.android.contribute.databinding.MainActBinding
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class MainActivity : AppCompatActivity(),
  HasAndroidInjector {

  private lateinit var binding: MainActBinding

  @Inject lateinit var androidInjector: DispatchingAndroidInjector<Any>
  @Inject lateinit var hoge: Hoge

  override fun onCreate(savedInstanceState: Bundle?) {
    AndroidInjection.inject(this)
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this, R.layout.main_act)
    setSupportActionBar(binding.toolbar)

    hoge.show()

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

  override fun androidInjector(): AndroidInjector<Any> {
    return androidInjector
  }
}