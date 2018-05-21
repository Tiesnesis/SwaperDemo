package uiswaper.cucumber.steps;

import cucumber.api.java.en.Given;
import org.junit.Assert;
import uiswaper.cucumber.testData.Investor;

import java.util.LinkedHashMap;


public class NavigationSteps extends AbstrastSteps {

    @Given("I Open My profile")
    public void i_open_my_profile() {
        overviewPage.openMyProfile();
        myProfile.waitForLoad();
    }

    @Given("I Check My profile information")
    public void i_check_my_profile_information() {
        LinkedHashMap<String,String> investorData = (LinkedHashMap<String, String>) myProfile.getInvestorData();
        Investor investor = Investor.getInstance();
        Assert.assertEquals(investorData.get("Name"), (investor.name));
        Assert.assertEquals(investorData.get("Personal ID"), (investor.id));
        Assert.assertEquals(investorData.get("Phone"), (investor.phone));
        Assert.assertEquals(investorData.get("Address"), (investor.address));
        Assert.assertEquals(investorData.get("Type"), (investor.type));
        Assert.assertEquals(investorData.get("Country"), (investor.country));
        Assert.assertEquals(investorData.get("Current Email"), (investor.email));
    }
}