package com.liono360.newOrganization;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.LocationPage;
import com.liono360.utility.ExcelDataProvider;
import com.liono360.utility.RetryAnalyzer;

public class CreateLocation extends Baseclass {
	
	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void CreateLocationTest() throws InterruptedException, IOException {
		
		
		//redirectToCRM();
		LocationPage location = new LocationPage(driver);
		ExcelDataProvider exceldata=new ExcelDataProvider();
		
		explWaitToClick(location.clickInventory());
		location.clickInventory().click();
		logger.info("Clicked on Inventory");
		
		
		TryClick(location.clickLocation());
		//location.clickLocation().click();
		logger.info("Clicked on Location");
		
		location.clickOpenAddLocation().click();
	
		location.clickAddLocation().click();
		logger.info("Clicked on add location button");
		
		location.setlocationId().sendKeys(exceldata.LocationID()+randomnumber());
		String SetLocationId= location.setlocationId().getDomAttribute("value");
		logger.info("Location id added");
		
		
		location.seLocationName().sendKeys(exceldata.LocationName());
		String SetLocationName= location.seLocationName().getDomAttribute("value");
		
		TryClick(location.selectCategory());
		logger.info("Click Category");
		Thread.sleep(1000);
		ClickMultipleDropdownValue(1).click();
		logger.info("Category added");
		Thread.sleep(500);
		Actions action = new Actions(driver);
		
		location.setLocation().sendKeys(exceldata.StreetAddress());
		Thread.sleep(4000);
		
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		action.sendKeys(Keys.ENTER).build().perform();
		
		location.setEmail().sendKeys("Location"+randomnumber()+"@lionobytes.com");
		logger.info("Sendkeys on email");
		
		location.setPhoneNo().sendKeys("+15478"+randomnumber()+randomnumber());
		logger.info("Phone number added");
		
		explWaitToClick(location.clickSave());
		
		location.clickSave().click();
		logger.info("Clicked on save button");
		
		waitUntilPageLoad();
		
		location.setSearchLocation().sendKeys(SetLocationId);
		
		waitUntilPageLoad();
		Thread.sleep(2000);
		
		String LocationNameAfterCreate=location.ListedLocation().getText();
		System.out.println("provided Location name to create: "+SetLocationId);
		System.out.println("Listed Location name after create: "+LocationNameAfterCreate);

		if (SetLocationId.equalsIgnoreCase(LocationNameAfterCreate)) {
			Assert.assertTrue(true);
			logger.info("Create Location test passed");
		} 

		else {
			Assert.assertTrue(false);
			logger.info("create Location test failed");
		}
		
		location.setSearchLocation().clear();
		waitUntilPageLoad();
		
		
		
				
		
		
		
		
		
		

}

}
