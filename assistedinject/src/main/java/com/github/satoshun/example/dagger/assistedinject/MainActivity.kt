package com.github.satoshun.example.dagger.assistedinject

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.squareup.inject.assisted.Assisted
import com.squareup.inject.assisted.AssistedInject
import com.squareup.inject.assisted.dagger2.AssistedModule
import dagger.Component
import dagger.Module
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
  @Inject lateinit var factory: Greeter.Factory

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    DaggerMainComponent.builder().build().inject(this)
    factory.create(100)
  }
}

@Component(modules = [ViewModule::class])
interface MainComponent {
  fun inject(activity: MainActivity)
}

class Greeter @AssistedInject constructor(
  @Assisted val num: Int,
  val greeter2: Greeter2
) {

  @AssistedInject.Factory
  interface Factory {
    fun create(num: Int): Greeter
  }
}

class Greeter2 @Inject constructor()

@AssistedModule
@Module(includes = [AssistedInject_ViewModule::class])
abstract class ViewModule
