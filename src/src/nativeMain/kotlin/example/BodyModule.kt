package example

import lib.StaticTemplate
import lib.tags.Body
import lib.with

val BodyModule: StaticTemplate = {
    Body() with {
        h1 {
            +"Hello, world!"
        }
        hr()
        div(clazz="MyClass") {
            p(clazz="test") {
                +"This is my first"
            }
            span {
                +"kotlin rendered page"
            }
        }
    }
}
