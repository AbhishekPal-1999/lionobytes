package com.liono360.Creditmemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.liono360.pageObject.CreditMemoPage;

public class TC_001CreateCreditMemo extends com.liono360.loginPage.Baseclass {

	@Test
	public void TC_001CreateCreditMemoTest() throws InterruptedException {
		//redirectToCRM();
		/* driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); */
		CreditMemoPage creditmemo = new CreditMemoPage(driver);
		TryClick(creditmemo.clickInventory());
		logger.info("Clicked on Inventory");

		TryClick(creditmemo.clickSales());
		logger.info("Clicked on sales to load the list");
		TryClick(creditmemo.clickCreditMemo());
		logger.info("Clicked on Credit memo");
		creditmemo.waitUntilPageLoad();
		TryClick(creditmemo.clickAddNewCreditmemo());
		logger.info("Clicked on add new credit memo");
		TryClick(creditmemo.setSearchAccount());
		creditmemo.setSearchAccount().sendKeys("SalesOrder Account");


		Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		action.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);

		TryClick(creditmemo.clickSalesRep());
		logger.info("Clicked on sales rep list");

		TryClick(creditmemo.clicksalesrepuser());
		logger.info("Clicked on sales rep list");

		TryClick(creditmemo.clickAddProductList());
		logger.info("Clicked on add new Product list");
		try {
			driver.findElement(By.xpath("(//tbody)[3]//tr[1]")).click();
			//Thread.sleep(1000);
			driver.findElement(By.xpath("(//tbody)[3]//tr[3]")).click();
			//Thread.sleep(1000);
			driver.findElement(By.xpath("(//tbody)[3]//tr[2]")).click();
			driver.findElement(By.xpath("(//tbody)[3]//tr[4]")).click();
			//Thread.sleep(1000);
		}
		catch(Exception e) {

		}




		TryClick(creditmemo.clickAddBtn());
		logger.info("Clicked added to product list");





		TryClick(creditmemo.clickSubmit());
		logger.info("Clicked save List");
		creditmemo.waitUntilPageLoad();
		TryClick(creditmemo.clickEstimateList());
		logger.info("Clicked Estimate List");
	}

}
