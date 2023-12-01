package template_lib

import kotlinx.datetime.Clock
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime
import template_lib.base.TagContainer
import template_lib.base.TransientTag

public typealias Template<VM> = (context: Context, data: VM) -> TagContainer
public typealias StaticTemplate = Template<Unit>

public fun <VM>TagContainer.include(context: Context, template: Template<VM>, vm: VM): TagContainer =
    add(template(context, vm))

public fun TagContainer.include(context: Context, template: Template<Unit>): TagContainer =
    add(TransientTag().apply {
        val timestamp = Clock.System.now().toLocalDateTime(TimeZone.currentSystemDefault()).time
        !"Rendering starts at - $timestamp"
        +TemplateCache[context, template]
        !"Rendering of $timestamp ended"
    })

public fun <T: TagContainer>T.childs(): TransientTag =
    TransientTag().apply {
        this.addAll(this@childs.children)
    }
