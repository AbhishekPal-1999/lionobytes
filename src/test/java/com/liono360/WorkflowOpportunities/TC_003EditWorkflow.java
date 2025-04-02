package com.liono360.WorkflowOpportunities;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.WorkflowOpportunityPage;

public class TC_003EditWorkflow extends Baseclass {
	
	@Test
	public void EditWorkflowTest () throws InterruptedException {
		
	
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
		
		
		
		TryClick(WfOpp.Edit());
		logger.info("Clicked on Edit");
		
		
		Thread.sleep(1000);
		WfOpp.Name().clear();
		Thread.sleep(1000);
		WfOpp.Name().sendKeys("WF-Edited"+randomnumber());
		logger.info("Sendkeys on Name Filed");
		
		String WorkflowNameNameBeforeCreate= WfOpp.Name().getAttribute("value");
		
		
		
		
		TryClick(WfOpp.Next());
		logger.info("Clicked on Next");
		
		//...........Edit Workflow................//
		
		TryClick(WfOpp.AddActions());
		logger.info("Clicked on Add Actions");
		
		TryClick(WfOpp.UpdateFiled());
		logger.info("Clicked on Update Filed");
		
		
		SelectDropdown(WfOpp.FiledToUpdate(),3);
		logger.info("Select Dropdown value For Filed To Update");
		
		//explWaitToClick(WfOpp.NewFiledValue());
		//WfOpp.NewFiledValue().sendKeys("907562"+randomnumber());
		//logger.info("Sendkeys on Contact Email Filed");
		
		
		
		
		TryClick(WfOpp.Save22());
		logger.info("Clicked on Save");
		
		//....................................................//
		
		
		TryClick(WfOpp.Save());
		logger.info("Clicked on Save");
		
		
		/*
		 * Thread.sleep(4000); String SavedSearchNameAfterCreate
		 * =WfOpp.Editedworkflow().getText();
		 * System.out.println("Workflow name to create: "+WorkflowNameNameBeforeCreate);
		 * System.out.println("Workflow name after create: "+SavedSearchNameAfterCreate)
		 * ;
		 * 
		 * if (WorkflowNameNameBeforeCreate.equals(SavedSearchNameAfterCreate)) {
		 * Assert.assertTrue(true); logger.info("Edit Workflow test passed"); } else {
		 * Assert.assertTrue(false); logger.info("Edit Workflow test failed"); }
		 */
		
	}

}
