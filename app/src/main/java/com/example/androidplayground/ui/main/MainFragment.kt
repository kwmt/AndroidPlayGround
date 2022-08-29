package com.example.androidplayground.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.androidplayground.R

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
        private val TAG = MainFragment::class.java.simpleName
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]

        Log.d(TAG, "onViewCreated")

        Log.d(TAG, "viewModel.defaultValue.observe(viewLifecycleOwner)")
        viewModel.defaultValue.observe(viewLifecycleOwner) {
            Log.d(TAG, "defaultValue LiveData#onChanged is called")
        }
        Log.d(TAG, "viewModel.noDefaultValue.observe")
        viewModel.noDefaultValue.observe(viewLifecycleOwner) {
            Log.d(TAG, "noDefaultValue LiveData#onChanged is called")
        }
    }
}
