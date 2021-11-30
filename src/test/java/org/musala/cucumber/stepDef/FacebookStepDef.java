package org.musala.cucumber.stepDef;



import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.musala.cucumber.runner.TestState;
import org.musala.selenium.page.FacebooktPage;

public class FacebookStepDef extends AbstractStepDef {
    public FacebookStepDef(TestState state) {
        super(state, FacebookStepDef
                .class.getName());
    }


    @And("^user click on accept all cookies button$")
    public void userClickOnAcceptAllCookiesButton() {
        FacebooktPage facebookPage = new FacebooktPage(state.getDriver());
        facebookPage.swithToPopUp();
        facebookPage.clickOnAcceptAllCookies();

    }

    @Then("^the facebook URL is loaded$")
    public void theFacebookURLIsLoaded() {
        FacebooktPage facebookPage = new FacebooktPage(state.getDriver());
        Assert.assertTrue("The url of facebook page is not correct", facebookPage.getUrl().contains("www.facebook.com/MusalaSoft"));
    }

    @And("^the Musala Soft profile picture appears on the new page$")
    public void theMusalaSoftProfilePictureAppearsOnTheNewPage() {
        FacebooktPage facebookPage = new FacebooktPage(state.getDriver());
        Assert.assertTrue("The profile picture is not displayed", facebookPage.isProfilePictureDisplayed());


    }
}
