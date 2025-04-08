package com.liono360.Product.services;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ProductPage;
import com.liono360.utility.RetryAnalyzer;

public class TC_004DeleteServiceTest extends Baseclass{
	
	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void DeleteServiceTest() throws InterruptedException, IOException {
		
	//	redirectToCRM();

		ProductPage products = new ProductPage(driver);
		TryClick(products.clickInventory());
		logger.info("Clicked on inventory button");
		
		TryClick(products.clickProduct());
		logger.info("Clicked on product to load the list");

		TryClick(products.clickService());
		logger.info("Clicked on services");
		
		waitUntilPageLoad();
		Thread.sleep(2000);
		explWaitToClick(products.listedProductIs());
		
		mouseActionRightClick(driver, products.listedProductIs());
	
		String listedProductToDelete= products.listedProductIs().getText();
		
		
		TryClick(products.clickDeleteOption());
		logger.info("Clicked on delete button");
		
		TryClick(products.clickYesToDelete());
		logger.info("Clicked on confirm delete");
		waitUntilPageLoad();
		Thread.sleep(3000);
		String listedProductAfterDelete = products.listedProductIs().getText();
		 System.out.println("Provided Lead name to create: "+listedProductAfterDelete);
			System.out.println("Listed Lead name after create: "+listedProductToDelete);
		if (!listedProductToDelete.equalsIgnoreCase(listedProductAfterDelete)) {
			Assert.assertTrue(true);
			logger.info("delete Service test passed");
		}
		else {
			Assert.assertTrue(false);
			captureScreen(driver, "DeleteService");
			logger.info("delete Service test failed");
			
		}
		
	}

}
