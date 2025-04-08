package com.liono360.location;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.LocationPage;
import com.liono360.utility.RetryAnalyzer;

public class TC_004SearchLocationTest extends Baseclass{
	
	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void searchLocationTest() throws InterruptedException, IOException {

		LocationPage location = new LocationPage(driver);
		
		explWaitToClick(location.clickInventory());
		
		location.clickInventory().click();
		logger.info("Clicked on Inventory");
	
		TryClick (location.clickLocation());
		logger.info("Clicked on Location");
		
		waitUntilPageLoad();
		Thread.sleep(2000);
		explWaitToClick(location.Search());
		
		location.Search().clear();
		logger.info("Cleared the search text box");
		
		location.Search().sendKeys(location.ListedLocation().getText());
		String searchText = location.setSearchLocation().getDomProperty("value");
		
		
		Thread.sleep(2000);
		waitUntilPageLoad();
		
		explWaitToClick(location.listedLocationIs());
		
		System.out.println("Searcherd Text:"+searchText );
		String listedLocationId = location.ListedLocation().getText();
		System.out.println("Location Id is: "+listedLocationId);
		
		
		if (listedLocationId.contains(searchText)){
			Assert.assertTrue(true);
			logger.info("Search Location test passed");
		} else {
			Assert.assertTrue(false);
			captureScreen(driver, "SearchLocation");
			logger.info("Search location test failed");
		}
		
		
	}

}
