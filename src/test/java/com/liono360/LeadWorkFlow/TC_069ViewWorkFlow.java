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

public class TC_069ViewWorkFlow extends Baseclass {

	@Test
	public void TC_069ViewWorkFlowTest() throws InterruptedException, IOException {
		
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
		Thread.sleep(15000);
		
		
		mouseActionRightClick(driver, workflow.ListedLeads());
		logger.info("right clicked on added workflow");
		Thread.sleep(2000);
		workflow.clickview().click();
		logger.info("clicked on view option");
		Thread.sleep(10000);
		
		if(workflow.HeaderInview().isDisplayed())
		{ 
			Thread.sleep(4000);
			Assert.assertTrue(true);
			logger.info("View workflow Case test passed");
		}
		else
		{
			Assert.assertTrue(false);
			captureScreen(driver, "View Case");
			logger.info("View workflow Case test failed");
		}
		workflow.clickCancel().click();
		logger.info("clicked on cancel");
		Thread.sleep(4000);
	}
	
	
}
