package managers;

import org.openqa.selenium.WebDriver;
import pageobjects.HomePage;

//import pageobjects.HotelBookingPage;

public class PageObjectManager {

	private WebDriver driver;
	private HomePage homepage;
//	private HotelBookingPage booking;
//	private allTest test;
	public PageObjectManager(WebDriver driver) {

		this.driver = driver;

	}

	public HomePage getHomePage() {
		return (homepage == null) ? new HomePage(driver) : homepage;
	}
//    public allTest getPage(){
//		return (test == null) ? new allTest(driver): test;
//	}
//	public HotelBookingPage getBooking(){
//		return (booking == null) ? new HotelBookingPage(driver): booking;
//	}

}
