package com.github.satoshun.example.sub

import android.app.Activity
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class SubActivityCounter @Inject constructor(
  private val activity: Activity
)
