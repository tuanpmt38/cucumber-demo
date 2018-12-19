package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginDDT {

    WebDriver driver;
    String url = "http://sdettraining.com/trguitransactions/AccountManagement.aspx";

    @Test( dataProvider= "getData")
    public void loginTest(String name, String email, String password){

        driver.findElement(By.name("ctl00$MainContent$txtUserName")).sendKeys(email);
        driver.findElement(By.name("ctl00$MainContent$txtPassword")).sendKeys(password);

        //submitElement.click();
//        String message = driver.findElement(By.id("conf_message")).getText();
//        System.out.println("CONfirmation: " + message);

        String pageTile = driver.getTitle();
        System.out.println("PageTitle: " +pageTile);

        System.out.println("New record: " + email + " " + password);
    }

    @BeforeMethod
    public void setUp(){
        driver = utils.DrivenFactory.open("chrome");
        driver.get(url);
    }

    @AfterMethod
    public void tearDown(){

        driver.quit();
    }

    @DataProvider
    public Object[][] getData(){

        String filename = "/home/tuan-minh/setup/setup-selenium/UserLogin.xls";

        return utils.Excel.get(filename);
    }
}

