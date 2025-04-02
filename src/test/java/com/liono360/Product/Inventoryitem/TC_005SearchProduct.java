package com.liono360.Product.Inventoryitem;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ProductPage;

public class TC_005SearchProduct extends Baseclass{
	
	@Test
	public void SearchProductTest() throws InterruptedException, IOException {
		
		
		redirectToCRM();
		
		ProductPage products = new ProductPage(driver);
		products.clickInventory().click();
		logger.info("Clicked on inventory button");
		Thread.sleep(2000);
		products.clickProduct().click();
		logger.info("Clicked on product to load the list");
		Thread.sleep(15000);
		
		explWaitToClick(products.setSearch());
		products.setSearch().sendKeys("item");
	
		
		Thread.sleep(5000);
		
	
		
		 if(products.listedProductIs().isDisplayed())
			{
				Assert.assertTrue(true);
				logger.info(" product created");
			}
			else
			{
				Assert.assertTrue(false);
				captureScreen(driver, "addInvoice");
				logger.info("Invoice  created test failed");
			}

	}
}
