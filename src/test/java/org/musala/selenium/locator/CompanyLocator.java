package org.musala.selenium.locator;


import org.apache.log4j.Logger;
import org.musala.selenium.locator.core.Locator;
import org.openqa.selenium.By;

public enum CompanyLocator implements Locator {

    leadershipSection(By.xpath("//section[@class='company-members']")),
    facebookIcon(By.xpath("//span[@class='musala musala-icon-facebook']"));


    static Logger logger = Logger.getLogger(CompanyLocator.class.getName());
    private By locator;

    CompanyLocator(By locator) {
        this.locator = locator;
    }

    @Override
    public By by() {
        logger.trace("locator");
        return locator;
    }
}
