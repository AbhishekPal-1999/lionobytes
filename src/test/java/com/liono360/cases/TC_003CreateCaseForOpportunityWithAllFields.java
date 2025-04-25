package com.liono360.cases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.CasesPage;
import com.liono360.pageObject.LoginPage;

public class TC_003CreateCaseForOpportunityWithAllFields extends Baseclass{

	
	@Test
	 public void TC_003CreateCaseWithOpportunity() throws InterruptedException, IOException {
		  
		    CreateCaseWithAllData("'Opportunity'","d");
		}
	 
	 
	 
	public void CreateCaseWithAllData(String CaseAssociation, String TextForAssociationName) throws InterruptedException, IOException {
	
		
// LOGIN TO CRM===============================================================================================
		
	    //  redirectToCRM();
	    
		CasesPage cases= new CasesPage(driver);
		
		waitUntilPageLoad();
		Thread.sleep(5000);
		
		cases.clickCases().click();
		logger.info("Clicked on Cases ");
		cases.waitUntilPageLoad();
		//Thread.sleep(9000);
		cases.clickAddCase().click();
		logger.info("Clicked on add case button");
		cases.waitUntilPageLoad();
		//Thread.sleep(7000);

		cases.selectCaseAssociation().click();
		//Thread.sleep(500);
		

		explWaitToClick(driver.findElement(By.xpath("//span[text()="+CaseAssociation+"]")));
		driver.findElement(By.xpath("//span[text()="+CaseAssociation+"]")).click();
		logger.info("Case Association  is added");


		cases.setAssociationName().sendKeys(TextForAssociationName);
		cases.waitUntilPageLoad();
		//Thread.sleep(10000);
		driver.findElement(By.xpath("(//li[@role='option'])[1]")).click();
		logger.info("Association Name Added");

		cases.setcontactNames().sendKeys("MyName" + randomnumber());
		logger.info("Contact Name Added");
		//Thread.sleep(500);

		String CaseNameBeforeCreate= cases.setcontactNames().getAttribute("value");

		cases.setEmailAddress().sendKeys("satyacase" + randomnumber() + "@lionobytes.com");
		logger.info("Email for contact is added");
		//Thread.sleep(500);

		cases.setPhoneNumber().sendKeys("+1546365" + randomnumber());
		logger.info("Phone number for contact is added");
		//Thread.sleep(500);

		cases.selectSelectSource().click();
		Thread.sleep(500);
		explWaitToClick(driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")));
		driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")).click();
		logger.info("Source is selected");

		cases.selectCategory().click();
		Thread.sleep(500);
		explWaitToClick(driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")));
		driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")).click();
		logger.info("Category is selected");

		cases.selectSubCategory().click();
		Thread.sleep(500);
		explWaitToClick(driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")));
		driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")).click();
		logger.info("Sub-Category is selected");

		cases.SelectPriority().click();
		Thread.sleep(1000);
		explWaitToClick(driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")));
		driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")).click();
		logger.info("Priority is selected");

		cases.setSubject().sendKeys("regardingLead" + randomnumber());
		logger.info("Subject is added");
		Thread.sleep(500);

		String path=System.getProperty("user.dir") + "\\TestData\\test1.png";
		cases.attachSharedFiles().sendKeys(path);
		

		logger.info("File is added");
		Thread.sleep(5000);

		cases.setCaseDeatils().sendKeys("this is automation generated case" + randomnumber());
		logger.info("Case details is added");
		Thread.sleep(500);


		jsScroll(driver,cases.SelectGroups());
		Thread.sleep(1000);
		cases.SelectGroups().click();
	    Thread.sleep(500);
		explWaitToClick(driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")));
		driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")).click();
		logger.info("Groups is selected");

		cases.SelectUsers().click();
		Thread.sleep(500);
		explWaitToClick(driver.findElement(By.xpath("//li//span[text()='Automation lob']")));
		driver.findElement(By.xpath("//li//span[text()='Automation lob']")).click();
		logger.info("Users is selected");

		Thread.sleep(500);
		cases.clickSubmit().click();
		logger.info("Clicked on save button to add Case");
		cases.waitUntilPageLoad();
		
		
		waitUntilPageLoad();
		Thread.sleep(10000);

		String CaseNameAfterCreate = cases.CaseIDs().getText();
		System.out.println("Case ID during creation: "+CaseNameBeforeCreate);
		System.out.println("Case ID after creation: "+CaseNameAfterCreate);

		if (CaseNameBeforeCreate.equals(CaseNameAfterCreate)) {
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
