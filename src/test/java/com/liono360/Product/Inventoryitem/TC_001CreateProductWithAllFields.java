package com.liono360.Product.Inventoryitem;


import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ProductPage;

public class TC_001CreateProductWithAllFields extends Baseclass {

	@Test
	public void CreateProductwithRequiredfieldTest() throws InterruptedException, IOException {


		waitUntilPageLoad();
		Thread.sleep(4000);
		ProductPage products = new ProductPage(driver);
		TryClick(products.clickInventory());
		logger.info("Clicked on inventory button");
		waitUntilPageLoad();
		TryClick(products.clickProduct());
		logger.info("Clicked on product to load the list");
		waitUntilPageLoad();
		Thread.sleep(5000);

		TryClick(products.clickAddNewProduct());
		logger.info("Clicked on add new product button");
		waitUntilPageLoad();

		products.setItemNo().sendKeys("item"+ randomnumber());

		String addedProduct = products.setItemNo().getDomProperty("value");

		logger.info("Added product item no.");

		SelectDropdown(products.clickcolor(),2);
		logger.info("click item color");

		TryClick(products.setManugacturerItemNo());
		logger.info("click manufacturer no");

		products.setManugacturerItemNo().sendKeys("890276"+randomnumber());
		logger.info("set manufacturer no");


		TryClick(products.selectCategory());
		logger.info("click category");
		TryClick(products.clickdrpchoicecategory());

		TryClick(products.setManugacturerItemNo());
		logger.info("click manufacturer no");


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


		TryClick(products.clicklength());

		products.clicklength().clear();
		logger.info("click length");
		//	Thread.sleep(1000);
		products.clicklength().sendKeys("19");
		logger.info("fill length");
		//Thread.sleep(1000);
		TryClick(products.clickWidth());
		//	Thread.sleep(1000);
		products.clickWidth().clear();
		logger.info("click width");
		//	Thread.sleep(1000);
		products.clickWidth().sendKeys("6");
		logger.info("fill width");
		//	Thread.sleep(1000);
		TryClick(products.clickHeight());
		//Thread.sleep(1000);
		products.clickHeight().clear();
		logger.info("click height");
		//	Thread.sleep(1000);
		products.clickHeight().sendKeys("17");
		logger.info("fill height");
		//Thread.sleep(1000);
		SelectDropdown(products.clickUnit(),1);
		logger.info("click unit");
		//	Thread.sleep(1000);

		TryClick(products.clickWeight());
		//	Thread.sleep(1000);
		products.clickWeight().clear();
		logger.info("click weight");
		//	Thread.sleep(1000);
		products.clickWeight().sendKeys("67");
		logger.info("fill weight");
		//	Thread.sleep(1000);
		SelectDropdown(products.clickUnit(),1);
		logger.info("click unit");
		//	Thread.sleep(1000);


		SelectDropdown(products.clickVendor(),1);
		logger.info("click vendor");
		//	Thread.sleep(1000);
		/*
		 * products.clickselectVendor().click(); logger.info("select vendor");
		 */
		//Thread.sleep(1000);

		TryClick(products.clickBrand());
		logger.info("click brand");
		//	Thread.sleep(1000);

		TryClick(products.clickselectVendor());
		logger.info("select Brand");
		//		Thread.sleep(1000);
		jsScroll(driver,products.selectCustomerTypeList());

		/*
		 * TryClick(products.clickmanufacturervendor());
		 * logger.info("select manufacturer vendor"); // Thread.sleep(1000);
		 * Tryciproducts.clickselectVendor().click(); logger.info("select vendor"); //
		 * Thread.sleep(1000);
		 */				
		TryClick(products.clickManufacturerCountry());

		logger.info("select manufacturer country");
		//	Thread.sleep(1000);
		TryClick(products.clickselectVendor());
		logger.info("selected manufacturer country vendor");
		//	Thread.sleep(1000);
		//	
		TryClick(products.clickWarranty());
		logger.info("click warranty");
		//	Thread.sleep(1000);
		TryClick(products.clickselectVendor());
		logger.info("selected warranty");
		//	Thread.sleep(2000);

		TryClick(products.clicksales());



		logger.info("click sales"); 
		TryClick(products.clickcost());
		products.clickcost().clear();
		products.clickcost().sendKeys("7"+randomnumber()); logger.info("fill cost");
		TryClick(products.clickSaleprizze());
		products.clickSaleprizze().clear();
		products.clickSaleprizze().sendKeys("7"+randomnumber()); logger.info("fill cost");

		TryClick(products.clickSelectClass());
		TryClick(products.clickdrpchoicecategory());
		logger.info("selected warranty");

		//	Thread.sleep(2000);
		TryClick(products.clickSave());

		//Thread.sleep(10000);
		logger.info("Clicked on save");
		waitUntilPageLoad();


		String listedProduct = products.listedProductIs().getText();



		System.out.println("Provided Lead name to create: "+addedProduct);
		System.out.println("Listed Lead name after create: "+listedProduct);
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
