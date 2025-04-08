package com.liono360.location;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.LocationPage;
import com.liono360.utility.RetryAnalyzer;

public class TC_006InventoryAdjustmentTest extends Baseclass {

	public static String getFirstWordUsingSplit(String input) {
		String[] tokens = input.split("-", 2);
		return tokens[0];
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void InventoryAdjustmentTest() throws InterruptedException, IOException {

		LocationPage location = new LocationPage(driver);
		explWaitToClick(location.clickInventory());
		location.clickInventory().click();
		logger.info("Clicked on Inventory");

		explWaitToClick(location.clickLocation());
		location.clickLocation().click();
		logger.info("Clicked on Location");

		explWaitToClick(location.clickExpandDropdown());
		location.clickExpandDropdown().click();
		logger.info("Clicked on expand to open adjustment");

		explWaitToClick(location.clickInventoryAdjustment());
		location.clickInventoryAdjustment().click();
		logger.info("Clicked on inventory adjustment button");

		explWaitToClick(location.selectToLocation());
		location.selectToLocation().click();
		logger.info("Clicked on select location");

		explWaitToClick(location.clickFirst());
		location.clickFirst().click();
		logger.info("Selected location to adjust");

		String adjustmentLocationNameIdIs = location.clickFirst().getText();
		getFirstWordUsingSplit(adjustmentLocationNameIdIs);

		System.out.println(getFirstWordUsingSplit(adjustmentLocationNameIdIs));
		logger.info("Got Adjustment warehouse");

		explWaitToClick(location.selectFinanceAccount());
		location.selectFinanceAccount().click();
		logger.info("Clicked on finance account dropdown");

		explWaitToClick(location.clickAssetAccount());
		location.clickAssetAccount().click();
		logger.info("Selected finance account");

		explWaitToClick(location.selectProductForAdjustment());
		location.selectProductForAdjustment().click();
		logger.info("Clicked on product list to load");

		explWaitToClick(location.clickFirst());
		location.clickFirst().click();
		logger.info("Selected product for Adjustment");

		location.setProductQtyToAdjust().sendKeys("10");
		String s1 = location.setProductQtyToTransfer().getDomProperty("value");
		int qtyAddedToAdjust = Integer.parseInt(s1);
		logger.info("Added quantity to Adjust");

		location.setComment().sendKeys("Test Inventory Adjustment");
		logger.info("Added text to comment");

		location.clickSave().click();
		logger.info("Clicked on save button");

		waitUntilPageLoad();

		explWaitToClick(location.setSearchLocation());
		location.setSearchLocation().clear();
		location.setSearchLocation().sendKeys(getFirstWordUsingSplit(adjustmentLocationNameIdIs));
		logger.info("Searched adjustment location");

		Thread.sleep(2000);
		waitUntilPageLoad();

		explWaitToClick(location.listedLocationIs());
		location.listedLocationIs().click();
		logger.info("Clicked on searched location");

		waitUntilPageLoad();
		Thread.sleep(2000);

		explWaitToClick(location.clickAdjustmentsTab());
		location.clickAdjustmentsTab().click();
		logger.info("Clicked on Adjustment tab");

		explWaitToClick(location.clickAdjustedTransferedInventory());
		location.clickAdjustedTransferedInventory().click();
		logger.info("Clicked on Invetory adjustment to open details");

		explWaitToClick(location.qtyAdjusted());
		String qtyAdjustedByUser = location.qtyAdjusted().getText();
		int qtyAdjusted = Integer.parseInt(qtyAdjustedByUser);

		if (qtyAddedToAdjust == qtyAdjusted) {
			Assert.assertTrue(true);
			logger.info("Inventory Adjustment test passed");
		} else {
			Assert.assertTrue(false);
			captureScreen(driver, "InventoryAdjustment");
			logger.info("Inventory Adjustment test failed");
		}
		
		explWaitToClick(location.clickCancel());
		location.clickCancel().click();
		logger.info("Clicked on cancel button");
		
		explWaitToClick(location.clickCloseDetails());
		location.clickCloseDetails().click();
		logger.info("Clicked on close button");
		
		

	}

}
