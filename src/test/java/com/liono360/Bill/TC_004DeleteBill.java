package com.liono360.Bill;

import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ProductPage;

public class TC_004DeleteBill extends Baseclass{
	@Test
	public void DeleteBill() throws InterruptedException {
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
		waitUntilPageLoad();
		Thread.sleep(2000);
		mouseActionRightClick(driver, products.listedProductIs());
		//String listedProductToDelete= products.listedProductIs().getText();
		
		Thread.sleep(4000);
		TryClick(products.clickDeleteOption());
		
		logger.info("Clicked on delete button");
	
		TryClick(products.clickYesToDelete());
		
		logger.info("Clicked on confirm delete");
	}

}
