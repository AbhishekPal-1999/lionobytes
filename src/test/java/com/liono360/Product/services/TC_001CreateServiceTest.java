package com.liono360.Product.services;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ProductPage;
import com.liono360.utility.RetryAnalyzer;

public class TC_001CreateServiceTest extends Baseclass {

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void CreateServiceTest() throws InterruptedException, IOException {
		//redirectToCRM();

		ProductPage products = new ProductPage(driver);
		TryClick(products.clickInventory());
		logger.info("Clicked on inventory button");
		
		TryClick(products.clickProduct());
		logger.info("Clicked on product to load the list");

		TryClick(products.clickService());
		logger.info("Clicked on services");
		
		waitUntilPageLoad();
		
		TryClick(products.clickAddNewProduct());
		logger.info("Clicked on add new Service button");
		
		products.setItemNo().sendKeys("Service" + randomnumber());
		logger.info("Added Service item no.");
		String addedProduct = products.setItemNo().getDomProperty("value");
		
		TryClick(products.selectCategory());
		logger.info("click category");
		TryClick(products.clickdrpchoicecategory());
		logger.info("Selected category for Service");
		
//		TryClick(products.clickUOM());
//		logger.info("click UOM");

		//	Thread.sleep(1000);
//		TryClick(driver.findElement(By.xpath("(//li[@aria-label='Each'])[1]")));
//		logger.info("click UOM Each");
		TryClick(products.clickBarcode());
		logger.info("click Barcode");
		//	Thread.sleep(1000);
		products.clickBarcode().sendKeys("Service789"+randomnumber());
		logger.info("fill barcode no");

		products.clickinputprize().clear();
		products.clickinputprize().sendKeys("4"+randomnumber());
		logger.info("Added sales price data");
		
		scrollIntoView(products.selectTaxableOption());
		
		TryClick(products.selectTaxableOption());
		TryClick(products.selectYes());
		logger.info("Seleced Service ad Taxable");
		
		TryClick(products.clickSave());
		logger.info("Clicked on save");
		waitUntilPageLoad();
		Thread.sleep(1000);

		String listedProduct = products.listedProductIs().getText();
		System.out.println("Provided Service name to create: "+addedProduct);
		System.out.println("Listed Service name after create: "+listedProduct);
		
		if (addedProduct.equalsIgnoreCase(listedProduct)) {
			Assert.assertTrue(true);
			logger.info("Create product test passed");
		} 

		else {
			Assert.assertTrue(false);
			logger.info("create product test failed");
		}
		
		


	}

}
