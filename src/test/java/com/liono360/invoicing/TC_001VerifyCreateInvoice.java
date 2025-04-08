package com.liono360.invoicing;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.InvoicingPage;

public class TC_001VerifyCreateInvoice extends Baseclass {
	@Test
	public void VerifyCreateInvoice() throws InterruptedException, IOException {
		// redirectToCRM();
		Actions action = new Actions(driver);
		InvoicingPage invoice = new InvoicingPage(driver);
		TryClick(invoice.clickInventory());

		logger.info("Clicked on inventory button");

		TryClick(invoice.clickSales());
		logger.info("Clicked on sales button");

		TryClick(invoice.clickInvoicing());
		logger.info("Click Invoice");
		invoice.waitUntilPageLoad();

		TryClick(invoice.clickAddNewInvoicing());
		logger.info("Add new Invoice");

		TryClick(invoice.clickAdd2());
		invoice.waitUntilPageLoad();
		TryClick(invoice.setSearchAccount());
		invoice.setSearchAccount().sendKeys("SalesOrder Account");

		Thread.sleep(7000);
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		action.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);

		/*
		 * invoice.clickselectAdd().click(); Thread.sleep(10000);
		 */
		TryClick(invoice.clickShippingTerm());
		logger.info("Clicked on shipping list");

		TryClick(invoice.clickshippingtermoption());
		logger.info("Clicked on option list");

		TryClick(invoice.clickSalesRep());
		logger.info("Clicked on sales rep list");

		TryClick(invoice.clickshippingtermoption());
		logger.info("Clicked on option list");

		TryClick(invoice.clickAddProductList());
		logger.info("Clicked on add new Product list");

		try {
			driver.findElement(By.xpath("(//tbody)[3]//tr[1]")).click();
			// Thread.sleep(1000);
			driver.findElement(By.xpath("(//tbody)[3]//tr[3]")).click();
			// Thread.sleep(1000);
			driver.findElement(By.xpath("(//tbody)[3]//tr[2]")).click();
			driver.findElement(By.xpath("(//tbody)[3]//tr[4]")).click();
			// Thread.sleep(1000);
		} catch (Exception e) {
		}
		TryClick(invoice.clickAddBtn());
		logger.info("Clicked added to product list");

		logger.info("Clicked on sales order product");
		TryClick(invoice.clickSubmit());
		logger.info("Clicked save List");

		TryClick(invoice.clickInvoiceList());
		logger.info("Clicked  List");

		if (invoice.showInvoice().isDisplayed()) {
			Assert.assertTrue(true);
			logger.info(" Invoice created");
		} else {
			Assert.assertTrue(false);
			captureScreen(driver, "addInvoice");
			logger.info("Invoice  created test failed");
		}

	}
}
