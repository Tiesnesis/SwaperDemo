package uiswaper.cucumber;
import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Element {;
    By locator;
    Integer timeout = 20000;

    public Element(String type, String value){
        switch(type) {
            case "css" :
                locator = By.cssSelector(value);
                break;
            case "xpath" :
                locator = By.xpath(value);
                break;
            default :
                locator = By.cssSelector(value);
        }
    }

    public void click(){
        $(locator).click();
    }

    public void waitUntilVisible(){
        $(locator).waitUntil(Condition.visible, timeout);
    }

    public void setValue(String value){
        $(locator).setValue(value);
    }

}

