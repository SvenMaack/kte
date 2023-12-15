package css.properties

import css.base.Rule
import kotlin.test.Test
import kotlin.test.assertEquals

class MaxHeightTest {
    @Test
    fun `max-height creates property`() {
        HeightTextValue.entries.forEach {
            val rule = Rule("selector")
            rule.`max-height` = it
            assertEquals(1, rule.properties.size)
            assertEquals("max-height", rule.properties[0].property)
            assertEquals(it.value, rule.properties[0].value)
        }
    }

    @Test
    fun `max-height creates initial property`() {
        val rule = Rule("selector")
        rule.`max-height` = initial
        assertEquals(1, rule.properties.size)
        assertEquals("max-height", rule.properties[0].property)
        assertEquals("initial", rule.properties[0].value)
    }

    @Test
    fun `max-height creates inherit property`() {
        val rule = Rule("selector")
        rule.`max-height` = inherit
        assertEquals(1, rule.properties.size)
        assertEquals("max-height", rule.properties[0].property)
        assertEquals("inherit", rule.properties[0].value)
    }

    @Test
    fun `max-height creates property with size values`() {
        val rule = Rule("selector")
        rule.`max-height` = 1.px
        assertEquals(1, rule.properties.size)
        assertEquals("max-height", rule.properties[0].property)
        assertEquals("1px", rule.properties[0].value)
    }
}
