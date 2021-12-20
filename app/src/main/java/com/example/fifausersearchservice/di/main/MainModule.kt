package com.example.fifausersearchservice.di.main

import com.example.fifausersearchservice.data.main.MainRepository
import com.example.fifausersearchservice.feature.main.viewmodel.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val mainModule = module{
    single{ MainRepository() }
    viewModel { MainViewModel (get()) }
}