package com.github.satoshun.example.dagger.android.contribute

import dagger.Module
import dagger.Provides

@Module class BuildModule {
  @Provides fun provideMessage(): String {
    return "Hello World!!"
  }
}
