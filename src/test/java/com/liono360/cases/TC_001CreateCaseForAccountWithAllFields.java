package com.liono360.cases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.CasesPage;
import com.liono360.pageObject.LeadPage;
import com.liono360.pageObject.LoginPage;
import com.liono360.utility.ExcelDataProvider;

public class TC_001CreateCaseForAccountWithAllFields extends Baseclass {
    
   @Test
   public void TC_001CreateCaseWithAccount() throws InterruptedException, IOException {
			

// LOGIN TO CRM===============================================================================================
	
	    
	    Actions action = new Actions(driver);
		CasesPage cases= new CasesPage(driver);
		ExcelDataProvider exceldata=new ExcelDataProvider();
		
		waitUntilPageLoad();
		TryClick(cases.clickCases());
		logger.info("Clicked on Cases ");
		
		waitUntilPageLoad();
		Thread.sleep(2000);
		action.moveToElement(cases.Actionbttn()).build().perform();
		logger.info("Mousehover on Action button");
		
		
		TryClick(cases.clickAddCase());
		logger.info("Clicked on add case button");
	
	
		TrySelectDropdown(cases.selectCaseAssociation(),"Account");
		logger.info("Case Association  is added");
		
		
		TryClick(cases.setAssociationName());
		Thread.sleep(3000);
		logger.info("Clicked on Select Association Name");
		
		TryClick(cases.CaseAssociationSelect());
		logger.info("Case Association is Selected");
		
		waitUntilPageLoad();
		String CaseNameBeforeCreate= cases.caseId().getAttribute("value");
		
		SelectDropdown(cases.selectSelectSource(),1);
		logger.info("Source is selected");
		
		
		SelectDropdown(cases.selectCategory(),1);
		logger.info("Category is selected");
	

		SelectDropdown(cases.selectSubCategory(),1);
		logger.info("Sub-Category is selected");
		
		
		SelectDropdown(cases.SelectPriority(),1);
		logger.info("Priority is selected");
		
	

		cases.setSubject().sendKeys("regardingLead" + randomnumber());
		logger.info("Subject is added");
	

		String path=System.getProperty("user.dir") + "\\TestData\\test1.png";
		cases.attachSharedFiles().sendKeys(path);
		logger.info("File is added");
	

		cases.setCaseDeatils().sendKeys("this is automation generated case" + randomnumber());
		logger.info("Case details is added");

		
		jsScroll(driver,cases.SelectGroups());
	
		SelectDropdown(cases.SelectGroups(),1);
		logger.info("Groups is selected");
		
		SelectDropdown(cases.SelectUsers(),4);
		logger.info("Users is selected");

		
		
		TryClick(cases.clickSubmit());
		logger.info("Clicked on save button to add Case");
		

		waitUntilPageLoad();
		String CaseNameAfterCreate = cases.CaseIDs().getText();
    	System.out.println("Case name to create: "+CaseNameBeforeCreate);
		System.out.println("Case name after create: "+CaseNameAfterCreate);

		if (CaseNameBeforeCreate.equalsIgnoreCase(CaseNameAfterCreate)) {
			Assert.assertTrue(true);
			logger.info("Add case test passed");
		} 
		else {
			Assert.assertTrue(false);
			captureScreen(driver, "addCase");
			logger.info("Add case test failed");
		}
	}
}
