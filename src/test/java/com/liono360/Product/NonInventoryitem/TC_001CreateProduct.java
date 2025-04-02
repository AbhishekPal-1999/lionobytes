package com.liono360.Product.NonInventoryitem;


import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ProductPage;

public class TC_001CreateProduct extends Baseclass {

	@Test
	public void CreateProductwithRequiredfieldTest() throws InterruptedException, IOException {


		//redirectToCRM();
		waitUntilPageLoad();
		Thread.sleep(4000);
		ProductPage products = new ProductPage(driver);
		TryClick(products.clickInventory());
		logger.info("Clicked on inventory button");
		waitUntilPageLoad();
		TryClick(products.clickProduct());
		logger.info("Clicked on product to load the list");
		products.	waitUntilPageLoad();
	

		
		TryClick(products.selectProduct());
		logger.info("select dropdown product channel");
		products.	waitUntilPageLoad();
		TryClick(products.ClickNonInventory());
		logger.info("clicked non inventory");
		
		products.	waitUntilPageLoad();
		
		TryClick(products.clickAddNewProduct());
		logger.info("Clicked on add new product button");
		products.	waitUntilPageLoad();

		products.setItemNo().sendKeys("item"+ randomnumber());

		String addedProduct = products.setItemNo().getAttribute("value");

		logger.info("Added product item no.");
		TryClick(products.selectVariant());
		logger.info("select variant no");
		TryClick(products.clickdrpVarientchoice());
		logger.info("click varient");
		

		TryClick(products.selectCategory());
		logger.info("click category");
		TryClick(products.clickdrpchoicecategory());
		
		
		TryClick(products.setManugacturerPartNo());
		logger.info("click manufacturer no");

		products.setManugacturerPartNo().sendKeys("890276"+randomnumber());
		logger.info("set manufacturer no");


		TryClick(products.clickNoninvendescription());
		logger.info("click non inventory description");
		products.clickNoninvendescription().sendKeys("Non inventory description "+randomstring()+randomnumber());

		/*
		 * TryClick(products.setManugacturerItemNo());
		 * logger.info("click manufacturer no");
		 */

		//	Thread.sleep(1000);

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

       TryClick(products.clickprice());
      products.clickprice().clear();
      products.clickprice().sendKeys(randomnumber());
		

		TryClick(products.clickSelectClass());
		TryClick(products.clickdrpchoicecategory());
		logger.info("selected warranty");

		//	Thread.sleep(2000);
		TryClick(products.clickSave());

		//Thread.sleep(10000);
		logger.info("Clicked on save");
		products.	waitUntilPageLoad();
        Thread.sleep(4000);

		String listedProduct = products.listedProductIs().getText();



		System.out.println("Provided product name to create: "+addedProduct);
		System.out.println("Listed product name after create: "+listedProduct);
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
