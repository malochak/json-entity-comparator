package dev.mkon.json.entity.comparison.domain.core

import java.time.Instant

sealed interface ValueType {
    data class StringValue(val value: String) : ValueType
    data class NumberValue(val value: Number) : ValueType
    data class BooleanValue(val value: Boolean) : ValueType
    data class TimeValue(val value: Instant) : ValueType
}