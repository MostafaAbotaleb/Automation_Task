package org.musala.selenium.page;


import org.musala.selenium.driver.CustomWebDriver;
import org.musala.selenium.locator.core.Locator;
import org.musala.selenium.page.core.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.util.List;

import static org.musala.selenium.locator.JoinusLocator.*;

public class JoinusPage extends PageObject {
    public JoinusPage(CustomWebDriver driver) {
        super(driver, JoinusPage.class.getName());
    }


    public String getUrl() {
        return driver.getSeleniumWebDriver().getCurrentUrl();
    }

    public void selectValueFromLocationList(String location) {
        WebElement locationDropdown = driver.findElement(By.id("get_location"));
        Select selectOptions = new Select(locationDropdown);
        selectOptions.selectByVisibleText(location);
    }

    public void selectPosition(String position) throws Throwable {
        driver.selectByName(openPositions.by(), position);
    }

    public void isApplyButtonDisplayed() {
        driver.isElementVisible(applyBtn.by());

    }

    public void clickOnApplyButton() {
        driver.waitVisibilityOf(applyBtn.by(), 10);
        driver.clickOn(applyBtn);
    }

    public void uploadCv(String cvFile) throws IOException {
        driver.uploadFileFromDocuments(cvElement, cvFile);
    }

    public void typeText(String field, String value) throws Exception {
        Locator locator;
        switch (field.toLowerCase()) {
            case "name":
                locator = nameField;
                break;
            case "email":
                locator = emailField;
                break;
            case "mobile":
                locator = mobileField;
                break;
            case "message":
                locator = messageField;
                break;
            default:
                throw new Exception("Unknown field " + field);
        }
        driver.waitVisibilityOf(locator, 10);
        driver.sendKeysTo(locator, value);
        driver.blur(locator);
    }

    public String getErrorMessage() {
        driver.waitVisibilityOf(errorMessage, 10);
        return driver.getText(errorMessage.by());
    }

    public void clickOntheCloseButton() {
        driver.waitVisibilityOf(closeButton.by(), 10);
        driver.clickOn(closeButton);
    }

    public boolean isSectionDisplayed(String element) throws Exception {
        Locator locator;
        switch (element.toLowerCase()) {
            case "general description":
                locator = generalDescription;
                break;
            case "Requirements":
                locator = requirements;
                break;
            case "Responsibilities":
                locator = responsibilities;
                break;
            case "What we offer":
                locator = whatWeOffer;
                break;
            default:
                throw new Exception("Unknown section " + element);
        }
        driver.waitVisibilityOf(locator, 10);
        return driver.isElementVisible(locator.by());
    }

    public List<String> getAllOpenPositions() {
        return driver.getAllElementsText(openPositions);
    }
}
