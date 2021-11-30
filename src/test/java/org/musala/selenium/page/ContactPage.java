package org.musala.selenium.page;


import org.musala.selenium.driver.CustomWebDriver;
import org.musala.selenium.locator.core.Locator;
import org.musala.selenium.page.core.PageObject;


import static org.musala.selenium.locator.ContactLocator.*;

public class ContactPage extends PageObject {
    public ContactPage(CustomWebDriver driver) {
        super(driver, ContactPage.class.getName());
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
            case "subject":
                locator = subjectField;
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


    public void clickOnSend() {
        driver.waitVisibilityOf(sendButton.by(), 10);
        driver.clickOn(sendButton);
    }

    public String isEmailErrorMessageDisplayed() {
        driver.waitVisibilityOf(emailErrorMessage.by(), 10);
        return driver.getText(emailErrorMessage.by());
    }
}
