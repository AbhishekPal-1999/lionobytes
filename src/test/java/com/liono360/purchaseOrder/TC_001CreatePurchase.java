package com.liono360.purchaseOrder;

import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.PurchasePage;

public class TC_001CreatePurchase extends Baseclass {
	@Test
	public void CreatePurchase() throws InterruptedException {

		Actions action = new Actions(driver);

		// redirectToCRM();
		waitUntilPageLoad();
		Thread.sleep(2000);
		PurchasePage purchase = new PurchasePage(driver);
		TryClick(purchase.clickInventory());
		logger.info("Clicked on inventory button");
		waitUntilPageLoad();

		TryClick(purchase.clickPurchases());
		logger.info("Clicked on purchases ");

		TryClick(purchase.clickPurchaseOrder());
		logger.info("Clicked on purchase order ");
		waitUntilPageLoad();
		
		String beforeAddingPO = purchase.listedPurchaseOrder().getText();

		TryClick(purchase.clickAddNewPurchase());
		logger.info("Clicked on add new purchases ");

		SelectDropdown(purchase.clickSelectVendor(),1);
		logger.info("Clicked on select vendor address");

		jsClick(driver,driver.findElement(By.xpath("(//tr[@class='p-element p-selectable-row ng-star-inserted'])[16]")));
		logger.info("Clicked on select vendor data");

//		driver.findElement(By.xpath("//input[@aria-activedescendant='p-highlighted-option']")).sendKeys("IBM");
//		logger.info("click on IBM ");
//		action.sendKeys(Keys.ARROW_DOWN).build().perform();
//		action.sendKeys(Keys.ENTER).build().perform();
//		waitUntilPageLoad();
//		driver.findElement(By.xpath("//div[@role='dialog']//div//form//div//div//div//div//div//h6//span//i")).click();
//		logger.info("click on shipping button");
//		waitUntilPageLoad();
//		driver.findElement(By.xpath("//body/div/div/ul/li[1]")).click();
//		logger.info("Clicked on shipping address");
//		waitUntilPageLoad();

		
		jsClick(driver,purchase.clickPlusaddproductkit());
		logger.info(" click plus button to add product ");
		Thread.sleep(2000);
		try {
			TryClick(driver.findElement(By.xpath("//p-table[@selectionmode='multiple']//tr")));
			TryClick(driver.findElement(By.xpath("//p-table[@selectionmode='multiple']//tr[2]")));
			TryClick(driver.findElement(By.xpath("//p-table[@selectionmode='multiple']//tr[3]")));

		} catch (Exception e) {

		}

		TryClick(purchase.clickAddOption());
		logger.info("Clicked on add product list to PO");

	
		TryClick(purchase.clickSubmit());
		logger.info("Clicked save List");
		
		waitUntilPageLoad();
		Thread.sleep(1000);
		
		String afterAddingPO = purchase.listedPurchaseOrder().getText();
		
		
		if (beforeAddingPO.equalsIgnoreCase(afterAddingPO)) {
			Assert.assertFalse(true);
			logger.info("Create purchase order test passed");
		} 

		else {
			Assert.assertTrue(true);
			logger.info("create purchase order test failed");
		}


	}

}
