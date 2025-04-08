package com.liono360.Product.BundleItem;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ProductPage;

public class TC_001CreateBundle extends Baseclass {

	@Test
	public void createBundleTest() throws InterruptedException {

		ProductPage products = new ProductPage(driver);
		TryClick(products.clickInventory());
		logger.info("Clicked on inventory button");

		TryClick(products.clickProduct());
		logger.info("select dropdown product channel");
		waitUntilPageLoad();

		products.clickBundleItem().click();
		waitUntilPageLoad();
		logger.info("Click Bundle item to show list");

		TryClick(products.clickAddNewProduct());
		logger.info("Clicked on add new product button");
		waitUntilPageLoad();

		products.setBundleNo().sendKeys("Bundleitem" + randomnumber());
		String addedProduct = products.setBundleNo().getDomProperty("value");

		logger.info("Added Bunlde item no.");
		explWaitToClick(products.selectVariant());

		TryClick(products.selectVariant());
		logger.info("Click on variant");

		driver.findElement(By.xpath("(//li[@role='option'])[2]")).click();
		logger.info("Click on variant dropdown");

		TryClick(products.selectCategory());
		logger.info("click category");

		TryClick(products.clickdrpchoicecategory());
		logger.info("Click on dropsdown category");

		products.clickkititemdescription().sendKeys("Bundle item description " + randomstring() + randomnumber());
		logger.info("Added data description field");

		products.clickBarcode().sendKeys("Bundle789" + randomnumber());
		logger.info("fill barcode no");

		scrollIntoView(products.clickAddNewUOM());

		products.clickAddNewUOM().click();
		logger.info("clicked to add second Unit of measure");

		SelectDropdown(products.selectSecondUOMBundle(), 1);
		logger.info("Selected 2nd UOM");

		products.clickBarcode2().sendKeys("Bunlde239" + randomnumber());
		logger.info("fill barcode no for second Unit of measure");

		scrollIntoView(products.clickAddProductToKit());

		jsClick(driver, products.clickAddProductToKit());
		logger.info("Click Plus button for add new products for Bundle");
		waitUntilPageLoad();

		try {
			driver.findElement(By.xpath("((//table)[3]//tr[2])")).click();
			// Thread.sleep(1000);
			driver.findElement(By.xpath("((//table)[3]//tr[3])")).click();
			// Thread.sleep(1000);
			driver.findElement(By.xpath("((//table)[3]//tr[4])")).click();
			// Thread.sleep(1000);
			logger.info("Added Prodcut to Bundle ");
		} catch (Exception e) {

		}
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//div[@aria-label='dropdown trigger'])[6]")).click();
		logger.info("Click Dropdown Bundle different product add");

		TryClick(driver.findElement(By.xpath("//li[@aria-label='Service']")));
		logger.info("Click Dropdown bundle add service");

		try {
			driver.findElement(By.xpath("((//table)[3]//tr[2])")).click();
			// Thread.sleep(1000);
			driver.findElement(By.xpath("((//table)[3]//tr[3])")).click();

		} catch (Exception e) {

		}

		driver.findElement(By.xpath("(//div[@aria-label='dropdown trigger'])[6]")).click();
		logger.info("Click to select different product for bundle");

		TryClick(driver.findElement(By.xpath("//li[@aria-label='Non Inventory Item']")));
		logger.info("Click non inventory product type");

		try {
			driver.findElement(By.xpath("((//table)[3]//tr[2])")).click();
			driver.findElement(By.xpath("((//table)[3]//tr[3])")).click();

		} catch (Exception e) {

		}

		TryClick(products.clickAddOption());

		logger.info("Click Add button ");
		TryClick(products.clickSave());

		logger.info("Clicked on save");
		waitUntilPageLoad();
		Thread.sleep(2000);

		products.setSearch().sendKeys(addedProduct);
		String listedBundle = products.listedProductIs().getText();

		if (addedProduct.equalsIgnoreCase(listedBundle)) {
			Assert.assertTrue(true);
			logger.info("Create Bundle test passed");
		}

		else {
			Assert.assertTrue(false);
			logger.info("create Bundle test failed");
		}

		products.setSearch().clear();
		refreshWindow();

	}

}
