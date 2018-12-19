package smocktest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTestNG {

    WebDriver driver;

    @Test
    public void loginTest(){
        System.out.println("Running test");
        boolean loginEmailBox= driver.findElement(By.id("MainContent_txtUserName")).isDisplayed();
        boolean passwordBox= driver.findElement(By.id("MainContent_txtPassword")).isDisplayed();

        Assert.assertTrue(loginEmailBox,"Email textbox");
        Assert.assertTrue(passwordBox,"Password textbox");
    }

    @BeforeMethod
    public void setup(){
        System.out.println("Starting test");
        driver = utils.DrivenFactory.open("chrome");
        String url = "http://sdettraining.com/trguitransactions/AccountManagement.aspx";
        driver.get(url);
    }

    @AfterMethod
    public void tearDear(){
        System.out.println("Closing test");
    }
}
