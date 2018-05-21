package restapiswaper.cucumber.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import org.json.simple.JSONObject;
import org.junit.Assert;
import restapiswaper.cucumber.testData.Investor;

public class LoginSteps extends AbstractSteps{
    JSONObject response;

    @Given("^I have logged in$")
    public void i_have_logged_in() throws Throwable {
        loginResource.post(
                Investor.getInstance().email,
                Investor.getInstance().password
        );

    }

    @Given("^I can log in with new password$")
    public void i_can_log_in_new_password() throws Throwable {
        loginResource.post(
                Investor.getInstance().email,
                Investor.getInstance().newPassword
        );

    }

    @When("^I get my data$")
    public void i_get_my_data() throws Throwable {
        response = loggedInResource.get();
    }

    @Then("^my data (.+) is (.+)")
    public void my_data_is(String key, String value) throws Throwable {
        Assert.assertEquals(response.get(key), value);
    }
}