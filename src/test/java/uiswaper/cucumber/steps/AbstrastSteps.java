package uiswaper.cucumber.steps;

import uiswaper.cucumber.pages.HomePage;
import uiswaper.cucumber.pages.OverviewPage;
import uiswaper.cucumber.pages.my.profile.MyProfile;


public abstract class AbstrastSteps {
    HomePage homePage = new HomePage();
    OverviewPage overviewPage = new OverviewPage();
    MyProfile myProfile = new MyProfile();

}
