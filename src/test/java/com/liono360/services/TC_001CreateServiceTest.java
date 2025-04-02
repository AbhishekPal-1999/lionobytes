package com.liono360.services;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ServicePage;

public class TC_001CreateServiceTest extends Baseclass {

	@Test

	public void CreateServiceTest() throws InterruptedException, IOException {
		//redirectToCRM();

		ServicePage products = new ServicePage(driver);
		TryClick(products.clickInventory());
		logger.info("Clicked on inventory button");
		
		TryClick(products.clickProduct());
		logger.info("Clicked on product to load the list");
		

		TryClick(products.selectProduct());
				logger.info("Clicked on inventory dropdown");
				products.	waitUntilPageLoad();
	
		TryClick(products.clickService());
		logger.info("Clicked on services");
		products.	waitUntilPageLoad();
		TryClick(products.clickAddNewProduct());
		logger.info("Clicked on add new Service button");
		products.setItemNo().sendKeys("service" + randomnumber());

		String addedProduct = products.setItemNo().getAttribute("value");
		logger.info("Added Service item no.");
		TryClick(products.selectCategory());
		logger.info("click category");
		TryClick(products.clickdrpchoicecategory());
		logger.info("Select dropdown choice category");
		TryClick(products.clickUOM());
		logger.info("click UOM");

		//	Thread.sleep(1000);
		TryClick(driver.findElement(By.xpath("(//li[@aria-label='Each'])[1]")));
		logger.info("click UOM Each");
		TryClick(products.clickBarcode());
		logger.info("click Barcode");
		//	Thread.sleep(1000);
		products.clickBarcode().sendKeys("Product789"+randomnumber());
		logger.info("fill barcode no");

		TryClick(products.clickinputprize());
		logger.info("Click input prize");
		
		products.clickinputprize().clear();
		products.clickinputprize().sendKeys("4"+randomnumber());
		logger.info("fill input prize data");
		
		TryClick(products.clickSelectClass());
		TryClick(products.clickdrpchoicecategory());
		logger.info("Fill class ");
		
		TryClick(products.clickSave());
		logger.info("Clicked on save");
		products.	waitUntilPageLoad();

		String listedProduct = products.listedProductIs().getText();
		System.out.println("Provided Lead name to create: "+addedProduct);
		System.out.println("Listed Lead name after create: "+listedProduct);
		Thread.sleep(3000);
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
