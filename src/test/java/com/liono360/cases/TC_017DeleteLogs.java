package com.liono360.cases;

import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.CasesPage;

public class TC_017DeleteLogs extends Baseclass{

	
	@Test
	public void TC_016DeleteLogsTest () throws InterruptedException {
		CasesPage cases = new CasesPage(driver);

		waitUntilPageLoad();
		TryClick(cases.clickCases());
		logger.info("Clicked on Cases ");

		TryClick(cases.addedCase());
		logger.info("Clicked on created Cases");

		TryClick(cases.ActivityTab());
		logger.info("Clicked on Activity Tab");
		
		//.........................Delete Log 1..............................................//	
		
		TryClick(cases.FirstLog());
		logger.info("Clicked on first Log");
		
		
		TryClick(cases.DeleteLog1());
		logger.info("Clicked on Delete");
		
		
		TryClick(cases.Yes());
		logger.info("Clicked on Yes");
		
		
//.........................Delete Log 2..............................................//	
		
		TryClick(cases.SecondLog());
		logger.info("Clicked on Second Log");
		
		
		TryClick(cases.DeleteLog2());
		logger.info("Clicked on Delete");
		
		
		TryClick(cases.Yes());
		logger.info("Clicked on Yes");	
		
		
		
		
//.........................Delete Log 3..............................................//	
		
		TryClick(cases.ThirdLog());
		logger.info("Clicked on Third Log");
		
		
		TryClick(cases.DeleteLog3());
		logger.info("Clicked on Delete");
		
		
		TryClick(cases.Yes());
		logger.info("Clicked on Yes");			
		
		
	}

}
