package com.liono360.estimate;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.liono360.pageObject.EstimatePage;


public class TC_001CreateEstimate extends com.liono360.loginPage.Baseclass {

	@Test
	public void CreateEstimate() throws InterruptedException {
	//	redirectToCRM();
		/* driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); */
		EstimatePage Estimate = new EstimatePage(driver);
		TryClick(Estimate.clickInventory());
		
		logger.info("Clicked on inventory button");
		
		TryClick(Estimate.clickSales());
		logger.info("Clicked on sales to load the list");
		
		
		TryClick(Estimate.clickEstimate());
		logger.info("Click estimate");
		 Estimate.waitUntilPageLoad();
		TryClick(Estimate.clickAddNewEstimate());
		logger.info("Click Add new estimate");
		
		TryClick(Estimate.setSearchAccount());
		Estimate.setSearchAccount().sendKeys("SalesOrder Account");
	 

		Actions action = new Actions(driver);
		 Thread.sleep(2000);
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		action.sendKeys(Keys.ENTER).build().perform();
		 Thread.sleep(2000);
		 Estimate.waitUntilPageLoad();


	
	      TryClick(Estimate.clickShippingTerm());
	      logger.info("Clicked on shipping list");
	     
		  TryClick(Estimate.clickshippingTermdropdown());
	   	 logger.info("Clicked on Prepaid");
		
			TryClick(Estimate.clickSalesRep());
			logger.info("Clicked on sales rep list");
			Thread.sleep(500);
			TryClick(Estimate.clicksalesrepuser());
			logger.info("Clicked on sales rep list");
		  
			TryClick(Estimate.clickAddProductList());
			logger.info("Clicked on add new Product list");
			
			
			
			try {
				driver.findElement(By.xpath("(//tbody)[3]//tr[1]")).click();
				//Thread.sleep(1000);
				driver.findElement(By.xpath("(//tbody)[3]//tr[3]")).click();
				//Thread.sleep(1000);
				driver.findElement(By.xpath("(//tbody)[3]//tr[2]")).click();
				driver.findElement(By.xpath("(//tbody)[3]//tr[4]")).click();
				//Thread.sleep(1000);
					}
					catch(Exception e) {
					  
					}
			
			
			
			 
			   TryClick(Estimate.clickAddBtn());
			   logger.info("Clicked added to product list");
			  
			 

			
			
		TryClick(Estimate.clickSubmit());
		logger.info("Clicked save List");
		Estimate.waitUntilPageLoad();
		TryClick(Estimate.clickEstimateList());
		logger.info("Clicked Estimate List");
	

	}
}