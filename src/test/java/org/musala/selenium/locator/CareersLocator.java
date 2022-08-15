package org.musala.selenium.locator;


import org.apache.log4j.Logger;
import org.musala.selenium.locator.core.Locator;
import org.openqa.selenium.By;

public enum CareersLocator implements Locator {
    checkOpenPositionsButton(By.xpath("//button/span[text()='Check our open positions']"));

    static Logger logger = Logger.getLogger(CareersLocator.class.getName());
    private By locator;

    CareersLocator(By locator) {
        this.locator = locator;
    }



    @Override
    public By by() {
        logger.trace("locator");
        return locator;
    }
}
