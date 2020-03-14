package spicejet;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Resources.base;
import pageObjectModel.HotelBooking;

public class BookingHotels extends base {
	 public static Logger log =LogManager.getLogger(base.class.getName());

	@BeforeTest

	public void intialize() throws IOException {
		driver = intializeDriver();
		log.info("driver intialized");
		driver.get(prop.getProperty("url"));
		log.info("navigate to url");
		
		
	}

	@Test
	public void bookingHotelsTc() throws IOException, InterruptedException {
	
	
		HotelBooking hb = new HotelBooking(driver);
		hb.gethotelseacrh().click();
		WebElement source = hb.getdestinationcity();
		source.click();
		source.sendKeys("Pune");
		hb.getCheckInDate().click();
		int count1 = hb.getcalendarSelection().size();
		for (int i = 0; i < count1; i++) {
			String text = hb.getcalendarSelection().get(i).getText();
			if (text.equalsIgnoreCase("21")) {
				hb.getcalendarSelection().get(i).click();
				break;
			}
		}

		Select s = new Select(hb.getAdultCount());
		s.selectByIndex(2);
		hb.getSearchHotel().click();
		
		log.info("went through all elements");
	}
	@AfterTest
	public void teardown() {
		driver.close();
		driver = null;//to clear the heap memory
		log.info("");
	}
	

}
