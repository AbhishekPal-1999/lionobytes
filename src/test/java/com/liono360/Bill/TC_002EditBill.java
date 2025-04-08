package com.liono360.Bill;

import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ProductPage;

public class TC_002EditBill extends Baseclass{
	@Test
	public void EditBill() throws InterruptedException {
	//	redirectToCRM();

		ProductPage products = new ProductPage(driver);
		TryClick(products.clickInventory());
		logger.info("Clicked on inventory button");
		waitUntilPageLoad();
		TryClick(products.ClickPurchaseDropdown());
		logger.info("Clicked on Purchases Dropdown");
		TryClick(products.ClickBill());
		logger.info("Clicked  Bill");
		products.waitUntilPageLoad();

		mouseActionRightClick(driver, products.listedProductIs());
		logger.info("Right click on bill");
		waitUntilPageLoad();
		TryClick(products.clickEditOption());
		logger.info("Click edit button");
		products.waitUntilPageLoad();
		products.clickSave().click();
		logger.info("Clicked on save button to save the changes");
		Thread.sleep(4000);

	}
}
