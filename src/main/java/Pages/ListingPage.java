package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ListingPage {
	
	public WebDriver driver;
	String listingPageURL="https://www.saucedemo.com/inventory.html";
	
	public ListingPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
    public String getUrl()
    {
    	return driver.getCurrentUrl();
    }
	
	

}
