package test;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

@RunWith(value = Parameterized.class)
public class NewAccountDDT {

    String name, email, phone, gender, password, country;
    boolean weeklyEmail, monthlyEmail, occasionlEmail;
    WebElement nameElement, emailElement, phoneElement, passwordElement, veryfyPasswordElemnent, countryElement, maleElement, femaleElement, weeklyCheckbox, submitButton;
    WebDriver driver;
    String url = "http://sdettraining.com/trguitransactions/AccountManagement.aspx";

    //test method
    @Test
    public void newAccountTest() {
        System.out.println("new record: " + name + " " + email + " " + phone + " " + gender + " " + password +
                " " + country + " " + weeklyEmail + " " + monthlyEmail + " " + occasionlEmail);

        defineWebElements();

        //find out form
        nameElement.sendKeys(name);
        emailElement.sendKeys(email);
        phoneElement.sendKeys(phone);
        passwordElement.sendKeys(password);
        veryfyPasswordElemnent.sendKeys(password);
        new Select(countryElement).selectByVisibleText(country);

        //radio button
        if (gender.equalsIgnoreCase("Male")) {
            maleElement.click();
        } else {
            femaleElement.click();
        }

        //checkbox
        if (weeklyEmail) {
            if (!weeklyCheckbox.isSelected()) {
                weeklyCheckbox.click();
            }
        } else {
            if (weeklyCheckbox.isSelected()) {
                weeklyCheckbox.click();
            }
        }

        // submitButton.click();
//        if(phone.equals("45678891234")){
//            Assert.fail();
//        }
    }

    public void defineWebElements() {
        //define web element
        nameElement = driver.findElement(By.name("ctl00$MainContent$txtFirstName"));
        emailElement = driver.findElement(By.id("MainContent_txtEmail"));
        phoneElement = driver.findElement(By.name("ctl00$MainContent$txtHomePhone"));
        passwordElement = driver.findElement(By.id("MainContent_txtPassword"));
        veryfyPasswordElemnent = driver.findElement(By.id("MainContent_txtVerifyPassword"));
        countryElement = driver.findElement(By.id("MainContent_menuCountry"));
        maleElement = driver.findElement(By.id("MainContent_Male"));
        femaleElement = driver.findElement(By.id("MainContent_Female"));
        weeklyCheckbox = driver.findElement(By.id("MainContent_checkWeeklyEmail"));
        submitButton = driver.findElement(By.name("ctl00$MainContent$btnSubmit"));
    }

    @Before
    public void setUp() {
        //define webdriver
        driver = utils.DrivenFactory.open("chrome");
        //open website
        driver.get(url);
        driver.findElement(By.className("btn")).click();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Parameterized.Parameters
    public static List<String[]> getData() {

        return utils.CSV.get("/home/tuan-minh/setup/setup-selenium/UserAccount");
    }

    public NewAccountDDT(String name, String email, String phone, String gender, String password, String country,
                         String weeklyEmail, String monthlyEmail, String occasionalEmail) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.gender = gender;
        this.password = password;
        this.country = country;

        if(weeklyEmail.equals("TRUE")){ this.weeklyEmail = true; }else {
            this.weeklyEmail = false;
        }
        if(monthlyEmail.equals("TRUE")){ this.monthlyEmail = true; }else {
            this.monthlyEmail = false;
        }
        if(occasionalEmail.equals("TRUE")){ this.occasionlEmail = true; }else {
            this.occasionlEmail = false;
        }
    }
}
