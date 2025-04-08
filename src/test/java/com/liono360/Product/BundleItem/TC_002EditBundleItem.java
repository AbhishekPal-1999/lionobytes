package com.liono360.Product.BundleItem;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ProductPage;

public class TC_002EditBundleItem extends Baseclass {

	@Test
	public void editBundleTest() throws InterruptedException {

		ProductPage products = new ProductPage(driver);
		TryClick(products.clickInventory());
		logger.info("Clicked on inventory button");

		TryClick(products.clickProduct());
		logger.info("select dropdown product channel");
		waitUntilPageLoad();

		products.clickBundleItem().click();
		waitUntilPageLoad();
		logger.info("Click Bundle item to show list");

		waitUntilPageLoad();
		explWaitToClick(products.listedProductIs());
		Thread.sleep(1000);

		mouseActionRightClick(driver, products.listedProductIs());
		TryClick(products.clickEditOption());

		logger.info("Clicked on edit button for the product");

		waitUntilPageLoad();
		explWaitToClick(products.setBundleNo());

		products.setBundleNo().clear();

		products.setBundleNo().sendKeys("updatedItem" + randomnumber());
		logger.info("Updated product item no.");

		String updatedBundleItemNo = products.setBundleNo().getDomProperty("value");

		scrollIntoView(products.clickAddProductToKit());
		explWaitToClick(products.clickAddProductToKit());
		jsClick(driver, products.clickAddProductToKit());
		logger.info("Click Plus button for add new products for Bundle");

		TryClick(products.clickAddOption());

		logger.info("Click Add button ");
		
		scrollIntoView(products.clickAddProductToKit());

		jsClick(driver, products.clickAddProductToKit());
		logger.info("Click Plus button for add new products for Bundle");
		waitUntilPageLoad();

		try {
			driver.findElement(By.xpath("((//table)[3]//tr[2])")).click();
			logger.info("Removed one product");
		} catch (Exception e) {

		}
		
		TryClick(products.clickAddOption());

		logger.info("Click Add button ");

		TryClick(products.clickSave());

		logger.info("Clicked on save");
		waitUntilPageLoad();

		products.setSearch().sendKeys(updatedBundleItemNo);
		String listedBundle = products.listedProductIs().getText();

		if (updatedBundleItemNo.equalsIgnoreCase(listedBundle)) {
			Assert.assertTrue(true);
			logger.info("Edit Bundle test passed");
		}

		else {
			Assert.assertTrue(false);
			logger.info("Edit Bundle test failed");
		}

		products.setSearch().clear();
		refreshWindow();

	}

}
