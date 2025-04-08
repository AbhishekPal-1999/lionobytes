package com.liono360.cases;

import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.CasesPage;

public class TC_015AddFavoriteAndClickOnLogsIcon extends Baseclass{

	@Test
	public void TC_015AddFavoriteAndClickOnLogsIconTest() throws InterruptedException {

		CasesPage cases = new CasesPage(driver);

		waitUntilPageLoad();
		TryClick(cases.clickCases());
		logger.info("Clicked on Cases ");

		TryClick(cases.addedCase());
		logger.info("Clicked on created Cases");

		TryClick(cases.ActivityTab());
		logger.info("Clicked on Activity Tab");
		
	//.......................Add to Favorite Logs..................................................//	
		Thread.sleep(1000);
		TryClick(cases.Favorite1());
		logger.info("Clicked on Favorite first Log");
		
		Thread.sleep(1000);
		TryClick(cases.Favorite2());
		logger.info("Clicked on Favorite Second Log");
		
		Thread.sleep(1000);
		TryClick(cases.Favorite3());
		logger.info("Clicked on Favorite Third Log");
		
	//.......................Click On Logs Icon........................................................//	
		
		Thread.sleep(1000);
		TryClick(cases.LogIcon1());
		logger.info("Clicked on first Log icon");
		
		Thread.sleep(1000);
		TryClick(cases.LogIcon2());
		logger.info("Clicked on Second Log icon");
		
		Thread.sleep(1000);
		TryClick(cases.LogIcon3());
		logger.info("Clicked on Third Log icon");
		
		Thread.sleep(1000);
		TryClick(cases.LogIcon4());
		logger.info("Clicked on Fourth Log icon");
		
		Thread.sleep(1000);
		TryClick(cases.LogIcon5());
		logger.info("Clicked on Fifth Log icon");
		
		Thread.sleep(1000);
		TryClick(cases.LogIcon6());
		logger.info("Clicked on Six Log icon");
		
		
		
		
		
	}

}
