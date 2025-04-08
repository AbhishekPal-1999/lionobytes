package com.liono360.SavedSearchActivity;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.SavedSearchActivity;

public class TC_009ExportActivitySavedSearchwithDifferentFormat extends Baseclass {

	@Test
	public void ExportActivitySavedSearchwithDifferentFormatTest () throws InterruptedException {
		
		
		Actions action = new Actions(driver);
		SavedSearchActivity Activity = new SavedSearchActivity(driver);	
		
		TryClick(Activity.MiscBtn());
		logger.info("Clicked on Misc.");
		
		
		TryClick(Activity.SavedSearch());
		logger.info("Clicked on Saved Search");
		
		
		
	}
	
}
