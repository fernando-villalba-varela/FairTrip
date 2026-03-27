package com.fervillalba.fairtrip.domain.model

import java.time.LocalDateTime

data class Trip(
    val id: String,
    val name:String,
    val startDate: LocalDateTime,
    val endDate: LocalDateTime,
    val participants: List<String>,
)
