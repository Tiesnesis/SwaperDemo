package uiswaper.cucumber.pages;

import com.codeborne.selenide.Configuration;
import uiswaper.cucumber.Element;

import static com.codeborne.selenide.Selenide.open;

public class HomePage extends BasePage{

    Element loginButton = new Element( "css", "#dashboard");
    Element emailInput = new Element( "css", "input[type='email']");
    Element passwordInput = new Element( "css", "input[type='password']");
    Element submitLoginButton = new Element( "xpath", "//div/span[contains(text(), 'Log In')]");


    public void load(){
        Configuration.browser = "chrome";
        open(baseURL);
    }

    public void openLoginForm(){
        loginButton.click();
        emailInput.waitUntilVisible();
        passwordInput.waitUntilVisible();
    }

    public void enterLoginData(String email, String password){
        emailInput.setValue(email);
        passwordInput.setValue(password);
    }

    public void setSubmitLogin(String email, String password){
        enterLoginData(email, password);
        submitLoginButton.click();
    }
}
