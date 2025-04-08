package com.liono360.SavedSearchActivity;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.SavedSearchActivity;

public class TC_004DeleteSavedSearchActivity extends Baseclass{

	@Test
	public void DeleteSavedSearchActivityTest () throws InterruptedException, IOException {
		
		//redirectToCRM();

		Actions action = new Actions(driver);
		SavedSearchActivity Activity = new SavedSearchActivity(driver);	
		
		TryClick(Activity.MiscBtn());
		logger.info("Clicked on Misc.");
		
		
		TryClick(Activity.SavedSearch());
		logger.info("Clicked on Saved Search");
		
		
		TryClick(Activity.ClickOnSavedSearch());
		logger.info("Clicked on created Saved Search");	
		
		
		TryClick(Activity.HumbergIcon());
		logger.info("Clicked on Humberg Icon");
		
		
		TryClick(Activity.Delete());
		logger.info("Clicked on Delete");
		
		
		
		
		TryClick(Activity.Yes());
		logger.info("Clicked on Yes");
		
		
	
		/*
		 * Thread.sleep(3000); String deletesavedsearchname =
		 * Activity.ListedSavedSearch().getText(); Thread.sleep(5000); String
		 * listedActivityAfterDelete = Activity.ListedSavedSearch().getText(); if
		 * (deletesavedsearchname.equalsIgnoreCase(listedActivityAfterDelete)) {
		 * Assert.assertTrue(false);
		 * logger.info("Activity Saved Search DELETE test failed");
		 * 
		 * } else { Assert.assertTrue(true);
		 * logger.info("Activity Saved Search DELETE test passed");
		 * 
		 * }
		 */
	}
	
}
