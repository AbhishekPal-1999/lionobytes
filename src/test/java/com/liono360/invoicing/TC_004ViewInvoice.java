package com.liono360.invoicing;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.InvoicingPage;

public class TC_004ViewInvoice extends Baseclass {
	@Test
	public void ViewInvoicing() throws InterruptedException {
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
		
		TryClick(invoice.clickViewInvoicing());
		logger.info("click on viewed");
		invoice.waitUntilPageLoad();
		invoice.clickCancel().click();
		logger.info("clicked on cancel");
		
			
}
}
