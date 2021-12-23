package com.example.fifausersearchservice.feature.main.ui

import android.os.Bundle
import com.example.fifausersearchservice.R
import com.example.fifausersearchservice.base.BaseActivity
import com.example.fifausersearchservice.databinding.ActivityMainBinding
import com.example.fifausersearchservice.feature.main.viewmodel.MainViewModel
import com.example.fifausersearchservice.feature.matchsearch.MatchSearchFragment
import com.example.fifausersearchservice.feature.meta.MetaFragment
import com.example.fifausersearchservice.feature.rank.TopRankFragment
import com.example.fifausersearchservice.feature.user.UserFragment
import org.koin.androidx.viewmodel.ext.android.viewModel


class MainActivity : BaseActivity<ActivityMainBinding>(
    R.layout.activity_main
) {

    private val vm: MainViewModel by viewModel()

    companion object {
        var nickName: String = ""
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.btMain.setOnClickListener {
            overridePendingTransition(0, 0)
            val intent = intent
            startActivity(intent)
            overridePendingTransition(0, 0)
            setFrag(0)
        }

        setFrag(0)

        binding.fgSearch.setOnClickListener {
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

        binding.btSearch.setOnClickListener {
            nickName = binding.etUser.text.toString()
            vm.userPost()
        }
    }

    override fun observeEvent() {
        vm.run {
            failed.observe(this@MainActivity, {
                it.run {
                    showToast("해당 구단주는 존제하지 않습니다 \n 이름이나 형식을 확인해 주세요")
                }
            })
        }
    }

    private fun setFrag(fragNum: Int) {
        val ft = supportFragmentManager.beginTransaction()
        when (fragNum) {
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