package com.example.fifausersearchservice.feature.user.ui

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

    override fun observeEvent() {
        vm.success.observe(viewLifecycleOwner, {
            userSearch()
        })
    }

    override fun initView() {
    }

    private fun userSearch(){
        when(vm.matchType) {
            50 -> {
                binding.top.visibility = View.VISIBLE
                binding.tvTopRank.text = vm.division.name
            }

            52 -> {
                binding.coach.visibility = View.VISIBLE
                binding.tvCoachTopRank.text = vm.division.name
            }

            214 -> {
                binding.volta.visibility = View.VISIBLE
                binding.tvTopRankVolta.text = vm.division.name
            }
        }

        binding.tvName.text = vm.name
        binding.tv.visibility = View.VISIBLE
        binding.tvLevel.text = vm.level.toString()
        binding.textView.visibility = View.VISIBLE
    }
}