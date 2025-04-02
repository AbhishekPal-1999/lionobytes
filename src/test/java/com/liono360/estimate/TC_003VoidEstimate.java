package com.liono360.estimate;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.liono360.pageObject.EstimatePage;

public class TC_003VoidEstimate extends com.liono360.loginPage.Baseclass{
	@Test
	public void ViewEstimate() throws InterruptedException {
	//	redirectToCRM();

		EstimatePage Estimate = new EstimatePage(driver);
		TryClick(Estimate.clickInventory());

		logger.info("Clicked on inventory button");

		TryClick(Estimate.clickSales());
		logger.info("Clicked on sales to load the list");


		TryClick(Estimate.clickEstimate());
		logger.info("Click estimate");
		Estimate.waitUntilPageLoad();
		mouseActionRightClick(driver, Estimate.clickEstimateList());
		TryClick(Estimate.clickVoidOption());
		logger.info("Void estimate");
		
		TryClick(Estimate.clickYesToDelete());
		logger.info("Click yes ");
		Estimate.waitUntilPageLoad();
		
	}

}
