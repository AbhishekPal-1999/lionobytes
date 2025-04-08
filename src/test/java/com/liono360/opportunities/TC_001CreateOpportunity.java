package com.liono360.opportunities;

import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
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
	
	
		TryClick(opp.clickOpportunity());
		logger.info("Clicked on opportunities");
		
		
	    Thread.sleep(2000);
		TryClick(opp.clickAddOpportunity());
		logger.info("Clicked on New opportunity button");
		
		
		
		Thread.sleep(3000);
		opp.setOpportunityName().sendKeys("Opportunity"+randomnumber());
		logger.info("opportunity name added");
		
		
	
		
		String OpportunityNameBeforeCreate= opp.setOpportunityName().getAttribute("value");

		
		Thread.sleep(1000);
		opp.setAccountname().sendKeys("a");
		Thread.sleep(2000);
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		action.sendKeys(Keys.ENTER).build().perform();
		logger.info("Account Name Added");
		opp.waitUntilPageLoad();
		
		
		
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
		
		

		//opp.selectClosedate().click();
		//Thread.sleep(2000);
		//explWaitToClick(driver.findElement(By.xpath("//span[text()='28']")));
		//driver.findElement(By.xpath("//span[text()='28']")).click();
		
	
		
		CommonMethods commonMethods= new CommonMethods();
		String enddate=commonMethods.EndDate();
		TryClick(opp.selectClosedate());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		try {
			driver.findElement(By.xpath("(//span[text()='"+enddate+"'])[1]")).click();
		}
		catch(Exception e) {}
		try {
			driver.findElement(By.xpath("(//span[text()='"+enddate+"'])[2]")).click();	    }
		catch(Exception e) {}
		logger.info("end date added");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		

		
		//SelectDropdown(opp.selectStage(),1);
		//logger.info("stage is added");
		
		
		
		
		explWaitToClick(opp.setRepConfidence());
		opp.setRepConfidence().sendKeys(randomnumber());
		logger.info("rep confidence is added");

		
		explWaitToClick(opp.setTotalAmount());
		opp.setTotalAmount().sendKeys(randomnumber());
		logger.info("total amount is added");
		
		//TryClick(opp.clickPlusIcon());
		//logger.info("plus clicked");
	
		
		
       // opp.waitUntilPageLoad();
       // TryClick(opp.selectProductList());
	

		
		
       // SelectDropdown(opp.InventoryItem(),1);
       // logger.info("product type added");
		
	
		
       // SelectDropdown(opp.selectLocation(),1);
       // logger.info("location type added");
		
	
		
		
		
      //  explWaitToClick(opp.GloabalSearch());
       // Thread.sleep(2000);
		//opp.GloabalSearch().sendKeys("a");
		
		
		// opp.waitUntilPageLoad();
		 
		// TryClick(opp.selectItem1());
		// TryClick(opp.selectItem2());
		 //TryClick(opp.selectItem3());
			
		 
		 
		//driver.findElement(By.xpath("(//tbody//tr[1])[2]")).click();
		//driver.findElement(By.xpath("(//tbody//tr[3])[2]")).click();
		//driver.findElement(By.xpath("(//tbody//tr[5])[2]")).click();
		 
		 
		
		
		//TryClick(opp.clickAdd());
		//logger.info("add button clicked");
		
		explWaitToClick(opp.SetopportunityDetails());
		opp.SetopportunityDetails().sendKeys("this is notes about opporunites"+ randomnumber());
		logger.info("notes is added");
		

		
		
		TryClick(opp.clickSave());
		logger.info("save button clicked");
		
		
		
		
		opp.waitUntilPageLoad();
		//String OpportunityNameAfterCreate=opp.AddedOpportunity().getText();
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
