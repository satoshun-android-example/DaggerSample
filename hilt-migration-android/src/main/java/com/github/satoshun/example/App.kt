package com.github.satoshun.example

import android.app.Application
import android.content.Context
import com.github.satoshun.example.main.MainActivity
import com.github.satoshun.example.main.MainActivityModule
import dagger.Binds
import dagger.BindsInstance
import dagger.Module
import dagger.android.*
import dagger.hilt.DefineComponent
import dagger.hilt.InstallIn
import dagger.hilt.android.HiltAndroidApp
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityScoped
import dagger.hilt.internal.GeneratedComponentManagerHolder
import javax.inject.Inject

@HiltAndroidApp
class App : Application(), HasAndroidInjector {
  @Inject lateinit var androidInjector: DispatchingAndroidInjector<Any>
  @Inject lateinit var appComponentFactory: AppComponent.Factory

  override fun androidInjector(): AndroidInjector<Any> {
    return androidInjector
  }

  override fun onCreate() {
    super.onCreate()

    val appComponent = appComponentFactory.app(this).create()

    val manager = (this as GeneratedComponentManagerHolder)
  }
}

@InstallIn(ApplicationComponent::class)
@Module(
  includes = [
    AndroidInjectionModule::class,
    ActivityModule::class
  ]
)
interface AppModule {
  @Binds
  fun bindContext(@ApplicationContext app: Context): Context
}

@Module
interface ActivityModule {
  @ActivityScoped
  @ContributesAndroidInjector(
    modules = [MainActivityModule::class]
  )
  fun contributeMainActivity(): MainActivity
}

@DefineComponent(parent = ApplicationComponent::class)
interface AppComponent {
  @DefineComponent.Builder
  interface Factory {
    fun app(@BindsInstance app: App): AppComponent.Factory
    fun create(): AppComponent
  }
}
