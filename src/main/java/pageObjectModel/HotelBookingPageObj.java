package pageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HotelBookingPageObj {
	public WebDriver driver;
	
	By hotelSearch=By.xpath("//span[contains(text(),'Hotels')]");
	By destinationCity=By.xpath("//input[@id='ctl00_mainContent_txtOriginStation1_MST']");
	By checkInDate=By.xpath("//input[@id='ctl00_mainContent_txt_Fromdate_MST']");
	By calendarSelection=By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//a[@class='ui-state-default']");
	By selectAdult=By.xpath("//select[@id='ddl_Adult_MST']");
	By searchHotel=By.xpath("//input[@id='ctl00_mainContent_ButtonSubmit_MST']");


	
	
	public HotelBookingPageObj(WebDriver driver) {
		this.driver=driver;	
	}
	
	
	public WebElement getHotelSearch() {
		return driver.findElement( hotelSearch);
		
	}
	public WebElement getDestinationCity() {
		return driver.findElement(destinationCity);
		
	}
	public WebElement getCheckInDate() {
		return driver.findElement(checkInDate);
		
	}
	public List<WebElement> getCalendarSelection() {
		return driver.findElements(calendarSelection);
		
	}
	
	public WebElement getAdultCount() {
		return driver.findElement(selectAdult);
		
	}
	public WebElement getSearchHotel() {
		return driver.findElement(searchHotel);
		
	}


	

}
