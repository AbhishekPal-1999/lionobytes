package com.liono360.BillPayment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ProductPage;

public class TC_003ViewBillPayment extends Baseclass {
	@Test
	public void ViewBillPayment() throws InterruptedException {
		//redirectToCRM();

		ProductPage products = new ProductPage(driver);
		TryClick(products.clickInventory());
		logger.info("Clicked on inventory button");
		waitUntilPageLoad();
		TryClick(products.ClickPurchaseDropdown());
		logger.info("Clicked on Purchases Dropdown");
		TryClick(driver.findElement(By.xpath("//span[text()='Bill Payment']")));
		logger.info("Click bill payment create");
		waitUntilPageLoad();
		Thread.sleep(6000);
		mouseActionRightClick(driver, products.listedProductIs());
		//String listedProductToView= products.listedLocationIs().getText();

	
		
		TryClick(products.clickViewOption());
		logger.info("Clicked on view button");
		
		driver.findElement(By.xpath("//span[normalize-space()='Cancel']")).click();
		logger.info("Clicked on cancel button");
		Thread.sleep(2000);
		
	}

}
