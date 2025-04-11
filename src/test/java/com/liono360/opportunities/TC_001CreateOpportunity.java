package com.liono360.opportunities;

import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.LeadWorkFlow.CommonMethods;
import com.liono360.loginPage.Baseclass;

import com.liono360.pageObject.OpportunitiesPage;

public class TC_001CreateOpportunity extends Baseclass {
	
	@Test
	public void CreateOpportunityTest() throws InterruptedException, IOException {
		
		// LOGIN TO CRM===============================================================================================
		
	   //redirectToCRM();

		OpportunitiesPage opp=new OpportunitiesPage(driver);
		 Actions action = new Actions(driver);
	   
	
		 
		waitUntilPageLoad();
		TryClick(opp.clickOpportunity());
		logger.info("Clicked on opportunities");
		
		waitUntilPageLoad();
	    Thread.sleep(2000);
	    action.moveToElement(opp.ActionBtn()).build().perform();
		logger.info("Mousehover on Action");
	    
	    
		TryClick(opp.clickAddOpportunity());
		logger.info("Clicked on New opportunity button");
		
		
		Thread.sleep(3000);
		opp.setOpportunityName().sendKeys("Opportunity"+randomnumber());
		logger.info("opportunity name added");		
		String OpportunityNameBeforeCreate= opp.setOpportunityName().getAttribute("value");

		
		Thread.sleep(1000);
		TryClick(opp.setAccountname());
		logger.info("Clicked on Select Account Name");
		
		waitUntilPageLoad();
		TryClick(opp.SelectAccountName());
		logger.info("Account is Selected");
		
		
		waitUntilPageLoad();
		SelectDropdown(opp.selectOwner(),2);
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
		String OpportunityNameAfterCreate =opp.ListedOpportunity().getText();
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

	public String EndDate() {

		LocalDate currentDate = LocalDate.now();
		int currentDay = currentDate.getDayOfMonth();
		int endDay = currentDay + 3;
		return String.valueOf(endDay);
	}
}
