package com.liono360.Creditmemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.CreditMemoPage;

public class TC_002EditCreditMemo extends Baseclass{
	@Test
	public void EditCreditMemo() throws InterruptedException {
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
		TryClick(creditmemo.clickEditEstimate());
		logger.info("Clicked on Edit Credit memo");
		creditmemo.waitUntilPageLoad();
		creditmemo.setSearchAccount().clear();
		logger.info("account name is clear ");


		creditmemo.setSearchAccount().sendKeys("Automation Account");

		Actions action1 = new Actions(driver);
		Thread.sleep(2000);
		action1.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		TryClick(creditmemo.clickEditNewAcc());
		logger.info("Click New  List");
		TryClick(creditmemo.clickAddProductList());
		logger.info("Clicked on add new Product list");



		try {
			
			driver.findElement(By.xpath("//th[text()=' Item No. ']//parent::tr//parent::thead//following-sibling::tbody//tr[4]")).click();
			driver.findElement(By.xpath("//th[text()=' Item No. ']//parent::tr//parent::thead//following-sibling::tbody//tr[5]")).click();
			//Thread.sleep(1000);
				}
				catch(Exception e) {
				  
				}
	



		TryClick(creditmemo.clickAddBtn());
		logger.info("Clicked Added Product List");


		creditmemo.clickSaveBtn1().click();
		logger.info("Saved info");
		creditmemo.waitUntilPageLoad();

	}
}
