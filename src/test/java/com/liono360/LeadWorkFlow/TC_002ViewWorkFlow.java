package com.liono360.LeadWorkFlow;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.LeadWorkFlowPage;

public class TC_002ViewWorkFlow extends Baseclass {

	@Test
	public void TC002ViewWorkFlow() throws InterruptedException, IOException {
		
		//redirectToCRM();

		LeadWorkFlowPage workflow= new LeadWorkFlowPage(driver);
		CommonMethods commonMethods= new CommonMethods();
		TryClick( workflow.clickMisc());
		logger.info("Clicked Misc.");


		TryClick( workflow.clickWorkFlow());
		logger.info("Clicked workflow");
		waitUntilPageLoad();
		mouseActionRightClick(driver, workflow.ListedLeads());
		logger.info("right clicked on added workflow");
		Thread.sleep(2000);
		TryClick( workflow.clickview());
		logger.info("clicked on view option");
		waitUntilPageLoad();
		
		if(workflow.HeaderInview().isDisplayed())
		{ 

			Assert.assertTrue(true);
			logger.info("View workflow Case test passed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("View workflow Case test failed");
		}
		TryClick( workflow.clickCancel());
		logger.info("clicked on cancel");
		
	}
	
	
}
