package com.liono360.opportunities;

import java.io.IOException;

import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.OpportunitiesPage;

public class TC_002ViewOpportunity extends Baseclass{
	
@Test
public void ViewOpportunityTest() throws InterruptedException, IOException {
	
// LOGIN TO CRM===============================================================================================
	
    //redirectToCRM();

	OpportunitiesPage opp=new OpportunitiesPage(driver);
	

	TryClick(opp.clickOpportunity());
	logger.info("Clicked on opportunities");
	

	Thread.sleep(4000);
	mouseActionRightClick(driver, opp.AddedOpportunity());
	logger.info("right clicked on added opportunity");
	
	
	Thread.sleep(1000);
	TryClick(opp.clickViewOpportuity());
	logger.info("clicked on view option");
	
	
	

	/*
	 * opp.waitUntilPageLoad(); if(opp.ViewOpportunityHeader().isDisplayed()) {
	 * 
	 * Assert.assertTrue(true); logger.info("View Opportunity test passed"); } else
	 * { Assert.assertTrue(false); captureScreen(driver, "View Opportunity");
	 * logger.info("View Opportunity test failed"); }
	 */
	
	TryClick(opp.clickCancel());
	logger.info("clicked on cancel");
	
	
	
	
  } 


}
