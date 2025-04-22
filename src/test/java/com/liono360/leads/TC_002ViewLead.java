package com.liono360.leads;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.LeadPage;
import com.liono360.pageObject.LoginPage;
import com.liono360.utility.ExcelDataProvider;

public class TC_002ViewLead extends Baseclass{
	
	@Test
	public void TC002_ViewLead() throws InterruptedException, IOException {
		//redirectToCRM();

		LeadPage leads = new LeadPage(driver);
		ExcelDataProvider exceldata=new ExcelDataProvider();
		
		waitUntilPageLoad();
		Thread.sleep(2000);
		
		TryClick(leads.clickLead());
		logger.info("Clicked on Lead ");

		waitUntilPageLoad();
		Thread.sleep(5000);
		
		mouseActionRightClick(driver, leads.listedLeads());
		Thread.sleep(1000);
		TryClick(leads.clickViewLead());
		logger.info("clicked on view option");
		
	    waitUntilPageLoad();

	 // ASSERTION====================================================================================================		

	 		if(leads.ViewLeadHeader().isDisplayed())
	 		{ 

	 			Assert.assertTrue(true);
	 			logger.info("View lead test passed");
	 		}
	 		else
	 		{
	 			Assert.assertTrue(false);
	 			captureScreen(driver, "View Account test ");
	 			logger.info("view lead test failed");
	 		}
	 		TryClick(leads.clickCancel());
	 		logger.info("clicked on cancel");
	 		//Thread.sleep(4000);
	 	}

	

}
