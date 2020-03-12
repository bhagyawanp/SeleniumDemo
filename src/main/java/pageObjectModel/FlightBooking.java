package pageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlightBooking {
	
	public WebDriver driver;
	
	By departure=By.xpath("//span[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']");
	By departureCity=By.xpath("//a[contains(text(),'Aurangabad (IXU)')]");
	By arrivalCity=By.xpath("//a[contains(text(),'Durgapur (RDP)')]");
	By departureDate=By.id("ctl00_mainContent_view_date1");
	By searchFlight=By.id("ctl00_mainContent_btn_FindFlights");
	By calendarSelection=By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//a[@class='ui-state-default']");

	
	
	public FlightBooking(WebDriver driver) {
		this.driver=driver;	
	}
	
	
	public WebElement getdaparture() {
		return driver.findElement(departure);
		
	}
	public WebElement getdepartureCity() {
		return driver.findElement(departureCity);
		
	}
	public WebElement getarrivalCity() {
		return driver.findElement(arrivalCity);
		
	}
	public WebElement getdaprturedate() {
		return driver.findElement(departureDate);
	}
	
	public List<WebElement> getcalendar() {
		
		return driver.findElements(calendarSelection);
	}
	public WebElement getsearchflight() {
		return driver.findElement(searchFlight);
	}
	
	

	
	
	
	

}
