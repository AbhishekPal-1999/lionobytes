package com.liono360.opportunities;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.OpportunitiesPage;

public class TC_005CreateWithRequireds extends Baseclass {
	
	@Test
	public void CreateWithMandatory() throws IOException, InterruptedException {
		
// LOGIN TO CRM===============================================================================================
		
	   // redirectToCRM();

		OpportunitiesPage opp=new OpportunitiesPage(driver);
		
		
		waitUntilPageLoad();
		TryClick(opp.clickOpportunity());
		logger.info("Clicked on opportunities");
		
		
		waitUntilPageLoad();
		TryClick(opp.clickAddOpportunity());
		logger.info("Clicked on add opportunity button");
		
		
		opp.waitUntilPageLoad();
		explWaitToClick(opp.setOpportunityName());
		opp.setOpportunityName().sendKeys("Opportunity"+randomnumber());
		logger.info("opportunity name added");
		
		
		String OpportunityNameBeforeCreate= opp.setOpportunityName().getAttribute("value");
		
		
		
		opp.selectClosedate().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("(//span[text()='28'])[2]")));
		driver.findElement(By.xpath("(//span[text()='28'])[2]")).click();
		
		
		
		
		
		SelectDropdown(opp.selectStage(),1);
		logger.info("stage is added");
		
		opp.clickSave().click();
		logger.info("save button clicked");
		
		
		opp.waitUntilPageLoad();
		//String OpportunityNameAfterCreate=opp.AddedOpportunity().getText();
		String OpportunityNameAfterCreate = opp.ListedOpportunity().getText();
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
