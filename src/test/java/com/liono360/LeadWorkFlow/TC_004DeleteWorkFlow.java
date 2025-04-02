package com.liono360.LeadWorkFlow;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.CasesPage;
import com.liono360.pageObject.LeadPage;
import com.liono360.pageObject.LeadWorkFlowPage;
import com.liono360.pageObject.LoginPage;

public class TC_004DeleteWorkFlow extends Baseclass {

	@Test
	public void TC004DeleteWorkFlow() throws InterruptedException, IOException {

		LeadWorkFlowPage workflow= new LeadWorkFlowPage(driver);
		CommonMethods commonMethods= new CommonMethods();
		TryClick( workflow.clickMisc());
		logger.info("Clicked Misc.");


		TryClick( workflow.clickWorkFlow());
		logger.info("Clicked workflow");
		workflow.setGlobalSearch().clear();
		waitUntilPageLoad();
		workflow.setGlobalSearch().sendKeys("a");
		Thread.sleep(2000);
		waitUntilPageLoad();
		workflow.setGlobalSearch().clear();
	
		waitUntilPageLoad();
		
		String WorkflowNameToDelete= workflow.ListedLeads().getText();
		
		mouseActionRightClick(driver, workflow.ListedLeads());
		logger.info("right clicked on added workflow");
		Thread.sleep(2000);
		TryClick( workflow.clickDelete());
		logger.info("clicked on delete option");
		
		TryClick( workflow.clickYes());
		logger.info("clicked on delete option");
	
	    waitUntilPageLoad();
		String WorkflowAfterDelete  = workflow.ListedWorkflow().getText();
	    System.out.println("workflow name to delete: "+WorkflowNameToDelete);
	    System.out.println("workflow name after delete: "+WorkflowAfterDelete);
		if(WorkflowNameToDelete.equals(WorkflowAfterDelete))
		{ 
			Assert.assertTrue(false);
			captureScreen(driver, "delete test Case");
			logger.info("delete workflow Case test failed");
			
		}
		else
		{
		
			Assert.assertTrue(true);
			logger.info("delete workflow  test passed");
			
			
		}
		
	}
	
	
}
