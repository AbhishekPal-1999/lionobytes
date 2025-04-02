package com.liono360.services;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ServicePage;

public class TC_005EditServiceTest extends Baseclass {
	
	@Test
	public void EditServiceTest() throws InterruptedException, IOException {
		
		//redirectToCRM();

		ServicePage products = new ServicePage(driver);
		TryClick(products.clickInventory());
		logger.info("Clicked on inventory button");
		
		TryClick(products.clickProduct());
		logger.info("Clicked on product to load the list");
		
		products.	waitUntilPageLoad();
		
		TryClick(products.selectProduct());
		logger.info("Clicked on inventory dropdown");
		
		
		TryClick(products.clickService());
		logger.info("Clicked on services");
		
		products.	waitUntilPageLoad();
		
		mouseActionRightClick(driver, products.listedProductIs());
		products.	waitUntilPageLoad();
		

		
		TryClick(products.clickEditOption());
		
	    
	    logger.info("Clicked on edit button for the product");

	    // Make the necessary changes to the product
	    
	    products.setItemNo().clear();
	    products.setItemNo().sendKeys("updatedItem" + randomnumber());
	    logger.info("Updated product item no.");
	    String updatedProduct = products.setItemNo().getAttribute("value");

	    // Save the changes
	    products.clickSave().click();
	    logger.info("Clicked on save button to save the changes");
		products.	waitUntilPageLoad();
        		 
        	Thread.sleep(4000);
	    // Verify that the product was successfully updated
	   
	    String listedProduct = products.listedProductIs().getText();

	    if (listedProduct.equalsIgnoreCase(updatedProduct)) {
	        Assert.assertTrue(true);
	    } else {
	        Assert.assertTrue(false);
	        captureScreen(driver, "editService");
	        logger.info("Edit service test failed");
	    }
	}

}
