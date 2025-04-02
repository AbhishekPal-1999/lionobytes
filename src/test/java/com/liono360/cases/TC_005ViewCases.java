package com.liono360.cases;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.CasesPage;
import com.liono360.pageObject.LeadPage;
import com.liono360.pageObject.LoginPage;

public class TC_005ViewCases extends Baseclass {

	@Test
	public void TC_005viewCasesTest() throws InterruptedException, IOException {
		
// LOGIN TO CRM===============================================================================================
		
	   // redirectToCRM();
		
		
		CasesPage cases= new CasesPage(driver);
		
		waitUntilPageLoad();
		TryClick(cases.clickCases());
		logger.info("Clicked on Cases ");
		
		waitUntilPageLoad();
		Thread.sleep(2000);
		mouseActionRightClick(driver, cases.addedCase());
		logger.info("rigt clicked on added case");
		
		

		TryClick(cases.clickViewCase());
		logger.info("clicked on view option");
		
		
		
		TryClick(cases.clickCancel());
		logger.info("clicked on cancel");
		
	}
	
	
}
