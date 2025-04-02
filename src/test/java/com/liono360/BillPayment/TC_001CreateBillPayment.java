package com.liono360.BillPayment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ProductPage;

public class TC_001CreateBillPayment extends Baseclass{
	@Test
	public void createbillpayment() throws InterruptedException {
	//	redirectToCRM();
		waitUntilPageLoad();
		Thread.sleep(4000);
		ProductPage products = new ProductPage(driver);
		TryClick(products.clickInventory());
		logger.info("Clicked on inventory button");
		waitUntilPageLoad();
		TryClick(products.ClickPurchaseDropdown());
		logger.info("Clicked on Purchases Dropdown");
		
		TryClick(driver.findElement(By.xpath("//span[text()='Bill Payment']")));
		logger.info("Click bill payment create");
		waitUntilPageLoad();
		Thread.sleep(10000);
		TryClick(products.clickdrpNewBill());
		logger.info("Clicked new bill dropdown");
		waitUntilPageLoad();
		Thread.sleep(2000);
		TryClick(driver.findElement(By.xpath("//li[@aria-label='Pay bills']")));

		logger.info("Clicked pay bill");
		TryClick(driver.findElement(By.xpath("//p-dropdown[@placeholder='Select Vendor']//div//div[@aria-label='dropdown trigger']")));
		logger.info("click Select vendor");
		
		TryClick(driver.findElement(By.xpath("//input[@autocomplete='off']")));
		logger.info("click search on vendor");
		
		driver.findElement(By.xpath("//input[@autocomplete='off']")).sendKeys("IBM");
		logger.info(" fill data for vendor");
		TryClick(driver.findElement(By.xpath("//p-dropdownitem//li")));
		logger.info("click vendor data list");
		waitUntilPageLoad();
		Thread.sleep(500);
		driver.findElement(By.xpath("((//tbody)[2]//p-checkbox)[2]")).click();
		logger.info("click pay full due checkbox");
		
		   TryClick(products.clickSave());
		   logger.info("Clicked save List");
		   
	}

}
  