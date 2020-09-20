package com.github.satoshun.example.sub

import android.app.Activity
import com.github.satoshun.example.common.CommonDialogFragmentModule
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module(
  includes = [CommonDialogFragmentModule::class]
)
interface SubActivityModule {
  @ContributesAndroidInjector
  fun contributeMainFragment(): SubFragment

  @Binds
  fun bindActivity(activity: SubActivity): Activity
}
