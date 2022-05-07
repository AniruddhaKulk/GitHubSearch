package com.ani.kulk.githubsearch.model

data class Users(
    val incomplete_results: Boolean,
    val items: List<Item>,
    val total_count: Int
)