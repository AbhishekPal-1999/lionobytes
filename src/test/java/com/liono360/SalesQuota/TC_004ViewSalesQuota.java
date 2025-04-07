package com.liono360.SalesQuota;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.SalesQuotaPage;

public class TC_004ViewSalesQuota extends Baseclass {

	
	@Test
	public void ViewSalesQuotaTest () throws InterruptedException {
		
        Actions action = new Actions(driver);
		
		SalesQuotaPage SQ =new SalesQuotaPage(driver);
		

		waitUntilPageLoad();
		TryClick(SQ.SalesQuotaModule());
		logger.info("Clicked on Sales Quota Module");
		
		
		
		SelectDropdown(SQ.AccountChannel(),1);
		logger.info("Select Account Channel For Sales Quota");
		
		
		
		TryClick(SQ.ClickOnSalesQuota());
		logger.info("Clicked on Sales Quota Details");
		
		
		TryClick(SQ.HumerbergIcon());
		logger.info("Clicked on Humerberg Icon");
		
		
		TryClick(SQ.Clickonview());
		logger.info("Clicked on View");
		
		
		
		Thread.sleep(1000);
		if(SQ.Verfiyviewsq().isDisplayed())
		{ 
			Assert.assertTrue(true);
			logger.info("View Sales Quota Case test passed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("View Sales Quota Case test failed");
		}
		
		
		
	}
	
	
}
