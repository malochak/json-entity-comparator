package dev.mkon.json.entity.comparison.domain.core

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive

class JsonModelSpec : ShouldSpec({

    should("create json object") {
        val modelDefinition = ModelDefinition(
            listOf(
                ModelProperty("string", ValueType.StringValue),
                ModelProperty("number", ValueType.NumberValue)
            )
        )

        val obj = JsonObject(
            mapOf(
                "string" to JsonPrimitive("test"),
                "number" to JsonPrimitive(123)
            )
        )

        val model = JsonModel(modelDefinition, obj)

        model.print() shouldBe "{\"string\":\"test\",\"number\":123}"
    }

    should("should throw exception when definition doesn't match json") {
        val modelDefinition =
            ModelDefinition(listOf(ModelProperty("string", ValueType.StringValue)))

        val obj = JsonObject(
            mapOf(
                "string" to JsonPrimitive("test"),
                "number" to JsonPrimitive(123)
            )
        )

        val model = JsonModel(modelDefinition, obj)

        model.print() shouldBe "{\"string\":\"test\",\"number\":123}"
    }


})
