package org.musala.selenium.locator;


import org.apache.log4j.Logger;
import org.musala.selenium.locator.core.Locator;
import org.openqa.selenium.By;

public enum MainLocator implements Locator {
    contactUsButton(By.cssSelector("span[data-alt='Contact us']")),
    careersTab(By.xpath("//ul[@id='menu-main-nav-1']//a[text()='Careers']")),
    companyTap(By.xpath("//ul[@id='menu-main-nav-1']//a[contains(@href,'company')]"));

    static Logger logger = Logger.getLogger(MainLocator.class.getName());
    private By locator;

    MainLocator(By locator) {
        this.locator = locator;
    }

//    @Override
    public By by() {
        logger.trace("locator");
        return locator;
    }
}
