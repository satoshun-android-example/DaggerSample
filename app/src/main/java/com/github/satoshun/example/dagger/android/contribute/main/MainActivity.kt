package com.github.satoshun.example.dagger.android.contribute.main

import android.content.Intent
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.view.Menu
import android.widget.TextView
import android.widget.Toast
import com.github.satoshun.example.dagger.android.contribute.R
import com.github.satoshun.example.dagger.android.contribute.databinding.MainActBinding
import com.github.satoshun.example.dagger.android.contribute.sub.SubActivity
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity(),
  MainContract.View {
  @Inject lateinit var presenter: MainPresenter
  @Inject lateinit var message: String

  private lateinit var binding: MainActBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this, R.layout.main_act)
    setSupportActionBar(binding.toolbar)


    binding.fab.setOnClickListener { startActivity(Intent(this@MainActivity, SubActivity::class.java)) }
    binding.content.edit.setOnClickListener { presenter.doTask() }

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

  override fun addTask(task: String) {
    val view = TextView(this)
    view.text = task
    binding.content.container.addView(view)
  }

  override fun showMessage(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
  }

  override fun showErrorMessage(errorMessage: String) {
    Toast.makeText(this, errorMessage, Toast.LENGTH_LONG).show()
  }
}
