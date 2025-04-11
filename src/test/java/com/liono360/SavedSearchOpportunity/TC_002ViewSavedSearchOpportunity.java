package com.liono360.SavedSearchOpportunity;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.OpportunitySavedSearchPage;

public class TC_002ViewSavedSearchOpportunity extends Baseclass {

	@Test
	public void TC_002ViewSavedSearchOpportunityTest () throws IOException, InterruptedException {
		//redirectToCRM();
		
		Actions action = new Actions(driver);
		OpportunitySavedSearchPage OppSavedSearch = new OpportunitySavedSearchPage(driver);		
		
		TryClick(OppSavedSearch.MiscBtn());
		logger.info("Clicked on Misc.");
		
		
		TryClick(OppSavedSearch.SavedSearch());
		logger.info("Clicked on Saved Search");	
		
		
		TryClick(OppSavedSearch.ClickOnSavedSearch());
		logger.info("Clicked on created Saved Search");	
		
		
		TryClick(OppSavedSearch.HumbergIcon());
		logger.info("Clicked on Humberg Icon");
		
		
		
		TryClick(OppSavedSearch.View());
		logger.info("Clicked on view");
		
		
		
		Thread.sleep(3000);
		if (OppSavedSearch.VerifyViewSavedSearch().isDisplayed()) {
			Thread.sleep(4000);
			AssertJUnit.assertTrue(true);
			logger.info("View Opportunity Saved Search test passed");
		} else {
			AssertJUnit.assertTrue(false);
			captureScreen(driver, "viewLead");
			logger.info("view Opportunity Saved Search test failed");
		}
		
		
		
		TryClick(OppSavedSearch.CancelButton());
		logger.info("Clicked on Cancel");
		
	}
	
}

		
		
		
		
		
