package com.liono360.Product.Inventoryitem;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ProductPage;

public class TC_002EditProduct extends Baseclass{
	
	@Test
	public void EditProductTest() throws InterruptedException, IOException {
		
	//	redirectToCRM();
		
		ProductPage products = new ProductPage(driver);
		
		waitUntilPageLoad();
		Thread.sleep(10000);
		TryClick(products.clickInventory());
		logger.info("Clicked on inventory button");
		
		
		TryClick(products.clickProduct());
		logger.info("Clicked on product to load the list");
		
		
		TryClick(products.btnInventoryItems());
		logger.info("Clicked on inventory Item button");
		
		
		waitUntilPageLoad();
		Thread.sleep(2000);
		mouseActionRightClick(driver,products.listedProductIs());
		Thread.sleep(2000);
		
		TryClick(products.clickEditOption());
	    logger.info("Clicked on edit button for the product");

	  
	    TryClick(products.setItemNo());
	    products.setItemNo().clear();
	   
	    products.setItemNo().sendKeys("updatedItem" + randomnumber());
	    logger.info("Updated product item no.");
	    String updatedProduct = products.setItemNo().getAttribute("value");
	  
	    // Save the changes
	    products.clickSave().click();
	    logger.info("Clicked on save button to save the changes");
	    Thread.sleep(3000);
	    // Verify that the product was successfully updated
		
		
		  String listedProduct = products.listedProductIs().getText();
		 
		  System.out.println("Provided Lead name to create: "+updatedProduct);
			System.out.println("Listed Lead name after create: "+listedProduct);
			if (updatedProduct.equalsIgnoreCase(listedProduct)) {
				Assert.assertTrue(true);
				logger.info("Edit product test passed");
			} 

			else {
				Assert.assertTrue(false);
				logger.info("Edit product test failed");
			}
		
		 
	}
}
