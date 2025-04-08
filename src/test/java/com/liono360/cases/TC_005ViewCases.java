package com.liono360.cases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.CasesPage;

public class TC_005ViewCases extends Baseclass {

	@Test
	public void TC_005viewCasesTest() throws InterruptedException, IOException {
		
// LOGIN TO CRM===============================================================================================
		
	   // redirectToCRM();
		
		
		CasesPage cases= new CasesPage(driver);
		
		waitUntilPageLoad();
		TryClick(cases.clickCases());
		logger.info("Clicked on Cases ");
		
		
		
		
		Thread.sleep(3000);
		mouseActionRightClick(driver, cases.addedCase());
		logger.info("rigt clicked on added case");
		
		

		TryClick(cases.clickViewCase());
		logger.info("clicked on view option");
		
		
		
		/*
		 * cases.waitUntilPageLoad(); if(cases.ViewCaseHeader().isDisplayed()) {
		 * 
		 * Assert.assertTrue(true); logger.info("View Case test passed"); } else {
		 * Assert.assertTrue(false); captureScreen(driver, "View Case");
		 * logger.info("view Case test failed"); }
		 */
		
		TryClick(cases.clickCancel());
		logger.info("clicked on cancel");
		
	}
	
	
}
