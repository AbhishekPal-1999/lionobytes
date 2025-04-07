package com.liono360.SalesQuota;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.SalesQuotaPage;

public class TC_006DeleteSalesQuota extends Baseclass{

	
	@Test
	public void DeleteSalesQuotaTest() throws InterruptedException {
		
	
		 Actions action = new Actions(driver);
			
			SalesQuotaPage SQ =new SalesQuotaPage(driver);
			

			waitUntilPageLoad();
			waitUntilPageLoad();
			TryClick(SQ.SalesQuotaModule());
			logger.info("Clicked on Sales Quota Module");
			
			
			
			SelectDropdown(SQ.AccountChannel(),1);
			logger.info("Select Account Channel For Sales Quota");
			
			
			
			TryClick(SQ.ClickOnSalesQuota());
			logger.info("Clicked on Sales Quota Details");
			
			
			TryClick(SQ.HumerbergIcon());
			logger.info("Clicked on Humerberg Icon");
			
			
			TryClick(SQ.ClickOnDelete());
			logger.info("Clicked on Delete");
			
			
			TryClick(SQ.Yes());
			logger.info("Clicked on Yes");
			
			
			if (SQ.VerifyDelete().isDisplayed()) {
				logger.info("Sales Quota Deleted Successfully");
			}else {
				logger.info("Sales Quota Not Deleted Successfully");
			}
			
		
	}

}
