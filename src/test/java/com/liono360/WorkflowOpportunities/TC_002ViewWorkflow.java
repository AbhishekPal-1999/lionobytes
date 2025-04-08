package com.liono360.WorkflowOpportunities;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.WorkflowOpportunityPage;

public class TC_002ViewWorkflow extends Baseclass{

	@Test
	public void ViewWorkflowTest () throws InterruptedException {
		
		//redirectToCRM();

		Actions action = new Actions(driver);
		WorkflowOpportunityPage WfOpp = new WorkflowOpportunityPage(driver);
		
		
		
		TryClick(WfOpp.Misc());
		logger.info("Clicked on Misc.");
		
		
		
		TryClick(WfOpp.Workflow());
		logger.info("Clicked on Workflow");	
		
		
		
		TryClick(WfOpp.ClickOnWorkflow());
		logger.info("Clicked on created  Workflow");	
		
		
		TryClick(WfOpp.HumbergIcon());
		logger.info("Clicked on Humberg Icon");
		
		
		TryClick(WfOpp.ViewBtn1());
		logger.info("Clicked on view Btn");
		
		TryClick(WfOpp.Next());
		logger.info("Clicked on Next");
		
		/*
		 * Thread.sleep(3000); if (WfOpp.ViewWorkflow().isDisplayed()) {
		 * Thread.sleep(4000); AssertJUnit.assertTrue(true);
		 * logger.info("View Activity Saved Search test passed"); } else {
		 * AssertJUnit.assertTrue(false);
		 * logger.info("view Activity Saved Search test failed"); }
		 */
	
		
		TryClick(WfOpp.Cancel());
		logger.info("Clicked on Cancel");
		
		
	}
	
}
