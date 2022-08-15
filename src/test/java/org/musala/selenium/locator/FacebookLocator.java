package org.musala.selenium.locator;


import org.apache.log4j.Logger;
import org.musala.selenium.locator.core.Locator;
import org.openqa.selenium.By;

public enum FacebookLocator implements Locator {
    fbAcceptAllButton(By.xpath("//button[text()='Accept All']")),
    fbProfile(By.xpath("//a[@aria-label='Musala Soft profile photo']//div[@class='q9uorilb l9j0dhe7 pzggbiyp du4w35lb']//*[name()='svg']//*[name()='g' and contains(@mask,'url(#jsc_c')]//*[name()='image' and contains(@x,'0')]"));


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
