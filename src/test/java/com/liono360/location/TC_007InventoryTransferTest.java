package com.liono360.location;

import java.io.IOException;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.LocationPage;
import com.liono360.utility.RetryAnalyzer;

public class TC_007InventoryTransferTest extends Baseclass {

	public static String getFirstWordUsingSplit(String input) {
		String[] tokens = input.split("-", 2);
		return tokens[0];
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void InventoryTransferTest() throws InterruptedException, IOException {

		LocationPage location = new LocationPage(driver);
		
		explWaitToClick(location.clickInventory());
		location.clickInventory().click();
		logger.info("Clicked on Inventory");

		explWaitToClick(location.clickLocation());
		location.clickLocation().click();
		logger.info("Clicked on Location");

		explWaitToClick(location.clickExpandDropdown());
		location.clickExpandDropdown().click();
		logger.info("Clicked on expand to open transfer");

		explWaitToClick(location.clickInventoryTransfer());
		location.clickInventoryTransfer().click();
		logger.info("Clicked on inventory Transfer button");

		explWaitToClick(location.selectFromLocation());
		location.selectFromLocation().click();
		logger.info("Clicked on from location for transfer");

		explWaitToClick(location.clickFirst());
		location.clickFirst().click();
		logger.info("Selected from location for transfer");

		String trnsferedFromLocationIs = location.clickFirst().getText();

		explWaitToClick(location.selectToLocation());
		location.selectToLocation().click();
		logger.info("Clicked on to locaton to transfer");

		explWaitToClick(location.clickSecond());
		location.clickSecond().click();
		logger.info("Selected location to transfer");

		explWaitToClick(location.selectProductForTransfer());
		location.selectProductForTransfer().click();
		logger.info("Clicked on product list to load");
		
		Thread.sleep(2000);
		waitUntilPageLoad();

		explWaitToClick(location.clickFirst());
		location.clickFirst().click();
		logger.info("Selected product for Transfer");

		

		try {
			explWaitToClick(location.selectFromBin());
			if (location.selectFromBin().isDisplayed())
				explWaitToClick(location.selectFromBin());
			location.selectFromBin().click();
			location.clickFirst().click();
		} catch (NoSuchElementException e) {
			logger.info("Default From bin is selected");

		}
		logger.info("If default from bin is not showing click and select bin");

		try {
			if (location.selectToBin().isDisplayed())
				explWaitToClick(location.selectFromBin());
			location.selectToBin().click();
			location.clickFirst().click();
		} catch (NoSuchElementException e) {
			System.out.println("Default To bin is selected");

		}
		logger.info("If default To bin is not showing click and select bin");

		explWaitToClick(location.setTransferQty());
		location.setTransferQty().clear();
		location.setTransferQty().sendKeys("10");

		String qtyTransferedByUser = location.setTransferQty().getDomProperty("value");
		int qtyToTransfer = Integer.parseInt(qtyTransferedByUser);

		logger.info("Added 10 Quantity to transfer from location A to Locaion B");

		location.setComment().sendKeys("Test Inventory Transfer");
		logger.info("Added text to comment for transfer inventory");

		location.clickNext().click();
		logger.info("Clicked on Next button");

		location.clickConfirm().click();
		logger.info("Clicked on Confirm button");

		waitUntilPageLoad();

		explWaitToClick(location.setSearchLocation());
		location.setSearchLocation().clear();
		location.setSearchLocation().sendKeys(getFirstWordUsingSplit(trnsferedFromLocationIs));
		logger.info("Searched transfer location");

		Thread.sleep(2000);
		waitUntilPageLoad();

		explWaitToClick(location.listedLocationIs());
		location.listedLocationIs().click();
		logger.info("Clicked on searched location");

		waitUntilPageLoad();

		explWaitToClick(location.clickTransferTab());
		location.clickTransferTab().click();
		logger.info("Clicked on Transfer tab");

		Thread.sleep(2000);
		waitUntilPageLoad();

		explWaitToClick(location.clickAdjustedTransferedInventory());
		location.clickAdjustedTransferedInventory().click();
		logger.info("Clicked on Invetory Transfer to open details");

		waitUntilPageLoad();

		String transferedQuantity = location.qtyTransfered().getText();
		int transferedQty = Integer.parseInt(transferedQuantity);

		if (qtyToTransfer == transferedQty) {
			Assert.assertTrue(true);
			logger.info("Inventory Transfer test passed");
		} else {
			Assert.assertTrue(false);
			captureScreen(driver, "InventoryTransfer");
			logger.info("Inventory Transer test failed");
		}
		
		explWaitToClick(location.clickCancel());
		location.clickCancel().click();
		logger.info("Clicked on cancel button");

	}

}
