package uiswaper.cucumber.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uiswaper.cucumber.testData.Investor;


public class LoginSteps extends AbstrastSteps {

    @Given("I have logged in")
    public void i_have_logged_in() {
        homePage.load();
        homePage.openLoginForm();
        homePage.setSubmitLogin(
                Investor.getInstance().email,
                Investor.getInstance().password
        );
        overviewPage.waitForLoad();
    }
}