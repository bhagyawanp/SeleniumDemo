package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Registeration {
	
	public WebDriver driver;
	
	By LoginButton=By.xpath("//a[@id='ctl00_HyperLinkLogin']");
	By spiceClubMember=By.xpath("//a[contains(text(),'SpiceClub Members')]");
	By signUp=By.xpath("//a[contains(text(),'Sign up')]");
	By title=By.id("CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_DropDownListTitle");
	By FirstName=By.cssSelector("#CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TextBoxFirstName");
	By LastName=By.xpath("//input[@id='CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TextBoxLastName']");
	By mobileNumber=By.xpath("//input[@id='CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TEXTBOXINTLMOBILENUMBER']");
	By password=By.xpath("//input[@id='CONTROLGROUPREGISTERVIEW_MemberInputRegisterView_PasswordFieldAgentPassword']");
	By ConfirmPAssword=By.xpath("//input[@id='CONTROLGROUPREGISTERVIEW_MemberInputRegisterView_PasswordFieldPasswordConfirm']");
	By DoB=By.id("CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TEXTBOXINPUTDOB");
	By Email=By.xpath("//input[@id='CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TextBoxEmail']");
	By tAndc=By.xpath("//input[@id='chkSpiceClubTnC']");
	By submit=By.xpath("//input[@id='CONTROLGROUPREGISTERVIEW_ButtonSubmit']");
	
	
	
	public Registeration(WebDriver driver) {
		this.driver=driver;	
	}
	
	
	public WebElement getLoginButton() {
		return driver.findElement(LoginButton);
		
	}
	public WebElement getSpcieClubMember() {
		return driver.findElement(spiceClubMember);
		
	}
	public WebElement getsignUp() {
		return driver.findElement(signUp);
		
	}
	public WebElement gettitle() {
		return driver.findElement(title);
		
	}
	public WebElement getFirstName() {
		return driver.findElement(FirstName);
		
	}
	
	public WebElement getLastName() {
		return driver.findElement(LastName);
		
	}
	
	public WebElement getMobileNumber() {
		return driver.findElement( mobileNumber);
		
	}
	public WebElement getpassword() {
		return driver.findElement(password);
		
	}
	public WebElement getConfirmPAssword() {
		return driver.findElement(ConfirmPAssword);
		
	}
	public WebElement getDoB() {
		return driver.findElement(DoB);
		
	}
	
	public WebElement getEmail() {
		return driver.findElement( Email);
		
	}
	public WebElement gettAndc() {
		return driver.findElement( tAndc);
		
	}
	
	public WebElement getSubmit() {
		return driver.findElement(submit);
		
	}
	
	
	
	
	

}
