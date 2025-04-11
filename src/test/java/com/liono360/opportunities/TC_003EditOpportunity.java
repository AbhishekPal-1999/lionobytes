package com.liono360.opportunities;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.LoginPage;
import com.liono360.pageObject.OpportunitiesPage;

public class TC_003EditOpportunity extends Baseclass{
	
	@Test
	public void EditOpportunityTest() throws InterruptedException, IOException {

// LOGIN TO CRM===============================================================================================
		
	    //redirectToCRM();
	    
		OpportunitiesPage opp=new OpportunitiesPage(driver);
		 Actions action = new Actions(driver);

	
		TryClick(opp.clickOpportunity());
		logger.info("Clicked on opportunities");
		
		waitUntilPageLoad();
		Thread.sleep(2000);
		mouseActionRightClick(driver, opp.AddedOpportunity());
		logger.info("rigt clicked on added opportunity");
		
		
		
		
		TryClick(opp.clickEdit());
		logger.info("Edit button clicked");
		
	
		opp.waitUntilPageLoad();
		Thread.sleep(2000);
		String OpportunityNameBeforeEdit= opp.setOpportunityName().getAttribute("value");
		//opp.setOpportunityName().clear();
		//explWaitToClick(opp.setOpportunityName());
		//opp.setOpportunityName().sendKeys("Opportunity" + randomnumber());
		//logger.info("opportunity name added");
		
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
		TryClick(opp.Refreshbutton());
		Thread.sleep(3000);
		String OpportunityNameAfterEdit =opp.ListedOpportunity().getText();
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


