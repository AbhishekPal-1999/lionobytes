package com.liono360.Product.KitItem;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ProductPage;
import com.liono360.utility.RetryAnalyzer;

public class TC_003ViewAddedKitItem extends Baseclass {

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void ViewKitItem() throws InterruptedException, IOException {

		waitUntilPageLoad();
		ProductPage products = new ProductPage(driver);
		TryClick(products.clickInventory());
		logger.info("Clicked on inventory button");
		TryClick(products.clickProduct());
		logger.info("Clicked on product to load the list");
		TryClick(products.ClickKitItem());
		waitUntilPageLoad();
		logger.info("Click Kit item to show list");

		waitUntilPageLoad();
		explWaitToClick(products.listedProductIs());
		Thread.sleep(1000);

		mouseActionRightClick(driver, products.listedProductIs());
		TryClick(products.clickViewOption());

		logger.info("Clicked on view button for the Kit"); 
		
		if (products.ViewKitHeader().isDisplayed()) {

			Assert.assertTrue(true);
			logger.info("View product test passed");
		} else {
			Assert.assertTrue(false);
			captureScreen(driver, "View Kit test ");
			logger.info("view Kit test failed");
		}
		
		explWaitToClick(products.clickCancel());
		jsClick(driver, products.clickCancel());
		logger.info("Clicked on cancel button");
		waitUntilPageLoad();

	}
		
		
		


}
