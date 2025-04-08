package com.liono360.cases;

import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.CasesPage;

public class TC_019CasesAllActivityListFilter extends Baseclass {

	@Test
	public void TC_019CasesAllActivityListFilterTest() throws InterruptedException {

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
		
		
		TryClick(cases.FilterClick());
		logger.info("Clicked on Filter Icon");
		
		
	//...............................Filter 1............................................................//	
		
		
		SelectDropdown(cases.Filter(),1);
		logger.info("Select Value for Filter");
		
		
		SelectDropdown(cases.Operator(),1);
		logger.info("Select Value for Operator");
		
		
		TrySelectMultiDropdown(cases.Value2(),1,2);
		logger.info("Select Value for Dropdown");
		
		TryClick(cases.Apply());
		logger.info("Clicked on Apply");
		
		
		
		
	//..................................Filter 2............................................................//	
		
		TryClick(cases.Reset());
		logger.info("Clicked on Reset");
		
		TryClick(cases.FilterClick());
		logger.info("Clicked on Filter Icon");
		
	
		SelectDropdown(cases.Filter(),2);
		logger.info("Select Value for Filter");
		
		
		SelectDropdown(cases.Operator(),1);
		logger.info("Select Value for Operator");
		
		
		TrySelectMultiDropdown(cases.Value2(),1,2);
		logger.info("Select Value for Dropdown");
		
		TryClick(cases.Apply());
		logger.info("Clicked on Apply");
	
		
	//.....................................................................................//	
		
		Thread.sleep(2000);
		TryClick(cases.FilterClick());
		logger.info("Clicked on Filter Icon");
		
		TryClick(cases.Reset());
		logger.info("Clicked on Reset");
		
	
		
		
	}

}
