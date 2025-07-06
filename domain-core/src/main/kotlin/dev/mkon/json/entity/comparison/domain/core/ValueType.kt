package dev.mkon.json.entity.comparison.domain.core

import java.time.Instant

sealed interface ValueType {
    data object StringValue : ValueType
    data object NumberValue : ValueType
    data class BooleanValue(val value: Boolean) : ValueType
    data class TimeValue(val value: Instant) : ValueType
}