package com.liono360.Product.NonInventoryitem;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ProductPage;

public class TC_004DeleteProduct extends Baseclass{
	
	@Test
	public void DeleteProductTest() throws InterruptedException, IOException {
		
		
	//	redirectToCRM();
		
		ProductPage products = new ProductPage(driver);
		TryClick(products.clickInventory());
		logger.info("Clicked on inventory button");
		
		TryClick(products.clickProduct());
		logger.info("Clicked on product to load the list");
		
		TryClick(products.selectProduct());
		logger.info("select dropdown product channel");
		products.	waitUntilPageLoad();
		TryClick(products.ClickNonInventory());
		logger.info("clicked non inventory");
		
		products.	waitUntilPageLoad();
		
		mouseActionRightClick(driver, products.listedProductIs());
		String listedProductToDelete= products.listedProductIs().getText();
		
	
		TryClick(products.clickDeleteOption());
		
		logger.info("Clicked on delete button");
	
		TryClick(products.clickYesToDelete());
		
		logger.info("Clicked on confirm delete");
		
		String listedProductAfterDelete = products.listedProductIs().getText();
		
		if (listedProductToDelete.equalsIgnoreCase(listedProductAfterDelete)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
			captureScreen(driver, "addProduct");
			logger.info("Add product test failed");
			
		}
		
	}

}
