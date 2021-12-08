package org.musala.selenium.locator;


import org.apache.log4j.Logger;
import org.musala.selenium.locator.core.Locator;
import org.openqa.selenium.By;

public enum FacebookLocator implements Locator {
    fbAcceptAllButton(By.xpath("//button[text()='Accept All']")),
    fbProfile(By.xpath("//div[@class='_6tay']/img"));


    static Logger logger = Logger.getLogger(FacebookLocator.class.getName());
    private By locator;

    FacebookLocator(By locator) {
        this.locator = locator;
    }

    @Override
    public By by() {
        logger.trace("locator");
        return locator;
    }
}
