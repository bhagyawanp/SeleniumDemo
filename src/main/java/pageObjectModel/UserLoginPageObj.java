package pageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserLoginPageObj {
	
public WebDriver driver;

    By loginButton=By.xpath("//a[@id='ctl00_HyperLinkLogin']");
	By spiceClubMember=By.xpath("//a[contains(text(),'SpiceClub Members')]");
    By memberLogin=By.xpath("//li[@class='hide-mobile']//ul//li//a[contains(text(),'Member Login')]");
	By username=By.cssSelector("#ControlGroupLoginView_MemberLoginView2LoginView_TextBoxUserID");
	By password=By.cssSelector("#ControlGroupLoginView_MemberLoginView2LoginView_PasswordFieldPassword");
	By login=By.cssSelector("#ControlGroupLoginView_MemberLoginView2LoginView_ButtonLogIn");

	
	public UserLoginPageObj(WebDriver driver) {
		this.driver=driver;	
	}
	
	

	
	public WebElement getLoginButton() {
		return driver.findElement(loginButton);
		
	}
	public WebElement getSpiceClubMember() {
		return driver.findElement(spiceClubMember);
		
	}
	public WebElement getMemberLogin() {
		return driver.findElement(memberLogin);
		
	}
	public WebElement getUsername() {
		return driver.findElement(username);
		
	}
	public WebElement getPassword() {
		return driver.findElement(password);
		
	}
	public WebElement getLogin() {
		return driver.findElement(login);
		
	}


	
	

}
