package com.liono360.accounts;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;
import com.liono360.LeadWorkFlow.CommonMethods;
import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.AccountsPage;
import com.liono360.pageObject.OpportunitiesPage;
import com.liono360.utility.ExcelDataProvider;

public class TC_026Account_CRUD_Opportunity extends Baseclass{

	@Test
	public void TC026Account_CRUD_Oppty() throws InterruptedException, IOException {
		
		//redirectToCRM();

		Actions action = new Actions(driver);
		AccountsPage account = new AccountsPage(driver);
		Faker faker = new Faker();
		ExcelDataProvider exceldata=new ExcelDataProvider();
		OpportunitiesPage opp=new OpportunitiesPage(driver);
		
		
		TryClick(account.clickAccounts());
		logger.info("Clicked on Account Module");
		
		
		waitUntilPageLoad();
		waitUntilDisplay(account.ListedAccount(), 20);
		TryClick(account.ListedAccount());
		logger.info("Clicked on Account Record");

		waitUntilDisplay(account.Opportunity(), 20);
		TryClick(account.Opportunity());
		logger.info("Clicked on Opportunity Tab");
		
//Add Opportunity to Account----------------------------------------------------------------------------------------------------------------------
		
		waitUntilDisplay(account.AddOpportunity(), 20);
		TryClick(account.AddOpportunity());
		logger.info("Clicked on add button");
		
		opp.setOpportunityName().sendKeys("Opportunity"+randomnumber());
		logger.info("opportunity name added");		
		String OpportunityNameBeforeCreate= opp.setOpportunityName().getAttribute("value");

		
		waitUntilPageLoad();
		SelectDropdown(opp.selectOwner(),1);
		logger.info("Owner is selected");
		
		
		explWaitToClick(opp.ContactNames());
		opp.ContactNames().sendKeys("Jenifer"+randomnumber());
		logger.info("Contact Name Added");
		
		
		explWaitToClick(opp.setContactEmail());
		Thread.sleep(2000);
		opp.setContactEmail().sendKeys("opportunities" + randomnumber() + "@lionobytes.com");
		logger.info("ContactEmail is selected");
		
	
		explWaitToClick(opp.setcontactPhone());
		Thread.sleep(2000);
		opp.setcontactPhone().sendKeys("63653404" + randomnumber());
		logger.info("Contact Phone is selected");
		
		SelectDropdown(opp.selectQuality(),2);
		logger.info("Quality is added");

		
		SelectDropdown(opp.selectSource(),1);
		logger.info("source is added");
		
		
		CommonMethods commonMethods= new CommonMethods();
		String enddate=commonMethods.EndDate();
		TryClick(opp.selectClosedate());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		try {
			driver.findElement(By.xpath("(//span[text()='"+enddate+"'])[1]")).click();
		}
		catch(Exception e) {}
		try {
			driver.findElement(By.xpath("(//span[text()='"+enddate+"'])[2]")).click();	    }
		catch(Exception e) {}
		logger.info("end date added");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		explWaitToClick(opp.setRepConfidence());
		opp.setRepConfidence().sendKeys(randomnumber());
		logger.info("rep confidence is added");

		
		explWaitToClick(opp.setTotalAmount());
		opp.setTotalAmount().sendKeys(randomnumber());
		logger.info("total amount is added");

		
		explWaitToClick(opp.SetopportunityDetails());
		opp.SetopportunityDetails().sendKeys("this is notes about opporunites"+ randomnumber());
		logger.info("notes is added");
	
		
		
		TryClick(opp.clickSave());
		logger.info("save button clicked");
		
		
		opp.waitUntilPageLoad();
		String OpportunityNameAfterCreate =account.ListedAccountOpportunitys().getText();
		System.out.println("Opportunity name to create: "+OpportunityNameBeforeCreate);
		System.out.println("Opportunity name after create: "+OpportunityNameAfterCreate);

		if (OpportunityNameBeforeCreate.equals(OpportunityNameAfterCreate)) {
			Assert.assertTrue(true);
			logger.info("Add Opportunity test passed");
		} 
		else {
			Assert.assertTrue(false);
			captureScreen(driver, "add Opportunity");
			logger.info("Add Opportunity test failed");
		}

//View Opportunity from Account----------------------------------------------------------------------------------------------------------
		
		TryClick(account.ViewOpportunity());
		logger.info("clicked on View button");
		
		
		waitUntilPageLoad();
		TryClick(opp.clickCancel());
		logger.info("clicked on cancel");
		
//Edit_Update Opportunity from Account------------------------------------------------------------------------------------------------=
		
		waitUntilPageLoad();
		Thread.sleep(1000);
		TryClick(account.EditOpportunity());
		logger.info("clicked on Edit button");
		
		opp.waitUntilPageLoad();
		Thread.sleep(2000);
		String OpportunityNameBeforeEdit= opp.setOpportunityName().getAttribute("value");
		
		opp.setOpportunityName().clear();
		explWaitToClick(opp.setOpportunityName());
		opp.setOpportunityName().sendKeys("Opportunity" + randomnumber());
		logger.info("opportunity name added");
		
		SelectDropdown(opp.selectOwner(),3);
		logger.info("Owner is selected");
		

		opp.ContactNames().clear();
		explWaitToClick(opp.ContactNames());
		opp.ContactNames().sendKeys("Karter"+randomnumber());
		logger.info("Contact Name Added");
		
		
		opp.setContactEmail().clear();
		explWaitToClick(opp.setContactEmail());
		Thread.sleep(2000);
		opp.setContactEmail().sendKeys("opportunities" + randomnumber() + "@lionobytes.com");
		logger.info("ContactEmail is selected");
		
		
		opp.setcontactPhone().clear();
		explWaitToClick(opp.setcontactPhone());
		Thread.sleep(2000);
		opp.setcontactPhone().sendKeys("63653404" + randomnumber());
		logger.info("Contact Phone is selected");
		
		
		SelectDropdown(opp.selectQuality(),1);
		logger.info("Quality is added");

		
		SelectDropdown(opp.selectSource(),2);
		logger.info("source is added");
	
		
		
		opp.setRepConfidence().clear();
		explWaitToClick(opp.setRepConfidence());
		opp.setRepConfidence().sendKeys(randomnumber());
		logger.info("rep confidence is added");

		opp.setTotalAmount().clear();
		explWaitToClick(opp.setTotalAmount());
		opp.setTotalAmount().sendKeys(randomnumber());
		logger.info("total amount is added");
		
		
		opp.SetopportunityDetails().clear();
		explWaitToClick(opp.SetopportunityDetails());
		opp.SetopportunityDetails().sendKeys("this is notes about opporunites"+ randomnumber());
		logger.info("notes is added");
	
		
		
		TryClick(opp.clickSave());
		logger.info("save button clicked");
		
		
		waitUntilPageLoad();
		Thread.sleep(1000);
		String OpportunityNameAfterEdit =account.ListedAccountOpportunitys().getText();
		System.out.println("Opportunity name before Edit: "+OpportunityNameBeforeEdit);
		System.out.println("Opportunity name after Edit: "+OpportunityNameAfterEdit);

		if (OpportunityNameBeforeEdit.equalsIgnoreCase(OpportunityNameAfterEdit)) {
			Assert.assertTrue(true);
			logger.info("Opportunity is Edited");
		} 
		else {
			Assert.assertTrue(false);
			captureScreen(driver, "add Opportunity");
			logger.info("Opportunity is not Edited");
		}
		
		
	
	}

		
}


