package com.liono360.purchaseOrder;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.PurchasePage;

public class TC_004DeletePurchase  extends Baseclass {
	@Test

	public void DeletePurchase() throws InterruptedException, IOException {
	//	redirectToCRM();
		waitUntilPageLoad();
		Thread.sleep(4000);
		PurchasePage purchase = new PurchasePage(driver);
		TryClick(purchase.clickInventory());
		logger.info("Clicked on inventory button");
		waitUntilPageLoad();
		TryClick(purchase.clickPurchases());
		logger.info("Clicked on purchases ");

		TryClick(purchase.clickPurchaseOrder());
		logger.info("Clicked on purchase order ");
		waitUntilPageLoad();

		String listedProductToDelete= purchase.listedPurchaseOrder().getText();
		Thread.sleep(500);
		mouseActionRightClick(driver, purchase.listedPurchaseOrder());
		
		waitUntilPageLoad();
		TryClick(purchase.clickDeleteOption());

		 logger.info("Clicked on delete button");

		TryClick(purchase.clickYesToDelete());

		logger.info("Clicked on confirm delete");
		waitUntilPageLoad();
		Thread.sleep(500);
		String listedProductAfterDelete = purchase.listedPurchaseOrder().getText();
		
	//	System.out.println("Provided purchaseOrder name to create: "+listedProductIs);
		System.out.println("Listed  purchaseOrder before create: "+listedProductAfterDelete);
		System.out.println("Listed  purchaseOrder after create: "+listedProductToDelete);
		if (listedProductToDelete.equalsIgnoreCase(listedProductAfterDelete)) {
			Assert.assertTrue(false);
			logger.info("Add product test fail");
			
		}
		else {
			Assert.assertTrue(true);
			captureScreen(driver, "addProduct");
			logger.info("Add product test pass");

		}

	}
}


