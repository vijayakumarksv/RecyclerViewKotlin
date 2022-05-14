package com.gadget.android.recyclerviewbinding.repository

import com.gadget.android.recyclerviewbinding.model.User
import kotlinx.coroutines.delay

class UserRepository {

    suspend fun getUserData(): List<User> {
        delay(1000)
        val users: List<User> = listOf(
            User("Vijay"),
            User("Kumar"),
            User("Tamil"),
            User("Malar"),
            User("Prakash")
        )
        return users
    }
}