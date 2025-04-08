package com.liono360.Product.Inventoryitem;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ProductPage;
import com.liono360.utility.RetryAnalyzer;

public class TC_001CreateProduct extends Baseclass {

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void CreateProductwithRequiredfieldTest() throws InterruptedException, IOException {

		waitUntilPageLoad();
		ProductPage products = new ProductPage(driver);
		TryClick(products.clickInventory());
		logger.info("Clicked on inventory button");

		explWaitToClick(products.clickProduct());
		TryClick(products.clickProduct());
		logger.info("Clicked on product to load the list");

		explWaitToClick(products.clickInventoryItem());
		products.clickInventoryItem().click();
		logger.info("Clicked on inventory item");

		waitUntilPageLoad();
		explWaitToClick(products.clickAddNewProduct());
		TryClick(products.clickAddNewProduct());
		logger.info("Clicked on add new product button");

		waitUntilPageLoad();

		products.setItemNo().sendKeys("item" + randomnumber());
		String addedProduct = products.setItemNo().getDomProperty("value");
		logger.info("Added product item no.");

		SelectDropdown(products.clickcolor(), 2);
		logger.info("click item color");

		TryClick(products.selectVariant());
		logger.info("Clcked on variant dropdown");

		TryClick(products.clickdrpVarientchoice());
		logger.info("Added Product Variant");

		TryClick(products.selectCategory());
		logger.info("click category");
		TryClick(products.clickdrpchoicecategory());

		TryClick(products.clickBarcode());
		logger.info("click Barcode");
		// Thread.sleep(1000);
		products.clickBarcode().sendKeys(addedProduct + randomnumber());
		logger.info("fill barcode no");

		jsScroll(driver, products.clicklength());
		logger.info("Added scrolll to element");
		
		jsScroll(driver, products.clicklength());

		products.clicklength().clear();
		logger.info("click length");

		// Thread.sleep(1000);
		products.clicklength().sendKeys("19");
		logger.info("fill length");

		TryClick(products.clickWidth());
		// Thread.sleep(1000);
		products.clickWidth().clear();
		logger.info("click width");
		// Thread.sleep(1000);
		products.clickWidth().sendKeys("6");
		logger.info("fill width");
		// Thread.sleep(1000);

		TryClick(products.clickHeight());
		// Thread.sleep(1000);
		products.clickHeight().clear();
		logger.info("click height");
		// Thread.sleep(1000);
		products.clickHeight().sendKeys("17");
		logger.info("fill height");

		// Thread.sleep(1000);
		SelectDropdown(products.clickUnit(), 1);
		logger.info("click unit");
		// Thread.sleep(1000);

		TryClick(products.clickWeight());
		// Thread.sleep(1000);
		products.clickWeight().clear();
		logger.info("click weight");
		// Thread.sleep(1000);
		products.clickWeight().sendKeys("67");
		logger.info("fill weight");
		// Thread.sleep(1000);

		SelectDropdown(products.clickUnit(), 1);
		logger.info("click unit");
		// Thread.sleep(1000);

		SelectDropdown(products.clickVendor(), 1);
		logger.info("click vendor");

		TryClick(products.clickBrand());
		logger.info("click brand");
		

		TryClick(products.clickselectVendor());
		logger.info("select Brand");
	
		jsScroll(driver, products.selectCustomerTypeList());

		TryClick(products.clickManufacturerCountry());

		logger.info("select manufacturer country");
		
		TryClick(products.clickselectVendor());
		logger.info("selected manufacturer country vendor");
		
		TryClick(products.clickWarranty());
		logger.info("click warranty");
	
		TryClick(products.clickselectVendor());
		logger.info("selected warranty");

		TryClick(products.clicksales());

		logger.info("click sales");
		TryClick(products.clickcost());
		products.clickcost().clear();
		products.clickcost().sendKeys("7" + randomnumber());
		logger.info("fill cost price");
		TryClick(products.clickSaleprizze());
		products.clickSaleprizze().clear();
		products.clickSaleprizze().sendKeys("8" + randomnumber());
		logger.info("fill sales price");

		TryClick(products.clickSelectClass());
		TryClick(products.clickdrpchoicecategory());
		logger.info("selected warranty");

		TryClick(products.clickSave());

		logger.info("Clicked on save");
		waitUntilPageLoad();
		Thread.sleep(2000);
		
		
		explWaitToClick(products.setSearch());
		products.setSearch().sendKeys(addedProduct);
		waitUntilPageLoad();

		String listedProduct = products.listedProductIs().getText();

		System.out.println("Provided Product name to create: " + addedProduct);
		System.out.println("Listed Product name after create: " + listedProduct);
		if (addedProduct.equalsIgnoreCase(listedProduct)) {
			Assert.assertTrue(true);
			logger.info("Create product test passed");
		}

		else {
			Assert.assertTrue(false);
			logger.info("create product test failed");
		}
		products.setSearch().clear();
		driver.navigate().refresh();

	}
}
