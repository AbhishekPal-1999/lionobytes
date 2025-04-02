package com.liono360.services;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ServicePage;

public class TC_002ViewServiceTest extends Baseclass {

	@Test
	public void ViewServiceTest() throws InterruptedException, IOException {
		//redirectToCRM();

		ServicePage products = new ServicePage(driver);
		TryClick(products.clickInventory());
		logger.info("Clicked on inventory button");
		
		TryClick(products.clickProduct());
		logger.info("Clicked on product to load the list");
		
		products.	waitUntilPageLoad();
	
		TryClick(products.selectProduct());
		logger.info("Clicked on inventory dropdown");
		products.	waitUntilPageLoad();
	
		TryClick(products.clickService());
		logger.info("Clicked on services");
		products.	waitUntilPageLoad();
		
	
	

		mouseActionRightClick(driver, products.listedProductIs());
		Thread.sleep(2000);

	  TryClick( products.clickViewOption());
		logger.info("Clicked on view button");
		products.	waitUntilPageLoad();
		
		


		

		if (products.productViewHeader().isDisplayed()) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
			captureScreen(driver, "viewService");
			logger.info("View Service test failed");

		}
		
		driver.findElement(By.xpath("//span[normalize-space()='Cancel']")).click();
		logger.info("Clicked on cancel button");
		Thread.sleep(3000);
		
		
	}
}
