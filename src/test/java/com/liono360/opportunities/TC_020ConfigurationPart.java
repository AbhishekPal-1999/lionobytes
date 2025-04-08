package com.liono360.opportunities;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.OpportunitiesPage;

public class TC_020ConfigurationPart extends Baseclass {

	@Test
	public void TC_019ConfigurationPartTest () throws InterruptedException {
		
		OpportunitiesPage opp = new OpportunitiesPage(driver);
		Actions action = new Actions(driver);
		
		

		TryClick(opp.clickOpportunity());
		logger.info("Clicked on opportunities");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
