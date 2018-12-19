package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pom.LoginPageFacetory;

public class LoginFactory {

    String username= "tim@testemail.com";
    String password = "trpass";

    @Test
    public void loginTestFactory(){

        // in it driver
        WebDriver driver = utils.DrivenFactory.open("chrome");
        String url = "http://sdettraining.com/trguitransactions/AccountManagement.aspx";
        driver.get(url);

        // enter login
        LoginPageFacetory loginFactory = new LoginPageFacetory(driver);
        loginFactory.login(username,password);
    }
}
