package com.liono360.Product.Inventoryitem;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ProductPage;
import com.liono360.utility.RetryAnalyzer;

public class TC_003ViewProduct extends Baseclass {

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void ViewProductTest() throws InterruptedException, IOException {

		// redirectToCRM();

		ProductPage products = new ProductPage(driver);
		TryClick(products.clickInventory());
		logger.info("Clicked on inventory button");
		
		TryClick(products.clickProduct());
		logger.info("select dropdown product channel");
		waitUntilPageLoad();
		TryClick(products.clickInventoryItem());
		logger.info("clicked non inventory");
		
		Thread.sleep(4000);
		waitUntilPageLoad();
		
		Thread.sleep(1000);
		mouseActionRightClick(driver, products.listedProductIs());
		// String listedProductToView= products.listedLocationIs().getText();

		TryClick(products.clickViewOption());
		logger.info("Clicked on view button");
		if (products.ViewLeadHeader().isDisplayed()) {

			Assert.assertTrue(true);
			logger.info("View product test passed");
		} else {
			Assert.assertTrue(false);
			captureScreen(driver, "View Invntory test ");
			logger.info("view product test failed");
		}
		
		explWaitToClick(products.clickCancel());
		waitUntilPageLoad();

		jsClick(driver , products.clickCancel());
		logger.info("Clicked on cancel button");
		Thread.sleep(2000);

	}

}
