package page_lib.page.base

import css_lib.base.IDocument
import template_lib.Context
import template_lib.base.TagContainer

interface InlineCssProvider {
    fun getInlineCssDocument(): IDocument
}
interface ExternalCssProvider {
    fun getExternalCssDocument(): IDocument
}
interface CssProvider: InlineCssProvider, ExternalCssProvider

interface HtmlProvider<ViewModel> {
    fun getHtmlTag(context: Context, viewModel: ViewModel): TagContainer
}

interface IPageProvider<ViewModel>: HtmlProvider<ViewModel>, CssProvider
