package com.example.fifausersearchservice.feature.user

import android.view.View
import com.example.fifausersearchservice.R
import com.example.fifausersearchservice.base.BaseFragment
import com.example.fifausersearchservice.databinding.FragmentUsersBinding
import com.example.fifausersearchservice.feature.main.viewmodel.MainViewModel
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

    override fun initView() { // onCreate
    }

    private fun userSearch(){
        val data = vm.matchType
        when(data) {
            50 -> binding.bestgrade.visibility = View.VISIBLE

            52 -> binding.coact.visibility = View.VISIBLE

            54 -> binding.volta.visibility = View.VISIBLE
        }

        binding.tvName.text = vm.name
        binding.tv.visibility = View.VISIBLE
        binding.tvLevel.text = vm.level.toString()
        binding.textView.visibility = View.VISIBLE
    }
}