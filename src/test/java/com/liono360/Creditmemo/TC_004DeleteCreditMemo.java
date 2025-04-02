package com.liono360.Creditmemo;

import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.CreditMemoPage;

public class TC_004DeleteCreditMemo extends Baseclass{
	@Test
	public void DeleteCreditMemo() throws InterruptedException {
	//	redirectToCRM();
		/* driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); */
		CreditMemoPage creditmemo = new CreditMemoPage(driver);
		TryClick(creditmemo.clickInventory());
		logger.info("Clicked on Inventory");

		TryClick(creditmemo.clickSales());
		logger.info("Clicked on sales to load the list");
		TryClick(creditmemo.clickCreditMemo());
		logger.info("Clicked on Credit memo");
		creditmemo.waitUntilPageLoad();
		
		mouseActionRightClick(driver, creditmemo.clickEstimateList());
		logger.info("rigt clicked on added sales");

		TryClick(creditmemo.clickDelete());
		logger.info("Deleted");

		creditmemo.clickYes().click();
		logger.info("Clicked yes");
		creditmemo.waitUntilPageLoad();
	}

}
