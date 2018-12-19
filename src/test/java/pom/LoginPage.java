package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    By name = By.id("MainContent_txtUserName");
    By passwd = By.id("MainContent_txtPassword");
    By btnLogin = By.name("ctl00$MainContent$btnLogin");

    public void clickSubmit(){
        driver.findElement(btnLogin).click();
    }

    public void setLoginPage(String username, String password){
        driver.findElement(name).sendKeys(username);
        driver.findElement(passwd).sendKeys(password);

    }

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
}

