package com.liono360.ItemReceipt;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ItemReceiptPage;

public class TC_001CreateItemReceipt extends Baseclass{
	@Test
	public void CreateItemReceipt() throws InterruptedException {
		//redirectToCRM();

		Actions action = new Actions(driver);
		ItemReceiptPage itemreceipt = new ItemReceiptPage(driver);
		itemreceipt.waitUntilPageLoad();
		TryClick(itemreceipt.clickInventory());
		logger.info("Clicked on Inventory");
		TryClick(itemreceipt.clickPurchases());
		logger.info("Clicked on purchases ");
		TryClick(itemreceipt.clickItemReceipt());
		logger.info("Clicked on Item receipt ");
		itemreceipt.waitUntilPageLoad();
		Thread.sleep(5000);
		TryClick(itemreceipt.clickAddNewItemReceipt());
		logger.info("Clicked on add new Item receipt ");
		TryClick(itemreceipt.clickSelectVendor());
		logger.info("Clicked on select vendor");

		TryClick(driver.findElement(By.xpath("//input[@aria-activedescendant='p-highlighted-option']")));
		logger.info("Clicked on select vendor data");

		driver.findElement(By.xpath("//input[@aria-activedescendant='p-highlighted-option']")).sendKeys("IBM");
		logger.info("click on IBM ");
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		action.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//tbody)[3]//tr[1]")).click();
	//	driver.findElement(By.xpath("(//tbody)[3]//tr[2]")).click();
		TryClick(itemreceipt.clickAddBtn());
		logger.info("Clicked added to product list");

		TryClick(driver.findElement(By.xpath("//div[@role='dialog']//div//form//div//div//div//div//div//h6//span//i")));
		logger.info("click shipping button");
		itemreceipt.waitUntilPageLoad();
		TryClick(itemreceipt.drpshippingbtn());
		logger.info(" click shipping address dropdown btn");
		/*
		 * TryClick(itemreceipt.clickSalesRep());
		 * logger.info("Clicked on sales rep list");
		 * 
		 * TryClick(itemreceipt.clicksalesrepuser());
		 * logger.info("Clicked on sales rep list");
		 */
		/*
		 * TryClick(itemreceipt.clickAddProductList());
		 * logger.info("Clicked on add new Product list"); Thread.sleep(1000); try {
		 * driver.findElement(By.xpath("(//tbody)[3]//tr[1]")).click();
		 * //Thread.sleep(1000);
		 * 
		 * } catch(Exception e) {
		 * 
		 * }
		 * 
		 * 
		 * 
		 * 
		 * TryClick(itemreceipt.clickAddBtn());
		 * logger.info("Clicked added to product list");
		 */
		driver.findElement(By.xpath("//th[12]//p-checkbox[1]//div[1]//div[2]")).click();
		logger.info("Clicked On RIF");
		TryClick(itemreceipt.clickSubmit());
		logger.info("Clicked save List");
		itemreceipt.waitUntilPageLoad();

	}

}
