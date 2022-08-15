package org.musala.selenium.page;


import org.musala.selenium.driver.CustomWebDriver;
import org.musala.selenium.page.core.PageObject;
import java.util.Iterator;
import java.util.Set;
import static org.musala.selenium.locator.FacebookLocator.*;


public class FacebooktPage extends PageObject {
    public FacebooktPage(CustomWebDriver driver) {
        super(driver, FacebooktPage.class.getName());
    }


    public void swithToPopUp() {
        Set<String> handles = driver.getWindowHandles();
        Iterator<String> iterator = handles.iterator();
        String subWindowHandler =iterator.next();
        driver.switchTo().window(subWindowHandler);
    }

    public void clickOnAcceptAllCookies() {
        driver.waitVisibilityOf(fbAcceptAllButton.by(), 10);
        driver.clickOn(fbAcceptAllButton);
    }

    public String getUrl()  {
        driver.switchToNewTab();
        driver.waitUntilPageUrlContains("www.facebook.com/MusalaSoft",10);
        return driver.getCurrentUrl();
    }

    public boolean isProfilePictureDisplayed() {
        driver.waitVisibilityOf(fbProfile.by(), 20);
        return driver.isElementVisible(fbProfile.by());
    }
}
