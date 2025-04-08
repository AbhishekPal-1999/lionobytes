package com.liono360.opportunities;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.OpportunitiesPage;

public class TC_015AllActivityListGroupBy extends Baseclass {

	
	@Test
	public void TC_015AllActivityListGroupByTest () throws InterruptedException {
		
	
		// redirectToCRM();

		OpportunitiesPage opp = new OpportunitiesPage(driver);
		Actions action = new Actions(driver);

		TryClick(opp.clickOpportunity());
		logger.info("Clicked on opportunities");

		TryClick(opp.AddedOpportunity());
		logger.info("Clicked on listed opportunity");

		TryClick(opp.ActivityTab());
		logger.info("Clicked on Activity Tab");

		TryClick(opp.AllActivityList());
		logger.info("Clicked on All Activity List Tab");
		
		
		//......................Group By 1...................................................//
		
		TryClick(opp.GroupBybtnClick());
		logger.info("Clicked on Group by Button");
		
		
		
		SelectDropdown(opp.GroupBy(),1);
		logger.info("Select Value for Group By");
		
		
		TryClick(opp.Apply());
		logger.info("Clicked on Apply");
		
		
		
		//......................Group By 2...................................................//	
		 
		Thread.sleep(2000);
		TryClick(opp.GroupBybtnClick());
		logger.info("Clicked on Group by Button");
		
        
		SelectDropdown(opp.GroupBy(),2);
		logger.info("Select Value for Group By");
		
		
		TryClick(opp.Apply());
		logger.info("Clicked on Apply");
		
		
	//......................Group By 3...................................................//	

		Thread.sleep(2000);
		TryClick(opp.GroupBybtnClick());
		logger.info("Clicked on Group by Button");
		
		
		
		SelectDropdown(opp.GroupBy(),3);
		logger.info("Select Value for Group By");
		
		
		TryClick(opp.Apply());
		logger.info("Clicked on Apply");
		
		
		//......................Group By 4...................................................//		
	
		Thread.sleep(2000);
		TryClick(opp.GroupBybtnClick());
		logger.info("Clicked on Group by Button");
		
		SelectDropdown(opp.GroupBy(),4);
		logger.info("Select Value for Group By");
		
		
		TryClick(opp.Apply());
		logger.info("Clicked on Apply");
			
		
//...................................Group By 5....................................................................//		
		
		
		Thread.sleep(2000);
		TryClick(opp.GroupBybtnClick());
		logger.info("Clicked on Group by Button");
			
		
		SelectDropdown(opp.GroupBy(),5);
		logger.info("Select Value for Group By");
		
		
		TryClick(opp.Apply());
		logger.info("Clicked on Apply");
		
		
//...................................Group By 6....................................................................//		
		

		Thread.sleep(2000);
		TryClick(opp.GroupBybtnClick());
		logger.info("Clicked on Group by Button");

	

		SelectDropdown(opp.GroupBy(), 6);
		logger.info("Select Value for Group By");

		TryClick(opp.Apply());
		logger.info("Clicked on Apply");
		
		
//...................................Group By 7....................................................................//			
		
		Thread.sleep(2000);
		TryClick(opp.GroupBybtnClick());
		logger.info("Clicked on Group by Button");


		SelectDropdown(opp.GroupBy(), 7);
		logger.info("Select Value for Group By");

		TryClick(opp.Apply());
		logger.info("Clicked on Apply");
	
		
		
//..........................Reset...............................................................................//
		Thread.sleep(2000);
		TryClick(opp.GroupBybtnClick());
		logger.info("Clicked on Group by Button");
	

		TryClick(opp.Reset());
		logger.info("Clicked on Reset");
		
		
		
	}
	
	
}
