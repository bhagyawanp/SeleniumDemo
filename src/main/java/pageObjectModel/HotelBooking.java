package pageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HotelBooking {
	public WebDriver driver;
	
	By hotelSearch=By.xpath("//span[contains(text(),'Hotels')]");
	By destinationCity=By.xpath("//input[@id='ctl00_mainContent_txtOriginStation1_MST']");
	By CheckInDate=By.xpath("//input[@id='ctl00_mainContent_txt_Fromdate_MST']");
	By calendarSelection=By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//a[@class='ui-state-default']");
	By SelectAdult=By.xpath("//select[@id='ddl_Adult_MST']");
	By searchHotel=By.xpath("//input[@id='ctl00_mainContent_ButtonSubmit_MST']");


	
	
	public HotelBooking(WebDriver driver) {
		this.driver=driver;	
	}
	
	
	public WebElement gethotelseacrh() {
		return driver.findElement( hotelSearch);
		
	}
	public WebElement getdestinationcity() {
		return driver.findElement(destinationCity);
		
	}
	public WebElement getCheckInDate() {
		return driver.findElement(CheckInDate);
		
	}
	public List<WebElement> getcalendarSelection() {
		return driver.findElements(calendarSelection);
		
	}
	
	public WebElement getAdultCount() {
		return driver.findElement(SelectAdult);
		
	}
	public WebElement getSearchHotel() {
		return driver.findElement(searchHotel);
		
	}


	

}
