package com.liono360.purchaseOrder;

import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.PurchasePage;

public class TC_003ViewPurchase extends Baseclass{
	@Test
	public void ViewPurchase() throws InterruptedException {
		
	//	redirectToCRM();
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
    	purchase.waitUntilPageLoad();
       
        
        mouseActionRightClick(driver, purchase.listedProductIs());
    	purchase.waitUntilPageLoad();
		
		TryClick(purchase.clickVoidOption());
		logger.info("Clicked on void button");
		TryClick(purchase.clickYesToDelete());
		logger.info("Clicked on Yes To button");
	}

}
