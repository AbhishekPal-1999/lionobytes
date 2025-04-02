package com.liono360.salesOrder;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.pageObject.LoginPage;
import com.liono360.pageObject.SalesPage;

public class TC_002EditSales extends com.liono360.loginPage.Baseclass {
	
   @Test
	public void EditSalesTest() throws InterruptedException, IOException
	{
	 //  redirectToCRM();
		 Actions action3 = new Actions(driver);
			SalesPage sales = new SalesPage(driver);
			TryClick(sales.clickInventory());
			logger.info("Clicked on inventory button");
			
			TryClick(sales.clickSales());
			logger.info("Clicked on sales to load the list");
			TryClick(sales.clickSalesOrder());
			logger.info("Clicked on SalesOrder");
		sales.waitUntilPageLoad();
			mouseActionRightClick(driver, sales.clickSalesList());
			logger.info("rigt clicked on added sales");
		
			TryClick(sales.clickEditsales());
			logger.info("click on edit sales button");
			waitUntilPageLoad();
			

		    sales.setSearchAccount().click();
		    logger.info("account name is click ");
			sales.setSearchAccount().clear();
			logger.info("account name is clear ");
			
			  
				sales.setSearchAccount().sendKeys("Automation Account");
				Thread.sleep(2000);
				Actions action1 = new Actions(driver);
				action1.sendKeys(Keys.ARROW_DOWN).build().perform();
				action1.sendKeys(Keys.ENTER).build().perform();
			
				TryClick(sales.clickAddProductList());
				logger.info("Clicked on add new Product list");
				 
					/*
					 * Thread.sleep(7000); sales.clickSelectAddress().click();
					 * logger.info("Click select List");
					 */
		  
		  
					
					try {
						
						driver.findElement(By.xpath("//th[text()=' Item No. ']//parent::tr//parent::thead//following-sibling::tbody//tr[4]")).click();
						driver.findElement(By.xpath("//th[text()=' Item No. ']//parent::tr//parent::thead//following-sibling::tbody//tr[5]")).click();
						//Thread.sleep(1000);
							}
							catch(Exception e) {
							  
							}
			
				 
				TryClick( sales.clickAddBtn());
				 logger.info("Clicked Added Product List");
				
				 
				 TryClick(sales.clickSaveBtn1());
				 logger.info("Saved info");
				
				   	
				TryClick( sales.clickSalesList());
				  logger.info("Clicked sales List");
				
					/*
					 * explWaitToClick(sales.showSalesOrderInvoice());
					 * 
					 * 
					 * 
					 * 
					 * if(sales.showSalesOrderInvoice().isDisplayed()) { Assert.assertTrue(true);
					 * logger.info("Sales order updated"); } else { Assert.assertTrue(false);
					 * captureScreen(driver, "EditInvoice");
					 * logger.info("Sales order updated test failed"); }
					 * 
					 */
				 
}
}