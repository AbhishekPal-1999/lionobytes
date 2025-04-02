package com.liono360.MiscSavedSearchesAccount;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.LeadWorkFlow.CommonMethods;
import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.LeadWorkFlowPage;
import com.liono360.pageObject.MiscSavedSearches;

public class TC_003EditSavedSearch extends Baseclass{

	@Test
	public void TC003_EditSavedSearch() throws InterruptedException {
		

	//	redirectToCRM();

		MiscSavedSearches ss = new MiscSavedSearches (driver);
		
		TryClick(ss.Miscbtn());
		logger.info("Clicked Misc.");
		
		TryClick(ss.Savedsearch());
		logger.info("Clicked saved search.");
		waitUntilPageLoad();
		Thread.sleep(3000);
		mouseActionRightClick(driver, ss.ListedSavedsearch());
		logger.info("right clicked on added saved search");
		Thread.sleep(2000);
		TryClick(ss.Edit());
		logger.info("clicked on edit option");
		waitUntilPageLoad();
		
		ss.Name().clear();
		ss.Name().sendKeys("SAVED SEARCH SSE-"+randomnumber()+" Account");
		logger.info("Saved search name added added");

		String SavedsearchName = ss.Name().getAttribute("value");
		
		ss.Notes().clear();
		ss.Notes().sendKeys("This saved search is edited via automation");
		logger.info("Notes added");	
		TryClick(ss.Preview());
		Thread.sleep(1000);
		logger.info("clicked on preview button");	
		TryClick(ss.Cancel());
		Thread.sleep(500);
		TryClick(ss.SaveSS());
		logger.info("save savedsearch");
		waitUntilPageLoad();
		Thread.sleep(500);
		ss.SearchSS().clear();
		waitUntilPageLoad();
		Thread.sleep(500);
		ss.SearchSS().sendKeys(SavedsearchName);
		logger.info("search savedsearh");
		waitUntilPageLoad();
		String ListedSavedsearch  = ss.ListedSavedsearch().getText();
	    System.out.println("saved search name to create: "+SavedsearchName);
		System.out.println("saved search name after create: "+ListedSavedsearch);
		
// ASSERTION--------------------------------------------------------------------------------------------------------
	    
		   if (SavedsearchName.equals(ListedSavedsearch)) {
		    	Assert.assertTrue(true);
		    	logger.info("Edit savedsearch test passed");
		    } 
		    else {
		    	Assert.assertTrue(false);
		    
		    	logger.info("Edit savedsearch  test failed");
		    }
	}
	
}
