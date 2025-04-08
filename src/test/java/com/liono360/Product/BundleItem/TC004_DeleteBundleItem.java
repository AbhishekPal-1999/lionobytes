package com.liono360.Product.BundleItem;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ProductPage;

public class TC004_DeleteBundleItem extends Baseclass{
	
	@Test
	public void deleteBndleItemTest() throws InterruptedException, IOException {
		
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
		
		String listedProductToDelete =products.listedProductIs().getText();

		mouseActionRightClick(driver, products.listedProductIs());
		TryClick(products.clickDeleteOption());

		logger.info("Clicked on Delete button for the bundle");
		
		explWaitToClick(products.clickYesToDelete());
		
		jsClick(driver, products.clickYesToDelete());
		
		logger.info("Clicked on confirm delete");
		
		for(int i=0; i<=1; i++) {
		waitUntilPageLoad();
		Thread.sleep(1000);
		}
		explWaitToClick(products.listedProductIs());
		
		String listedProductAfterDelete = products.listedProductIs().getText();
		
		if (!listedProductToDelete.equalsIgnoreCase(listedProductAfterDelete)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
			captureScreen(driver, "DeleteBundle");
			logger.info("Delete bundle test failed");
			
		}
	}

}
