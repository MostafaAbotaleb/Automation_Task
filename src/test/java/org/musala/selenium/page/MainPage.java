package org.musala.selenium.page;


import org.musala.selenium.driver.CustomWebDriver;
import org.musala.selenium.page.core.PageObject;


import static org.musala.selenium.locator.MainLocator.*;

public class MainPage extends PageObject {
    public MainPage(CustomWebDriver driver) {
        super(driver, MainPage.class.getName());
    }


    public void openContactPage() {
        driver.waitVisibilityOf(contactUsButton.by(), 10);
        driver.clickOn(contactUsButton);
    }

    public void openCompanyPage() {

        driver.waitVisibilityOf(companyTap.by(), 10);
        driver.clickOn(companyTap);
    }

    public void openCareersPage() {
        driver.waitVisibilityOf(careersTab.by(), 10);
        driver.clickOn(careersTab);
    }

}
