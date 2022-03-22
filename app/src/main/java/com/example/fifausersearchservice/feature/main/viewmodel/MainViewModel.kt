package com.example.fifausersearchservice.feature.main.viewmodel

import ACCESS_TOKEN
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.fifausersearchservice.feature.main.ui.MainActivity
import com.example.fifausersearchservice.feature.user.Rank
import kotlin.properties.Delegates

class MainViewModel(
    private val repository: FifaRepository
) : ViewModel() {
    lateinit var name : String
    var level by Delegates.notNull<Int>()
    val success : MutableLiveData<Boolean> = MutableLiveData()
    val failed : MutableLiveData<Boolean> = MutableLiveData()
    var matchType by Delegates.notNull<Int>()
    var division by Delegates.notNull<Rank>()
    lateinit var achievementData: String

    fun userPost(){
        val nickname = MainActivity.nickName
        repository.userGet(nickname).subscribe { response ->
            if(response.isSuccessful){
                ACCESS_TOKEN = response.body()?.accessId.toString()
                name = response.body()?.nickname.toString()
                level = response.body()?.level!!
                success.value = true
                maxDivisionGet()
            }
            else {
                failed.value = true
            }
        }
    }

    private fun maxDivisionGet(){
        repository.maxDivisionGet().subscribe { response ->
            if(response.isSuccessful){
                matchType = response.body()?.matchType!!
                division = response.body()?.division!!.toRank()
                achievementData = response.body()?.achievementDate.toString()
                success.value = true
            }
            else{
                failed.value = true
            }
        }
    }
}