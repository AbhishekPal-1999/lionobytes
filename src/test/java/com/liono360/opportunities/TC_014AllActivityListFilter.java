package com.liono360.opportunities;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.OpportunitiesPage;

public class TC_014AllActivityListFilter extends Baseclass {

	
	@Test
	public void TC_014AllActivityListFilterTest () throws InterruptedException {
		
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
		
		
		TryClick(opp.FilterClick());
		logger.info("Clicked on Filter Icon");
		
		
	//...............................Filter 1............................................................//	
		
		
		SelectDropdown(opp.Filter(),1);
		logger.info("Select Value for Filter");
		
		
		SelectDropdown(opp.Operator(),1);
		logger.info("Select Value for Operator");
		
		
		TrySelectMultiDropdown(opp.Value2(),1,2);
		logger.info("Select Value for Dropdown");
		
		TryClick(opp.Apply());
		logger.info("Clicked on Apply");
		
		
		
		
	//..................................Filter 2............................................................//	
		
		TryClick(opp.Reset());
		logger.info("Clicked on Reset");
		
		TryClick(opp.FilterClick());
		logger.info("Clicked on Filter Icon");
		
	
		SelectDropdown(opp.Filter(),2);
		logger.info("Select Value for Filter");
		
		
		SelectDropdown(opp.Operator(),1);
		logger.info("Select Value for Operator");
		
		
		TrySelectMultiDropdown(opp.Value2(),1,2);
		logger.info("Select Value for Dropdown");
		
		TryClick(opp.Apply());
		logger.info("Clicked on Apply");
	
		
		
		
		
		
		
		
	}

}
