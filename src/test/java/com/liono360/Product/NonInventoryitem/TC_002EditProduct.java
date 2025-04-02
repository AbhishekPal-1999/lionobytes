package com.liono360.Product.NonInventoryitem;

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
		TryClick(products.clickInventory());
		logger.info("Clicked on inventory button");
		products.	waitUntilPageLoad();
		TryClick(products.clickProduct());
		logger.info("Clicked on product to load the list");
		products.	waitUntilPageLoad();
		
		TryClick(products.selectProduct());
		logger.info("select dropdown product channel");
		products.	waitUntilPageLoad();
		TryClick(products.ClickNonInventory());
		logger.info("clicked non inventory");
		
		waitUntilPageLoad();
		
		mouseActionRightClick(driver, products.listedProductIs());
		products.	waitUntilPageLoad();
		
		TryClick(products.clickEditOption());
	    
	    logger.info("Clicked on edit button for the product");

	    // Make the necessary changes to the product
	  
	    TryClick(products.setItemNo());
	    products.setItemNo().clear();
	   
	    products.setItemNo().sendKeys("updatedItem" + randomnumber());
	    logger.info("Updated product item no.");
	    String updatedProduct = products.setItemNo().getAttribute("value");
	  
	    // Save the changes
	    products.clickSave().click();
	    logger.info("Clicked on save button to save the changes");
	    Thread.sleep(5000);
	    products.	waitUntilPageLoad();
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
