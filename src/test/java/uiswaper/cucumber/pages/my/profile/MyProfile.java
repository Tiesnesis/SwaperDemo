package uiswaper.cucumber.pages.my.profile;

import uiswaper.cucumber.ElementGroup;
import uiswaper.cucumber.HelperUtil;

import java.util.*;

public class MyProfile extends ProfileMenu {
    ElementGroup investorProperties = new ElementGroup( "css", ".static-property");


    public void waitForLoad(){
        investorProperties.waitUntilVisible();
    }

    public Map<String, String> getInvestorData(){
        Map<String,String> map = new LinkedHashMap<>();
        List<String> keys = investorProperties.getSubElementValues("css", "div.key");
        List<String> values = investorProperties.getSubElementValues("css", "div.value");
        return HelperUtil.twoListsToLinkedHasmap(keys, values);
    }
}
