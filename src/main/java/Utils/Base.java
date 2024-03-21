package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	WebDriver driver;
	
	public WebDriver initilazeDriver() throws IOException
	{
		Properties prop=new Properties();
		FileInputStream file=new FileInputStream("src//test//java//Configuration//data.properties");
		prop.load(file);
		
		String Url=prop.getProperty("URL");
		String browser=prop.getProperty("browser");
		System.out.println("Browser is"+ browser);
		
		if(driver==null)
		{
			if(browser.equals("chrome"))
			{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver=new ChromeDriver();
			}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(Url);
		driver.manage().window().maximize();

		}
		return driver;
	}
	

}
