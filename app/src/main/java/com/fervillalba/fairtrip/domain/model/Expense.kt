package com.fervillalba.fairtrip.domain.model

import java.time.LocalDateTime

data class Expense (
    val id: String,
    val paidBy: String,
    val amount: Double,
    val participants: List<String>,
    val date: LocalDateTime,
    val description: String,
    val tripId: String,
)