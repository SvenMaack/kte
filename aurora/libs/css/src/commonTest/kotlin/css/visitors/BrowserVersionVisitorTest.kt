package css.visitors

import css.base.Property
import css.base.Rule
import css.base.browser.Chrome
import css.base.browser.Firefox
import kotlin.test.Test
import kotlin.test.assertEquals

class BrowserVersionVisitorTest {
    @Test
    fun `version calculated correctly`() {
        val rule = Rule("selector").apply {
            +Property(
                "property1",
                "value",
                listOf(
                    Chrome { 1.0 },
                    Firefox { 2.0 }
                )
            )
            +Property(
                "property2",
                "value",
                listOf(
                    Chrome { 3.0 },
                    Firefox { 1.0 }
                )
            )
        }

        val visitor = BrowserVersionVisitor()
        val result = visitor.visitRule(rule).result

        assertEquals(2, result.size)
        assertEquals(3.0, result["chrome"])
        assertEquals(2.0, result["firefox"])
    }

    @Test
    fun `version calculated correctly with missing browser`() {
        val rule = Rule("selector").apply {
            +Property(
                "property1",
                "value",
                listOf(
                    Chrome { 1.0 },
                    Firefox { 2.0 }
                )
            )
            +Property(
                "property2",
                "value",
                listOf(
                    Chrome { 3.0 }
                )
            )
        }

        val visitor = BrowserVersionVisitor()
        val result = visitor.visitRule(rule).result

        assertEquals(2, result.size)
        assertEquals(3.0, result["chrome"])
        assertEquals(2.0, result["firefox"])
    }
}
