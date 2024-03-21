package StepDefinition;

import Pages.ListingPage;
import Utils.TextContextSetup;

public class ListingPageTest {
	TextContextSetup tcs;
	ListingPage listingpage;
	
	
	public ListingPageTest(TextContextSetup tcs)
	{
		this.tcs=tcs;
		listingpage=tcs.PageObjectManager.getlistingPage();
	}

}
