package com.liono360.cases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.CasesPage;
import com.liono360.pageObject.LoginPage;

public class TC_013CreateWithOnlyRequiredData extends Baseclass{

	@Test
	public void TC_013CreateWithOnlyRequiredFields() throws InterruptedException, IOException {
		
// LOGIN TO CRM===============================================================================================
		
	    redirectToCRM();

		CasesPage cases= new CasesPage(driver);
		cases.clickCases().click();
		logger.info("Clicked on Cases ");
		cases.waitUntilPageLoad();
		String CNbeforeCreate= cases.latestCaseNo().getText();
		
		cases.clickAddCase().click();
		logger.info("Clicked on add case button");
		cases.waitUntilPageLoad();
		
		cases.selectCaseAssociation().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='Lead']")));
		driver.findElement(By.xpath("//span[text()='Lead']")).click();
		logger.info("Case Association  is added");
		
		
		cases.setAssociationName().sendKeys("enter");
		cases.waitUntilPageLoad();
		driver.findElement(By.xpath("(//li[@role='option'])[1]")).click();
		logger.info("Association Name Added");
		
		cases.setCaseDeatils().sendKeys("this is automation generated case" + randomnumber());
		logger.info("Case details is added");
		Thread.sleep(2000);
		
		cases.SelectGroups().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")));
		driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")).click();
		logger.info("Groups is selected");
		
		Thread.sleep(4000);
		cases.clickSubmit().click();
		logger.info("Clicked on save button to add Case");
		
		cases.waitUntilPageLoad();
		String CNafterCreate = cases.latestCaseNo().getText();
		System.out.println("case no before create is: "+CNbeforeCreate);
		System.out.println("case no after create is: "+CNafterCreate);

		if (CNafterCreate!= CNbeforeCreate) {
			Assert.assertTrue(true);
			logger.info("create case test passed");
		} else {
			Assert.assertTrue(false);
			captureScreen(driver, "addCase");
			logger.info("Create case test failed");
		}
	}
	
}
