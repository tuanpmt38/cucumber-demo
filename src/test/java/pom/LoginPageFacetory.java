package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFacetory {

    // define web element at class level
    WebDriver driver;
    @FindBy(id = "MainContent_txtUserName" )
    WebElement usernameBox;

    @FindBy(id = "MainContent_txtPassword" )
    WebElement passwordBox;

    @FindBy(name = "ctl00$MainContent$btnLogin" )
    WebElement submitButton;

    // steps
    public void setUsername(String username){
        usernameBox.sendKeys(username);
    }
    public void setPassword(String password){
        passwordBox.sendKeys(password);
    }
    public void clickSubmit(){
        submitButton.click();
    }

    // action
    public void login(String username, String password){
        setUsername(username);
        setPassword(password);
        clickSubmit();

    }

    // contractor
    public LoginPageFacetory(WebDriver driver) {
        this.driver = driver;

        // in it webelement
        PageFactory.initElements(driver, this);
    }

}

