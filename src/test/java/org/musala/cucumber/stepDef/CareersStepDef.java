package org.musala.cucumber.stepDef;



import cucumber.api.java.en.And;
import org.musala.cucumber.runner.TestState;
import org.musala.selenium.page.CareersPage;


public class CareersStepDef extends AbstractStepDef {
    public CareersStepDef(TestState state) {
        super(state, CareersStepDef.class.getName());
    }


    @And("^user click on check our open positions button$")
    public void userClickOnCheckOurOpenPositionsButton() {
        CareersPage careersPage = new CareersPage(state.getDriver());
        careersPage.clickOnCheckOurPositions();
    }


}
