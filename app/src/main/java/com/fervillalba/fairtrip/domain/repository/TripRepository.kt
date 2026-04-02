package com.fervillalba.fairtrip.domain.repository

import com.fervillalba.fairtrip.domain.model.Trip
import kotlinx.coroutines.flow.Flow

interface TripRepository {
    suspend fun addTrip(trip: Trip)
    suspend fun editTrip(trip: Trip)
    suspend fun deleteTrip(trip: Trip)
    fun getTrip(userId: String): Flow<List<Trip>>
}