package com.github.satoshun.example

import javax.inject.Singleton

@Singleton
@dagger.Component
interface AppComponent {
  fun inject(activity: MainActivity): MainActivity
  fun inject(fragment: MainFragment): MainFragment
}
