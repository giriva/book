package stepdefinition;

import java.util.concurrent.TimeUnit;
import managers.FileReaderManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import static java.lang.Thread.sleep;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;


public class allTest {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", FileReaderManager.getInstance().getConfigReader().getDriverPath());
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(FileReaderManager.getInstance().getConfigReader().getImplicitlyWait(), TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void test() throws Exception {
        driver.get("http://hotel-test.equalexperts.io/");
        driver.findElement(By.id("firstname")).clear();
        driver.findElement(By.id("firstname")).sendKeys("test");
        driver.findElement(By.id("lastname")).clear();
        driver.findElement(By.id("lastname")).sendKeys("testlastname");
        driver.findElement(By.id("totalprice")).clear();
        driver.findElement(By.id("totalprice")).sendKeys("3");
        driver.findElement(By.id("checkin")).clear();
        driver.findElement(By.id("checkin")).sendKeys("2018-09-11");
        driver.findElement(By.id("checkout")).clear();
        driver.findElement(By.id("checkout")).sendKeys("2018-09-12");
        driver.findElement(By.cssSelector("#form > div:nth-child(1) > div:nth-child(7) > input:nth-child(1)")).click();
        sleep(5);
        System.out.println("Booking Successfully made");
        driver.findElement(By.cssSelector("div:nth-child(7) > input:nth-child(1)")).click();
        System.out.println("Deletion successfully done");
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }

}




