package dev.mkon.json.entity.comparison.domain.core

import kotlinx.serialization.json.JsonObject

class JsonModel(private val definition: ModelDefinition? = null, private val json: JsonObject) {

    fun print() = json.toString()
}
