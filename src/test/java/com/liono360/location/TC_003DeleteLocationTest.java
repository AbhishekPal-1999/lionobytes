package com.liono360.location;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.LocationPage;
import com.liono360.utility.RetryAnalyzer;

public class TC_003DeleteLocationTest extends Baseclass {

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void deleteLocationTest() throws InterruptedException, IOException {
		// redirectToCRM();

		LocationPage location = new LocationPage(driver);
		
		explWaitToClick(location.clickInventory());

		location.clickInventory().click();
		logger.info("Clicked on Inventory");

		location.clickLocation().click();
		logger.info("Clicked on Location");
		
		waitUntilPageLoad();

		String listedlocation = location.ListedLocation().getText();

		Thread.sleep(12000);
		explWaitToClick(location.ListedLocation());
		
		Actions actions = new Actions(driver);
		actions.contextClick(location.ListedLocation()).build().perform();
		mouseActionRightClick(driver, location.ListedLocation());

		logger.info("Right click over added location");
		location.clickDelete().click();
		logger.info("Clicked on delete button");

		TryClick(location.clickYes());
		logger.info("Clicked on confirm delete location");
		
		waitUntilPageLoad();
		Thread.sleep(8000);
		
		String locationNameAfterDelete = location.ListedLocation().getText();
		System.out.println("Listed location name before delete: " + listedlocation);
		System.out.println("Listed location name after delete: " + locationNameAfterDelete);
		if (listedlocation.equalsIgnoreCase(locationNameAfterDelete)) {
			Assert.assertTrue(false);
			logger.info("delete location test Passed");
		}

		else {
			
			Assert.assertTrue(true);
			captureScreen(driver, "addLocation");
			logger.info("delete location test Failed");
		}

	}

}
