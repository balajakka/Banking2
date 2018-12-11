package StepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import static StepDefinition.HookTest.myDriver;

/**
 * Created by balajakka on 10/12/2018.
 */
public class BankingAccess {
//    WebDriver myDriver;
    String myPageTitle;

    @Given("^I am a Chrome user$")
    public void I_am_a_Chrome_user(){


        System.setProperty("webdriver.chrome.driver","./src/test/java/StepDefinition/chromedriver");
        System.out.println("TEST");
    }

    @When("^I open Barclays website$")
    public void I_open_Barclays_website(){
        myDriver.get("https://www.barclays.co.uk");
        System.out.println("BERCLAYS PAGE");
    }

    @Then("^Barclays web page displays$")
    public void Barclays_web_page_displays(){
        //myPageTitle = myDriver.getTitle();
        //System.out.println(myPageTitle);

        BarclaysHomePage bhp1 = new BarclaysHomePage();
        Assert.assertEquals(true,bhp1.getHomePageTitle().contains("Barclays"));

    }
    @And("^Login button is displayed")
    public void step1(){
        //Boolean isLoginDisplayed = myDriver.findElement(By.xpath("//a[@class='login btn btn-primary btn-sm']")).isDisplayed();

        BarclaysHomePage bhp = new BarclaysHomePage();
        Assert.assertEquals(true,bhp.isLoginButtonDisplayed());

    }

    @And("^Register button is displayed")
    public void step2(){
        //Boolean isLoginDisplayed = myDriver.findElement(By.xpath("//a[@class='login btn btn-primary btn-sm']")).isDisplayed();

        BarclaysHomePage bhp2 = new BarclaysHomePage();
        Assert.assertEquals(true,bhp2.isRegisterButtonDisplayed());

    }

    @And("^Contact us button is displayed")
    public void step3(){
        //Boolean isLoginDisplayed = myDriver.findElement(By.xpath("//a[@class='login btn btn-primary btn-sm']")).isDisplayed();

        BarclaysHomePage bhp3 = new BarclaysHomePage();
        Assert.assertEquals(true,bhp3.isContactUsButtonDisplayed());

    }

    @When("^I open Santander website$")
    public void I_open_Santander_website(){
        myDriver.get("https://www.santander.co.uk/uk/");

    }
    @Then("^Santander Home page displayed$")
    public void Santander_Home_page_displayed(){
    SantanderHomePage shp1 = new SantanderHomePage();
        shp1.getTitle();
        //shp1.clickLogin();
        Assert.assertEquals(true,shp1.getTitle().contains("Santander"));
    }
    @And("^San Login button is displayed$")
    public void San_Login_button_is_displayed(){
        SantanderHomePage shp2 = new SantanderHomePage();
        Assert.assertEquals(true,shp2.isloginButtonDisplayed());

    }
}
