package spicejet;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Resources.base;
import pageObjectModel.FlightBooking;

public class flightBooking extends base{
	 public static Logger log =LogManager.getLogger(base.class.getName());
	@BeforeTest

	public void intialize() throws IOException {
		driver = intializeDriver();
		log.info("driver initialized");
		driver.get(prop.getProperty("url"));
		log.info("driver baviagted");
		
		
	}
	

	@Test
	public void flightBookingTc() throws IOException, InterruptedException {
		
		log.info("navigated to site");
		FlightBooking fb = new FlightBooking(driver);
		fb.getdaparture().click();
		fb.getdepartureCity().click();
		fb.getarrivalCity().click();
		fb.getdaprturedate().click();
		int count = fb.getcalendar().size();
		for (int i = 0; i < count; i++) {
			String text = fb.getcalendar().get(i).getText();
			if (text.equalsIgnoreCase("21")) {
				fb.getcalendar().get(i).click();
				break;
			}
		}
		fb.getsearchflight().click();
	}
		@AfterTest
		public void teardown() {
			driver.close();
			driver = null;
		}

}

	