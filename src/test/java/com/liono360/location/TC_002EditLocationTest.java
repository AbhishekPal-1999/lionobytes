package com.liono360.location;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.LocationPage;
import com.liono360.utility.ExcelDataProvider;
import com.liono360.utility.RetryAnalyzer;

/**
 * @author Panchanan Lead page elements
 */

public class TC_002EditLocationTest extends Baseclass {

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void editLocationTest() throws InterruptedException, IOException {
		// redirectToCRM();
		Actions action = new Actions(driver);

		ExcelDataProvider exceldata = new ExcelDataProvider();
		LocationPage location = new LocationPage(driver);

		explWaitToClick(location.clickInventory());

		location.clickInventory().click();
		logger.info("Clicked on Inventory");

		explWaitToClick(location.clickLocation());

		location.clickLocation().click();
		logger.info("Clicked on Location");
		
		waitUntilPageLoad();

		Thread.sleep(5000);
		explWaitToClick(location.ListedLocation());
		
		mouseActionRightClick(driver, location.ListedLocation());

		logger.info("Right click over added location");
		location.clickEdit().click();
		logger.info("Clicked over edit button");

		location.setlocationId().click();
		Thread.sleep(1000);
		location.setlocationId().clear();
		logger.info("Removed location id ");

		location.setlocationId().sendKeys(exceldata.LocationID() + randomnumber());
		logger.info("Location Id updated");

		String EditedLocationId = location.setlocationId().getDomProperty("value");

		TryClick(location.seLocationName());
		logger.info("Location name click");

		location.seLocationName().clear();
		Thread.sleep(1000);
		logger.info("Location name clear");
		location.seLocationName().sendKeys("UpdatedLocation" + randomnumber());
		logger.info("Fill Location name");
		Thread.sleep(2000);
		String SetLocationId = location.setlocationId().getDomProperty("value");

		TryClick(location.selectCategory());
		logger.info("Click Category");
		Thread.sleep(1000);
		ClickMultipleDropdownValue(2).click();

		location.setLocation().clear();
		logger.info("Location is clear");
		location.setLocation().sendKeys(exceldata.StreetAddress());
		Thread.sleep(4000);

		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		action.sendKeys(Keys.ENTER).build().perform();
		logger.info("Fill location address");

		location.setEmail().clear();
		logger.info("email is clear");
		location.setEmail().sendKeys("Location" + randomnumber() + "@lionobytes.com");
		logger.info("Sendkeys on email");

		location.setPhoneNo().clear();
		logger.info("Phone no. is clear");
		location.setPhoneNo().sendKeys("+15478" + randomnumber() + randomnumber());
		logger.info("Phone number added");

		Thread.sleep(2000);
		explWaitToClick(location.clickSave());

		location.clickSave().click();
		logger.info("Clicked on save option after edit");

		waitUntilPageLoad();
		Thread.sleep(3000);

		TryClick(location.setSearchLocation());
		location.setSearchLocation().sendKeys(SetLocationId);
		String LocationNameAfterUpdated = location.ListedLocation().getText();
		System.out.println("Edited Location id: " + EditedLocationId);
		System.out.println("provided Location Id to Edit: " + SetLocationId);
		System.out.println("Listed Location Id after edit: " + LocationNameAfterUpdated);

		if (SetLocationId.equalsIgnoreCase(LocationNameAfterUpdated)) {
			Assert.assertTrue(true);
			logger.info("Edit Location test passed");
		}

		else {
			Assert.assertTrue(false);
			logger.info("Edit Location test failed");
		}

	}
}
