package com.liono360.purchaseOrder;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.PurchasePage;

public class TC_002EditPurchase extends Baseclass {
	@Test
	public void EditPurchase() throws InterruptedException, IOException {
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

		mouseActionRightClick(driver, purchase.listedPurchaseOrder());
		waitUntilPageLoad();

		TryClick(purchase.clickEditOption());

		logger.info("Clicked on edit button for the product");

		waitUntilPageLoad();

		TryClick(driver.findElement(By.xpath("//table[@role='table']//thead//tr//th//span//i")));
		// jsClick(driver,purchase.clickPlusaddproductkit());
		logger.info(" click plus button to add product ");
		Thread.sleep(3000);
		try {
			TryClick(driver.findElement(By.xpath("//p-table[@selectionmode='multiple']//tr")));
			TryClick(driver.findElement(By.xpath("//p-table[@selectionmode='multiple']//tr[4]")));
			TryClick(driver.findElement(By.xpath("//p-table[@selectionmode='multiple']//tr[5]")));
			// Thread.sleep(1000);
			// driver.findElement(By.xpath("((//tbody)[4]//tr)[2]")).click();
			// Thread.sleep(1000);
			// driver.findElement(By.xpath("((//tbody)[4]//tr)[3]")).click();
			// Thread.sleep(1000);
		} catch (Exception e) {

		}

		TryClick(purchase.clickAddOption());
		logger.info("Clicked added to product list");

		logger.info("Clicked on sales order product");
		TryClick(purchase.clickSubmit());
		logger.info("Clicked save List");
		
		waitUntilPageLoad();
		Thread.sleep(1000);
		waitUntilPageLoad();

		TryClick(purchase.listedPurchaseOrder());
		logger.info("Clicked on the updated purchase order");
		
		waitUntilPageLoad();

		jsScroll(driver, purchase.verifyActivity());
		logger.info("Scrolled to the activity section");

		String updatedActivity = purchase.verifyActivity().getText();
		System.out.println(updatedActivity);

		if (updatedActivity.contains("Purchase Order Updated")) {

			Assert.assertTrue(true);
			logger.info("Edit Purchase order test passed");
		} else {
			Assert.assertTrue(false);
			captureScreen(driver, "Edit purchase order ");
			logger.info("Edit purchase order failed");
		}

	}

}
