package com.liono360.Product.NonInventoryitem;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ProductPage;
import com.liono360.utility.RetryAnalyzer;

public class TC_002EditProduct extends Baseclass {

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void EditProductTest() throws InterruptedException, IOException {

		// redirectToCRM();

		ProductPage products = new ProductPage(driver);
		TryClick(products.clickInventory());
		logger.info("Clicked on inventory button");

		TryClick(products.clickProduct());
		logger.info("select dropdown product channel");
		waitUntilPageLoad();
		TryClick(products.ClickNonInventory());
		logger.info("clicked non inventory");

		waitUntilPageLoad();
		Thread.sleep(1000);

		mouseActionRightClick(driver, products.listedProductIs());
		TryClick(products.clickEditOption());

		logger.info("Clicked on edit button for the product");

		// Make the necessary changes to the product

		TryClick(products.setItemNo());
		products.setItemNo().clear();

		products.setItemNo().sendKeys("updatedItem" + randomnumber());
		logger.info("Updated product item no.");
		String updatedProduct = products.setItemNo().getDomProperty("value");

		jsScroll(driver, products.clickPurchasedProduct());

		products.clickPurchasedProduct().click();
		logger.info("Clicked on check box to select product as purchased item");

		products.setCostPrice().sendKeys(randomnumber());
		logger.info("Added the cost price of purchased non inventory item");

		products.clickSave().click();
		logger.info("Clicked on save button to save the changes");

		products.clickFinancialOfPreviousYear().click();
		logger.info("Selected to update financial entry of previous data");

		products.clickFinaceDataSave().click();
		logger.info("Clicked on save button on financial data update prompt");

		// Save the changes

		waitUntilPageLoad();
		Thread.sleep(2000);
		// Verify that the product was successfully updated

		products.setSearch().sendKeys(updatedProduct);

		String listedProduct = products.listedProductIs().getText();

		products.setSearch().sendKeys(updatedProduct);

		System.out.println("Provided Non inventory name to before edit: " + updatedProduct);
		System.out.println("Listed Non inventory name after edit: " + listedProduct);
		if (updatedProduct.equalsIgnoreCase(listedProduct)) {
			Assert.assertTrue(true);
			logger.info("Edit Non inventory test passed");
		}

		else {
			Assert.assertTrue(false);
			logger.info("Edit Non inventory test failed");
		}

		explWaitToClick(products.setSearch());

		products.setSearch().clear();
		refreshWindow();

	}
}
