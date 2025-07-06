package dev.mkon.json.entity.comparison.domain.core

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive

class JsonModelSpec : ShouldSpec({

    should("create json object") {
        val obj = JsonObject(mapOf("data" to JsonPrimitive("test")))

        val model = JsonModel(null, obj)

        model.print() shouldBe "{\"data\":\"test\"}"
    }

})
