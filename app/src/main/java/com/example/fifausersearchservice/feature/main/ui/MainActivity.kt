package com.example.fifausersearchservice.feature.main.ui

import android.os.Bundle
import com.example.fifausersearchservice.R
import com.example.fifausersearchservice.base.BaseActivity
import com.example.fifausersearchservice.databinding.ActivityMainBinding
import android.content.Intent
import com.example.fifausersearchservice.feature.main.viewmodel.MainViewModel
import org.koin.androidx.viewmodel.compat.ScopeCompat.viewModel
import org.koin.androidx.viewmodel.ext.android.viewModel


class MainActivity : BaseActivity<ActivityMainBinding>(
    R.layout.activity_main
) {

    private val vm: MainViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.btMain.setOnClickListener {
            overridePendingTransition(0, 0)
            val intent = intent
            startActivity(intent)
            overridePendingTransition(0, 0)
        }

        binding.btSearch.setOnClickListener {

        }
    }

    override fun observeEvent() {

    }
}