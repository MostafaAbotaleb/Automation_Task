package org.musala.cucumber.stepDef;



import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.musala.cucumber.runner.TestState;
import org.musala.selenium.page.CompanyPage;


public class CompanyStepDef extends AbstractStepDef {
    public CompanyStepDef(TestState state) {
        super(state, CompanyStepDef
                .class.getName());
    }


    @Then("^the correct URL is loaded$")
    public void theCorrectURLIsLoaded() {
        CompanyPage companyPage = new CompanyPage(state.getDriver());
        Assert.assertEquals("Company page not opened", "https://www.musala.com/company/", companyPage.getUrl());
    }


    @And("^the leadership section is visible$")
    public void theLeadershipSectionIsVisible() {
        CompanyPage companyPage = new CompanyPage(state.getDriver());
        Assert.assertTrue("The leadership section is not visible", companyPage.isLeadershipSectionVisible());
    }

    @When("^user open the facebook link$")
    public void userOpenTheFacebookLink() {
        CompanyPage companyPage = new CompanyPage(state.getDriver());
        companyPage.openFacebookLink();
    }

    @And("^user switch to facebook browser tab$")
    public void userSwitchToFacebookBrowserTab() {
        CompanyPage companyPage = new CompanyPage(state.getDriver());
        companyPage.swithToTab();
    }
}
