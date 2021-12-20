package com.example.fifausersearchservice.feature.meta

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fifausersearchservice.R
import com.example.fifausersearchservice.base.BaseFragment
import com.example.fifausersearchservice.databinding.MatchsearchBinding
import com.example.fifausersearchservice.databinding.MetaBinding

class MetaFragment: BaseFragment<MetaBinding>(
    R.layout.meta
){
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return binding.root
    }

    override fun observeEvent() {

    }

    override fun initView() {

    }

}