package com.example.fifausersearchservice.feature.main.ui

import android.os.Bundle
import com.example.fifausersearchservice.R
import com.example.fifausersearchservice.base.BaseActivity
import com.example.fifausersearchservice.databinding.ActivityMainBinding
import android.content.Intent
import android.util.Log
import com.example.fifausersearchservice.feature.main.viewmodel.MainViewModel
import com.example.fifausersearchservice.feature.matchsearch.MatchSearchFragment
import com.example.fifausersearchservice.feature.meta.MetaFragment
import com.example.fifausersearchservice.feature.rank.TopRankFragment
import com.example.fifausersearchservice.feature.user.UserFragment
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

        setFrag(0)

        binding.fgSearch.setOnClickListener{
            setFrag(0)
        }

        binding.fgMatch.setOnClickListener {
            setFrag(1)
        }

        binding.fgMeta.setOnClickListener {
            setFrag(2)
        }

        binding.fgRank.setOnClickListener {
            setFrag(3)
        }
    }

    override fun observeEvent() {

    }

    private fun setFrag(fragnum : Int) {
        val ft = supportFragmentManager.beginTransaction()
        when(fragnum){
            0 -> {
                ft.replace(R.id.fragment, UserFragment()).commit()
            }
            1 -> {
                ft.replace(R.id.fragment, MatchSearchFragment()).commit()
            }
            2 -> {
                ft.replace(R.id.fragment, MetaFragment()).commit()
            }
            3 -> {
                ft.replace(R.id.fragment, TopRankFragment()).commit()
            }
        }
    }
}