package com.liono360.opportunities;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.OpportunitiesPage;

public class TC_010InactiveOpportunity extends Baseclass{
	
	@Test
	public void InactiveTest() throws InterruptedException, IOException {
		
// LOGIN TO CRM===============================================================================================
		
	   // redirectToCRM();

		OpportunitiesPage opp=new OpportunitiesPage(driver);
		

		TryClick(opp.clickOpportunity());
		logger.info("Clicked on opportunities");



		String OpportunityBeforeInactive=opp.AddedOpportunity().getText();

		Thread.sleep(2000);
		mouseActionRightClick(driver, opp.AddedOpportunity());
		logger.info("rigt clicked on added opportunity");
	

		
		TryClick(opp.clickInactive());
		logger.info("Inactive button clicked");
	
		
		Thread.sleep(2000);
		opp.setComment().sendKeys("this is comment "+randomnumber());
		logger.info("comment added");
		


		TryClick(opp.clickSave());
		logger.info("save button clicked");
	

		
		TryClick(opp.clickActiveInactive());
		logger.info("active/inactive toggle button clicked");
	

		String OpportunityAfterInactive=opp.AddedOpportunity().getText();

		System.out.println("Opportunity name in active state: "+OpportunityBeforeInactive);
		System.out.println("Opportunity name in Inactive state: "+OpportunityAfterInactive);

		Thread.sleep(2000);
		if (OpportunityBeforeInactive.equals(OpportunityAfterInactive)) {
			Assert.assertTrue(true);
			logger.info("Active Inactive test passed");
		} 
		else {
			Assert.assertTrue(false);
			captureScreen(driver, "add Opportunity");
			logger.info("Active Inactive test failed");
		}
	}
			
	}


