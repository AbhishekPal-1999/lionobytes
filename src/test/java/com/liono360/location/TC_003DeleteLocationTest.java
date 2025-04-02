package com.liono360.location;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.LocationPage;
import com.liono360.pageObject.LoginPage;

public class TC_003DeleteLocationTest extends Baseclass {

	@Test
	public void deleteLocationTest() throws InterruptedException, IOException {
		//redirectToCRM();

		LocationPage location = new LocationPage(driver);
		
		location.clickInventory().click();
		logger.info("Clicked on Inventory");
		
		location.clickLocation().click();
		logger.info("Clicked on Location");
		waitUntilPageLoad();
		
		String listedlocation= location.ListedLocation().getText();

		

		
		mouseActionRightClick(driver, location.ListedLocation());
		logger.info("Right click over added location");
		location.clickDelete().click();
		logger.info("Clicked on delete button");

		TryClick(location.clickYes());
		waitUntilPageLoad();
		
		
		TryClick(location.Search());
		//location.Search().sendKeys(listedlocation);
		waitUntilPageLoad();
     	String locationNameAfterDelete=location.ListedLocation().getText();
		System.out.println("Listed location name before delete: "+listedlocation);
		System.out.println("Listed location name after delete: "+locationNameAfterDelete);
		if (listedlocation.equalsIgnoreCase(locationNameAfterDelete)) {
			Assert.assertTrue(false);
			captureScreen(driver, "addLocation");
			logger.info("delete location test failed");
			} 
		
		else {
			Assert.assertTrue(true);
			logger.info("delete location test passed");
		}

	}
	

	}


