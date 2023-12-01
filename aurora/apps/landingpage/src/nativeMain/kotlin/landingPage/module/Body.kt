package landingPage.module

import modules_lib.navigation.NavigationVM
import modules_lib.navigation.NavigationModule
import template.Template
import template.StaticTemplate
import template.childs
import template.include
import template.tags.Body

val BodyTemplate: Template<NavigationVM> = { context, data ->
    Body().apply {
        include(template=DynamicBody, context=context, vm=data)
        include(template=StaticBody,  context=context)
    }
}

private val DynamicBody: Template<NavigationVM> = { context, data ->
    Body().apply {
        include(template=NavigationModule.template, context=context, vm=data)
    }.childs()
}

private val StaticBody: StaticTemplate = { _, _ ->
    Body().apply {
        div(clazz = "MyClass") {
            p(clazz = "test") {
                +"This is my first kotlin rendered page"
            }
        }
    }.childs()
}
