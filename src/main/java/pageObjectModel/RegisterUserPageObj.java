package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterUserPageObj {
	
	public WebDriver driver;
	
	private By loginButton=By.xpath("//a[@id='ctl00_HyperLinkLogin']");
	private By spiceClubMember=By.xpath("//a[contains(text(),'SpiceClub Members')]");
	private By signUp=By.xpath("//a[contains(text(),'Sign up')]");
	private By title=By.id("CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_DropDownListTitle");
	private By firstName=By.cssSelector("#CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TextBoxFirstName");
	private By lastName=By.xpath("//input[@id='CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TextBoxLastName']");
	private By mobileNumber=By.xpath("//input[@id='CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TEXTBOXINTLMOBILENUMBER']");
	private By password=By.xpath("//input[@id='CONTROLGROUPREGISTERVIEW_MemberInputRegisterView_PasswordFieldAgentPassword']");
	private By confirmPassword=By.xpath("//input[@id='CONTROLGROUPREGISTERVIEW_MemberInputRegisterView_PasswordFieldPasswordConfirm']");
	private By doB=By.id("CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TEXTBOXINPUTDOB");
	private By email=By.xpath("//input[@id='CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TextBoxEmail']");
	private By tAndc=By.xpath("//input[@id='chkSpiceClubTnC']");
	private By submit=By.xpath("//input[@id='CONTROLGROUPREGISTERVIEW_ButtonSubmit']");
	
	
	
	public RegisterUserPageObj(WebDriver driver) {
		this.driver=driver;	
	}
	
	
	public WebElement getLoginButton() {
		return driver.findElement(loginButton);
		
	}
	public WebElement getSpiceClubMember() {
		return driver.findElement(spiceClubMember);
		
	}
	public WebElement getsignUp() {
		return driver.findElement(signUp);
		
	}
	public WebElement gettitle() {
		return driver.findElement(title);
		
	}
	public WebElement getFirstName() {
		return driver.findElement(firstName);
		
	}
	
	public WebElement getLastName() {
		return driver.findElement(lastName);
		
	}
	
	public WebElement getMobileNumber() {
		return driver.findElement( mobileNumber);
		
	}
	public WebElement getpassword() {
		return driver.findElement(password);
		
	}
	public WebElement getConfirmPAssword() {
		return driver.findElement(confirmPassword);
		
	}
	public WebElement getDoB() {
		return driver.findElement(doB);
		
	}
	
	public WebElement getEmail() {
		return driver.findElement( email);
		
	}
	public WebElement gettAndc() {
		return driver.findElement(tAndc);
		
	}
	
	public WebElement getSubmit() {
		return driver.findElement(submit);
		
	}
	
	
	
	
	

}
