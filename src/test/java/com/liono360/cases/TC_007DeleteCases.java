package com.liono360.cases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.CasesPage;
import com.liono360.pageObject.LoginPage;

public class TC_007DeleteCases extends Baseclass {

	@Test
	public void TC_007DeleteCasesTest() throws InterruptedException, IOException {
		
// LOGIN TO CRM===============================================================================================
		
	   // redirectToCRM();

		CasesPage cases= new CasesPage(driver);
		
		
		waitUntilPageLoad();
		TryClick(cases.clickCases());
		logger.info("Clicked on Cases ");
		
		waitUntilPageLoad();
	    Thread.sleep(2000);
	    
	    
	    String CaseIDBeforeDelete = cases.CaseIDs().getText();
	    
		mouseActionRightClick(driver, cases.addedCase());
		logger.info("rigt clicked on added case");

		
		
		TryClick(cases.clickDeleteCase());
		logger.info("clicked delete button");

		
		TryClick(cases.clickYesButton());
		logger.info("clicked yes button");
		
		waitUntilPageLoad();
		TryClick(cases.Refreshbutton());
		Thread.sleep(3000);
		String CaseIDAfterCreate = cases.CaseIDs().getText();
    	System.out.println("Case name to create: "+CaseIDBeforeDelete);
		System.out.println("Case name after create: "+CaseIDAfterCreate);

		if (CaseIDBeforeDelete.equalsIgnoreCase(CaseIDAfterCreate)) {
			Assert.assertTrue(false);
			logger.info("Case is not Deleted");
		} 
		else {
			Assert.assertTrue(true);
			captureScreen(driver, "addCase");
			logger.info("Case is Deleted successfully");
		}
		
		
	}
}
