package org.musala.cucumber.stepDef;


import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.musala.cucumber.runner.TestState;
import org.musala.selenium.page.JoinusPage;

public class JoinusStepDef extends AbstractStepDef {
    public JoinusStepDef(TestState state) {
        super(state, JoinusStepDef.class.getName());
    }


    @Then("^the correct URL of join us page is loaded$")
    public void theCorrectURLOfJoinUsPageIsLoaded() {
        JoinusPage joinusPage = new JoinusPage(state.getDriver());
        Assert.assertEquals("Join Us page not opened", "https://www.musala.com/careers/join-us/", joinusPage.getUrl());
    }

    @When("^user select \"([^\"]*)\" from location dropdown list$")
    public void userSelectAnywhereFromLocationDropdownList(String location) {
        JoinusPage joinusPage = new JoinusPage(state.getDriver());
        joinusPage.selectValueFromLocationList(location);
    }

    @When("^select \"([^\"]*)\" position$")
    public void selectPosition(String position) throws Throwable {
        JoinusPage joinusPage = new JoinusPage(state.getDriver());
        joinusPage.selectPosition(position);
    }


    @And("^the apply button is displayed$")
    public void theApplyButtonIsDisplayed() {
        JoinusPage joinusPage = new JoinusPage(state.getDriver());
        joinusPage.isApplyButtonDisplayed();
    }

    @And("^user click on apply button$")
    public void userClickOnApplyButton() {
        JoinusPage joinusPage = new JoinusPage(state.getDriver());
        joinusPage.clickOnApplyButton();
    }

    @And("^Upload \"([^\"]*)\" CV$")
    public void uploadCV(String cvFile) throws Throwable {
        JoinusPage joinusPage = new JoinusPage(state.getDriver());
        joinusPage.uploadCv(cvFile);
    }


    @And("^user fill the position form as fllow$")
    public void userFillThePositionFormAsFllow(DataTable table) {
        JoinusPage joinusPage = new JoinusPage(state.getDriver());
        table.asMap(String.class, String.class).forEach((field, value) -> {
            try {
                joinusPage.typeText(field, value);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    @Then("^error messages \"([^\"]*)\" should be displayed$")
    public void errorMessagesShouldBeDisplayed(String errorMessage) throws Throwable {
        JoinusPage joinusPage = new JoinusPage(state.getDriver());
        Assert.assertEquals("Error Message incorrect", errorMessage, joinusPage.getErrorMessage());
    }

    @And("^user click on close button of the popup$")
    public void userClickOnCloseButtonOfThePopup() {
        JoinusPage joinusPage = new JoinusPage(state.getDriver());
        joinusPage.clickOntheCloseButton();
    }

    @Then("^the following sections are displayed$")
    public void theFollowingSectionsAreDisplayed(DataTable table) {
        JoinusPage joinusPage = new JoinusPage(state.getDriver());
        table.asList(String.class).forEach(element -> {
            try {
                Assert.assertTrue(element + "is not displayed", joinusPage.isSectionDisplayed(element));
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    @And("^print opened positions for \"([^\"]*)\" city$")
    public void printOpenedPositions(String city) {
        JoinusPage joinusPage = new JoinusPage(state.getDriver());
        joinusPage.getAllOpenPositions().forEach(position -> System.out.println(city + "\n" + "Position: " + position + "\n" + "More info: http://www.musala.com/job/" + position.toLowerCase().replace(" ", "-")));
    }
}