package com.github.satoshun.example.customcomponent

import androidx.appcompat.app.AppCompatActivity
import com.github.satoshun.example.R
import dagger.BindsInstance
import dagger.hilt.DefineComponent
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject

class CustomComponentActivity : AppCompatActivity(R.layout.custom_component_act)

@DefineComponent(parent = SingletonComponent::class)
interface CustomComponentActivityComponent

@DefineComponent.Builder
interface CustomComponentActivityComponentBuilder {
  fun activity(@BindsInstance activity: CustomComponentActivity): CustomComponentActivityComponentBuilder
  fun build(): CustomComponentActivityComponent
}

class HogeHoge @Inject constructor(
  private val activity: CustomComponentActivity
)
