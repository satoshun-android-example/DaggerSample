package com.github.satoshun.example.dagger.android.contribute.main;

import android.os.Bundle;
import dagger.android.support.DaggerFragment;

import javax.inject.Inject;

public class MainFragment extends DaggerFragment {

  @Inject String message; // from App Component
  @Inject int tax; // from Activity Component
  @Inject float weight; // from Fragment Component

  @Override public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setRetainInstance(true);
  }
}
