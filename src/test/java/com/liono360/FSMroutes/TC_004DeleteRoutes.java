package com.liono360.FSMroutes;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.FSMroutesPage;
import com.liono360.pageObject.LoginPage;

public class TC_004DeleteRoutes extends Baseclass {

	@Test
	public void TC_004DeleteRoutesTest() throws InterruptedException, IOException {
		
//LOGIN TO CRM==========================================================	
		
	//	redirectToCRM();	
		
//GO TO ROUTE MODULE=====================================================
		

 
	    	  FSMroutesPage routes=new FSMroutesPage(driver);
		 routes.clickFSM().click();
		  logger.info("Clicked FSM ");
		//Thread.sleep(1000);
		waitUntilPageLoad();
		TryClick(routes.selectRoutes());
		logger.info("Routes is selected");
		routes.waitUntilPageLoad();			

		String RoutesBeforeDelete= routes.AddedRoutes().getText();

		mouseActionRightClick(driver, routes.AddedRoutes());
		logger.info("right clicked on added routes");
		Thread.sleep(500);

		TryClick(routes.clickDeleteRoutes());
		logger.info("clicked delete button");
		//Thread.sleep(5000);
		TryClick(routes.clickYesButton());
		logger.info("clicked yes button");

		routes.waitUntilPageLoad();
		//Thread.sleep(2000);
		String RoutesAfterDelete = routes.AddedRoutes().getText();
		System.out.println("routes name before delete is: "+RoutesBeforeDelete);
		System.out.println("routes name after delete is: "+RoutesAfterDelete);

		if (RoutesBeforeDelete!= RoutesAfterDelete) {
			Assert.assertTrue(true);
			logger.info("delete routes test passed");
		} else {
			Assert.assertTrue(false);
			captureScreen(driver, "delete routes");
			logger.info("delete routes test failed");
		}
		
	}
}
