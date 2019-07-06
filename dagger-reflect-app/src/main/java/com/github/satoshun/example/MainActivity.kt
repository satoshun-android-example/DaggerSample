package com.github.satoshun.example

import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.github.satoshun.example.databinding.MainActBinding
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

  private lateinit var binding: MainActBinding

  @Inject lateinit var hoge: Hoge

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    (application as App).appComponent.inject(this)
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
}
