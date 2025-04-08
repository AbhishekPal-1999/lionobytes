package com.liono360.Product.KitItem;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ProductPage;
import com.liono360.utility.RetryAnalyzer;

public class TC_004DeleteKitItem extends Baseclass{
	
	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void DeleteKitItem() throws InterruptedException, IOException {
		
		ProductPage products = new ProductPage(driver);
		TryClick(products.clickInventory());
		logger.info("Clicked on inventory button");
		
		TryClick(products.clickProduct());
		logger.info("select dropdown product channel");
		waitUntilPageLoad();
		TryClick(products.ClickKitItem());
		logger.info("clicked Kit Item");
		
		String listedProductToDelete =products.listedProductIs().getText();
		
		waitUntilPageLoad();
		
		
		explWaitToClick(products.listedProductIs());
		mouseActionRightClick(driver, products.listedProductIs());
		TryClick(products.clickDeleteOption());
		logger.info("Clicked on Delete button");
		
		explWaitToClick(products.clickYesToDelete());
	
		jsClick(driver, products.clickYesToDelete());
		
		logger.info("Clicked on confirm delete");
		
		waitUntilPageLoad();
		Thread.sleep(5000);
		
		explWaitToClick(products.listedProductIs());
		
		String listedProductAfterDelete = products.listedProductIs().getText();
		
		if (!listedProductToDelete.equalsIgnoreCase(listedProductAfterDelete)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
			captureScreen(driver, "DeleteKit");
			logger.info("Delete Kit test failed");
			
		}
		
	}

}
