package restapiswaper.cucumber.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.json.simple.JSONObject;
import org.junit.Assert;
import restapiswaper.cucumber.testData.Investor;

public class ProfileSteps extends AbstractSteps{
    JSONObject response;

    @When("^I change my password$")
    public void i_change_password() throws Throwable {
        profile.changePassword(
                    Investor.getInstance().password,
                    Investor.getInstance().newPassword
                );
    }

    @When("^I request account entries from (.+) date to (.+) date")
    public void my_data_is(String fromDate, String toDate) throws Throwable {
        response = accountEntries.post(fromDate, toDate);
    }

    @Then("^I have (.+) account entries")
    public void my_data_is(Long count) throws Throwable {
        JSONObject data = (JSONObject) response.get("data");
        Assert.assertEquals(data.get("totalRecords"), count);
    }
}

