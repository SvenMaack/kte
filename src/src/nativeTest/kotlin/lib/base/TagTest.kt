package lib.base

import io.mockative.configure
import io.mockative.Mock
import io.mockative.mock
import io.mockative.classOf
import io.mockative.verify
import io.mockative.time
import kotlin.test.Test
import kotlin.test.assertEquals

class TagTest {
    @Mock
    val api = configure(mock(classOf<Visitor<String>>())) {
        stubsUnitByDefault = true
    }

    @Test
    fun `tag is set correctly`() {
        assertEquals("p", Tag("p").name)
    }

    @Test
    fun `tag is set correctly with special characters`() {
        assertEquals("!- p", Tag("!- p").name)
    }

    @Test
    fun `visitor is being called`() {
        val tag = Tag("a")
        tag.traverse(api)
        verify(api)
            .invocation {
                visitTag(tag)
            }
            .wasInvoked(exactly = 1.time)
    }
}
