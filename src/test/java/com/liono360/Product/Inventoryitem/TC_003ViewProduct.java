package com.liono360.Product.Inventoryitem;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ProductPage;

public class TC_003ViewProduct extends Baseclass {
	
	@Test
	public void ViewProductTest() throws InterruptedException, IOException {
		
	//	redirectToCRM();
		
		ProductPage products = new ProductPage(driver);
		TryClick(products.clickInventory());
		logger.info("Clicked on inventory button");
		
		TryClick(products.clickProduct());
		logger.info("Clicked on product to load the list");
	waitUntilPageLoad();
	Thread.sleep(10000);
		
		
		mouseActionRightClick(driver, products.listedProductIs());
		//String listedProductToView= products.listedLocationIs().getText();
	
		
		TryClick(products.clickViewOption());
		logger.info("Clicked on view button");
		if(products.ViewLeadHeader().isDisplayed())
 		{ 

			
			
			
 			Assert.assertTrue(true);
 			logger.info("View product test passed");
 		}
 		else
 		{
 			Assert.assertTrue(false);
 			captureScreen(driver, "View Account test ");
 			logger.info("view product test failed");
 		}
		
		driver.findElement(By.xpath("//span[normalize-space()='Cancel']")).click();
		logger.info("Clicked on cancel button");
		Thread.sleep(2000);
		
		
		
	}

}
