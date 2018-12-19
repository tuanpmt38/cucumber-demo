package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pom.DashboardPage;
import pom.LoginPage;

public class Login {

    @Test
    public void loginTestPOM(){

        // Init driver
        WebDriver driver = utils.DrivenFactory.open("chrome");
        String url = "http://sdettraining.com/trguitransactions/AccountManagement.aspx";
        driver.get(url);

        // Enter Loginpage infomation
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setLoginPage("tim@testemail.com","trpass");
        loginPage.clickSubmit();

        //Dashboard
        DashboardPage dashboardPage = new DashboardPage(driver);
        String conf = dashboardPage.confirmationMessage();
        System.out.println(conf);
        String title = dashboardPage.getTitle();

        Assert.assertTrue(conf.contains("success"));
        Assert.assertTrue(title.contains("Account"));
//        dashboardPage.changPassword();
//        dashboardPage.confirmationMessage();

        //get confirmation

        // close driver
        driver.close();
    }
}

