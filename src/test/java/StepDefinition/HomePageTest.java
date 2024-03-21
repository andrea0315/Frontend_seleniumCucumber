package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Pages.HomePage;
import Utils.TextContextSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageTest {

	TextContextSetup tcs;
	HomePage homepage;
	String homepageURL="https://www.saucedemo.com/";
	
	public HomePageTest(TextContextSetup tcs)
	{
		this.tcs=tcs;
		homepage=tcs.PageObjectManager.gethomePage();
	}
	
	
	
	@Given("I am on homepage of SDM")
	public void i_am_on_homepage_of_sdm() {
		Assert.assertEquals(homepageURL, homepage.getHomepageURL());
		
	    
	}
	
	@When("^I enter username (.+) and password (.+)$")
	public void i_enter_username_and_password(String uname, String password) {
		
		homepage.enterSignDetails(uname, password);
	   
	
	}
	    
	@Then("I should be loggedIn sucessfully and landed on listing page")
	public void i_should_be_logged_in_sucessfully() {
		
	   }

}