package dev.mkon.json.entity.comparison.domain.core

import kotlinx.serialization.json.JsonObject

class JsonModel(definition: ModelDefinition, private val json: JsonObject) {

    init {
        definition.properties.forEach {
            require(json.containsKey(it.property)) { "Missing property '${it.property}' in json" }
        }

        json.keys.forEach { key -> require(definition.properties.any { it.property == key }) { "Unknown property '$key'" } }
    }

    fun print() = json.toString()
}
