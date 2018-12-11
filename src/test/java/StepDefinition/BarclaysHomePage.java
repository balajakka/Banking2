package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static StepDefinition.HookTest.myDriver;

/**
 * Created by balajakka on 11/12/2018.
 */
public class BarclaysHomePage {

    WebElement loginButton = myDriver.findElement(By.xpath("//a[@class='login btn btn-primary btn-sm']"));
    WebElement registerButton = myDriver.findElement(By.xpath("//a[@class='btn-none']"));
    WebElement contactusButton = myDriver.findElement(By.xpath("//div[@id='menu-screen']"));

    public Boolean isLoginButtonDisplayed(){
        return loginButton.isDisplayed();
    }
    public Boolean isRegisterButtonDisplayed(){
        return registerButton.isDisplayed();
    }

    public Boolean isContactUsButtonDisplayed(){
        return contactusButton.isDisplayed();
    }

    public String getHomePageTitle(){
        return myDriver.getTitle();
    }

}
