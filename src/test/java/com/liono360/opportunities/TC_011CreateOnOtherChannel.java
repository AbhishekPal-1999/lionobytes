package com.liono360.opportunities;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.OpportunitiesPage;

public class TC_011CreateOnOtherChannel extends Baseclass {
	
	@Test
	public void CreateOnOtherChannelTest() throws IOException, InterruptedException {
		
// LOGIN TO CRM===============================================================================================
		
	    redirectToCRM();

		OpportunitiesPage opp=new OpportunitiesPage(driver);
		opp.waitUntilPageLoad();
		opp.clickOpportunity().click();
		logger.info("Clicked on opportunities");
		opp.waitUntilPageLoad();

		opp.setChannel().click();
		//Thread.sleep(2000);
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
