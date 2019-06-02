package com.github.satoshun.example.dagger.android.contribute.main

import android.content.Context
import androidx.fragment.app.Fragment
import com.github.satoshun.example.dagger.android.contribute.Hoge
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject

class MainFragment : Fragment() {
  @Inject lateinit var hoge: Hoge

  override fun onAttach(context: Context) {
    AndroidSupportInjection.inject(this)
    super.onAttach(context)

    hoge.show()
  }
}
