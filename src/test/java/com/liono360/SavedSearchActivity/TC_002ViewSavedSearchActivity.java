package com.liono360.SavedSearchActivity;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.SavedSearchActivity;

public class TC_002ViewSavedSearchActivity extends Baseclass{

	@Test
	public void ViewSavedSearchActivityTest () throws InterruptedException, IOException {
		
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
		
		
		
		TryClick(Activity.View());
		logger.info("Clicked on view");
		
		
		
		Thread.sleep(3000);
		if (Activity.VerifyViewSavedSearch().isDisplayed()) {
			Thread.sleep(4000);
			AssertJUnit.assertTrue(true);
			logger.info("View Activity Saved Search test passed");
		} else {
			AssertJUnit.assertTrue(false);
			captureScreen(driver, "viewLead");
			logger.info("view Activity Saved Search test failed");
		}
		
		TryClick(Activity.CancelButton());
		logger.info("Clicked on Cancel");
	}
	
}
