package demo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class NewAccount {

    public static void main(String[] args) {

        String name = "Minh Tuan";
        String email = "";
        String phone = "";
        String password = "mspass";
        String country = "Germany";
        String browserType = "chrome";
        String gender = "Female";
        boolean weeklyEmail = true;
        boolean monthleEmail =false;
        boolean occassionalEmail ;

        //define webdriver
        WebDriver driver;
        driver = utils.DrivenFactory.open(browserType);

        //open website
        String url = "http://sdettraining.com/trguitransactions/AccountManagement.aspx";
        driver.get(url);
        driver.findElement(By.className("btn")).click();

        //define web element
        WebElement nameElement = driver.findElement(By.name("ctl00$MainContent$txtFirstName"));
        WebElement emailElement = driver.findElement(By.id("MainContent_txtEmail"));
        WebElement phoneElement = driver.findElement(By.name("ctl00$MainContent$txtHomePhone"));
        WebElement passwordElement = driver.findElement(By.name("ctl00$MainContent$txtPassword")) ;
        WebElement veryfyPasswordElemnent = driver.findElement(By.name("ctl00$MainContent$txtVerifyPassword"));
        WebElement countryElement = driver.findElement(By.id("MainContent_menuCountry"));
        WebElement maleElement = driver.findElement(By.id("MainContent_Male"));
        WebElement femaleElement = driver.findElement(By.id("MainContent_Female"));
        WebElement weeklyCheckbox = driver.findElement(By.id("MainContent_checkWeeklyEmail"));
        WebElement submitButton = driver.findElement(By.name("ctl00$MainContent$btnSubmit"));

        //find out form
        nameElement.sendKeys(name);
        emailElement.sendKeys(email);
        phoneElement.sendKeys(phone);
        passwordElement.sendKeys(password);
        veryfyPasswordElemnent.sendKeys(password);
        new Select(countryElement).selectByVisibleText(country);

        //radio button
        if (gender.equalsIgnoreCase("Male")){
            maleElement.click();
        }else {
            femaleElement.click();
        }

        //checkbox
        if (weeklyEmail){
            if(!weeklyCheckbox.isSelected()){
                weeklyCheckbox.click();
            }
        }else {
            if (weeklyCheckbox.isSelected()){
                weeklyCheckbox.click();
            }
        }
        driver.findElement(By.id("MainContent_checkMonthlyEmail")).click();

        submitButton.click();

        String conf = driver.findElement(By.id("MainContent_lblTransactionResult")).getText();
        String expected = "Customer information added successfully";
        System.out.println("message: " + conf);

        if(conf.equals(expected)){
            System.out.println("CONfirmation: " + conf);
        }else {
            System.out.println("TEST FAILED");
        }
    }
}

