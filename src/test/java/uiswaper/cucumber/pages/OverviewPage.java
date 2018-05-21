package uiswaper.cucumber.pages;

import uiswaper.cucumber.Element;

public class OverviewPage extends MainMenu{

    Element summaryTable = new Element( "css", "#summary-values");


    public void waitForLoad(){
        summaryTable.waitUntilVisible();
    }
}
