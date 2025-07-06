package dev.mkon.json.entity.comparison.domain.core

import dev.mkon.json.entity.comparison.domain.core.ComparisonType.Eq

data class Filter(
    val column: String,
    val type: ComparisonType = Eq,
    val value: ValueType
) {
}