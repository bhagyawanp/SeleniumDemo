package pageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlightBookingPageObj {
	
	public WebDriver driver;
	
	private By departure=By.xpath("//span[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']");
	private By departureCity=By.xpath("//a[contains(text(),'Aurangabad (IXU)')]");
	private By arrivalCity=By.xpath("//a[contains(text(),'Durgapur (RDP)')]");
	private By departureDate=By.id("ctl00_mainContent_view_date1");
	private By calendarSelection=By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//a[@class='ui-state-default']");
	private By searchFlight=By.id("ctl00_mainContent_btn_FindFlights");
	
	
	public FlightBookingPageObj(WebDriver driver) {
		this.driver=driver;	
	}
	
	
	public WebElement getDeparture() {
		return driver.findElement(departure);
		
	}
	public WebElement getDepartureCity() {
		return driver.findElement(departureCity);
		
	}
	public WebElement getArrivalCity() {
		return driver.findElement(arrivalCity);
		
	}
	public WebElement getDeprtureDate() {
		return driver.findElement(departureDate);
	}
	
	public List<WebElement> getCalendar() {
		
		return driver.findElements(calendarSelection);
	}
	public WebElement getSearchFlight() {
		return driver.findElement(searchFlight);
	}
	
	

	
	
	
	

}
