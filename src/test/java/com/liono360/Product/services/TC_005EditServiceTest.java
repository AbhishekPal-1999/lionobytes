package com.liono360.Product.services;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ProductPage;
import com.liono360.utility.RetryAnalyzer;

public class TC_005EditServiceTest extends Baseclass {
	
	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void EditServiceTest() throws InterruptedException, IOException {
		
		//redirectToCRM();

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
		TryClick(products.clickEditOption());

	    
	    logger.info("Clicked on edit button for the added service");
	    
	    products.setItemNo().clear();
	    products.setItemNo().sendKeys("updatedService" + randomnumber());
	    logger.info("Updated Service item no.");
	    String updatedProduct = products.setItemNo().getDomProperty("value");

	    jsScroll(driver, products.clickPurchasedProduct());
	    
	    products.clickPurchasedProduct().click();
	    logger.info("Clicked on check box to select service as purchased item");
	    
	    products.setCostPrice().sendKeys(randomnumber());
	    logger.info("Added the cost price of purchased service item");
	  
	    products.clickSave().click();
	    logger.info("Clicked on save button to save the changes");
	    
	    products.clickFinancialOfPreviousYear().click();
	    logger.info("Selected to update financial entry of previous data");
	    
	    products.clickFinaceDataSave().click();
	    logger.info("Clicked on save button on financial data update prompt");
	    
	    // Save the changes
	   
	    waitUntilPageLoad();
	    Thread.sleep(2000);
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
