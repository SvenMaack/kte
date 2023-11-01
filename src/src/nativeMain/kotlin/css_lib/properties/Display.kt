@file:Suppress("unused")

package css_lib.properties

import css_lib.base.Property
import css_lib.base.Rule
import css_lib.base.browser.SupportImpl

//https://www.w3schools.com/cssref/pr_class_display.php

@Suppress("EnumEntryName")
enum class DisplayTypeValues(val value: String) {
    `inline`("inline"),
    block("block"),
    contents("contents"),
    flex("flex"),
    `inline-block`("inline-block"),
    `inline-flex`("inline-flex"),
    `inline-grid`("inline-grid"),
    `inline-table`("inline-table"),
    `list-item`("list-item"),
    `run-in`("run-in"),
    table("table"),
    `table-caption`("table-caption"),
    `table-column-group`("table-column-group"),
    `table-header-group`("table-header-group"),
    `table-footer-group`("table-footer-group"),
    `table-row-group`("table-row-group"),
    `table-cell`("table-cell"),
    `table-column`("table-column"),
    `table-row`("table-row"),
    none("none"),
    initial("initial"),
    inherit("inherit"),
    unset("unset")
}

fun Rule.display(style: DisplayTypeValues): Property =
    +Property.build(
        property = "display",
        value = style.value,
        defaultValue = null,
        supportedBrowsers = SupportImpl(
            chrome = { 4.0 },
            edge = { 8.0 },
            firefox = { 3.0 },
            safari = { 3.1 },
            opera = { 7.0 },
        ).supportedBrowsers
    )
