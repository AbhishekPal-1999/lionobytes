package com.liono360.salesOrder;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.SalesPage;

public class TC_004ViewSales extends Baseclass{
	
	@Test
	public void ViewSalesTest() throws InterruptedException, IOException{
		
	
	//redirectToCRM();
	
	SalesPage sales = new SalesPage(driver);
	TryClick(sales.clickInventory());
	logger.info("Clicked on inventory button");
	
	TryClick(sales.clickSales());
	logger.info("Clicked on sales to load the list");
	
	TryClick(sales.clickSalesOrder());
	logger.info("Clicked on SalesOrder");
	sales.waitUntilPageLoad();
	mouseActionRightClick(driver, sales.clickSalesList());
	logger.info("rigt clicked on sales");

	
	  sales.clickViewEditOption().click(); logger.info("clicked on view  ");
	
	  waitUntilPageLoad();
	  
	  if(sales.ViewSales().isDisplayed()) {
	  Assert.assertTrue(true); logger.info("View sales test passed"); } else {
	  Assert.assertTrue(false); captureScreen(driver, "viewSales");
	  logger.info("view sales test failed"); } 
	  sales.ClickCancel().click(); logger.info("clicked cancel ");
	  
	 
	
}
	
	
	
}
