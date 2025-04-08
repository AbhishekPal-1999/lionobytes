package com.liono360.cases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.CasesPage;

public class TC_006EditCase extends Baseclass {
	
	@Test
	public void TC_006EditCases() throws InterruptedException, IOException {
// LOGIN TO CRM===============================================================================================
		
	   // redirectToCRM();

		CasesPage cases= new CasesPage(driver);
		
		
		waitUntilPageLoad();
		TryClick(cases.clickCases());
		logger.info("Clicked on Cases ");
	
	
	     Thread.sleep(5000);
		mouseActionRightClick(driver, cases.addedCase());
		logger.info("rigt clicked on added case");
		
	
		TryClick(cases.clickEditCase());
		logger.info("clicked edit button");
		
		
		TryClick(cases.clickSave());
		logger.info("Clicked on save");
		
		
	}

}
