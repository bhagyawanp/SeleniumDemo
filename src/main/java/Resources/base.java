package Resources;

import java.io.File;

import org.apache.commons.io.FileUtils;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class base {

	
	public  WebDriver driver;
	public Properties prop;
	
	public WebDriver intializeDriver() throws IOException {
		
		prop=new Properties();
		FileInputStream fis=new FileInputStream("/Users/bhagyawantpawar/eclipse-workspace/SeleniumWeb/src/main/java/Resources/base.properties");
		
		prop.load(fis);
		String browserName= prop.getProperty("browser");
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","/Users/bhagyawantpawar/Selenium/chromedriver 5");
			driver=new  ChromeDriver();
				
		}

	else if(browserName.equals("firefox")){
		
	}
	else if(browserName.equals("IE")){
		
	}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
		
	}

public void getScreenshot(String result) throws IOException
{
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("/Users/bhagyawantpawar/Documents/seleniumscreensots"+result+"screenshot.png"));
	
}

	

}
