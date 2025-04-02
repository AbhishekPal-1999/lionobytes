package com.liono360.estimate;

import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.EstimatePage;

public class TC_004DeleteEstimate extends Baseclass {


	@Test
	public void DeleteEstimate() throws InterruptedException {


		//redirectToCRM();
		EstimatePage Estimate = new EstimatePage(driver);
		TryClick(Estimate.clickInventory());

		logger.info("Clicked on inventory button");

		TryClick(Estimate.clickSales());
		logger.info("Clicked on sales to load the list");


		TryClick(Estimate.clickEstimate());
		logger.info("Click estimate");
		Estimate.waitUntilPageLoad();

		mouseActionRightClick(driver, Estimate.clickEstimateList());
		logger.info("rigt clicked on added sales");

		TryClick(Estimate.clickDelete());
		logger.info("Deleted");

		Estimate.clickYes().click();
		logger.info("Clicked yes");
		Estimate.waitUntilPageLoad();
	}
}
