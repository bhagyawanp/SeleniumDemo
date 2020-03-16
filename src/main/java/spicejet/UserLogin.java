package spicejet;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Resources.Base;
import pageObjectModel.UserLoginPageObj;

public class UserLogin extends Base {

	// TODO Auto-generated method stub
	public static Logger log = LogManager.getLogger(Base.class.getName());

	@BeforeTest
	public void intialize() throws IOException {
		driver = intializeDriver();
		log.info("driver initialized register");
		driver.get(prop.getProperty("url"));
		log.info("naviagate to url");
	}

	@Test(dataProvider = "getData")
	public void loginUserTc(String Username, String Password) throws IOException, InterruptedException {

		UserLoginPageObj lp = new UserLoginPageObj(driver);
		Actions d = new Actions(driver);
		d.moveToElement(lp.getLoginButton());
		WebElement element = lp.getSpiceClubMember();
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
		WebElement element1 = lp.getMemberLogin();
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element1);
		lp.getUsername().sendKeys(Username);
		lp.getPassword().sendKeys(Password);
		lp.getLogin().click();

	}

	@DataProvider
	public Object[][] getData() {
// Row stands for how many different data types test should run
//coloumn stands for how many values per each test

// Array size is 2
// 0,1
		Object[][] data = new Object[2][2];
//0th row
		data[0][0] = "9689332176";
		data[0][1] = "Spicejet@1";

//1st row
		data[1][0] = "8421238017";
		data[1][1] = "Spicejet@1";

		return data;

	}

	@AfterTest
	public void tearDown() {
		driver.close();
		driver = null;// to clear the heap memory
		log.info("");
	}

}
