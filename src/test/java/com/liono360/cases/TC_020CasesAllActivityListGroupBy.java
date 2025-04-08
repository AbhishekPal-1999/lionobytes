package com.liono360.cases;

import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.CasesPage;

public class TC_020CasesAllActivityListGroupBy extends Baseclass {

	@Test
	public void TC_020CasesAllActivityListGroupByTest () throws InterruptedException {
		
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
		
		
		//......................Group By 1...................................................//
		
		TryClick(cases.GroupBybtnClick());
		logger.info("Clicked on Group by Button");
		
		
		
		SelectDropdown(cases.GroupBy(),1);
		logger.info("Select Value for Group By");
		
		
		TryClick(cases.Apply());
		logger.info("Clicked on Apply");
		
		
		
		//......................Group By 2...................................................//	
		 
		Thread.sleep(2000);
		TryClick(cases.GroupBybtnClick());
		logger.info("Clicked on Group by Button");
		
        
		SelectDropdown(cases.GroupBy(),2);
		logger.info("Select Value for Group By");
		
		
		TryClick(cases.Apply());
		logger.info("Clicked on Apply");
		
		
	//......................Group By 3...................................................//	

		Thread.sleep(2000);
		TryClick(cases.GroupBybtnClick());
		logger.info("Clicked on Group by Button");
		
		
		
		SelectDropdown(cases.GroupBy(),3);
		logger.info("Select Value for Group By");
		
		
		TryClick(cases.Apply());
		logger.info("Clicked on Apply");
		
		
		//......................Group By 4...................................................//		
	
		Thread.sleep(2000);
		TryClick(cases.GroupBybtnClick());
		logger.info("Clicked on Group by Button");
		
		SelectDropdown(cases.GroupBy(),4);
		logger.info("Select Value for Group By");
		
		
		TryClick(cases.Apply());
		logger.info("Clicked on Apply");
			
		
//...................................Group By 5....................................................................//		
		
		
		Thread.sleep(2000);
		TryClick(cases.GroupBybtnClick());
		logger.info("Clicked on Group by Button");
			
		
		SelectDropdown(cases.GroupBy(),5);
		logger.info("Select Value for Group By");
		
		
		TryClick(cases.Apply());
		logger.info("Clicked on Apply");
		
		
//...................................Group By 6....................................................................//		
		

		Thread.sleep(2000);
		TryClick(cases.GroupBybtnClick());
		logger.info("Clicked on Group by Button");

	

		SelectDropdown(cases.GroupBy(), 6);
		logger.info("Select Value for Group By");

		TryClick(cases.Apply());
		logger.info("Clicked on Apply");
		
		
//...................................Group By 7....................................................................//			
		
		Thread.sleep(2000);
		TryClick(cases.GroupBybtnClick());
		logger.info("Clicked on Group by Button");


		SelectDropdown(cases.GroupBy(), 7);
		logger.info("Select Value for Group By");

		TryClick(cases.Apply());
		logger.info("Clicked on Apply");
	
		
		
//..........................Reset...............................................................................//
		Thread.sleep(2000);
		TryClick(cases.GroupBybtnClick());
		logger.info("Clicked on Group by Button");
	

		TryClick(cases.Reset());
		logger.info("Clicked on Reset");
		
	
		
	}
	
}
