package com.liono360.Product.BundleItem;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ProductPage;

public class TC_003ViewBundleItem extends Baseclass {
	
	@Test
	public void viewBundleItemTest() throws InterruptedException, IOException {
		
		ProductPage products = new ProductPage(driver);
		TryClick(products.clickInventory());
		logger.info("Clicked on inventory button");

		TryClick(products.clickProduct());
		logger.info("select dropdown product channel");
		waitUntilPageLoad();

		products.clickBundleItem().click();
		waitUntilPageLoad();
		logger.info("Click Bundle item to show list");

		waitUntilPageLoad();
		explWaitToClick(products.listedProductIs());
		Thread.sleep(1000);

		mouseActionRightClick(driver, products.listedProductIs());
		TryClick(products.clickViewOption());

		logger.info("Clicked on view button for the bundle");
		
		if (products.ViewBundleHeader().isDisplayed()) {

			Assert.assertTrue(true);
			logger.info("View product test passed");
		} else {
			Assert.assertTrue(false);
			captureScreen(driver, "View Bundle test ");
			logger.info("view Bundle test failed");
		}
		
		explWaitToClick(products.clickCancel());
		jsClick(driver, products.clickCancel());
		logger.info("Clicked on cancel button");
		waitUntilPageLoad();

	}
		
	

}
