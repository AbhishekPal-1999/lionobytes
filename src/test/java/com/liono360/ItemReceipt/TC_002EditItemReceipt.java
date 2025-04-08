package com.liono360.ItemReceipt;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ItemReceiptPage;

public class TC_002EditItemReceipt extends Baseclass{
	@Test
	public void EditItemReceipt() throws InterruptedException {
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
	//	Thread.sleep(5000);
		mouseActionRightClick(driver, itemreceipt.clickEstimateList());
		logger.info("Right Click on Item receipt ");
		TryClick(itemreceipt.clickEditEstimate());
		itemreceipt.waitUntilPageLoad();
	

		
		itemreceipt.clickSaveBtn1().click();
		logger.info("Saved info");
		itemreceipt.waitUntilPageLoad();
	}
	
	

}
