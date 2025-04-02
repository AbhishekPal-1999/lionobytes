package com.liono360.salesOrder;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.pageObject.SalesPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class TC_001CreateSales extends com.liono360.loginPage.Baseclass {
	
	@Test

	public void CreateSales() throws InterruptedException, IOException {
		
		
  //  redirectToCRM();
		
		SalesPage sales = new SalesPage(driver);
		

		TryClick(sales.clickInventory());
		logger.info("Clicked on inventory button");
	
		
		TryClick(sales.clickSales());
		logger.info("Clicked on sales to load the list");
		waitUntilPageLoad();
		TryClick(sales.clickSalesOrder());
		logger.info("Clicked on SalesOrder");
		sales.waitUntilPageLoad();
		TryClick(sales.clickAddNewSales());
		logger.info("Clicked on add new sales button");
		
		
		sales.setSearchAccount().sendKeys("SalesOrder Account");
		Thread.sleep(4000);
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		action.sendKeys(Keys.ENTER).build().perform();
		
	

	      TryClick(sales.clickShippingTerm());
	      logger.info("Clicked on shipping list");
	     
		  TryClick(sales.clickshippingTermdropdown());
	   	 logger.info("Clicked on Prepaid");
		
			TryClick(sales.clickSalesRep());
			logger.info("Clicked on sales rep list");
			
			TryClick(sales.clicksalesrepuser());
			logger.info("Clicked on sales rep list");
		  
			TryClick(sales.clickAddProductList());
			logger.info("Clicked on add new Product list");
			
			
			
			try {
				driver.findElement(By.xpath("(//tbody)[3]//tr[1]")).click();
				//Thread.sleep(1000);
				driver.findElement(By.xpath("(//tbody)[3]//tr[3]")).click();
				//Thread.sleep(1000);
				/*
				 * driver.findElement(By.xpath("(//tbody)[3]//tr[2]")).click();
				 * driver.findElement(By.xpath("(//tbody)[3]//tr[4]")).click();
				 */
				//Thread.sleep(1000);
					}
					catch(Exception e) {
					  
					}
			
			
			
			 
			   TryClick(sales.clickAddBtn());
			   logger.info("Clicked added to product list");
			  
			 
			   TryClick(sales.clickSubmit());
			   logger.info("Clicked save List");
			   
			  
			  TryClick(sales.clickSalesList());
			  logger.info("Clicked sales List");
			  sales.waitUntilPageLoad();
			   
			   
			 
				 if(sales.showSalesOrderInvoice().isDisplayed())
					{
						Assert.assertTrue(true);
						logger.info("Sales order created");
					}
					else
					{
						Assert.assertTrue(false);
						captureScreen(driver, "addsalesorder");
						logger.info("Sales order  created test failed");
					}
				 
				
				 
	}
}
