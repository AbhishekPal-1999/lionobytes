package com.liono360.opportunities;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.LoginPage;
import com.liono360.pageObject.OpportunitiesPage;

public class TC_006EditRequiredsOnly extends Baseclass{
	@Test
	public void EditMandatoryOnly() throws IOException, InterruptedException {
		
// LOGIN TO CRM===============================================================================================
		
	  //  redirectToCRM();

		OpportunitiesPage opp=new OpportunitiesPage(driver);
		
		
		waitUntilPageLoad();
		TryClick(opp.clickOpportunity());
		logger.info("Clicked on opportunities");
		
		waitUntilPageLoad();
		waitUntilPageLoad();
		Thread.sleep(4000);
		mouseActionRightClick(driver, opp.AddedOpportunity());
		logger.info("rigt clicked on added opportunity");
		
		
		
		
		TryClick(opp.clickEdit());
		logger.info("Edit button clicked");
		
	
		waitUntilPageLoad();
		Thread.sleep(2000);
		opp.setOpportunityName().clear();
		explWaitToClick(opp.setOpportunityName());
		opp.setOpportunityName().sendKeys("Opp-Ny" + randomnumber());
		logger.info("opportunity name added");
		
	
		
		String OpportunityNameBeforeEdit= opp.setOpportunityName().getAttribute("value");
		
		
		opp.selectClosedate().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("(//span[text()='28'])[2]")));
		driver.findElement(By.xpath("(//span[text()='28'])[2]")).click();
		
	

		
		SelectDropdown(opp.selectStage(),2);
		logger.info("stage is added");
		
		
		
		TryClick(opp.clickSave());
		logger.info("save button clicked");
		
		waitUntilPageLoad();
		String OpportunityNameAfterEdit = opp.ListedOpportunity().getText();
		System.out.println("Opportunity name to edit: "+OpportunityNameBeforeEdit);
		System.out.println("Opportunity name after edit: "+OpportunityNameAfterEdit);

		if (OpportunityNameBeforeEdit.equals(OpportunityNameAfterEdit)) {
			Assert.assertTrue(true);
			logger.info("Edit Opportunity test passed");
		} 
		else {
			Assert.assertTrue(false);
			captureScreen(driver, "Edit Opportunity");
			logger.info("Edit Opportunity test failed");
			}
		}
		
	

}
