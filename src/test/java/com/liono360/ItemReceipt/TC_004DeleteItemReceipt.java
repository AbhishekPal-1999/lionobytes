package com.liono360.ItemReceipt;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ItemReceiptPage;

public class TC_004DeleteItemReceipt extends Baseclass{
	@Test
	public void DeleteItemReceipt() throws InterruptedException {
//	redirectToCRM();
		
		Actions action = new Actions(driver);
		ItemReceiptPage itemreceipt = new ItemReceiptPage(driver);
		itemreceipt.waitUntilPageLoad();
		itemreceipt.waitUntilPageLoad();
		TryClick(itemreceipt.clickInventory());
		logger.info("Clicked on Inventory");
		TryClick(itemreceipt.clickPurchases());
		logger.info("Clicked on purchases ");
		TryClick(itemreceipt.clickItemReceipt());
		logger.info("Clicked on Item receipt ");
		itemreceipt.waitUntilPageLoad();
		itemreceipt.waitUntilPageLoad();
		mouseActionRightClick(driver, itemreceipt.clickEstimateList());
		logger.info("rigt clicked on added item receipt");
        
		TryClick(itemreceipt.clickDelete());
		logger.info("Deleted");

		itemreceipt.clickYes().click();
		logger.info("Clicked yes");
		itemreceipt.waitUntilPageLoad();
	}
	

}
