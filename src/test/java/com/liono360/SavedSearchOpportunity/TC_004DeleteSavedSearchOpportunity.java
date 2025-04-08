package com.liono360.SavedSearchOpportunity;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.OpportunitySavedSearchPage;

public class TC_004DeleteSavedSearchOpportunity extends Baseclass {

	@Test
	public void TC_004DeleteSavedSearchOpportunityTest () throws InterruptedException, IOException {
		
		// redirectToCRM();

		Actions action = new Actions(driver);
		OpportunitySavedSearchPage OppSavedSearch = new OpportunitySavedSearchPage(driver);
		
		
		
		TryClick(OppSavedSearch.MiscBtn());
		logger.info("Clicked on Misc.");
		
		
		TryClick(OppSavedSearch.SavedSearch());
		logger.info("Clicked on Saved Search");
		
		
		//TryClick(OppSavedSearch.ClickOnSavedSearch());
		//logger.info("Clicked on created Saved Search");	
		
		
		 Actions actions = new Actions(driver);
	     actions.doubleClick(OppSavedSearch.ClickOnSavedSearch()).perform();
		
		TryClick(OppSavedSearch.HumbergIcon());
		logger.info("Clicked on Humberg Icon");
		
		
		TryClick(OppSavedSearch.Delete());
		logger.info("Clicked on Delete");
		
		
		
		
		TryClick(OppSavedSearch.Yes());
		logger.info("Clicked on Yes");
		
		/*
		 * String deletesavedsearchname = "Name of the saved search to delete";
		 * Thread.sleep(3000); List<String> savedSearchNamesBeforeDelete =
		 * (List<String>) OppSavedSearch.ListedSavedSearch(); Thread.sleep(3000);
		 * List<String> savedSearchNamesAfterDelete = (List<String>)
		 * OppSavedSearch.ListedSavedSearch(); Thread.sleep(3000);
		 * 
		 * if (!savedSearchNamesAfterDelete.contains(deletesavedsearchname)) {
		 * Assert.assertTrue(true);
		 * logger.info("Opportunity Saved Search DELETE test passed"); } else {
		 * Assert.assertTrue(false);
		 * logger.info("Opportunity Saved Search DELETE test failed"); }
		 */
	}
}
		
		
		
		
		
		
	