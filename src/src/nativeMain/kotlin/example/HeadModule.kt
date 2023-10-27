package example

import lib.*
import lib.tags.Head

data class HeadDto(
    val title: String
)

val HeadModule: DynamicTemplate<HeadDto> = { context, data ->
    Head().apply {
        include(context=context, template=StaticHead)
        title {
            +data.title
        }
        meta(name="description", content="Put your description here.")
        meta(name="keywords", content="Put your description here.")
    }
}

val StaticHead: StaticTemplate = { _ ->
    Head().childs {
        meta(charset="UTF-8")
        meta(name="viewport", content="width=device-width, initial-scale=1")
    }
}