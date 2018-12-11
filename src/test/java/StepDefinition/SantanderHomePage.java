package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static StepDefinition.HookTest.myDriver;

/**
 * Created by balajakka on 11/12/2018.
 */
public class SantanderHomePage {
    WebElement loginButton = myDriver.findElement(By.xpath("//a[@class='buttonLogin2 noresponsive']"));
    public Boolean isloginButtonDisplayed(){
        return loginButton.isDisplayed();
    }

    public String getTitle(){
        return myDriver.getTitle();
    }

    public void clickLogin(){
        loginButton.click();
    }
}
