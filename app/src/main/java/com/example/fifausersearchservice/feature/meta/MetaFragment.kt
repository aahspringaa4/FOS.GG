package com.example.fifausersearchservice.feature.meta

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.fifausersearchservice.R
import com.example.fifausersearchservice.base.BaseFragment
import com.example.fifausersearchservice.databinding.MatchsearchBinding
import com.example.fifausersearchservice.databinding.MetaBinding

class MetaFragment: BaseFragment<MetaBinding>(
    R.layout.meta
){
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.meta, container, false)

        return binding.root
    }

    override fun observeEvent() {

    }

    override fun initView() {

    }

}