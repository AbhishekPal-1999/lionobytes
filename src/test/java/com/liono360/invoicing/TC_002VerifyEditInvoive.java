package com.liono360.invoicing;



import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.InvoicingPage;

public class TC_002VerifyEditInvoive extends Baseclass{


	@Test
	public void EditInvoicing() throws InterruptedException, IOException {
		//redirectToCRM();
		Actions action = new Actions(driver);
		InvoicingPage invoice=new InvoicingPage(driver);
		TryClick(invoice.clickInventory());

		logger.info("Clicked on inventory button");

		TryClick(invoice.clickSales());
		logger.info("Clicked on sales button");

		TryClick(invoice.clickInvoicing());
		logger.info("Click Invoice");
		invoice.waitUntilPageLoad();


		mouseActionRightClick(driver, invoice.clickInvoiceList());
		logger.info("rigt clicked on added sales");
	
		TryClick(invoice.clickEditInvoicing());
		logger.info("click on edit sales button");
		
		TryClick(invoice.setSearchAccount());
		logger.info("click search acc search ");
		invoice.waitUntilPageLoad();

		invoice.setSearchAccount().clear();
		logger.info("account name is clear ");
        
		invoice.setSearchAccount().sendKeys("SalesOrderUpdatedAccount");
	
		Actions action1 = new Actions(driver);
		Thread.sleep(2000);
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		action1.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(8000);
		/*
		 * TryClick(invoice.clickEditNewAcc()); logger.info("Click New  List");
		 */		
		TryClick(invoice.clickAddProductList());
		logger.info("Clicked on add new Product list");
		
		
		
		try {
			driver.findElement(By.xpath("(//tbody)[3]//tr[5]")).click();
			//Thread.sleep(1000);
			driver.findElement(By.xpath("(//tbody)[3]//tr[3]")).click();
			//Thread.sleep(1000);
		
			//Thread.sleep(1000);
				}
				catch(Exception e) {
				}
		  TryClick(invoice.clickAddBtn());
		   logger.info("Clicked added to product list");
	     TryClick(invoice.clickSubmit());
		logger.info("Clicked save List");
		
		/*
		 * if(invoice.showInvoice().isDisplayed()) { Assert.assertTrue(true);
		 * logger.info(" Invoice updated"); } else { Assert.assertTrue(false);
		 * captureScreen(driver, "UpdateInvoice");
		 * logger.info("Invoice  updated test failed"); }
		 */

	}
}

