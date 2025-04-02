package com.liono360.location;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.LocationPage;
import com.liono360.pageObject.LoginPage;

public class TC_004SearchLocationTest extends Baseclass{
	
	@Test
	public void searchLocationTest() throws InterruptedException, IOException {
		redirectToCRM();

		LocationPage location = new LocationPage(driver);
		
		location.clickInventory().click();
		logger.info("Clicked on Inventory");
	
		TryClick (location.clickLocation());
		logger.info("Clicked on Location");
		
		
		location.Search().sendKeys("USA");
		String searchText = location.setSearchLocation().getAttribute("value");
		explWaitToClick(location.listedLocationIs());
		
		String listedLocation = location.listedLocationIs().getText();
		
		if (listedLocation.contains(searchText)){
			Assert.assertTrue(true);
			logger.info("Search Location test passed");
		} else {
			Assert.assertTrue(false);
			captureScreen(driver, "SearchLocation");
			logger.info("Search location test failed");
		}
		
		
	}

}
