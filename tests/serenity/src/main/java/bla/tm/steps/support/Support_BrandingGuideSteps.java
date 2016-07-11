package bla.tm.steps.support;

import bla.tm.pages.site.support.Support_BrandingGuidePage;
import net.thucydides.core.annotations.Step;

public class Support_BrandingGuideSteps {

    Support_BrandingGuidePage brandingGuidePage;

    @Step
    public void openPage() {
        brandingGuidePage.open();
    }

    @Step
    public void maximiseBrowserWindow() {
        brandingGuidePage.maximisePageWindow();
    }

    @Step
    public String getTitle() {
        return brandingGuidePage.getTitleText();
    }

    @Step
    public void checkGeneralPageElements(boolean disqus, boolean leftMenu){
        brandingGuidePage.checkGeneralPageElements(disqus, leftMenu);
    }
}
