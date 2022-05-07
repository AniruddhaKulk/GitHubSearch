package com.ani.kulk.githubsearch.network

interface UseCase {
    interface ResourceUseCase<params : Params, T : Any> : UseCase {
        suspend fun execute(params: params): Resource<T>
    }

    abstract class Params
}