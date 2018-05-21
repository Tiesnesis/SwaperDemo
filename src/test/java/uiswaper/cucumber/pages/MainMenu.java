package uiswaper.cucumber.pages;

import uiswaper.cucumber.Element;


public class MainMenu extends BasePage{

    Element overViewButton = new Element( "css", "#dashboard");
    Element myInvestmentsButton = new Element( "css", "#open-investments");
    Element myProfileButton = new Element( "css", "#personal-information");
    Element helpButton = new Element( "css", "#faq");

    public void openOverview(){
        overViewButton.click();
    }

    public void openMyInvestments(){
        myInvestmentsButton.click();
    }

    public void openMyProfile(){
        myProfileButton.click();
    }

    public void openHelp(){
        helpButton.click();
    }
}
