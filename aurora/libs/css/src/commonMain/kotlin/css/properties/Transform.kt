package css.properties

import css.base.Property
import css.base.Rule
import css.base.browser.SupportImpl

public fun Rule.transform(x: Size, y: Size): List<Property> =
    listOf(
        +Property(
            property = "-webkit-transform",
            value = "translate($x,$y)",
            supportedBrowsers = SupportImpl(
                chrome = { 36.0 },
                edge = { 10.0 },
                firefox = { 16.0 },
                safari = { 9.0 },
                opera = { 23.0 },
            ).supportedBrowsers
        ),
        +Property(
            property = "transform",
            value = "translate($x,$y)",
            supportedBrowsers = SupportImpl(
                chrome = { 36.0 },
                edge = { 10.0 },
                firefox = { 16.0 },
                safari = { 9.0 },
                opera = { 23.0 },
            ).supportedBrowsers
        )
    )
