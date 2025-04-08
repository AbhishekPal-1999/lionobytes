package com.liono360.SavedSearchActivity;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.SavedSearchActivity;

public class TC_008AddReportActivitySavedSearch extends Baseclass {

	@Test
	public void AddReportActivitySavedSearchTest () throws InterruptedException {
		
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
			
		
		
		
		
	}
	
}
