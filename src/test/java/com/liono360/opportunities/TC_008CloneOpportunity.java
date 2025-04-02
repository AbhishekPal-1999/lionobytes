package com.liono360.opportunities;

import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.LoginPage;
import com.liono360.pageObject.OpportunitiesPage;

public class TC_008CloneOpportunity extends Baseclass{
	
	@Test
	public void CloneOpportunityTest() throws InterruptedException {
		
// LOGIN TO CRM===============================================================================================
		
	   // redirectToCRM();
	    
		OpportunitiesPage opp=new OpportunitiesPage(driver);


		
		TryClick(opp.clickOpportunity());
		logger.info("Clicked on opportunities");



		
		
		
		Thread.sleep(3000);
		mouseActionRightClick(driver, opp.AddedOpportunity());
		logger.info("rigt clicked on added opportunity");



	
		
		TryClick(opp.ClickClone());
		logger.info("clone button clicked");



		
		TryClick(opp.clickSave());
		logger.info("save button clicked");

		
	}

}
