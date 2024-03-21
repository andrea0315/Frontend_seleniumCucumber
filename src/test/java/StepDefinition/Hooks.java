package StepDefinition;

import java.io.IOException;

import Utils.TextContextSetup;
import io.cucumber.java.After;

public class Hooks {
	
TextContextSetup tcs;
	
	public  Hooks(TextContextSetup tcs)
	{
		this.tcs=tcs;
	}
	
	@After
	public void tearDown() throws IOException
	{
		tcs.base.initilazeDriver().quit();
	}

}
