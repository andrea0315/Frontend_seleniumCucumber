package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageObjectManager {
	
	public HomePage homepage;
	public ListingPage listingpage;
	public WebDriver driver;
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public HomePage gethomePage()
	{
		homepage=new HomePage(driver);
		return homepage;

	}
	
	public ListingPage getlistingPage()
	
	{
		listingpage=new ListingPage(driver);
		return listingpage;
		
	}
	
	

}
