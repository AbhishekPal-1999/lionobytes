package com.liono360.purchaseOrder;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ProductPage;
import com.liono360.pageObject.PurchasePage;

public class TC_001CreatePurchase extends Baseclass {
	@Test
	public void CreatePurchase() throws InterruptedException {
		
		Actions action = new Actions(driver);

		//redirectToCRM();
		waitUntilPageLoad();
		Thread.sleep(5000);
		PurchasePage purchase = new PurchasePage(driver);
		TryClick(purchase.clickInventory());
		logger.info("Clicked on inventory button");
		purchase.waitUntilPageLoad();
		TryClick(purchase.clickPurchases());
		logger.info("Clicked on purchases ");
	
        TryClick(purchase.clickPurchaseOrder());
        logger.info("Clicked on purchase order ");
        waitUntilPageLoad();
    	purchase.waitUntilPageLoad();
		TryClick(purchase.clickAddNewPurchase());
		logger.info("Clicked on add new purchases ");
		

		TryClick(purchase.clickSelectVendor());
		logger.info("Clicked on select vendor");
	
		driver.findElement(By.xpath("//input[@aria-activedescendant='p-highlighted-option']")).click();
		logger.info("Clicked on select vendor data");
		
		driver.findElement(By.xpath("//input[@aria-activedescendant='p-highlighted-option']")).sendKeys("IBM");
		logger.info("click on IBM ");
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		action.sendKeys(Keys.ENTER).build().perform();
		purchase.waitUntilPageLoad();
		driver.findElement(By.xpath("//div[@role='dialog']//div//form//div//div//div//div//div//h6//span//i")).click();
		logger.info("click on shipping button");
		purchase.waitUntilPageLoad();
		driver.findElement(By.xpath("//body/div/div/ul/li[1]")).click();
		logger.info("Clicked on shipping address");
		purchase.waitUntilPageLoad();

		/* TryClick(purchase.clickBarcodeItemNo()); */
		
		/*
		 * purchase.clickBarcodeItemNo().sendKeys("SalesOrderProduct");
		 * action.sendKeys(Keys.ENTER).build().perform();
		 */
         TryClick(driver.findElement(By.xpath("//table[@role='table']//thead//tr//th//span//i")));
		//jsClick(driver,purchase.clickPlusaddproductkit());
		logger.info(" click plus button to add product ");
		Thread.sleep(3000);
		try {
			TryClick(driver.findElement(By.xpath("//p-table[@selectionmode='multiple']//tr")));
			TryClick(driver.findElement(By.xpath("//p-table[@selectionmode='multiple']//tr[2]")));
			TryClick(driver.findElement(By.xpath("//p-table[@selectionmode='multiple']//tr[3]")));
			//Thread.sleep(1000);
		//	driver.findElement(By.xpath("((//tbody)[4]//tr)[2]")).click();
			//Thread.sleep(1000);
			//driver.findElement(By.xpath("((//tbody)[4]//tr)[3]")).click();
			//Thread.sleep(1000);
				}
				catch(Exception e) {
				  
				}
			
		
		 TryClick(purchase.clickAddOption());
		   logger.info("Clicked added to product list");
		
		logger.info("Clicked on sales order product");
		TryClick(purchase.clickSubmit());
		logger.info("Clicked save List");
	
		/*
		 * TryClick(purchase.clickpurchaseList()); logger.info("Clicked  List");
		 * 
		 * 
		 * TryClick(purchase.clickIssued()); logger.info("Clicked  issued");
		 * 
		 * TryClick(purchase.clickSubmit()); logger.info("Clicked save List");
		 * 
		 * 
		 * TryClick(purchase.clickReceiveInventory());
		 * logger.info("Clicked receive inventory");
		 * 
		 * driver.findElement(By.xpath("(//p-checkbox)[2]")).click();
		 * 
		 * TryClick(purchase.clickSubmit()); logger.info("Clicked save List");
		 * 
		 * 
		 * TryClick(purchase.clickdrpPurchaseOrder());
		 * 
		 * logger.info("Clicked Purchase order List");
		 * 
		 * 
		 * TryClick(purchase.clickBill()); logger.info("Click bill");
		 * 
		 * 
		 * mouseActionRightClick(driver,purchase.clickpurchaseList());
		 * logger.info("Clicked  bill "); Thread.sleep(2000);
		 * 
		 * TryClick(purchase.clickPayBill()); logger.info("Clicked pay bill "); //
		 * Thread.sleep(2000);
		 * 
		 * driver.findElement(By.xpath("(//td)[29]")).click();
		 * purchase.clickSubmit().click(); logger.info("Clicked save List");
		 * Thread.sleep(1000);
		 */

	}

}
