package uiswaper.cucumber;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.json.simple.JSONObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import restapiswaper.cucumber.testData.Setting;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ElementGroup {;
    By locator;
    Integer timeout = 20000;

    public ElementGroup(String type, String value){
        locator = createLocator(type, value);
    }


    public void waitUntilVisible(){
        $(locator).waitUntil(Condition.visible, timeout);
    }

    public List<String> getSubElementValues(String type, String value){
        List<String> valueList = new ArrayList<>();
        By listLocator = createLocator(type, value);
        for(WebElement element : $$(locator)){
            WebElement subElement = element.findElement(listLocator);
            valueList.add(subElement.getText());
        }
        return valueList;
    }

    public By createLocator(String type, String value){
        By locator;
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
        return locator;
    }

}

