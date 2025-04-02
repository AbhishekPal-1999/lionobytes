package com.liono360.MiscSavedSearchesLead;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.LeadWorkFlow.CommonMethods;
import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.LeadWorkFlowPage;
import com.liono360.pageObject.MiscSavedSearches;

public class TC_004DeleteSavedSearch extends Baseclass{

	@Test
	public void TC004_DeleteSavedSearch() throws InterruptedException {
	
		//redirectToCRM();

		MiscSavedSearches ss = new MiscSavedSearches (driver);
		
		TryClick(ss.Miscbtn());
		logger.info("Clicked Misc.");
		
		TryClick(ss.Savedsearch());
		logger.info("Clicked saved search.");
		waitUntilPageLoad();
		Thread.sleep(1000);
		String ListedSavedsearchBeforeDelete  = ss.ListedSavedsearch().getText();
		mouseActionRightClick(driver, ss.ListedSavedsearch());
		logger.info("right clicked on added workflow");
		Thread.sleep(2000);
		TryClick(ss.clickDelete());
		logger.info("clicked on delete option");
		Thread.sleep(1000);
		ss.clickYes().click();
		logger.info("clicked on delete option");
		waitUntilPageLoad();   
	    Thread.sleep(1000);
		ss.SearchSS().clear();
		Thread.sleep(2000);
		ss.SearchSS().sendKeys(" ");
		Thread.sleep(1000);
		ss.SearchSS().clear();
		waitUntilPageLoad();
	    String ListedSavedsearchAfterDelete  = ss.ListedSavedsearch().getText();
	    System.out.println("Listed Saved search before delete : "+ListedSavedsearchBeforeDelete);
		System.out.println("Listed Saved search after delete  : "+ListedSavedsearchAfterDelete);
		
		if(ListedSavedsearchBeforeDelete.equals(ListedSavedsearchAfterDelete))
		{ 
			Assert.assertTrue(false);
			
			logger.info("delete Savedsearch Case test failed");
			
		}
		else
		{
			Assert.assertTrue(true);
			logger.info("delete Savedsearch Case test passed");
			
			
		}
	}
}
