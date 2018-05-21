package restapiswaper.cucumber.steps;
import restapiswaper.cucumber.apiResources.*;
import restapiswaper.cucumber.apiResources.notifications.Settings;
import restapiswaper.cucumber.apiResources.notifications.SettingsDisableNotifications;
import restapiswaper.cucumber.apiResources.profile.AccountEntries;
import restapiswaper.cucumber.apiResources.profile.Profile;

public abstract class AbstractSteps {
    Login loginResource = new Login();
    LoggedIn loggedInResource = new LoggedIn();
    Settings settingsResource = new Settings();
    Logout logoutResource = new Logout();
    SettingsDisableNotifications settingsDisableNotifications = new SettingsDisableNotifications();
    Profile profile = new Profile();
    AccountEntries accountEntries = new AccountEntries();
}
