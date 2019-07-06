package com.github.satoshun.example

import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
  @Inject lateinit var hoge: Hoge

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    (application as App).appComponent.inject(this)
    setContentView(R.layout.main_act)
    setSupportActionBar(findViewById(R.id.toolbar))

    hoge.show("MainActivity")

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
