package css.visitors

import css.base.Document
import css.base.Property
import kotlin.test.Test
import kotlin.test.assertEquals

class ProductionVisitorTest {
    @Test
    fun `visit rules turns them into string`() {
        val document = Document()
        document["selector1"] = {
            +Property("property1", "value", listOf())
        }
        document["selector2"] = {
            +Property("property2", "value", listOf())
        }
        val productionVisitor = ProductionVisitor()

        productionVisitor.visitRule(document.rules[0])
        productionVisitor.visitRule(document.rules[1])

        assertEquals(".selector1{property1:value;}.selector2{property2:value;}", productionVisitor.result)
    }
}
