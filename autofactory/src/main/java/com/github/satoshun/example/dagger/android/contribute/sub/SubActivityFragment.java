package com.github.satoshun.example.dagger.android.contribute.sub;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.github.satoshun.example.dagger.android.contribute.databinding.FragmentSubBinding;
import dagger.android.support.DaggerFragment;

import javax.inject.Inject;

public class SubActivityFragment extends DaggerFragment implements SubActivityContract.View {

  @Inject SubActivityViewModel viewModel;

  @Inject String message; // from App Component
  @Inject int tax; // from Activity Component
  @Inject float weight; // from Fragment Component

  private FragmentSubBinding binding;

  public SubActivityFragment() {
  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {
    binding = FragmentSubBinding.inflate(inflater, container, false);
    binding.setModel(viewModel);
    return binding.getRoot();
  }

  @Override public void onViewCreated(View view, Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
  }
}
