package Utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Pages.PageObjectManager;

public class TextContextSetup {
	
	public WebDriver driver;
	public PageObjectManager PageObjectManager;
	public Base base;
	public String  listingPageURL;
	
	public TextContextSetup() throws IOException
	{
		base=new Base();
		PageObjectManager=new PageObjectManager(base.initilazeDriver());
		
	}
	
	
	

}
