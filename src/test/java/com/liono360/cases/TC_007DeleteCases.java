package com.liono360.cases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.CasesPage;

public class TC_007DeleteCases extends Baseclass {

	@Test
	public void TC_007DeleteCasesTest() throws InterruptedException, IOException {
		
// LOGIN TO CRM===============================================================================================
		
	   // redirectToCRM();

		CasesPage cases= new CasesPage(driver);
		
		
		waitUntilPageLoad();
		TryClick(cases.clickCases());
		logger.info("Clicked on Cases ");
		
		
		
	
		//String CNbeforeDelete= cases.latestCaseNo().getText();
		
	    Thread.sleep(5000);
		mouseActionRightClick(driver, cases.addedCase());
		logger.info("rigt clicked on added case");

		
		
		TryClick(cases.clickDeleteCase());
		logger.info("clicked delete button");


		
		TryClick(cases.clickYesButton());
		logger.info("clicked yes button");
		
		
		/*
		 * cases.waitUntilPageLoad(); String CNafterDelete =
		 * cases.latestCaseNo().getText();
		 * System.out.println("case no before delete is: "+CNbeforeDelete);
		 * System.out.println("case no after delete is: "+CNafterDelete);
		 */

		/*
		 * if (CNbeforeDelete!= CNafterDelete) { Assert.assertTrue(true);
		 * logger.info("delete case test passed"); } else { Assert.assertTrue(false);
		 * captureScreen(driver, "addCase"); logger.info("delete case test failed"); }
		 */
		
	}
}
