package uiswaper.cucumber.pages.my.profile;

import uiswaper.cucumber.Element;
import uiswaper.cucumber.pages.MainMenu;

public class ProfileMenu extends MainMenu {

    Element personalInformationButton = new Element( "css", ".personal-information");
    Element notificationSettingsButton = new Element( "css", ".notification-settings");
    Element addFundsButton = new Element( "css", ".add-funds");
    Element withdrawalButton = new Element( "css", ".withdrawal");
    Element incomeStatementButton = new Element( "css", ".income-statement");


    public void openPersonalInformation(){
        personalInformationButton.click();
    }

    public void openNotificationSettings(){
        notificationSettingsButton.click();
    }

    public void OpenAddFunds(){
        addFundsButton.click();
    }

    public void OpenWithdrawal(){
        withdrawalButton.click();
    }

    public void openIncomeStatement(){
        incomeStatementButton.click();
    }
}
