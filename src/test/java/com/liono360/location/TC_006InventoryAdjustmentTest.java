package com.liono360.location;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.LocationPage;
import com.liono360.pageObject.LoginPage;

public class TC_006InventoryAdjustmentTest extends Baseclass {
	@Test
	public void InventoryAdjustmentTest() throws InterruptedException, IOException {
		
		driver.get(baseURL);
		logger.info("URL is opened");
		LoginPage lp = new LoginPage(driver);

		lp.setUserName(username);
		logger.info("Username added");
		lp.setPassword(password);
		logger.info("password added");
		Thread.sleep(2000);
		lp.clickSubmit();
		logger.info("Clicked on submit button");
		Thread.sleep(18000); 
		
		LocationPage location = new LocationPage(driver);
		location.clickInventory().click();
		logger.info("Clicked on Inventory");
		Thread.sleep(2000);
		location.clickLocation().click();
		logger.info("Clicked on Location");
		Thread.sleep(12000);
		location.clickExpandDropdown().click();
		explWaitToClick(location.clickInventoryAdjustment());
		location.clickInventoryAdjustment().click();
		logger.info("Clicked on inventory adjustment button");
		
		explWaitToClick(location.selectToLocation());
		location.selectToLocation().click();
		Thread.sleep(2000);
		explWaitToClick(location.setSearchToLocation());
		location.setSearchToLocation().sendKeys("Usa NEW");
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//li[@aria-label='Usa New']")));
		driver.findElement(By.xpath("//li[@aria-label='Usa New']")).click();
		logger.info("Selected Adjustment warehouse");
		Thread.sleep(2000);
		explWaitToClick(location.selectFinanceAccount());
		location.selectFinanceAccount().click();
		logger.info("Clicked on finance account dropdown");
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='Assets']")));
		driver.findElement(By.xpath("//span[text()='Assets']")).click();
		logger.info("Selected finance account");
		Thread.sleep(2000);
		explWaitToClick(location.selectProductForAdjustment());
		location.selectProductForAdjustment().click();
		Thread.sleep(2000);
		location.setSearchProduct().sendKeys("Hyrider");
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//li[@aria-label='Hyrider-Hyrider']")));
		driver.findElement(By.xpath("//li[@aria-label='Hyrider-Hyrider']")).click();
		logger.info("Selected product for Adjustment");
		Thread.sleep(3000);
		
		location.setProductQtyToAdjust().sendKeys("10");
		String s1 = location.setProductQtyToTransfer().getAttribute("value");
		int qtyAddedToAdjust = Integer.parseInt(s1);
		logger.info("Added quantity to Adjust");
		Thread.sleep(1000);
		location.setComment().sendKeys("Test Inventory Adjustment");
		logger.info("Added text to comment");
		Thread.sleep(1000);
		location.clickSave().click();
		logger.info("Clicked on save button");
		Thread.sleep(2000);
		explWaitToClick(location.setSearchLocation());
		location.setSearchLocation().sendKeys("Usa New");
		Thread.sleep(3000);
		explWaitToClick(location.listedLocationIs());
		location.listedLocationIs().click();
		logger.info("Clicked on searched location");
		Thread.sleep(3000);

		explWaitToClick(location.clickAdjustmentsTab());
		location.clickAdjustmentsTab().click();
		logger.info("Clicked on Adjustment tab");
		Thread.sleep(2000);
		explWaitToClick(location.clickViewQtyAdjusted());
		location.clickViewQtyAdjusted().click();
		logger.info("Clicked on view transfer details");
		Thread.sleep(2000);
		explWaitToClick(location.qtyAdjusted());
		String s = location.qtyAdjusted().getText();
		int qtyAdjusted = Integer.parseInt(s);
         
		System.out.println(qtyAddedToAdjust + " " + qtyAdjusted);
		
		if (qtyAddedToAdjust == qtyAdjusted) {
			Assert.assertTrue(true);
			logger.info("Inventory Adjustment test passed");
		} else {
			Assert.assertTrue(false);
			captureScreen(driver, "InventoryAdjustment");
			logger.info("Inventory Adjustment test failed");
		}

		
	}

}
