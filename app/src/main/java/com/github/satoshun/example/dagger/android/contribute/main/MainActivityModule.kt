package com.github.satoshun.example.dagger.android.contribute.main

import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector
import javax.inject.Qualifier

@Module(
  includes = [
    ObjectModule::class,
    NamedModule::class
  ]
)
interface MainActivityModule {
  companion object {
    @Provides
    fun provideTestHoge(): TestHoge = TestHoge()
  }

  @ContributesAndroidInjector(modules = [MainFragmentModule::class])
  fun contributeMainActivity(): MainActivity
}

@Module
interface MainFragmentModule {
  @ContributesAndroidInjector
  fun contributeMainFragment(): MainFragment
}

class TestHoge

@Module
object ObjectModule {
  @Provides
  fun provideTestObject(): TestObject = TestObject()
}

class TestObject

@Qualifier
annotation class BaseQualifier

@Module
object NamedModule {
  @BaseQualifier
  @Provides
  fun provideNamedObject(): NamedObject = NamedObject()
}

class NamedObject
