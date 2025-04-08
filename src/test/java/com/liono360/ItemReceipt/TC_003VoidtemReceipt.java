package com.liono360.ItemReceipt;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ItemReceiptPage;

public class TC_003VoidtemReceipt extends Baseclass{
	@Test
	public void VioidItemReceipt() throws InterruptedException {
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
		itemreceipt.waitUntilPageLoad();
		Thread.sleep(5000);
		mouseActionRightClick(driver, itemreceipt.clickEstimateList());
		TryClick(itemreceipt.clickVoidOption());
		logger.info("Void estimate");
		
		TryClick(itemreceipt.clickYes());
		logger.info("Click yes ");
		itemreceipt.waitUntilPageLoad();
	}

}
