package com.github.satoshun.example

import android.content.Context
import com.github.satoshun.example.main.MainActivity
import com.github.satoshun.example.main.MainActivityModule
import dagger.Binds
import dagger.BindsInstance
import dagger.Module
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.ContributesAndroidInjector
import dagger.android.support.DaggerApplication
import dagger.hilt.DefineComponent
import dagger.hilt.EntryPoint
import dagger.hilt.EntryPoints
import dagger.hilt.InstallIn
import dagger.hilt.android.HiltAndroidApp
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityScoped
import dagger.hilt.components.SingletonComponent
import dagger.hilt.internal.GeneratedComponentManagerHolder
import javax.inject.Inject

@HiltAndroidApp
class App : DaggerApplication() {
  @EntryPoint
  @InstallIn(SingletonComponent::class)
  interface ApplicationInjector : AndroidInjector<App>

  @Inject lateinit var appComponentFactory: AppComponent.Factory

  override fun applicationInjector(): AndroidInjector<App> =
    EntryPoints.get(this, ApplicationInjector::class.java)

  override fun onCreate() {
    super.onCreate()

    val appComponent = appComponentFactory.app(this).create()

    val manager = (this as GeneratedComponentManagerHolder)
  }
}

@InstallIn(SingletonComponent::class)
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

@DefineComponent(parent = SingletonComponent::class)
interface AppComponent {
  @DefineComponent.Builder
  interface Factory {
    fun app(@BindsInstance app: App): AppComponent.Factory
    fun create(): AppComponent
  }
}
