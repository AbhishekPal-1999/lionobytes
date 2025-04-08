package com.liono360.opportunities;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.OpportunitiesPage;

public class TC_013AllActivityList extends Baseclass {

	@Test
	public void TC_013AllActivityListTest() throws InterruptedException {

		 // redirectToCRM();

		OpportunitiesPage opp=new OpportunitiesPage(driver);
		 Actions action = new Actions(driver);
		
		
		 
			TryClick(opp.clickOpportunity());
			logger.info("Clicked on opportunities");

			TryClick(opp.AddedOpportunity());
			logger.info("Clicked on listed opportunity");

			TryClick(opp.ActivityTab());
			logger.info("Clicked on Activity Tab");	
			
			
			
			TryClick(opp.AllActivityList());
			logger.info("Clicked on All Activity List Tab");	
			
		
			
			SelectDropdown(opp.SelectActivityFilter(),1);
			logger.info("Select Value for Filter");
					
			
			Thread.sleep(2000);
			SelectDropdown(opp.SelectActivityFilter(),2);
			logger.info("Select Value for Filter");
					
			
			Thread.sleep(2000);
			SelectDropdown(opp.SelectActivityFilter(),3);
			logger.info("Select Value for Filter");
					
			
			Thread.sleep(2000);
			SelectDropdown(opp.SelectActivityFilter(),4);
			logger.info("Select Value for Filter");
			
			
			
		
	}

}
