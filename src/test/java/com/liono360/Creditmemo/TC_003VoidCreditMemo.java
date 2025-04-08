package com.liono360.Creditmemo;

import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.CreditMemoPage;

public class TC_003VoidCreditMemo extends Baseclass {
	@Test
	public void ViewCreditMemo() throws InterruptedException {
	//	redirectToCRM();
		
	CreditMemoPage creditmemo = new CreditMemoPage(driver);
	TryClick(creditmemo.clickInventory());
	logger.info("Clicked on Inventory");

	TryClick(creditmemo.clickSales());
	logger.info("Clicked on sales to load the list");
	TryClick(creditmemo.clickCreditMemo());
	logger.info("Clicked on Credit memo");
	creditmemo.waitUntilPageLoad();
	mouseActionRightClick(driver, creditmemo.clickEstimateList());
	TryClick(creditmemo.clickVoidOption());
	logger.info("Void estimate");
	
	TryClick(creditmemo.clickSaveBtn1());
	logger.info("Click yes ");
	creditmemo.waitUntilPageLoad();
}
}