package restapiswaper.cucumber.steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.json.simple.parser.ParseException;
import restapiswaper.cucumber.testData.Investor;

import java.io.IOException;

public class Hooks extends AbstractSteps {

    @Before
    public void beforeScenario() throws IOException {
        loginResource.post(
                Investor.getInstance().email,
                Investor.getInstance().password
        );
    }

    @After("@ChangePassword")
    public void afterScenarioPassword() throws IOException, ParseException {
        profile.changePassword(
                Investor.getInstance().newPassword,
                Investor.getInstance().password
        );
    }

    @After
    public void afterScenario() throws IOException{
        logoutResource.post();
    }


}