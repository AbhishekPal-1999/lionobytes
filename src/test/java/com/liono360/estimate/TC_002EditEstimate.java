package com.liono360.estimate;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.liono360.pageObject.EstimatePage;

public class TC_002EditEstimate extends com.liono360.loginPage.Baseclass{


	@Test

	public void EditEstimate() throws InterruptedException {
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
		logger.info("rigt clicked on added sales");

		TryClick(Estimate.clickEditEstimate());
		logger.info("click on edit sales button");

		TryClick(Estimate.setSearchAccount());
		logger.info("click search acc search ");


		Estimate.setSearchAccount().clear();
		logger.info("account name is clear ");


		Estimate.setSearchAccount().sendKeys("Automation Account");

		Actions action1 = new Actions(driver);
		Thread.sleep(2000);
		action1.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		TryClick(Estimate.clickEditNewAcc());
		logger.info("Click New  List");

		TryClick(Estimate.clickAddProductList());
		logger.info("Clicked on add new Product list");



		try {
			driver.findElement(By.xpath("(//tbody)[3]//tr[5]")).click();
			//Thread.sleep(1000);
			driver.findElement(By.xpath("(//tbody)[3]//tr[4]")).click();
			//Thread.sleep(1000);
			driver.findElement(By.xpath("(//tbody)[3]//tr[6]")).click();

			//Thread.sleep(1000);
		}
		catch(Exception e) {

		}



		TryClick(Estimate.clickAddBtn());
		logger.info("Clicked Added Product List");


		Estimate.clickSaveBtn1().click();
		logger.info("Saved info");
		Estimate.waitUntilPageLoad();

	}
}