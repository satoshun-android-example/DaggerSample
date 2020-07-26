package com.github.satoshun.example.customcomponent

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.satoshun.example.R
import dagger.BindsInstance
import dagger.hilt.DefineComponent
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Inject

class CustomComponentActivity : AppCompatActivity(R.layout.custom_component_act) {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
  }
}

@DefineComponent(parent = ApplicationComponent::class)
interface CustomComponentActivityComponent

@DefineComponent.Builder
interface CustomComponentActivityComponentBuilder {
  fun activity(@BindsInstance activity: CustomComponentActivity): CustomComponentActivityComponentBuilder
  fun build(): CustomComponentActivityComponent
}

class HogeHoge @Inject constructor(
  private val activity: CustomComponentActivity
)
