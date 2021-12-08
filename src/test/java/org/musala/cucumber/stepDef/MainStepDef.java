package org.musala.cucumber.stepDef;



import cucumber.api.java.en.Given;
import org.musala.cucumber.runner.TestState;
import org.musala.selenium.page.MainPage;

public class MainStepDef extends AbstractStepDef {
    public MainStepDef(TestState state) {
        super(state, MainStepDef
                .class.getName());
    }

    @Given("^open contact page$")
    public void openContactPage() {
        MainPage mainPage = new MainPage(state.getDriver());
        mainPage.openContactPage();

    }

    @Given("^open company page$")
    public void openCompanyPage() throws Throwable {
        MainPage mainPage = new MainPage(state.getDriver());
        mainPage.openCompanyPage();
    }

    @Given("^open careers page$")
    public void openCareersPage() {
        MainPage mainPage = new MainPage(state.getDriver());
        mainPage.openCareersPage();
    }
}
