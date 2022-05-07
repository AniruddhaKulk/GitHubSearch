package com.ani.kulk.githubsearch.di

import com.ani.kulk.githubsearch.ui.SearchUserViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModules = module {
    viewModel {
        SearchUserViewModel(searchUserUseCase = get())
    }
}