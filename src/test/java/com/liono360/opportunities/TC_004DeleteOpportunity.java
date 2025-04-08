package com.liono360.opportunities;

import java.io.IOException;

import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.OpportunitiesPage;

public class TC_004DeleteOpportunity extends Baseclass{
	
	@Test
	public void DeleteOpportunityTest() throws InterruptedException, IOException {
		
// LOGIN TO CRM===============================================================================================
		
	    //redirectToCRM();

		OpportunitiesPage opp=new OpportunitiesPage(driver);
		
		
	
		TryClick(opp.clickOpportunity());
		logger.info("Clicked on opportunities");
		
		
		
		String OpportunitybeforeDelete= opp.AddedOpportunity().getText();
		
		
	
		Thread.sleep(4000);
		mouseActionRightClick(driver, opp.AddedOpportunity());
		logger.info("rigt clicked on added opportunity");
		
		
		
		TryClick(opp.clickDeleteOpportunity());
		logger.info("clicked delete button");
		
		
		
		TryClick(opp.clickYesButton());
		logger.info("clicked yes button");
		
		
		
		/*
		 * opp.waitUntilPageLoad(); String OpportunityafterDelete =
		 * opp.AddedOpportunity().getText();
		 * System.out.println("opportunity name before delete is: "
		 * +OpportunitybeforeDelete);
		 * System.out.println("opportunity name after delete is: "
		 * +OpportunityafterDelete);
		 * 
		 * if (OpportunitybeforeDelete!= OpportunityafterDelete) {
		 * Assert.assertTrue(true); logger.info("delete opportunity test passed"); }
		 * else { Assert.assertTrue(false); captureScreen(driver, "delete opportunity");
		 * logger.info("delete opportunity test failed"); }
		 */
	}

}
