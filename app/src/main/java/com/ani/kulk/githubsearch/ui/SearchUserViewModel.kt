package com.ani.kulk.githubsearch.ui

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ani.kulk.githubsearch.domain.SearchUserUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class SearchUserViewModel(private val searchUserUseCase: SearchUserUseCase): ViewModel() {

    fun searchUser(query: String) {
        viewModelScope.launch(Dispatchers.IO) {
            val users = searchUserUseCase.execute(SearchUserUseCase.Params(query))
            Log.d("TAG", "Users $users")
        }
    }
}