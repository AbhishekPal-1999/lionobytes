package com.liono360.BillPayment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ProductPage;

public class TC_004VoidBillPayment extends Baseclass{
	@Test
	public void VoidBillPayment() throws InterruptedException {
	//	redirectToCRM();

		ProductPage products = new ProductPage(driver);
		TryClick(products.clickInventory());
		logger.info("Clicked on inventory button");
		waitUntilPageLoad();
		TryClick(products.ClickPurchaseDropdown());
		logger.info("Clicked on Purchases Dropdown");
		TryClick(driver.findElement(By.xpath("//span[text()='Bill Payment']")));
		logger.info("Click bill payment create");
		waitUntilPageLoad();
		Thread.sleep(8000);
		mouseActionRightClick(driver, products.listedProductIs());
		//String listedProductToView= products.listedLocationIs().getText();
	
		
		TryClick(products.clickVoidOption());
		logger.info("Clicked on void button");
		
		TryClick(products.clickYesToDelete());
		logger.info("Click yes ");
		waitUntilPageLoad();
	}

}
