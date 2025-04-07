package com.liono360.SalesQuota;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.SalesQuotaPage;

public class TC_005EditSalesQuota extends Baseclass {

	@Test
	public void EditSalesQuotaTest () throws InterruptedException {
		
		
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
			
			
			
			TryClick(SQ.Edit());
			logger.info("Clicked on Edit");
			
			
			TryClick(SQ.Next1());
			logger.info("Clicked on Next");
			
			TryClick(SQ.Next2());
			logger.info("Clicked on Next");
			
			
			TryClick(SQ.Save1());
			logger.info("Clicked on Save");
			
			
			
			Thread.sleep(1000);
			if (SQ.VerifyUpdatedsq().isDisplayed()) {
				logger.info("Sales Quota Updated Successfully");
			}else {
				logger.info("Sales Quota Not Updated Successfully");
			}
			
		
	}
	
	
}
