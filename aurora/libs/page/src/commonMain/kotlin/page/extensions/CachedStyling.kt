package page_lib.page.extensions

import css_lib.base.IDocument
import css_lib.base.RuleVisitorFactory
import page_lib.page.base.IPageRenderer

class CachedStyling(private val inner: IPageRenderer): IPageRenderer by inner {
    private var cachedInnerStyling: String? = null

    private var cachedExternalStyling: String? = null

    override fun renderInlineCss(ruleVisitorFactory: RuleVisitorFactory<String>, document: IDocument): String =
        cachedInnerStyling ?: inner.renderInlineCss(ruleVisitorFactory, document).apply {
            this@CachedStyling.cachedInnerStyling = this
        }

    override fun renderExternalCss(ruleVisitorFactory: RuleVisitorFactory<String>, document: IDocument): String =
        cachedExternalStyling ?: inner.renderExternalCss(ruleVisitorFactory, document).apply {
            this@CachedStyling.cachedExternalStyling = this
        }
}
