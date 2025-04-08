package com.liono360.cases;

import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.CasesPage;

public class TC_008VerifySearchCase extends Baseclass{
	
	@Test
	public void TC_008SearchCases() throws InterruptedException {
		 
// LOGIN TO CRM===============================================================================================
		
	    redirectToCRM();
		CasesPage cases= new CasesPage(driver);
		
		
		waitUntilPageLoad();
		TryClick(cases.clickCases());
		logger.info("Clicked on Cases ");
		
		
		explWaitToClick(cases.setGloabalSearch());
		cases.setGloabalSearch().sendKeys("lead");
		logger.info("text in search box is added");
		
		//cases.waitUntilPageLoad();
		//cases.setGloabalSearch().sendKeys("lead");
		//info("text in search box is added");
		
		
	}

}
