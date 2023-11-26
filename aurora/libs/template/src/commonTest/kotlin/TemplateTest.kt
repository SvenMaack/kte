package template_lib

import io.mockative.*
import template_lib.base.Tag
import template_lib.base.TagContainer
import template_lib.base.HtmlVisitor
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals
import kotlin.test.assertSame

class TemplateTest {
    @Mock
    val htmlVisitorMock = mock(classOf<HtmlVisitor<String>>())
    @Mock
    val dynamicTemplateMock = mock(classOf<Callable2R<Context, String, TagContainer>>())
    @Mock
    val staticTemplateMock = mock(classOf<Callable1R<Context, TagContainer>>())

    @Test
    fun `test include dynamic template adds children`() {
        val child = TagContainer("child")
        val parent = TagContainer("parent")
        val template: DynamicTemplate<String> = { _, _ ->
            child
        }

        parent.apply {
            include(context=Context({ htmlVisitorMock }, CSS()), template=template, dto="child")
        }

        assertEquals(1, parent.children.size)
        assertSame(child, parent.children[0])
    }

    @Test
    fun `test include dynamic template calls dynamic template function`() {
        val tag = TagContainer("parent")
        val context = Context({ htmlVisitorMock }, CSS())
        val dto = "child"
        every { dynamicTemplateMock.test(context, dto) }.returns(tag)

        tag.apply {
            include(context=context, template=dynamicTemplateMock::test, dto=dto)
        }

        verify { dynamicTemplateMock.test(context, dto) }
            .wasInvoked(exactly = once)
    }

    @Test
    fun `test include static template calls static template function only once`() {
        val tag = TagContainer("parent")
        val context = Context({ htmlVisitorMock }, CSS())
        every { staticTemplateMock.test(context) }.returns(tag)
        every { htmlVisitorMock.result }.returns("")

        tag.apply {
            include(context=context, template=staticTemplateMock::test)
            include(context=context, template=staticTemplateMock::test)
        }

        verify { staticTemplateMock.test(context) }
            .wasInvoked(exactly = once)
    }

    @Test
    fun `test childs function of tagContainer`() {
        val tag = TagContainer("parent")
        val child = Tag("child")
        val toTest = tag.childs {
            add(child)
        }

        assertNotEquals(toTest, tag)
        assertEquals(1, toTest.children.size)
        assertSame(child, toTest.children[0])
    }
}