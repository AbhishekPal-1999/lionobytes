package com.liono360.location;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.LocationPage;
import com.liono360.utility.ExcelDataProvider;
import com.liono360.utility.RetryAnalyzer;

public class TC_005ViewLocationTest extends Baseclass {

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void InventoryTeansferTest() throws InterruptedException, IOException {

		// redirectToCRM();

		Actions action = new Actions(driver);

		ExcelDataProvider exceldata = new ExcelDataProvider();
		LocationPage location = new LocationPage(driver);
		
		explWaitToClick(location.clickInventory());

		location.clickInventory().click();
		logger.info("Clicked on Inventory");

		location.clickLocation().click();
		logger.info("Clicked on Location");

		Actions actions = new Actions(driver);
		
		Thread.sleep(12000);
		explWaitToClick(location.ListedLocation());
		
		actions.contextClick(location.ListedLocation()).build().perform();
		mouseActionRightClick(driver, location.ListedLocation());
		
		explWaitToClick(location.clickView());

		logger.info("Right click over added location");
		
		location.clickView().click();
		logger.info("Clicked over view button");
		
		String setLocationId = location.setlocationId().getDomProperty("value");


		location.clickCancel().click();
		logger.info("Clicked  on cancel button");
		
		waitUntilPageLoad();
		Thread.sleep(7000);
		
		String LocationNameAfterCreate=location.ListedLocation().getText();
		
		System.out.println("provided Location name to create: "+setLocationId);
		System.out.println("Listed Location name after create: "+LocationNameAfterCreate);

		if (setLocationId.equalsIgnoreCase(LocationNameAfterCreate)) {
			Assert.assertTrue(true);
			logger.info("View Location test passed");
		} 

		else {
			Assert.assertTrue(false);
			logger.info("View Location test failed");
		}
		

	}
}
