package com.example.fifausersearchservice.feature.user.dto.ui

import android.view.View
import com.example.fifausersearchservice.R
import com.example.fifausersearchservice.base.BaseFragment
import com.example.fifausersearchservice.databinding.FragmentUsersBinding
import com.example.fifausersearchservice.feature.main.viewmodel.MainViewModel
import com.example.fifausersearchservice.feature.user.RankListViewData
import org.koin.androidx.viewmodel.ext.android.sharedViewModel

class UserFragment: BaseFragment<FragmentUsersBinding>(
    R.layout.fragment_users
){
    private val vm: MainViewModel by sharedViewModel()
    var rankList = arrayListOf<RankListViewData>()

    override fun observeEvent() {
        vm.success.observe(viewLifecycleOwner, {
            userSearch()
        })
    }

    override fun initView() { // onCreate
    }

    private fun userSearch(){
        when(vm.matchType) {
            50 -> binding.bestgrade.visibility = View.VISIBLE

            52 -> binding.coact.visibility = View.VISIBLE

            214 -> binding.volta.visibility = View.VISIBLE
        }

        when(vm.division){
            800 -> binding // 슈퍼 챔피언스

            900 -> binding // 챔피언스

            1000 -> binding // 슈퍼챌린지

            1100 -> binding // 챌린지1

            1200 -> binding // 챌린지2

            1300 -> binding // 챌린지3

            2000 -> binding // 월드클래스1

            2100 -> binding // 월드클래스2

            2200 -> binding // 월드클래스3

            2300 -> binding // 프로1

            2400 -> binding // 프로2

            2500 -> binding // 프로3

            2600 -> binding // 세미프로1

            2700 -> binding // 세미프로2

            2800 -> binding // 세미프로3

            2900 -> binding // 유망주1

            3000 -> binding // 유망주2

            3100 -> binding // 유망주3
        }

        binding.tvName.text = vm.name
        binding.tv.visibility = View.VISIBLE
        binding.tvLevel.text = vm.level.toString()
        binding.textView.visibility = View.VISIBLE
    }
}