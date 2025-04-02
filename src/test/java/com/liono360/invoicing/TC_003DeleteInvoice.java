package com.liono360.invoicing;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.InvoicingPage;

public class TC_003DeleteInvoice extends Baseclass {
	
	TC_001VerifyCreateInvoice cr=new TC_001VerifyCreateInvoice(); 
	@Test
	public void TC_004DeleteInvoicing() throws InterruptedException, IOException {
		
		//redirectToCRM();
		
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
		
			TryClick(invoice.clickDelete());
			logger.info("Deleted");
		
			TryClick(invoice.clickYes());
			logger.info("Clicked yes");
		
			
	}

}
