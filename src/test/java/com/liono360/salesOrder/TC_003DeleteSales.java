package com.liono360.salesOrder;

import java.io.IOException;

import org.testng.annotations.Test;

import com.liono360.pageObject.SalesPage;

public class TC_003DeleteSales extends com.liono360.loginPage.Baseclass{
	@Test
	public void DeleteSalestest() throws InterruptedException, IOException {
	//redirectToCRM();
	
	SalesPage sales = new SalesPage(driver);
	TryClick(sales.clickInventory());
	logger.info("Clicked on inventory button");
	
	TryClick(sales.clickSales());
	logger.info("Clicked on sales to load the list");
	TryClick(sales.clickSalesOrder());
	logger.info("Clicked on salesorder");
	sales.waitUntilPageLoad();
	mouseActionRightClick(driver, sales.clickSalesList());
	logger.info("rigt clicked on added sales");
     

	
	   TryClick(sales.clickDelete());
	  logger.info("Clicked on delete button");
	  waitUntilPageLoad();
		  TryClick(sales.acceptDeleteSales()); 
	  logger.info("Clicked on confirm delete");
	 
	

		

	}
}