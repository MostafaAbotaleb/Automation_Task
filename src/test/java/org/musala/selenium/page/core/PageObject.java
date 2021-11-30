package org.musala.selenium.page.core;

import org.apache.log4j.Logger;
import org.musala.selenium.driver.CustomWebDriver;

public class PageObject {
    protected static Logger logger;
    protected final CustomWebDriver driver;

    public PageObject(CustomWebDriver driver, String pageClass) {
        logger = Logger.getLogger(pageClass);
        logger.trace(pageClass);
        this.driver = driver;
    }
}
