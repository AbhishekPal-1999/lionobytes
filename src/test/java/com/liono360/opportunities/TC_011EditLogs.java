package com.liono360.opportunities;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.OpportunitiesPage;

public class TC_011EditLogs extends Baseclass {

	
	@Test
	public void TC_011EditLogsTest() throws InterruptedException {

		 // redirectToCRM();

		OpportunitiesPage opp=new OpportunitiesPage(driver);
		 Actions action = new Actions(driver);
		
		
		 
			TryClick(opp.clickOpportunity());
			logger.info("Clicked on opportunities");

			TryClick(opp.AddedOpportunity());
			logger.info("Clicked on listed opportunity");

			TryClick(opp.ActivityTab());
			logger.info("Clicked on Activity Tab");
		 
		 
		//........................Edit 1..........................................//
			
			
			TryClick(opp.FirstLog());
			logger.info("Clicked on first Log");
			
			
			TryClick(opp.EditLog());
			logger.info("Clicked on edit log");
			
			
			Thread.sleep(2000);
			opp.Description1().clear();
			Thread.sleep(2000);
			opp.Description1().sendKeys("Edit Comments");
			logger.info("Edit Comments");
			
			
			
			Thread.sleep(2000);
			opp.Description1().sendKeys("Add Comments");
			logger.info("New Comment Added");
			
			TryClick(opp.SaveEditLog());
			logger.info("Clicked on Save");
			
			
	//..................................Edit 2.................................................................//		
			
			
			
			
			
			
			
			
			
		
	}

}
