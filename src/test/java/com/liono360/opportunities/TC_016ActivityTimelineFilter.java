package com.liono360.opportunities;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.OpportunitiesPage;

public class TC_016ActivityTimelineFilter extends Baseclass {

	@Test
	public void TC_016ActivityTimelineFilterTest() throws InterruptedException {

		OpportunitiesPage opp = new OpportunitiesPage(driver);
		Actions action = new Actions(driver);
		
		

		TryClick(opp.clickOpportunity());
		logger.info("Clicked on opportunities");

		TryClick(opp.AddedOpportunity());
		logger.info("Clicked on listed opportunity");

		TryClick(opp.ActivityTab());
		logger.info("Clicked on Activity Tab");	
			
		
		TryClick(opp.TabFilter());
		logger.info("Clicked on Filter");
		
		
		
		TryClick(opp.AllActivity());
		logger.info("Clicked on All Activity Filter");
		
		
		
		
		//................................2....................................................//
		Thread.sleep(2000);
		TryClick(opp.TabFilter());
		logger.info("Clicked on Filter");
		
		
		
		Thread.sleep(2000);
		TryClick(opp.UserActivity());
		logger.info("Clicked on User Activity Filter");
		
		
	//.....................................3...............................................................//	
		Thread.sleep(2000);
		TryClick(opp.TabFilter());
		logger.info("Clicked on Filter");
		
		
		
		Thread.sleep(2000);
		TryClick(opp.SystemActivity());
		logger.info("Clicked on System Activity Filter");

//...............................................4..................................................//
		Thread.sleep(2000);
		TryClick(opp.TabFilter());
		logger.info("Clicked on Filter");
		
		
		
		Thread.sleep(2000);
		TryClick(opp.Favorite());
		logger.info("Clicked on Favorite Filter");
		
		
	}

}
