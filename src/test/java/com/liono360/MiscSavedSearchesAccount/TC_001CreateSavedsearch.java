package com.liono360.MiscSavedSearchesAccount;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.MiscSavedSearches;

public class TC_001CreateSavedsearch extends Baseclass{

	@Test
	public void TC001_CreateAccountSavedsearch() throws InterruptedException {
	
		

		MiscSavedSearches ss = new MiscSavedSearches (driver);
		
		TryClick(ss.Miscbtn());
		logger.info("Clicked Misc.");
		
		TryClick(ss.Savedsearch());
		logger.info("Clicked saved search.");
		
		TryClick( ss.Newbtn());
		logger.info("Clicked new button");
	    waitUntilPageLoad();

		ss.Name().sendKeys("SAVED SEARCH SS-"+randomnumber()+" Account");
		logger.info("Saved search name added added");

		String SavedsearchName = ss.Name().getAttribute("value");

		ss.selectUsers().click();
		//driver.findElement(By.xpath("//span[text()='Satyendra Bhardwaj']")).click();
		logger.info("user selected");

		TrySelectDropdown( ss.SelectModule(),"Account");
		logger.info("module selected");
	    waitUntilPageLoad();

		TrySelectDropdown( ss.SelectChannel(),"Default Channel");
		logger.info("user selected");
		waitUntilPageLoad();

		
		TryClick( ss.PlusC());
		logger.info("plus button clicked");
		//Thread.sleep(4000);
		
		TryLionoTreeSelect(ss.RuleFilter(), ss.Search(), "Country");
		logger.info("Country field selected");
		
		SelectDropdown(ss.operator(),1);
		logger.info("Operator is selected");
		
		TrySelectDropdown(ss.SelectOperatorValue(),"USA");
		logger.info("Rule value is added");
		
		TryClick(ss.saverule());
		logger.info("Clicked save button");	
		
		ss.Notes().sendKeys("This saved search is created via automation");
		logger.info("Notes added");	
		TryClick(ss.Preview());
		Thread.sleep(1000);
		logger.info("clicked on preview button");	
		TryClick(ss.Cancel());
		Thread.sleep(500);
		TryClick(ss.SaveSS());
		logger.info("save savedsearch");
		waitUntilPageLoad();
		ss.SearchSS().sendKeys(SavedsearchName);
		logger.info("search savedsearh");
		waitUntilPageLoad();
		String ListedSavedsearch  = ss.ListedSavedsearch().getText();
	    System.out.println("saved search name to create: "+SavedsearchName);
		System.out.println("saved search name after create: "+ListedSavedsearch);
		
// ASSERTION--------------------------------------------------------------------------------------------------------
	    
		   if (SavedsearchName.equals(ListedSavedsearch)) {
		    	Assert.assertTrue(true);
		    	logger.info("Create savedsearch test passed");
		    } 
		    else {
		    	Assert.assertTrue(false);
		    
		    	logger.info("Create savedsearch  test failed");
		    }
	}
	

}
