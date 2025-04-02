package com.liono360.WorkflowOpportunities;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.WorkflowOpportunityPage;

public class TC_004DeleteWorkflow extends Baseclass {

	
	@Test
	public void DeleteWorkflowTest () throws InterruptedException {
		
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
		
		
		
		TryClick(WfOpp.Delete());
		logger.info("Clicked on Delete");
		
		
		/*
		 * Thread.sleep(3000); String deletesavedWorkflowname =
		 * WfOpp.Editedworkflow().getText(); Thread.sleep(5000); String
		 * listedActivityAfterDelete = WfOpp.Editedworkflow().getText(); if
		 * (deletesavedWorkflowname.equalsIgnoreCase(listedActivityAfterDelete)) {
		 * Assert.assertTrue(false);
		 * logger.info("Activity Saved Search DELETE test failed");
		 * 
		 * } else { Assert.assertTrue(true);
		 * logger.info("Activity Saved Search DELETE test passed");
		 * 
		 * }
		 */
		
		
		
	}
	
}
