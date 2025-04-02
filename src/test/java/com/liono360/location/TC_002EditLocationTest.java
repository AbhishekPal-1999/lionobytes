package com.liono360.location;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.LocationPage;
import com.liono360.pageObject.LoginPage;
import com.liono360.utility.ExcelDataProvider;

/**
 * @author Panchanan
 *Lead page elements
 */

public class TC_002EditLocationTest extends Baseclass {
	
	@Test
	public void editLocationTest() throws InterruptedException, IOException {
		//redirectToCRM();
		Actions action = new Actions(driver);
		
		ExcelDataProvider exceldata=new ExcelDataProvider();
		LocationPage location = new LocationPage(driver);
		
		location.clickInventory().click();
		logger.info("Clicked on Inventory");
		
		location.clickLocation().click();
		logger.info("Clicked on Location");
		
		
		Actions actions = new Actions(driver);
		mouseActionRightClick(driver, location.ListedLocation());
		
		logger.info("Right click over added location");
		location.clickEdit().click();
		logger.info("Clicked over edit button");
		
		
		location.setlocationId().click();
		Thread.sleep(1000);
		location.setlocationId().clear();
		logger.info("Removed location id ");
		
		location.setlocationId().sendKeys(exceldata.LocationID()+randomnumber());
		logger.info("Location Id updated");
		
		String EditedLocationId = location.setlocationId().getAttribute("value");
	
		TryClick(location.seLocationName());
		logger.info("Location name click");
	
		location.seLocationName().clear();
		Thread.sleep(1000);
		logger.info("Location name clear");
		location.seLocationName().sendKeys("UpdatedLocation"+randomnumber());
		logger.info("Fill Location name");
		Thread.sleep(2000);
		String SetLocationName= location.seLocationName().getAttribute("value");
		
		
		
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
		location.setEmail().sendKeys("Location"+randomnumber()+"@lionobytes.com");
		logger.info("Sendkeys on email");
		
		location.setPhoneNo().clear();
		logger.info("Phone no. is clear");
		location.setPhoneNo().sendKeys("+15478"+randomnumber()+randomnumber());
		logger.info("Phone number added");
		Thread.sleep(2000);
		
		location.clickSave().click();
		logger.info("Clicked on save option after edit");
		Thread.sleep(3000);
		TryClick(location.setSearchLocation());
		location.setSearchLocation().sendKeys(SetLocationName);
		String LocationNameAfterUpdated=location.ListedLocation().getText();
		System.out.println("provided Location name to create: "+SetLocationName);
		System.out.println("Listed Location name after create: "+LocationNameAfterUpdated);

		if (SetLocationName.equalsIgnoreCase(LocationNameAfterUpdated)) {
			Assert.assertTrue(true);
			logger.info("Edit Location test passed");
		} 

		else {
			Assert.assertTrue(false);
			logger.info("Edit Location test failed");
		}
		
		
		
	
	}
}
