package com.liono360.Product.Inventoryitem;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ProductPage;
import com.liono360.utility.RetryAnalyzer;

public class TC_005SearchProduct extends Baseclass{
	
	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void SearchProductTest() throws InterruptedException, IOException {
		
		ProductPage products = new ProductPage(driver);
		explWaitToClick(products.clickInventory());
		products.clickInventory().click();
		logger.info("Clicked on inventory button");
		
		explWaitToClick(products.clickProduct());
		products.clickProduct().click();
		logger.info("Clicked on product to load the list");
		
		explWaitToClick(products.clickInventoryItem());
		products.clickInventoryItem().click();
		logger.info("Clicked on inventory item");

		waitUntilPageLoad();
		Thread.sleep(2000);
		
		explWaitToClick(products.setSearch());
		products.setSearch().sendKeys(products.listedProductIs().getText());
		
		waitUntilPageLoad();
		Thread.sleep(2000);
		
		 if(products.listedProductIs().isDisplayed())
			{
				Assert.assertTrue(true);
				logger.info(" product search passed");
			}
			else
			{
				Assert.assertTrue(false);
				captureScreen(driver, "searchproduct");
				logger.info("Search Product test failed");
			}
		 
		 driver.navigate().refresh();
		 waitUntilPageLoad();
		 

	}
}
