package com.liono360.Bill;

import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ProductPage;

public class TC_003VoidBill extends Baseclass {
	@Test
	public void ViewBill() throws InterruptedException {
		//redirectToCRM();

		ProductPage products = new ProductPage(driver);
		TryClick(products.clickInventory());
		logger.info("Clicked on inventory button");
		waitUntilPageLoad();
		TryClick(products.ClickPurchaseDropdown());
		logger.info("Clicked on Purchases Dropdown");
		TryClick(products.ClickBill());
		logger.info("Clicked  Bill");
		waitUntilPageLoad();
		
		mouseActionRightClick(driver, products.listedProductIs());
		//String listedProductToView= products.listedLocationIs().getText();
	
		
		TryClick(products.clickVoidOption());
		logger.info("Clicked on void button");
		
		TryClick(products.clickYesToDelete());
		logger.info("Click yes ");
		waitUntilPageLoad();
		
	}

}
