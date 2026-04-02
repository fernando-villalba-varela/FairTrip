package com.fervillalba.fairtrip.domain.repository

import com.fervillalba.fairtrip.domain.model.User
import kotlinx.coroutines.flow.Flow

interface UserRepository {
    suspend fun addUser(user: User)
    suspend fun deleteUser(user: User)
    suspend fun editUser(user: User)
    fun getUser(userId: String): Flow<User>
}