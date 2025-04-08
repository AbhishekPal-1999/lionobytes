package com.liono360.cases;

import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.CasesPage;

public class TC_018CasesAllActivityList extends Baseclass {

	@Test
	public void TC_018CasesAllActivityListTest () throws InterruptedException {
		
		CasesPage cases = new CasesPage(driver);

		waitUntilPageLoad();
		TryClick(cases.clickCases());
		logger.info("Clicked on Cases ");

		TryClick(cases.addedCase());
		logger.info("Clicked on created Cases");

		TryClick(cases.ActivityTab());
		logger.info("Clicked on Activity Tab");
		
		
		TryClick(cases.AllActivityList());
		logger.info("Clicked on All Activity List Tab");	
		
	
		
		SelectDropdown(cases.SelectActivityFilter(),1);
		logger.info("Select Value for Filter");
				
		
		Thread.sleep(2000);
		SelectDropdown(cases.SelectActivityFilter(),2);
		logger.info("Select Value for Filter");
				
		
		Thread.sleep(2000);
		SelectDropdown(cases.SelectActivityFilter(),3);
		logger.info("Select Value for Filter");
				
		
		Thread.sleep(2000);
		SelectDropdown(cases.SelectActivityFilter(),4);
		logger.info("Select Value for Filter");
		
		
	
		
	}
	
}
