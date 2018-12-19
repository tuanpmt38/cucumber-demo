package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DrivenFactory {

    //this method return a webdriver object
    public static WebDriver open (String browserType){

        if(browserType.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","/home/tuan-minh/setup/setup-selenium/chromedriver");
            return new ChromeDriver();
        }else {
            System.setProperty("webdriver.gecko.driver","/home/tuan-minh/setup/setup-selenium/geckodriver");
            return new FirefoxDriver();
        }

    }
}
