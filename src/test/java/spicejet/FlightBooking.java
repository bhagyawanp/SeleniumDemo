package spicejet;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Resources.Base;
import pageObjectModel.FlightBookingPageObj;

public class FlightBooking extends Base {
	public static Logger log = LogManager.getLogger(Base.class.getName());

	@BeforeTest

	public void intialize() throws IOException {
		driver = intializeDriver();
		log.info("driver initialized");
		driver.get(prop.getProperty("url"));
		log.info("Navigate to url");

	}

	@Test
	public void flightBookingTc() throws IOException, InterruptedException {
		FlightBookingPageObj fb = new FlightBookingPageObj(driver);
		fb.getDeparture().click();
		fb.getDepartureCity().click();
		fb.getArrivalCity().click();
		fb.getDeprtureDate().click();
		int count = fb.getCalendar().size();
		for (int i = 0; i < count; i++) {
			String text = fb.getCalendar().get(i).getText();
			if (text.equalsIgnoreCase("21")) {
				fb.getCalendar().get(i).click();
				break;
			}
		}
		fb.getSearchFlight().click();
		log.info("went through all elements");
	}

	@AfterTest
	public void tearDown() {
		driver.close();
		driver = null;
		log.info("close the browser");
	}

}
