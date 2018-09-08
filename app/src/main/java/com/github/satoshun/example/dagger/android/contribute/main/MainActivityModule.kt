package com.github.satoshun.example.dagger.android.contribute.main

import com.github.satoshun.example.dagger.android.contribute.FragmentScope
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector

@dagger.Module
class MainActivityModule {
  @Module
  abstract class BindModule {
    @FragmentScope
    @ContributesAndroidInjector(modules = [MainFragmentModule::class])
    abstract fun mainFragment(): MainFragment
  }

  @Provides fun bindPresenter(presenter: MainPresenter): MainContract.Presenter {
    return presenter
  }

  @Provides fun provideMainContractView(activity: MainActivity): MainContract.View {
    return activity
  }

  @Provides fun provideTax(): Int {
    return 10
  }
}
