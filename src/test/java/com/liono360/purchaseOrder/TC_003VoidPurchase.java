package com.liono360.purchaseOrder;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.PurchasePage;

public class TC_003VoidPurchase extends Baseclass {
	@Test
	public void VoidPurchaseOrderTest() throws InterruptedException, IOException {

		// redirectToCRM();
		waitUntilPageLoad();
		Thread.sleep(1000);
		PurchasePage purchase = new PurchasePage(driver);
		TryClick(purchase.clickInventory());
		logger.info("Clicked on inventory button");
		waitUntilPageLoad();
		TryClick(purchase.clickPurchases());
		logger.info("Clicked on purchases ");

		TryClick(purchase.clickPurchaseOrder());
		logger.info("Clicked on purchase order ");
		
		waitUntilPageLoad();
		Thread.sleep(1000);
		waitUntilPageLoad();

		mouseActionRightClick(driver, purchase.listedPurchaseOrder());
		waitUntilPageLoad();
		logger.info("Right cliked on purchase order");

		jsClick(driver, purchase.clickVoidOption());
		logger.info("Clicked on void option");

		waitUntilPageLoad();

		jsClick(driver, purchase.listedPurchaseOrder());
		logger.info("Clicke on voided purchase order");
		waitUntilPageLoad();

		String verifyStatus = purchase.verifyStatus().getText();

		if (verifyStatus.contains("Void")) {
			Assert.assertTrue(true);
			logger.info("Void Purchase order is passed");

		} else {
			Assert.assertTrue(false);
			captureScreen(driver, "Void purchase order Failed ");
		}

	}

}
