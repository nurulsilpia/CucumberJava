package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LoginPage_PF {

	@FindBy(id = "name")
	WebElement txt_username;
	
	@FindBy(id = "password")
	WebElement txt_password;
	
	@FindBy(id = "login")
	WebElement btn_login;
	
	WebDriver driver;
	
	public LoginPage_PF(WebDriver driver) {
		this.driver = driver;
		
		// AJAX handle loading time for element and to avoid 'No Element Exception'
		/*
		 * AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,
		 * 30); PageFactory.initElements(factory, this);
		 */
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
	}
	
	public void enterUsername(String username) {
		txt_username.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		txt_password.sendKeys(password); 
	}
	
	public void clickOnLogin() {
		btn_login.click();
	}
}
