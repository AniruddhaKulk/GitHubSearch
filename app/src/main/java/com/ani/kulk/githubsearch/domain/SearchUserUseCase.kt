package com.ani.kulk.githubsearch.domain

import com.ani.kulk.githubsearch.model.Users
import com.ani.kulk.githubsearch.network.NetworkService
import com.ani.kulk.githubsearch.network.Resource
import com.ani.kulk.githubsearch.network.UseCase
import java.lang.Exception

class SearchUserUseCase(val networkService: NetworkService): UseCase.ResourceUseCase<SearchUserUseCase.Params, Users> {
    override suspend fun execute(params: Params): Resource<Users> {
        return try {
            val users = networkService.searchUser(params.query)
            if (users.items.isEmpty()) return Resource.empty("No users found")
            Resource.success(users)
        } catch (e: Exception) {
            Resource.error("something went wrong: ${e.localizedMessage}")
        }
    }

    class Params(val query: String) : UseCase.Params()

}