package spicejet;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Resources.Base;
import pageObjectModel.HotelBookingPageObj;

public class HotelBooking extends Base {
	public static Logger log = LogManager.getLogger(Base.class.getName());

	@BeforeTest

	public void intialize() throws IOException {
		driver = intializeDriver();
		log.info("driver intialized");
		driver.get(prop.getProperty("url"));
		log.info("navigate to url");

	}

	@Test
	public void hotelBookingTc() throws IOException, InterruptedException {

		HotelBookingPageObj hb = new HotelBookingPageObj(driver);
		hb.getHotelSearch().click();
		WebElement source = hb.getDestinationCity();
		source.click();
		source.sendKeys("Pune");
		hb.getCheckInDate().click();
		int count1 = hb.getCalendarSelection().size();
		for (int i = 0; i < count1; i++) {
			String text = hb.getCalendarSelection().get(i).getText();
			if (text.equalsIgnoreCase("21")) {
				hb.getCalendarSelection().get(i).click();
				break;
			}
		}

		Select s = new Select(hb.getAdultCount());
		s.selectByIndex(2);
		hb.getSearchHotel().click();

		log.info("went through all elements");
	}

	@AfterTest
	public void tearDown() {
		driver.close();
		driver = null;// to clear the heap memory
		log.info("");
	}

}
