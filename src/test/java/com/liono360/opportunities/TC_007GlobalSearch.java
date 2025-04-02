package com.liono360.opportunities;

import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.LoginPage;
import com.liono360.pageObject.OpportunitiesPage;

public class TC_007GlobalSearch extends Baseclass {

	@Test
	public void GlobalSearch() throws InterruptedException {
		
// LOGIN TO CRM===============================================================================================
		
	   // redirectToCRM();

		OpportunitiesPage opp=new OpportunitiesPage(driver);
		
		
		
		Thread.sleep(1000);
		TryClick(opp.clickOpportunity());
		logger.info("Clicked on opportunities");
		
		
		
		Thread.sleep(3000);
		opp.searchOpportunity().sendKeys("opportunity");
		logger.info("text passed to search");
		
		
		
	}
}
