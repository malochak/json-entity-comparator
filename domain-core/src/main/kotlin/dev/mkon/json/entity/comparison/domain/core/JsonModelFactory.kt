package dev.mkon.json.entity.comparison.domain.core

import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonObject

class JsonModelFactory {
    private val jsonSerializer = Json

    fun decode(value: String): JsonModel {
        val json = jsonSerializer.decodeFromString<JsonObject>(value)
        return JsonModel(null, json)
    }
}