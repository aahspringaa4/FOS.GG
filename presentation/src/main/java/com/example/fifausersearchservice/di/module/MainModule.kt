package com.example.fifausersearchservice.di.module

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object MainModule {

    @Binds
    fun bindMainDataSource(
        mainRepository: FifaRepository
    ): FifaRepository = FifaRepository()
}