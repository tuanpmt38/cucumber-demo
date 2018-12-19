package stepDefinitions;


import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class BDDLoginTest {

    WebDriver driver;
    String url = "http://sdettraining.com/trguitransactions/AccountManagement.aspx";
    String username = "tim@testemail.com";
    String password = "trpass";

    By htmlUsername = By.id("MainContent_txtUserName");
    By htmlPassword = By.id("MainContent_txtPassword");
    By htmlClick = By.name("ctl00$MainContent$btnLogin");
    By htmlTitle = By.id("conf_message");

    @Given("^user is on the login page$")
    public void user_is_on_the_login_page() {

        System.out.println("User is on the login page");
        driver = utils.DrivenFactory.open("chrome");
        driver.get(url);

    }

    @When("^user enters correct username and correct password$")
    public void user_enters_correct_username_and_correct_password() throws Throwable {
        System.out.println("User enters correct username and correct password ");
        driver.findElement(htmlUsername).sendKeys(username);
        driver.findElement(htmlPassword).sendKeys(password);
        click_login();

    }

    @When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_enters_username(String username, String password) throws Throwable {
        System.out.println("Testing username and password: " + username + "," + password);
        driver.findElement(htmlUsername).sendKeys(username);
        driver.findElement(htmlPassword).sendKeys(password);
        click_login();
        Thread.sleep(5000);
    }

    @And("^user clicks login button")
    public void click_login() {
        driver.findElement(htmlClick).click();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Then("^user gets confirmation$")
    public void user_gets_confirmation() throws Throwable {
        System.out.println("User get confirmation");
        Assert.assertTrue(driver.findElement(htmlTitle).getText().contains("success"));
    }

//    @After
//    public void tearDown() {
//        driver.quit();
//    }
}

