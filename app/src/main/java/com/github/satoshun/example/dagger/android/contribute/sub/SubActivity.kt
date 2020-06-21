package com.github.satoshun.example.dagger.android.contribute.sub

import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject

class SubActivity : AppCompatActivity() {
  @Inject lateinit var counter: SubCounter
}
