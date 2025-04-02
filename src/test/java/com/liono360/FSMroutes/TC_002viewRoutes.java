package com.liono360.FSMroutes;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.FSMroutesPage;
import com.liono360.pageObject.LoginPage;

public class TC_002viewRoutes extends Baseclass {

	@Test
	public void TC_002ViewRoutes() throws IOException, InterruptedException {
		
//LOGIN TO CRM=====================================================================================
		
		
		//redirectToCRM();
		
		
//GO TO ROUTE MODULE=====================================================
		
		
		   FSMroutesPage routes=new FSMroutesPage(driver);
	     	TryClick(routes.clickFSM());
	    	logger.info("Clicked FSM ");
		//Thread.sleep(1000);
		waitUntilPageLoad();
		TryClick(routes.selectRoutes());
		logger.info("Routes is selected");
		routes.waitUntilPageLoad();

		mouseActionRightClick(driver, routes.AddedRoutes());
		logger.info("rigt clicked on added routes");
		Thread.sleep(2000);
		TryClick(routes.clickViewRoutes());
		logger.info("clicked on view option");
		Thread.sleep(4000);
		routes.waitUntilPageLoad();
		
		if(routes.ViewRoutesHeader().isDisplayed())
		{ 

			Assert.assertTrue(true);
			logger.info("View routes test passed");
		}
		else
		{
			Assert.assertTrue(false);
			captureScreen(driver, "View routes");
			logger.info("view routes test failed");
		}

		routes.clickCancel().click();
		logger.info("clicked on cancel");
		}
}
