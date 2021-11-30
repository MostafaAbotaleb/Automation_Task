package org.musala.selenium.page;


import org.musala.selenium.driver.CustomWebDriver;
import org.musala.selenium.page.core.PageObject;
import static org.musala.selenium.locator.CareersLocator.*;


public class CareersPage extends PageObject {
    public CareersPage(CustomWebDriver driver) {
        super(driver, CareersPage.class.getName());
    }


    public void clickOnCheckOurPositions() {
        driver.waitVisibilityOf(checkOpenPositionsButton.by(), 10);
        driver.clickOn(checkOpenPositionsButton);
    }


}
