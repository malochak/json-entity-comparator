package dev.mkon.json.entity.comparison.domain.core

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe

class JsonModelFactorySpec : ShouldSpec({

    should("decode json string") {
        val json = """
            {
                "data": "test"
            }
        """.trimIndent()

        val model = JsonModelFactory().decode(json)

        model.print() shouldBe "{\"data\":\"test\"}"
    }

})
