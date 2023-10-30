package css_lib

import kotlin.test.Test
import kotlin.test.assertEquals

class PropertyTest {
    @Test
    fun `test property is rendered correctly`() {
        val property = Property("value", "property")

        assertEquals("value:property;", property.toString())
    }
}
