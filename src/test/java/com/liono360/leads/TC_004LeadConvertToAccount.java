package com.liono360.leads;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.AccountsPage;
import com.liono360.pageObject.LeadPage;
import com.liono360.pageObject.LoginPage;
import com.liono360.utility.ExcelDataProvider;

public class TC_004LeadConvertToAccount extends Baseclass {

	@SuppressWarnings("unused")
	@Test
	public void TC004_LeadConvertToAccount() throws InterruptedException, IOException {

		LeadPage leads = new LeadPage(driver);
		AccountsPage account = new AccountsPage(driver);
		ExcelDataProvider exceldata=new ExcelDataProvider();
		
		
		waitUntilPageLoad();
		Thread.sleep(5000);
		
		TryClick(leads.clickLead());
		logger.info("Clicked on Lead ");
		
		
		waitUntilPageLoad();
		Thread.sleep(2000);
		
		
		leads.listedLeads().click();
		
		Thread.sleep(1000);
		leads.listedLeads().click();
		logger.info("Clicked on Lead Record");
		
		waitUntilPageLoad();
		TryClick(leads.AssignedStage());
		logger.info("Clicked on Assigned Stage");
		
		Thread.sleep(1000);
		leads.AddComments().sendKeys("This is the lead Conversion Comment for Assigned");
		logger.info("Comment added for Assigned Stage ");
		
		TryClick(leads.clickSave());
		logger.info("Clicked on Save button");
		
		waitUntilPageLoad();
		TryClick(leads.WorkingNotContacted());
		logger.info("Clicked on Working Not Contacted Stage");
		
		Thread.sleep(1000);
		leads.AddComments().sendKeys("This is the lead Conversion Comment for Working Not Contacted");
		logger.info("Comment added for Working Not Contacted Stage ");
		
		TryClick(leads.clickSave());
		logger.info("Clicked on Save button");
		
		waitUntilPageLoad();
		TryClick(leads.WorkingContactedStage());
		logger.info("Clicked on Working Contacted Stage");
		
		Thread.sleep(1000);
		leads.AddComments().sendKeys("This is the lead Conversion Comment for Working Contacted");
		logger.info("Comment added for Working Contacted Stage ");
		
		TryClick(leads.clickSave());
		logger.info("Clicked on Save button");
		
		waitUntilPageLoad();
		TryClick(leads.ClosedSatge());
		logger.info("Clicked on Working Closed Stage");
		
		Thread.sleep(3000);
		leads.AddComments().sendKeys("This is the lead Conversion Comment for Closed");
		logger.info("Comment added for Closed Stage ");
		
	
		TryClick(leads.clickSave());
		logger.info("Clicked on Save button");
		
// Convert Lead to Account===================================================================================
		
	    waitUntilPageLoad();
	    String Lead_Name=leads.LeadNameOverviewPage().getText();
		
	    Thread.sleep(5000);
		TryClick(leads.hamburgerIcon());
		logger.info("Clicked on hamburger Icon");
		
		Thread.sleep(1000);
		TryClick(leads.clickConvert());
		logger.info("Clicked on Convert");
		
		TryClick(leads.clickSave());
		logger.info("Clicked on Save button");
		

// ASSERTION=======================================================================================
		
		waitUntilPageLoad();
		Thread.sleep(4000);
		
		TryClick(account.clickAccounts());
		logger.info("Clicked on Account Module");
		

		waitUntilPageLoad();
		Thread.sleep(5000);
		
		String Converted_Lead_To_Account=account.ListedAccount().getText();
		System.out.println("Listed Lead name: "+Lead_Name);
		System.out.println("Converted Lead To Account: "+Converted_Lead_To_Account);
		
		if (Lead_Name.equalsIgnoreCase(Converted_Lead_To_Account)) {
			Assert.assertTrue(true);
			logger.info("lead converted to Account successfully");
		} 

		else {
			logger.info("Lead Convert to Account is failed");
		}
	 
	}
	

	
}
