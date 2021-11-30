package org.musala.selenium.locator;


import org.apache.log4j.Logger;
import org.musala.selenium.locator.core.Locator;
import org.openqa.selenium.By;

public enum JoinusLocator implements Locator {
    openPositions(By.xpath("//article//h2")),
    applyBtn(By.xpath("//input[@value='Apply']")),
    cvElement(By.id("uploadtextfield")),
    nameField(By.xpath("//input[@id='cf-1']")),
    emailField(By.xpath("//input[@type='email']")),
    mobileField(By.xpath("//input[@name='mobile-number']")),
    messageField(By.xpath("//textarea[@name='your-message']")),
    closeButton(By.xpath("//button[@class='close-form']")),
    errorMessage(By.xpath("//span[contains(text(),\"is\")]")),
    generalDescription(By.xpath("//h2[text()='General description']")),
    requirements(By.xpath("//h2[text()='Requirements']")),
    responsibilities(By.xpath("//h2[text()='Responsibilities']")),
    whatWeOffer(By.xpath("//h2[text()='What we offer']"));


    static Logger logger = Logger.getLogger(JoinusLocator.class.getName());
    private By locator;

    JoinusLocator(By locator) {
        this.locator = locator;
    }

    @Override
    public By by() {
        logger.trace("locator");
        return locator;
    }
}
