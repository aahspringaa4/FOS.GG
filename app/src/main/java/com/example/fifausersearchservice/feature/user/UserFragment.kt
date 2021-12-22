package com.example.fifausersearchservice.feature.user

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.fifausersearchservice.R
import com.example.fifausersearchservice.base.BaseFragment
import com.example.fifausersearchservice.databinding.MetaBinding
import com.example.fifausersearchservice.databinding.UserBinding
import com.example.fifausersearchservice.feature.main.ui.MainActivity
import com.example.fifausersearchservice.feature.main.viewmodel.MainViewModel
import com.example.fifausersearchservice.feature.user.dto.ResponseUserDTO
import org.koin.androidx.viewmodel.ext.android.sharedViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class UserFragment: BaseFragment<UserBinding>(
    R.layout.user
){
    private val vm: MainViewModel by sharedViewModel()
    override fun observeEvent() {
        vm.success.observe(viewLifecycleOwner, {
            userSearch()
        })
    }

    override fun initView() {

    }

    fun userSearch(){
        binding.tvName.text = vm.name
        binding.tvLevel.text = vm.level.toString()
    }
}