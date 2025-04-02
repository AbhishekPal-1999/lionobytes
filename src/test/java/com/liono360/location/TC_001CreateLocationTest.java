package com.liono360.location;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.LocationPage;
import com.liono360.pageObject.LoginPage;
import com.liono360.utility.ExcelDataProvider;

public class TC_001CreateLocationTest extends Baseclass {
	
	@Test
	public void CreateLocationTest() throws InterruptedException, IOException {
		
		
		//redirectToCRM();
		LocationPage location = new LocationPage(driver);
		ExcelDataProvider exceldata=new ExcelDataProvider();
		location.clickInventory().click();
		logger.info("Clicked on Inventory");
		
		
		TryClick(location.clickLocation());
		//location.clickLocation().click();
		logger.info("Clicked on Location");
		
		location.clickOpenAddLocation().click();
	
		location.clickAddLocation().click();
		logger.info("Clicked on add location button");
		
		location.setlocationId().sendKeys(exceldata.LocationID()+randomnumber());
		String SetLocationId= location.setlocationId().getAttribute("value");
		logger.info("Location id added");
		location.seLocationName().sendKeys(exceldata.LocationName());
		String SetLocationName= location.seLocationName().getAttribute("value");
		
		TryClick(location.selectCategory());
		logger.info("Click Category");
		Thread.sleep(1000);
		ClickMultipleDropdownValue(1).click();
		logger.info("Category added");
		Thread.sleep(500);
		Actions action = new Actions(driver);
		
		location.setLocation().sendKeys(exceldata.StreetAddress());
		Thread.sleep(3000);
		
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		action.sendKeys(Keys.ENTER).build().perform();
		
		location.setEmail().sendKeys("Location"+randomnumber()+"@lionobytes.com");
		logger.info("Sendkeys on email");
		
		
		location.setPhoneNo().sendKeys("+15478"+randomnumber()+randomnumber());
		logger.info("Phone number added");
		Thread.sleep(2000);
		location.clickSave().click();
		logger.info("Clicked on save button");
		Thread.sleep(5000);
		
		TryClick(location.setSearchLocation());
		location.setSearchLocation().sendKeys(SetLocationName);
		String LocationNameAfterCreate=location.ListedLocation().getText();
		System.out.println("provided Location name to create: "+SetLocationName);
		System.out.println("Listed Location name after create: "+LocationNameAfterCreate);

		if (SetLocationName.equalsIgnoreCase(LocationNameAfterCreate)) {
			Assert.assertTrue(true);
			logger.info("Create Location test passed");
		} 

		else {
			Assert.assertTrue(false);
			logger.info("create Location test failed");
		}
		
		
				
		
		
		
		
		
		

}

}