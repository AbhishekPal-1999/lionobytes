package com.liono360.cases;

import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.CasesPage;

public class TC_022CasesColumnSetting1 extends Baseclass {

	@Test
	public void TC_022CasesColumnSetting1Test () throws InterruptedException {
		
        CasesPage cases = new CasesPage(driver);
		
		
		waitUntilPageLoad();
		TryClick(cases.clickCases());
		logger.info("Clicked on Cases ");

		TryClick(cases.Setting());
		logger.info("Clicked on Setting");
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		cases.SearchFeilds().sendKeys("Resolution Date");
		logger.info("Sendkeys On SearchFeilds");
		
		

		TryClick(cases.SaveColumnSetting());
		logger.info("Click On Save");	
		
	}
	
	
}
