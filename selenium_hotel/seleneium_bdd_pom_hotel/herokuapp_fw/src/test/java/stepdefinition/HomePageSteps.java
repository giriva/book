package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import managers.FileReaderManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import managers.PageObjectManager;
import org.openqa.selenium.WebDriver;
import managers.WebDriverManager;
import pageobjects.HomePage;

import java.util.concurrent.TimeUnit;

public class HomePageSteps {

    WebDriver driver;

    HomePage homePage;
    WebDriverManager webDriverManager;
    PageObjectManager pageObjectManager;


    @Given("^application is loaded$")
    public void user_is_on_Home_Page() {
        System.setProperty("webdriver.chrome.driver", FileReaderManager.getInstance().getConfigReader().getDriverPath());
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(FileReaderManager.getInstance().getConfigReader().getImplicitlyWait(), TimeUnit.SECONDS);
        pageObjectManager = new PageObjectManager(driver);
        homePage = pageObjectManager.getHomePage();
        homePage.navigateTo_HomePage();
    }

    @Given("^firstname field lable is displayed$")
    public void firstname_field_lable_is_displayed() throws Throwable {
        String fName = "Firstname";
        Assert.assertEquals(fName, homePage.getfnameText());
    }

    @And("^surname field lable is displayed$")
    public void surname_field_lable_is_displayed() throws Throwable {
        String lName = "Surname";
        Assert.assertEquals(lName, homePage.getlnameText());
    }

    @And("^price field lable is displayed$")
    public void price_field_lable_is_displayed() throws Throwable {
        String price = "Price";
        Assert.assertEquals(price, homePage.getpriceText());
    }

    @And("^deposit field lable is displayed$")
    public void deposit_field_lable_is_displayed() throws Throwable {
        String deposit = "Deposit";
        Assert.assertEquals(deposit, homePage.getdepositText());
    }

    @And("^Checkin field lable is displayed$")
    public void checkin_field_lable_is_displayed() throws Throwable {
        String chkin = "Check-in";
        Assert.assertEquals(chkin, homePage.getlcheckinText());
    }

    @Then("^Checkout field lable is displayed$")
    public void checkout_field_lable_is_displayed() throws Throwable {
        String chkout = "Check-out";
        Assert.assertEquals(chkout, homePage.getlcheckoutText());
        driver.quit();

    }
}
