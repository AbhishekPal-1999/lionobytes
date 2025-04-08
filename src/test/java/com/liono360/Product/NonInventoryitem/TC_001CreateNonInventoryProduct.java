package com.liono360.Product.NonInventoryitem;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ProductPage;
import com.liono360.utility.RetryAnalyzer;

public class TC_001CreateNonInventoryProduct extends Baseclass {

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void CreateProductwithRequiredfieldTest() throws InterruptedException, IOException {

		waitUntilPageLoad();
		handleGeoLocation();
		
		ProductPage products = new ProductPage(driver);
		TryClick(products.clickInventory());
		logger.info("Clicked on inventory button");

		TryClick(products.clickProduct());
		logger.info("Clicked on product to load the list");

		explWaitToClick(products.clickNonInventoryItem());
		products.clickNonInventoryItem().click();
		logger.info("Clicked on non inventory item");

		waitUntilPageLoad();
		Thread.sleep(1000);

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

		TryClick(products.clickBarcode());
		logger.info("click Barcode");
		products.clickBarcode().sendKeys("Product789" + randomnumber());
		logger.info("fill barcode no");

		TryClick(products.clickprice());
		products.clickprice().clear();
		products.clickprice().sendKeys(randomnumber());

		jsScroll(driver, products.selectTaxableOption());
		products.selectTaxableOption().click();

		TryClick(products.selectYes());
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
		refreshWindow();

	}
}
