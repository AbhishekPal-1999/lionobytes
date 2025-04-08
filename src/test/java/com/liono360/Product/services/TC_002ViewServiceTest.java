package com.liono360.Product.services;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ProductPage;
import com.liono360.utility.RetryAnalyzer;

public class TC_002ViewServiceTest extends Baseclass {

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void ViewServiceTest() throws InterruptedException, IOException {
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
		Thread.sleep(2000);

		TryClick( products.clickViewOption());
		logger.info("Clicked on view button");
		waitUntilPageLoad();

		if (products.serviceViewHeader().isDisplayed()) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
			captureScreen(driver, "viewService");
			logger.info("View Service test failed");

		}
		
		driver.findElement(By.xpath("//span[normalize-space()='Cancel']")).click();
		logger.info("Clicked on cancel button");
		waitUntilPageLoad();
		
		
	}
}
