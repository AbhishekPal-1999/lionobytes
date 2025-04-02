package com.liono360.purchaseOrder;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.PurchasePage;

public class TC_002EditPurchase extends Baseclass{
	@Test
	public void EditPurchase() throws InterruptedException {
		//redirectToCRM();
		waitUntilPageLoad();
		Thread.sleep(4000);
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
        
        mouseActionRightClick(driver, purchase.listedProductIs());
    	purchase.waitUntilPageLoad();
		
		TryClick(purchase.clickEditOption());
	    
	    logger.info("Clicked on edit button for the product");
	    
	    waitUntilPageLoad();
		purchase.waitUntilPageLoad();
	    TryClick(driver.findElement(By.xpath("//table[@role='table']//thead//tr//th//span//i")));
		//jsClick(driver,purchase.clickPlusaddproductkit());
		logger.info(" click plus button to add product ");
		Thread.sleep(3000);
		try {
			TryClick(driver.findElement(By.xpath("//p-table[@selectionmode='multiple']//tr")));
			TryClick(driver.findElement(By.xpath("//p-table[@selectionmode='multiple']//tr[4]")));
			TryClick(driver.findElement(By.xpath("//p-table[@selectionmode='multiple']//tr[5]")));
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
	    
	    

	}

}
