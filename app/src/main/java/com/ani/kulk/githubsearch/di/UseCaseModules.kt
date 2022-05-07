package com.ani.kulk.githubsearch.di

import com.ani.kulk.githubsearch.domain.SearchUserUseCase
import org.koin.dsl.module

val useCaseModules = module {
    single { SearchUserUseCase(networkService = get()) }
}