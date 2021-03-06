package spicejet;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Resources.Base;
import Resources.ExcelDataDriven;
import pageObjectModel.RegisterUserPageObj;

public class RegisterUser extends Base {
	public static Logger log = LogManager.getLogger(Base.class.getName());

	@BeforeTest
	public void intialize() throws IOException {
		driver = intializeDriver();
		log.info("driver initialized");
		driver.get(prop.getProperty("url"));
		log.info("naviaget to url ");
	}

	@Test
	public void registerUserTc() throws IOException, InterruptedException {

		RegisterUserPageObj rs = new RegisterUserPageObj(driver);
		Actions d = new Actions(driver);
		d.moveToElement(rs.getLoginButton());
		WebElement element = rs.getSpiceClubMember();
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
		WebElement element1 = rs.getsignUp();
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element1);
		Select s = new Select(rs.gettitle());
		s.selectByIndex(1);

		ExcelDataDriven ed = new ExcelDataDriven();
		ArrayList<String> data = ed.getData("registerdata");

		rs.getFirstName().sendKeys(data.get(1));
		rs.getLastName().sendKeys(data.get(2));
		rs.getMobileNumber().sendKeys(data.get(3));
		rs.getpassword().sendKeys(data.get(4));
		rs.getConfirmPAssword().sendKeys(data.get(5));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(
				"document.getElementById('CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TEXTBOXINPUTDOB').value='06/04/1996'");
		rs.getEmail().sendKeys(data.get(6));
		rs.gettAndc().click();
		log.info("t and c accepeted");
		rs.getSubmit().click();
		log.info("u have regietr succesfully");

	}

	@AfterTest
	public void tearDown() {
		driver.close();
		driver = null;
		log.info("close the browser register");

	}

}
