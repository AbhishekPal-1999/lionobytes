package com.liono360.location;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.LocationPage;
import com.liono360.utility.ExcelDataProvider;

public class TC_005ViewLocationTest extends Baseclass {

	@Test
	public void InventoryTeansferTest() throws InterruptedException, IOException {

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
		location.clickView().click();
		logger.info("Clicked over edit button");
		
		
		location.clickCancel().click();
		logger.info("Clicked  on cancel button");
		
		

	}
}
