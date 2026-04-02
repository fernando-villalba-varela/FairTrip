package com.fervillalba.fairtrip.domain.repository

import com.fervillalba.fairtrip.domain.model.Expense
import com.fervillalba.fairtrip.domain.model.Trip
import kotlinx.coroutines.flow.Flow

interface ExpenseRepository {

    fun getExpense(tripId: String): Flow<Expense>

    suspend fun addExpense(expense: Expense)

    suspend fun editExpense(expense: Expense)

}