package com.liono360.cases;

import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.CasesPage;

public class TC_016EditLogs extends Baseclass{

	@Test
	public void TC_015EditLogsTest() throws InterruptedException {
		CasesPage cases = new CasesPage(driver);
		
		
		waitUntilPageLoad();
		TryClick(cases.clickCases());
		logger.info("Clicked on Cases ");

		TryClick(cases.addedCase());
		logger.info("Clicked on created Cases");

		TryClick(cases.ActivityTab());
		logger.info("Clicked on Activity Tab");	
		
		//........................Edit 1..........................................//
		
		
		TryClick(cases.FirstLog());
		logger.info("Clicked on first Log");
		
		
		TryClick(cases.EditLog());
		logger.info("Clicked on edit log");
		
		
		Thread.sleep(2000);
		cases.Description1().clear();
		Thread.sleep(2000);
		cases.Description1().sendKeys("Edit Comments");
		logger.info("Edit Comments");
		
		
		
		Thread.sleep(2000);
		cases.Description2().sendKeys("Add Comments");
		logger.info("New Comment Added");
		
		TryClick(cases.SaveEditLog());
		logger.info("Clicked on Save");
		
		
//..................................Edit 2.................................................................//		
		Thread.sleep(2000);
		

		TryClick(cases.SecondLog());
		logger.info("Clicked on Second Log");
		
		
		TryClick(cases.EditLog());
		logger.info("Clicked on edit log");
		
		
		Thread.sleep(2000);
		cases.Description1().clear();
		Thread.sleep(2000);
		cases.Description1().sendKeys("Edit Second Log Comments");
		logger.info("Edit Comments");
		
		
		
		Thread.sleep(2000);
		cases.Description2().sendKeys("Add Second logs Comments");
		logger.info("New Comment Added");
		
		TryClick(cases.SaveEditLog());
		logger.info("Clicked on Save");	
		
		
		
		//..................................Edit 3.................................................................//		
				Thread.sleep(2000);
				

				TryClick(cases.ThirdLog());
				logger.info("Clicked on Third Log");
				
				
				TryClick(cases.EditLog());
				logger.info("Clicked on edit log");
				
				
				Thread.sleep(2000);
				cases.Description1().clear();
				Thread.sleep(2000);
				cases.Description1().sendKeys("Third Second Log Comments");
				logger.info("Edit Comments");
				
				
				
				Thread.sleep(2000);
				cases.Description2().sendKeys("Third Second logs Comments");
				logger.info("New Comment Added");
				
				TryClick(cases.SaveEditLog());
				logger.info("Clicked on Save");	
					
		
		
		
		
		
		
	}

}
