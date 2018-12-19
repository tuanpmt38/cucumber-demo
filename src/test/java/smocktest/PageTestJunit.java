package smocktest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class PageTestJunit {

    // khai bao bien va class
    WebDriver driver;
    String url = "http://sdettraining.com/trguitransactions/AccountManagement.aspx";

    @Test
    public void pageTitleTest() {

        System.out.println("Runnning the test");

        driver = utils.DrivenFactory.open("chrome");
        driver.get(url);
        String actualTitle = driver.getTitle();
        String expectedTitle = "SDET Training | Account Management";
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @Before
    public void setUp(){
        System.out.println("Setting up the test");
        System.out.println("Initalizing the driver");
        driver = utils.DrivenFactory.open("chrome");

    }

    @After
    public void tearDown(){
        System.out.println("Closing the test");
        driver.close();
        System.out.println("Closing the driver");
    }
}

