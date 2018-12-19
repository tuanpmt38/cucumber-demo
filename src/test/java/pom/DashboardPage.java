package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {

    WebDriver driver;

    public String confirmationMessage(){
        return driver.findElement(By.id("conf_message")).getText();
    }

    public String getTitle(){
        return driver.getTitle();
    }

    public void changPassword(){
        driver.findElement(By.linkText("Change password")).click();
    }

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }
}

