package com.liono360.MiscSavedSearchesAccount;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.LeadWorkFlow.CommonMethods;
import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.LeadWorkFlowPage;
import com.liono360.pageObject.MiscSavedSearches;

public class TC_002ViewSavedSearch extends Baseclass{

	@Test
	public void TC002_ViewSavedSearch() throws InterruptedException {
		

		//redirectToCRM();

		MiscSavedSearches ss = new MiscSavedSearches (driver);
		
		TryClick(ss.Miscbtn());
		logger.info("Clicked Misc.");
		
		TryClick(ss.Savedsearch());
		logger.info("Clicked saved search.");
		waitUntilPageLoad();
		Thread.sleep(3000);
		mouseActionRightClick(driver, ss.ListedSavedsearch());
		logger.info("right clicked on added workflow");
		Thread.sleep(2000);
		TryClick(ss.clickview());
		logger.info("clicked on view option");
		waitUntilPageLoad();
		
		if(ss.ViewHeader().isDisplayed())
		{ 
			
			Assert.assertTrue(true);
			logger.info("View saved search Case test passed");
		}
		else
		{
			Assert.assertTrue(false);
			
			logger.info("View saved search Case test failed");
		}
		TryClick(ss.Cancel1());
		logger.info("clicked on cancel");
		
	}
	
}
