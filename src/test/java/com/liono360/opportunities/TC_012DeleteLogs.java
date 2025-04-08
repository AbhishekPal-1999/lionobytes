package com.liono360.opportunities;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.OpportunitiesPage;

public class TC_012DeleteLogs extends Baseclass {

	
	@Test
	public void TC_012DeleteLogsTest() throws InterruptedException {

		 // redirectToCRM();

		OpportunitiesPage opp=new OpportunitiesPage(driver);
		 Actions action = new Actions(driver);
		
		
		 
			TryClick(opp.clickOpportunity());
			logger.info("Clicked on opportunities");

			TryClick(opp.AddedOpportunity());
			logger.info("Clicked on listed opportunity");

			TryClick(opp.ActivityTab());
			logger.info("Clicked on Activity Tab");	
		
		
		//.........................Delete Log 1..............................................//	
			
			TryClick(opp.FirstLog());
			logger.info("Clicked on first Log");
			
			
			TryClick(opp.DeleteLog1());
			logger.info("Clicked on Delete");
			
			
			TryClick(opp.Yes());
			logger.info("Clicked on Yes");
			
			
//.........................Delete Log 2..............................................//	
			
			TryClick(opp.SecondLog());
			logger.info("Clicked on Second Log");
			
			
			TryClick(opp.DeleteLog2());
			logger.info("Clicked on Delete");
			
			
			TryClick(opp.Yes());
			logger.info("Clicked on Yes");	
			
			
			
			
//.........................Delete Log 3..............................................//	
			
			TryClick(opp.ThirdLog());
			logger.info("Clicked on Third Log");
			
			
			TryClick(opp.DeleteLog3());
			logger.info("Clicked on Delete");
			
			
			TryClick(opp.Yes());
			logger.info("Clicked on Yes");			
			
			
			
	}

}
