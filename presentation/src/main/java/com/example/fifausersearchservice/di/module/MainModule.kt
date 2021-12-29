package com.example.fifausersearchservice.di.module

import com.example.fifausersearchservice.data.main.MainRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object MainModule {

    @Binds
    fun bindMainDataSource(
        mainRepository: MainRepository
    ): MainRepository = MainRepository()
}