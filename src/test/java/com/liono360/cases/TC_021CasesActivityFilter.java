package com.liono360.cases;

import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.CasesPage;

public class TC_021CasesActivityFilter extends Baseclass {

	@Test
	public void TC_021CasesActivityFilter() throws InterruptedException {
		CasesPage cases = new CasesPage(driver);
		
		
		waitUntilPageLoad();
		TryClick(cases.clickCases());
		logger.info("Clicked on Cases ");

		TryClick(cases.addedCase());
		logger.info("Clicked on created Cases");
		
		
		
		
		TryClick(cases.ActivityTab());
		logger.info("Clicked on Activity Tab");	
			
		
		TryClick(cases.TabFilter());
		logger.info("Clicked on Filter");
		
		
		
		TryClick(cases.AllActivity());
		logger.info("Clicked on All Activity Filter");
		
		
		
		
		//................................2....................................................//
		Thread.sleep(2000);
		TryClick(cases.TabFilter());
		logger.info("Clicked on Filter");
		
		
		
		Thread.sleep(2000);
		TryClick(cases.UserActivity());
		logger.info("Clicked on User Activity Filter");
		
		
	//.....................................3...............................................................//	
		Thread.sleep(2000);
		TryClick(cases.TabFilter());
		logger.info("Clicked on Filter");
		
		
		
		Thread.sleep(2000);
		TryClick(cases.SystemActivity());
		logger.info("Clicked on System Activity Filter");

//...............................................4..................................................//
		Thread.sleep(2000);
		TryClick(cases.TabFilter());
		logger.info("Clicked on Filter");
		
		
		
		Thread.sleep(2000);
		TryClick(cases.Fav());
		logger.info("Clicked on Favorite Filter");
		
		
		
		
	}

}
