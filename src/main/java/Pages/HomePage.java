package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(id="user-name")
	WebElement emailField;
	
	@FindBy(id="password")
	WebElement passwordField;
	
	@FindBy(id="login-button")
	WebElement signinButton;
	
	/*public void clicksignIn()
	{
		LoginLink.click();
	}*/
	
	public void enterSignDetails(String email,String password)
	{
		emailField.sendKeys(email);
		passwordField.sendKeys(password);
		signinButton.click();
	}
	
	public String getHomepageURL()
	{
		return driver.getCurrentUrl();
	}
	

}
