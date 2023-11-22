package landingPage

import landingPage.module.LandingPageModule
import page_lib.page.Page

val landingPage = Page.build(
    name = "page",
    template = LandingPageModule.template,
    externalDocument = LandingPageModule.document
)