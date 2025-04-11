package com.liono360.SavedSearchOpportunity;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.OpportunitySavedSearchPage;

public class TC_003EditSavedSearchOpportunity extends Baseclass{

	@Test
	public void TC_003EditSavedSearchOpportunityTest () throws IOException, InterruptedException {
		
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
		
		
		TryClick(OppSavedSearch.Edit());
		logger.info("Clicked on Edit");
		
		Thread.sleep(1000);
		OppSavedSearch.Name1().clear();
		Thread.sleep(1000);
		explWaitToClick(OppSavedSearch.Name1());
		OppSavedSearch.Name1().sendKeys("Edited-Saved Search"+randomnumber());
		logger.info("Sendkeys On Name");
		
		
		String SavedSearchNameNameBeforeCreate= OppSavedSearch.Name1().getAttribute("value");
		
		
		
		TryClick(OppSavedSearch.ClickEditQuery());
		logger.info("Clicked on Edit Query btn");
		
		
		SelectDropdown(OppSavedSearch.Operator11(),7);
		logger.info("Select Dropdown value For Opeartor");
		
		
		
		TryClick(OppSavedSearch.Save22());
		logger.info("Click On Save");
		
		
		
		TryClick(OppSavedSearch.Preview());
		logger.info("Click On Preview");
		
		
		TryClick(OppSavedSearch.Cancel());
		logger.info("Click On Cancel");
		
		
		
		TryClick(OppSavedSearch.Save11());
		logger.info("Click On Save");
		

		Thread.sleep(3000);
		String SavedSearchNameAfterCreate = OppSavedSearch.EditSavedSearch().getText();
		System.out.println("Saved Search name before to create: " + SavedSearchNameNameBeforeCreate);
		System.out.println("Saved Search name after create: " + SavedSearchNameAfterCreate);

		if (SavedSearchNameNameBeforeCreate.equals(SavedSearchNameAfterCreate)) {
			Assert.assertTrue(true);
			logger.info("Edit Opportunity Saved Search test passed");
		} else {
			Assert.assertTrue(false);
			captureScreen(driver, "Edit Saved Search");
			logger.info("Edit Opportunity Saved Search test failed");
		}

	}

}
	

