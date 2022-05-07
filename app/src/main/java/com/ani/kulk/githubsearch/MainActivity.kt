package com.ani.kulk.githubsearch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ani.kulk.githubsearch.ui.SearchUserViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private val viewModel: SearchUserViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel.searchUser("Jake")
    }
}