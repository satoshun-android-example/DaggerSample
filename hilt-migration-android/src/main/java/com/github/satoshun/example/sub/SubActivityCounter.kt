package com.github.satoshun.example.sub

import android.app.Activity
import javax.inject.Inject

class SubActivityCounter @Inject constructor(
  private val activity: Activity
)
