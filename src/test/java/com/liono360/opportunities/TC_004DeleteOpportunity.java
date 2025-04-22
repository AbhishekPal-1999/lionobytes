package com.liono360.opportunities;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.LoginPage;
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
		
		
		waitUntilPageLoad();
		Thread.sleep(2000);
		String OpportunityNameBeforeDelete =opp.ListedOpportunity().getText();
		mouseActionRightClick(driver, opp.AddedOpportunity());
		logger.info("rigt clicked on added opportunity");
		
		
		
		TryClick(opp.clickDeleteOpportunity());
		logger.info("clicked delete button");
		
		
		
		TryClick(opp.clickYesButton());
		logger.info("clicked yes button");
		
		waitUntilPageLoad();
		TryClick(opp.Refreshbutton());
		waitUntilPageLoad();
		Thread.sleep(10000);
		String OpportunityNameAfterDelete =opp.ListedOpportunity().getText();
		System.out.println("Opportunity name before Delete: "+OpportunityNameBeforeDelete);
		System.out.println("Opportunity name after Delete: "+OpportunityNameAfterDelete);

		if (OpportunityNameBeforeDelete.equals(OpportunityNameBeforeDelete)) {
			Assert.assertTrue(true);
			logger.info("Opportunity is Deleted Successfully");
		} 
		else {
			Assert.assertTrue(false);
			captureScreen(driver, "add Opportunity");
			logger.info("Opportunity is not Deleted");
		}
		
		
		
	}

}
