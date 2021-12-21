package com.example.fifausersearchservice.feature.main.viewmodel

import ACCESS_TOKEN
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.fifausersearchservice.data.main.MainRepository
import com.example.fifausersearchservice.feature.main.ui.MainActivity
import com.example.fifausersearchservice.feature.user.dto.ResponseUserDTO
import retrofit2.Response
import kotlin.properties.Delegates

class MainViewModel(
    private val repository: MainRepository
) : ViewModel() {
    lateinit var name : String
    var level by Delegates.notNull<Int>()
    val success : MutableLiveData<Boolean> = MutableLiveData()
    val failed : MutableLiveData<Boolean> = MutableLiveData()

    private val nickname = MainActivity.nickName

    fun userPost(){
        repository.userPost(nickname).subscribe { response ->
            if(response.isSuccessful){
                ACCESS_TOKEN = "Bearer " + response.body()?.accessId.toString()
                name = response.body()?.nickname.toString()
                level = response.body()?.level!!
                success.value = true
            }
            else{
                failed.value = true
            }
        }
    }
}