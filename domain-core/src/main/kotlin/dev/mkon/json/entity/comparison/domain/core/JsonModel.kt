package dev.mkon.json.entity.comparison.domain.core

import kotlinx.serialization.json.JsonObject

class JsonModel(definition: ModelDefinition, private val json: JsonObject) {

    init {
        definition.properties.forEach {
            require(json.containsKey(it.property)) { "Missing property '${it.property}' in json" }
        }
    }
    fun print() = json.toString()
}
