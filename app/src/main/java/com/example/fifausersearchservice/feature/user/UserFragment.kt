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
import org.koin.androidx.viewmodel.ext.android.viewModel

class UserFragment: BaseFragment<UserBinding>(
    R.layout.user
){
    private val vm: MainViewModel by viewModel()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.user, container, false)

        return binding.root
    }

    override fun observeEvent() {

    }

    override fun initView() {

    }

    fun userSearch(){
        binding.tvName.text = vm.name
        binding.tvLevel.text = vm.level.toString()
    }
}