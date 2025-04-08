package com.liono360.Product.KitItem;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ProductPage;
import com.liono360.utility.RetryAnalyzer;

public class TC_002EditKitItem extends Baseclass {

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void EditKitItem() throws InterruptedException {

		waitUntilPageLoad();
		ProductPage products = new ProductPage(driver);
		TryClick(products.clickInventory());
		logger.info("Clicked on inventory button");
		TryClick(products.clickProduct());
		logger.info("Clicked on product to load the list");
		TryClick(products.ClickKitItem());
		waitUntilPageLoad();
		logger.info("Click Kit item to show list");

		waitUntilPageLoad();
		explWaitToClick(products.listedProductIs());
		Thread.sleep(1000);

		mouseActionRightClick(driver, products.listedProductIs());
		TryClick(products.clickEditOption());

		logger.info("Clicked on edit button for the product");

		waitUntilPageLoad();
		explWaitToClick(products.setItemNo());

		products.setItemNo().clear();

		products.setItemNo().sendKeys("updatedItem" + randomnumber());
		logger.info("Updated product item no.");

		String updatedKitItemNo = products.setItemNo().getDomProperty("value");
		
		scrollIntoView(products.clickAddProductToKit());
		explWaitToClick(products.clickAddProductToKit());
		jsClick(driver, products.clickAddProductToKit());
		logger.info("Click Plus button for add new products for Kit");

		TryClick(products.clickAddOption());

		logger.info("Click Add button ");

		TryClick(driver.findElement(By.xpath("(//span[text()='Finance'])[2]")));

		logger.info("Click Finance tab");

		TryClick(products.clickSave());

		logger.info("Clicked on save");
		waitUntilPageLoad();

		products.setSearch().sendKeys(updatedKitItemNo);
		String listedKit = products.listedProductIs().getText();

		if (updatedKitItemNo.equalsIgnoreCase(listedKit)) {
			Assert.assertTrue(true);
			logger.info("Edit Kit test passed");
		}

		else {
			Assert.assertTrue(false);
			logger.info("Edit Kit test failed");
		}

		products.setSearch().clear();
		refreshWindow();

	}

}
