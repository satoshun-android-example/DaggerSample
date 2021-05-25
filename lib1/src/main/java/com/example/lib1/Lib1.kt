package com.example.lib1

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject

class Lib1 @Inject constructor(
  private val lib1: Lib2
)

@InstallIn(SingletonComponent::class)
@Module
class LibModule {
  @Provides
  fun provideLib2(): Lib2 = Lib2()
}
