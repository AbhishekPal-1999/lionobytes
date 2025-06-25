package com.liono360.Product.NonInventoryitem;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ProductPage;

public class TC_001CreateProduct extends Baseclass{
	
	@Test
	public void CreateProductTest() throws InterruptedException, IOException {
		
	//	redirectToCRM();
		
		ProductPage products = new ProductPage(driver);
		TryClick(products.clickInventory());
		logger.info("Clicked on inventory button");
		products.	waitUntilPageLoad();
		
		TryClick(products.clickProduct());
		logger.info("Clicked on product to load the list");
		products.	waitUntilPageLoad();
		
		
		TryClick(products.ClickNonInventory());
		logger.info("clicked non inventory");
		
		waitUntilPageLoad();
		
		explWaitToClick(products.clickAddNewProduct());
		TryClick(products.clickAddNewProduct());
		logger.info("Clicked on add new non inventory item button");

		waitUntilPageLoad();

		products.setItemNo().sendKeys("nonInvItem" + randomnumber());

		String addedProduct = products.setItemNo().getDomProperty("value");

		logger.info("Added Non inventory item no.");

		TryClick(products.selectCategory());
		logger.info("click category");
		TryClick(products.clickdrpchoicecategory());

		TryClick(products.setManugacturerPartNo());
		logger.info("click manufacturer no");

		products.setManugacturerPartNo().sendKeys("890276" + randomnumber());
		logger.info("set manufacturer no");

		TryClick(products.clickNoninvendescription());
		logger.info("click non inventory description");
		products.clickNoninvendescription().sendKeys("Non inventory description " + randomstring() + randomnumber());

		Thread.sleep(2000);
		SelectDropdown(products.Unit_of_Measure(),6);
		logger.info("Unit of Measure is Selected");
		
		TryClick(products.clickBarcode());
		logger.info("click Barcode");
		products.clickBarcode().sendKeys("Product0789" + randomnumber());
		logger.info("fill barcode no");

		TryClick(products.clickprice());
		products.clickprice().clear();
		products.clickprice().sendKeys(randomnumber());

		logger.info("Selected non inventory item as taxable");
		
		TryClick(products.clickSave());
		logger.info("Clicked on save");

		waitUntilPageLoad();
		Thread.sleep(2000);

		products.setSearch().sendKeys(addedProduct);

		waitUntilPageLoad();
		Thread.sleep(2000);

		String listedProduct = products.listedProductIs().getText();

		System.out.println("Provided product name to create: " + addedProduct);
		System.out.println("Listed product name after create: " + listedProduct);

		if (addedProduct.equalsIgnoreCase(listedProduct)) {
			Assert.assertTrue(true);
			logger.info("Create product test passed");
		}

		else {
			Assert.assertTrue(false);
			logger.info("create product test failed");
		}
		
		products.setSearch().clear();
		 
	}
}
