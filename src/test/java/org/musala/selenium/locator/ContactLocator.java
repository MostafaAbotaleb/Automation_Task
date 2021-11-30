package org.musala.selenium.locator;


import org.apache.log4j.Logger;
import org.musala.selenium.locator.core.Locator;
import org.openqa.selenium.By;

public enum ContactLocator implements Locator {

    nameField(By.xpath("//input[@id='cf-1']")),
    emailField(By.xpath("//input[@type='email']")),
    subjectField(By.xpath("//input[@name='your-subject']")),
    messageField(By.xpath("//textarea[@name='your-message']")),
    sendButton(By.xpath("//input[@value='Send']")),
    emailErrorMessage(By.xpath("//input[@name=\"your-email\"]/../span"));

    static Logger logger = Logger.getLogger(ContactLocator.class.getName());
    private By locator;

    ContactLocator(By locator) {
        this.locator = locator;
    }

    @Override
    public By by() {
        logger.trace("locator");
        return locator;
    }
}
