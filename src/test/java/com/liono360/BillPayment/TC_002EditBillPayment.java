package com.liono360.BillPayment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ProductPage;

public class TC_002EditBillPayment extends Baseclass{
	@Test
	public void EDitBillPayment() throws InterruptedException {
		//redirectToCRM();
		ProductPage products = new ProductPage(driver);
		TryClick(products.clickInventory());
		logger.info("Clicked on inventory button");
		waitUntilPageLoad();
		TryClick(products.ClickPurchaseDropdown());
		logger.info("Clicked on Purchases Dropdown");
		TryClick(driver.findElement(By.xpath("//span[text()='Bill Payment']")));
		logger.info("Click bill payment create");
		waitUntilPageLoad();
		Thread.sleep(5000);

		mouseActionRightClick(driver, products.listedProductIs());
		waitUntilPageLoad();
		TryClick(products.clickEditOption());
		logger.info("Clicked on Edit Button");
		//TryClick(driver.findElement(By.xpath("//p-dropdown[@placeholder='Select Payment Term']//div//div[@aria-label='dropdown trigger']")));
		logger.info("Clicked on select payment term");
	    SelectDropdown(products.clickselectVendor1(), 1);
		products.clickSave().click();
		logger.info("Clicked on save button to save the changes");
		Thread.sleep(4000);
		
	}

}
