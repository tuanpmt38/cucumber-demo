package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class BDDCreateAccountTest {

    WebDriver driver;
    String url = "http://sdettraining.com/trguitransactions/NewAccount.aspx";

    By htmlName = By.id("MainContent_txtFirstName");
    By htmlEmail = By.id("MainContent_txtEmail");
    By htmlPhone = By.id("MainContent_txtHomePhone");
    By htmlPassword = By.id("MainContent_txtPassword");
    By htmlVerifyPassword = By.id("MainContent_txtVerifyPassword");
    By htmlSubmit = By.id("MainContent_btnSubmit");
    By htmlTitle = By.id("MainContent_lblTransactionResult");
    By htmlMale = By.id("MainContent_Male");
    By htmlFemale = By.id("MainContent_Female");
    By htmlCountry = By.id("MainContent_menuCountry");
    By htmlWeeklyEmail = By.id("MainContent_checkWeeklyEmail");
    By htmlMonthlyEmail = By.id("MainContent_checkMonthlyEmail");
    By htmlOccasional = By.id("MainContent_checkUpdates");

    @Given("^user is on the page create account$")
    public void user_is_on_the_page_create_account() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver = utils.DrivenFactory.open("chrome");
        driver.get(url);
        
    }

    @When("^user enters \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and (.*)$")
    public void user_enters_and_and_and_and(String name, String email, String phone, String password, String verifypassword) {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(htmlName).sendKeys(name);
        driver.findElement(htmlEmail).sendKeys(email);
        driver.findElement(htmlPhone).sendKeys(phone);
        driver.findElement(htmlPassword).sendKeys(password);
        driver.findElement(htmlVerifyPassword).sendKeys(verifypassword);
        
    }

    @When("^user select checkbox gender$")
    public void user_select_checkbox_gender() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
            driver.findElement(htmlMale).click();
        
    }

    @When("^user select country$")
    public void user_select_country() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        new Select(driver.findElement(htmlCountry)).selectByVisibleText("Germany");
        
    }

    @When("^user select checkbox subscriptions$")
    public void user_select_checkbox_subscriptions() throws Throwable{
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(htmlWeeklyEmail).click();

    }

    @When("^user click submit$")
    public void user_click_submit() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        WebElement submitElement = driver.findElement(htmlSubmit);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", submitElement);

//        Actions actions = new Actions(driver);
//        actions.click(driver.findElement(htmlSubmit));
//        actions.moveToElement(driver.findElement(htmlSubmit)).build().perform();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Thread.sleep(5000);
        
    }

    @Then("^gets confirmation$")
    public void gets_confirmation() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(driver.findElement(htmlTitle).getText().contains("success"));
    }
    @After
    public void tearDown() {
        driver.quit();
    }
}
