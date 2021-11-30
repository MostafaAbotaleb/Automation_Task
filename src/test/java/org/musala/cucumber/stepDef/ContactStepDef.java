package org.musala.cucumber.stepDef;


import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.musala.cucumber.runner.TestState;
import org.musala.selenium.page.ContactPage;


public class ContactStepDef extends AbstractStepDef {
    public ContactStepDef(TestState state) {
        super(state, ContactStepDef
                .class.getName());
    }


    @And("^user fill the form as fllow$")
    public void userFillTheFormAsFlow(DataTable table) {
        ContactPage contactPage = new ContactPage(state.getDriver());
        table.asMap(String.class, String.class).forEach((field, value) -> {
            try {
                contactPage.typeText(field, value);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    @When("^user click on send$")
    public void userClickOnSend() {
        ContactPage contactPage = new ContactPage(state.getDriver());
        contactPage.clickOnSend();
    }

    @Then("^error message should be displayed$")
    public void errorMessageShouldBeDisplayed() {
        ContactPage contactPage = new ContactPage(state.getDriver());
        Assert.assertEquals("Email error message not displayed", "The e-mail address entered is invalid.", contactPage.isEmailErrorMessageDisplayed());
    }
}
