package com.github.satoshun.example.dagger.android.contribute.sub

import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.Toolbar
import com.github.satoshun.example.dagger.android.contribute.R
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class SubActivity : DaggerAppCompatActivity() {
  @Inject lateinit var message: String

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.sub_activity)
    val toolbar = findViewById<View>(R.id.toolbar) as Toolbar
    setSupportActionBar(toolbar)
  }
}
