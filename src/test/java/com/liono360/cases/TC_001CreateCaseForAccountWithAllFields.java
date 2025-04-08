package com.liono360.cases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.CasesPage;
import com.liono360.utility.ExcelDataProvider;

public class TC_001CreateCaseForAccountWithAllFields extends Baseclass {
    
   @Test
   public void TC_001CreateCaseWithAccount() throws InterruptedException, IOException {
			
	

 
	
// LOGIN TO CRM===============================================================================================
		
	   // redirectToCRM();
	    
	    
	    Actions action = new Actions(driver);
		CasesPage cases= new CasesPage(driver);
		ExcelDataProvider exceldata=new ExcelDataProvider();
		
		waitUntilPageLoad();
		TryClick(cases.clickCases());
		logger.info("Clicked on Cases ");
		
		
		waitUntilPageLoad();
		TryClick(cases.clickAddCase());
		logger.info("Clicked on add case button");
	
		
		
		
	
		SelectDropdown(cases.selectCaseAssociation(),1);
		logger.info("Case Association  is added");
		
		
		
		cases.setAssociationName().sendKeys("a");
		Thread.sleep(5000);
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		action.sendKeys(Keys.ENTER).build().perform();
		logger.info("Association Name Added");
		
		String CaseNameBeforeCreate= cases.caseId().getAttribute("value");
		
		
		
		
		/*
		 * explWaitToClick(cases.setcontactNames()); Thread.sleep(2000);
		 * cases.setcontactNames().sendKeys("Jenifer"+randomnumber());
		 * logger.info("Contact Name Added");
		 * 
		 * 
		 * 
		 * 
		 * explWaitToClick(cases.setEmailAddress()); Thread.sleep(2000);
		 * cases.setEmailAddress().sendKeys("case" + randomnumber() +
		 * "@lionobytes.com"); logger.info("Email for contact is added");
		 * 
		 * 
		 * explWaitToClick(cases.setPhoneNumber()); Thread.sleep(2000);
		 * cases.setPhoneNumber().sendKeys("+1546365" + randomnumber());
		 * logger.info("Phone number for contact is added");
		 * 
		 * 
		 */
		
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
	

		//	cases.setResolutionDate().click();
		//	Thread.sleep(500);
		//	explWaitToClick(driver.findElement(By.xpath("(//span[text()='15'])[2]")));
		//	driver.findElement(By.xpath("(//span[text()='15'])[2]")).click();
		//	logger.info("Resolution Date is selected");
		
		
		
		
		
		jsScroll(driver,cases.SelectGroups());
		
		
		
		
		SelectDropdown(cases.SelectGroups(),1);
		logger.info("Groups is selected");
		
		SelectDropdown(cases.SelectUsers(),4);
		logger.info("Users is selected");

		
		
		TryClick(cases.clickSubmit());
		logger.info("Clicked on save button to add Case");
		

		waitUntilPageLoad();
		String CaseNameAfterCreate = driver.findElement(By.xpath("(//td[contains(., 'CN')])[1]")).getText();
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
