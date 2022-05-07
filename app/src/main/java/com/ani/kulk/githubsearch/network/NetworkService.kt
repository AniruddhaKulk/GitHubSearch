package com.ani.kulk.githubsearch.network

import com.ani.kulk.githubsearch.model.Users
import retrofit2.http.GET
import retrofit2.http.Query

interface NetworkService {

    @GET("/search/users")
    suspend fun searchUser(@Query("q") query: String): Users
}