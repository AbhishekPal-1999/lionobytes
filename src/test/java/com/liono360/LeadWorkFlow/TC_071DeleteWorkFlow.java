package com.liono360.LeadWorkFlow;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.LeadWorkFlowPage;
import com.liono360.pageObject.LoginPage;

public class TC_071DeleteWorkFlow extends Baseclass {

	@Test
	public void TC_071DeleteWorkFlowTest() throws InterruptedException, IOException {
		
		driver.get(baseURL);
		logger.info("URL is opened");
		LoginPage lp = new LoginPage(driver);

		lp.setUserName(username);
		logger.info("Username added");
		lp.setPassword(password);
		logger.info("password added");
		Thread.sleep(2000);
		lp.clickSubmit();
		logger.info("Clicked on submit button");
		Thread.sleep(20000);
		
		
		LeadWorkFlowPage workflow= new LeadWorkFlowPage(driver);

		workflow.clickMisc().click();
		logger.info("Clicked Misc.");
		Thread.sleep(2000);

		workflow.clickWorkFlow().click();
		logger.info("Clicked workflow");
		Thread.sleep(10000);
		
		String WorkflowNameToDelete= workflow.ListedLeads().getText();
		Thread.sleep(1000);

		mouseActionRightClick(driver, workflow.ListedLeads());
		logger.info("right clicked on added workflow");
		Thread.sleep(2000);
		workflow.clickDelete().click();
		logger.info("clicked on delete option");
		Thread.sleep(4000);
		
		workflow.clickYes().click();
		logger.info("clicked on delete option");
		Thread.sleep(10000);
		
//		workflow.setGlobalSearch().sendKeys(WorkflowNameToDelete);
//	    logger.info("workflow passed to search");
//	    Thread.sleep(15000);
	   
	    Thread.sleep(5000);
		String WorkflowAfterDelete  = workflow.ListedWorkflow().getText();
		
		if(WorkflowNameToDelete.equals(WorkflowAfterDelete))
		{ 
			Assert.assertTrue(false);
			captureScreen(driver, "View Case");
			logger.info("delete workflow Case test failed");
			
		}
		else
		{
			Thread.sleep(4000);
			Assert.assertTrue(true);
			logger.info("delete workflow Case test passed");
			
			
		}
		
	}
	
	
}
