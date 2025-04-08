package com.liono360.SavedSearchActivity;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.SavedSearchActivity;

public class TC_003EditSavedSearchActivity extends Baseclass {

	
	@Test
	public void EditSavedSearchActivityTest () throws InterruptedException, IOException {
		
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
		
		
		TryClick(Activity.Edit());
		logger.info("Clicked on Edit");
		
		Thread.sleep(1000);
		Activity.Name1().clear();
		Thread.sleep(1000);
		explWaitToClick(Activity.Name1());
		Activity.Name1().sendKeys("Edited-Saved Search"+randomnumber());
		logger.info("Sendkeys On Name");
		
		
		//String SavedSearchNameNameBeforeCreate= Activity.Name1().getAttribute("value");
		
		
		
		TryClick(Activity.ClickEditQuery());
		logger.info("Clicked on Edit Query btn");
		
		
		SelectDropdown(Activity.Operator11(),4);
		logger.info("Select Dropdown value For Opeartor");
		
		
		
		TryClick(Activity.Save22());
		logger.info("Click On Save");
		
		
		
		TryClick(Activity.Preview());
		logger.info("Click On Preview");
		
		
		TryClick(Activity.Cancel());
		logger.info("Click On Cancel");
		
		
		
		TryClick(Activity.Save11());
		logger.info("Click On Save");
		

		/*
		 * Thread.sleep(3000); String SavedSearchNameAfterCreate =
		 * Activity.EditSavedSearch().getText();
		 * System.out.println("Saved Search name before to create: " +
		 * SavedSearchNameNameBeforeCreate);
		 * System.out.println("Saved Search name after create: " +
		 * SavedSearchNameAfterCreate);
		 * 
		 * if (SavedSearchNameNameBeforeCreate.equals(SavedSearchNameAfterCreate)) {
		 * Assert.assertTrue(true);
		 * logger.info("Edit Activity Saved Search test passed"); } else {
		 * Assert.assertTrue(false); captureScreen(driver, "Edit Saved Search");
		 * logger.info("Edit Activity Saved Search test failed"); }
		 */

	}

}
	

