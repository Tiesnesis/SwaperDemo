package restapiswaper.cucumber.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.junit.Assert;
import restapiswaper.cucumber.testData.Setting;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotificationSettingsSteps extends AbstractSteps{
    JSONObject response;
    private Map<String, Setting> settingList;

    @When("^I check my notification settings$")
    public void i_get_my_settings(List<Setting> settings) throws Throwable {
        settingList = new HashMap<String, Setting>();

        for (Setting setting : settings) {
            String key = setting.getType() + setting.getName();
            settingList.put(key, setting);
        }

        response = settingsResource.get();

        JSONObject entries = (JSONObject) response.get("entries");
        JSONArray push = (JSONArray) entries.get("PUSH");

        for(Object notifItem : push){
            JSONObject jsonNotif = (JSONObject) notifItem;
            Setting setting = settingList.get("PUSH"+jsonNotif.get("type"));
            Assert.assertEquals(setting.getValue(), jsonNotif.get("enabled"));
        }

        JSONArray email = (JSONArray) entries.get("EMAIL");

        for(Object notifItem : email){
            JSONObject jsonNotif = (JSONObject) notifItem;
            Setting setting = settingList.get("EMAIL"+jsonNotif.get("type"));
            Assert.assertEquals(setting.getValue(), jsonNotif.get("enabled"));
        }
    }

    @Then("^I set my notification settings")
    public void i_set_my_settings(List<Setting> settings) throws Throwable {

        for (Setting setting : settings) {
            settingsDisableNotifications.post(setting.getType(), setting.getName());
        }

    }
}

