package pageobjects;

import dataProviders.ConfigFileReader;
import managers.FileReaderManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class HomePage {

	WebDriver driver;
	ConfigFileReader configFileReader;
	
	public HomePage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


    public void navigateTo_HomePage() {
        driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
    }

	@FindBy(how = How.CSS , using= "#bookings > div:nth-child(1) > div:nth-child(1) > h3")
	private WebElement fnamelabel;
	
	@FindBy(how = How.CSS , using= "#bookings > div:nth-child(1) > div:nth-child(2) > h3")
	private WebElement lnamelabel;

	@FindBy(how = How.CSS , using= "#bookings > div:nth-child(1) > div:nth-child(3) > h3")
	private WebElement price;

	@FindBy(how = How.CSS , using= "#bookings > div:nth-child(1) > div:nth-child(4) > h3")
	private WebElement deposit;

	@FindBy(how = How.CSS , using= "#bookings > div:nth-child(1) > div:nth-child(5) > h3")
	private WebElement checkin;

	@FindBy(how = How.CSS , using= "#bookings > div:nth-child(1) > div:nth-child(6) > h3")
	private WebElement checkout;

	public void getTitle(){
//
	}
	public String getfnameText(){
		return fnamelabel.getText();
	}
	public String getlnameText(){
		return lnamelabel.getText();
	}
	public String getpriceText(){
		return price.getText();
	}
	public String getdepositText(){
		return deposit.getText();
	}
	public String getlcheckinText(){
		return  checkin.getText();
	}
	public String getlcheckoutText(){
		return  checkout.getText();
	}

}
