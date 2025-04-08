package com.liono360.opportunities;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.OpportunitiesPage;

public class TC_012CreateWithCustom extends Baseclass{
	
	@Test
	public void CreateWithCustomTest() throws IOException, InterruptedException {
		
// LOGIN TO CRM===============================================================================================
		
	    redirectToCRM();

		OpportunitiesPage opp=new OpportunitiesPage(driver);
		opp.waitUntilPageLoad();
		opp.clickOpportunity().click();
		logger.info("Clicked on opportunities");
		opp.waitUntilPageLoad();

		opp.setChannel().click();
		Thread.sleep(500);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='Automation']")));
		driver.findElement(By.xpath("//span[text()='Automation']")).click();
		logger.info("channel is switched");
		opp.waitUntilPageLoad();

		opp.clickAddOpportunity().click();
		logger.info("Clicked on add opportunity button");
		opp.waitUntilPageLoad();

		opp.setOpportunityName().sendKeys("Opportunity"+ randomnumber());
		logger.info("opportunity name added");
		//Thread.sleep(2000);

		String OpportunityNameBeforeCreate= opp.setOpportunityName().getAttribute("value");

		opp.setAccountname().sendKeys("ab");
		Thread.sleep(9000);
		opp.waitUntilPageLoad();
		driver.findElement(By.xpath("(//li[@role='option'])[1]")).click();
		logger.info("Account Name Added");

		opp.waitUntilPageLoad();

		//			opp.selectOwner().click();
		//			Thread.sleep(2000);
		//			explWaitToClick(driver.findElement(By.xpath("//span[text()='Panchanan Pati ']")));
		//			driver.findElement(By.xpath("//span[text()='Panchanan Pati ']")).click();
		//			logger.info("Owner is selected");

		opp.ContactNames().sendKeys("MyName"+ randomnumber());
		logger.info("ContactNames is selected");
		//Thread.sleep(2000);

		opp.setContactEmail().sendKeys("opportunities" + randomnumber() + "@lionobytes.com");
		logger.info("ContactEmail is selected");

		opp.setcontactPhone().sendKeys("63653404" + randomnumber());
		logger.info("contact phone is selected");

		opp.selectQuality().click();
		//Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//li[@aria-label=\"AAA++++\"]")));
		driver.findElement(By.xpath("//li[@aria-label=\"AAA++++\"]")).click();
		logger.info("Quality is added");

		opp.selectSource().click();
		//Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")));
		driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")).click();
		logger.info("source is added");

		opp.selectClosedate().click();
		//Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("(//span[text()='31'])[2]")));
		driver.findElement(By.xpath("(//span[text()='31'])[2]")).click();
		logger.info("closed date is added");

		opp.selectStage().click();
		//Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")));
		driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")).click();
		logger.info("stage is added");

		opp.setRepConfidence().sendKeys(randomnumber());
		logger.info("rep confidence is added");

		opp.setTotalAmount().sendKeys(randomnumber());
		logger.info("total amount is added");
		//Thread.sleep(1000);

		opp.clickPlusIcon().click();
		logger.info("plus clicked");
		Thread.sleep(500);

		opp.selectProductList().click();
		//Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='Bundle Item']")));
		driver.findElement(By.xpath("//span[text()='Bundle Item']")).click();
		logger.info("product type added");

		opp.GloabalSearch().sendKeys("bundle");
		opp.waitUntilPageLoad();

		driver.findElement(By.xpath("(//tbody//tr[1])[2]")).click();
		//Thread.sleep(1000);

		driver.findElement(By.xpath("(//tbody//tr[3])[2]")).click();
		//Thread.sleep(1000);

		driver.findElement(By.xpath("(//tbody//tr[5])[2]")).click();
		//.sleep(2000);
		opp.clickAdd().click();
		logger.info("add button clicked");
		//Thread.sleep(2000);

		opp.setNotes().sendKeys("this is notes about opporunites"+ randomnumber());
		logger.info("notes is added");
		//Thread.sleep(4000);

		opp.ClickCustCheckbox().click();
		logger.info("checkbox clicked");
		//Thread.sleep(1000);

		opp.clickCustDropdon().click();
		//Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//ul//p-dropdownitem[2]//li")));
		driver.findElement(By.xpath("//ul//p-dropdownitem[2]//li")).click();
		logger.info("custom dropdown added");

		opp.setCustInputBox().sendKeys("this is custom");
		logger.info("text added in custom input box");
		//Thread.sleep(1000);

		opp.clickSave().click();
		logger.info("save button clicked");
		opp.waitUntilPageLoad();

		//String OpportunityNameAfterCreate=opp.AddedOpportunity().getText();
		String OpportunityNameAfterCreate = driver.findElement(By.xpath("//tbody//tr[1]//td[1]")).getText();
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
	}


	
}
