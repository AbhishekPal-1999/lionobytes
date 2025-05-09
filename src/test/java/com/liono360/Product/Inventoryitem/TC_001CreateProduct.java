package com.liono360.Product.Inventoryitem;


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
		ProductPage products = new ProductPage(driver);
		
		waitUntilPageLoad();
		Thread.sleep(10000);
		TryClick(products.clickInventory());
		logger.info("Clicked on inventory button");
		
		
		TryClick(products.clickProduct());
		logger.info("Clicked on product to load the list");
		
		
		TryClick(products.btnInventoryItems());
		logger.info("Clicked on inventory Item button");
		
		waitUntilPageLoad();
		Thread.sleep(2000);
		TryClick(products.clickAddNewProduct());
		logger.info("Clicked on add new product button");
		

		products.setItemNo().sendKeys("item No "+ randomnumber());

		String addedProduct = products.setItemNo().getAttribute("value");

		logger.info("Added product item no.");

		TryClick(products.setManugacturerItemNo());
		logger.info("click manufacturer no");

		products.setManugacturerItemNo().sendKeys("890276"+randomnumber());
		logger.info("set manufacturer no");


		TryClick(products.selectCategory());
		TryClick(products.clickdrpchoicecategory());
		logger.info("click category");
		

		SelectDropdown(products.selectVariant(),1);
		logger.info("select variant no");
	

		TryClick(products.clickUOM());
		logger.info("click UOM");

		
		TryClick(driver.findElement(By.xpath("(//li[@aria-label='Each'])")));
		logger.info("click UOM Each");
		TryClick(products.clickBarcode());
		logger.info("click Barcode");
		
		products.clickBarcode().sendKeys("Product789"+randomnumber());
		logger.info("fill barcode no");


		TryClick(products.clicklength());

		products.clicklength().clear();
		logger.info("click length");
		
		products.clicklength().sendKeys("19");
		logger.info("fill length");
	
		TryClick(products.clickWidth());
	
		products.clickWidth().clear();
		logger.info("click width");
	
		products.clickWidth().sendKeys("6");
		logger.info("fill width");
		
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
		
		Thread.sleep(1000);
		products.clickcost().clear();
		products.clickcost().sendKeys("50"); 
		logger.info("fill cost");
		
		Thread.sleep(1000);
		products.clickSaleprizze().clear();
		products.clickSaleprizze().sendKeys("50");
		logger.info("Sales Price");

		TryClick(products.click_Finance());
		logger.info("click Finance"); 
		
		TryClick(products.clickSelectClass());
		
		TryClick(products.clickdrpchoicecategory());
		logger.info("selected Class");
		
		TryClick(products.click_Location());
		logger.info("click Location"); 
		
//		products.AddQtyOnHand().sendKeys("30");
//		logger.info("Add QtyOnHand");

		Thread.sleep(2000);
		TryClick(products.clickSave());
		logger.info("Clicked on save");
		
		waitUntilPageLoad();
		Thread.sleep(2000);
// Assertions===========================================================================================================

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
