package com.github.satoshun.example

import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class MainActivity : AppCompatActivity(),
  HasAndroidInjector {
  @Inject lateinit var hoge: Hoge
  @Inject lateinit var androidInjector: DispatchingAndroidInjector<Any>

  override fun onCreate(savedInstanceState: Bundle?) {
    AndroidInjection.inject(this)
    super.onCreate(savedInstanceState)
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

  override fun androidInjector(): AndroidInjector<Any> = androidInjector
}
