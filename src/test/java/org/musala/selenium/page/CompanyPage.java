package org.musala.selenium.page;


import org.musala.selenium.driver.CustomWebDriver;
import org.musala.selenium.page.core.PageObject;

import static org.musala.selenium.locator.CompanyLocator.*;


public class CompanyPage extends PageObject {
    public CompanyPage(CustomWebDriver driver) {
        super(driver, CompanyPage.class.getName());
    }


    public String getUrl() {
        driver.waitUntilPageUrlContains("https://www.musala.com/company/",10);
        return driver.getSeleniumWebDriver().getCurrentUrl();
    }

    public boolean isLeadershipSectionVisible() {
        driver.waitVisibilityOf(leadershipSection.by(), 10);
        return driver.isElementVisible(leadershipSection.by());
    }

    public void openFacebookLink() {
        driver.waitVisibilityOf(facebookIcon.by(), 10);
        driver.clickOn(facebookIcon);

    }

    public void switchToNewTab() {
        driver.switchToNewTab();
    }
}
