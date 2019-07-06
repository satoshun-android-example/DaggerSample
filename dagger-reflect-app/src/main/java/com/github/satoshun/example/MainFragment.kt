package com.github.satoshun.example

import android.content.Context
import androidx.fragment.app.Fragment
import javax.inject.Inject

class MainFragment : Fragment() {
  @Inject lateinit var hoge: Hoge

  override fun onAttach(context: Context) {
    super.onAttach(context)
    (activity!!.application as App).appComponent.inject(this)

    hoge.show()
  }
}
