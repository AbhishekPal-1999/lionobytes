package com.liono360.leads;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.LeadPage;
import com.liono360.pageObject.LoginPage;

public class TC_004AssignLead extends Baseclass{
	
	@Test
	public void AssignLeadTest () throws InterruptedException {
		
		driver.get(baseURL);
		logger.info("URL is opened");
		LoginPage lp = new LoginPage(driver);

		lp.setUserName(username);
		logger.info("Username added");
		lp.setPassword(password);
		logger.info("password added");
		Thread.sleep(2000);
		lp.clickSubmit();
		logger.info("Clicked on submit button");
		Thread.sleep(20000);
		
		LeadPage leads = new LeadPage(driver);
		leads.clickLead().click();
		logger.info("Clicked on Lead ");
		
		Thread.sleep(20000);
		/*
		 * leads.LedsDrp().click(); Thread.sleep(2000);
		 * explWaitToClick(driver.findElement(By.xpath(
		 * "//span[text()='Akash_Automation']")));
		 * driver.findElement(By.xpath("//span[text()='Akash_Automation']")).click();
		 * logger.info("select on dropdown");
		 */
		
		
		Thread.sleep(8000);
		mouseActionRightClick(driver, leads.addedLead());
		logger.info("right clicked on added account");
		
		
		
		
	///..............Assign..................///	
		
		
		Thread.sleep(5000);
		leads.AssignClick().click();
		logger.info("Clicked on Assign ");
		
		
		
		
		Thread.sleep(5000);
		//explWaitToClick(leads.PrimaryAssign());
		//jsScroll(driver, leads.PrimaryAssign());
		jsClick(driver,leads.PrimaryAssign());
		logger.info("click on PrimaryAssign");
		jsClick(driver,driver.findElement(By.xpath("//div[text()='Bill Gates']")));
		logger.info("PrimaryAssign is added");
	
		
		
		
		
		
		Thread.sleep(5000);
		leads.SecondaryAssign().click();
		Thread.sleep(5000);
		explWaitToClick(driver.findElement(By.xpath("//div[text()='Chaitra Shetty']")));
		driver.findElement(By.xpath("//div[text()='Chaitra Shetty']")).click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//div[text()='John Claw']")));
		driver.findElement(By.xpath("//div[text()='John Claw']")).click();
		logger.info("select on dropdown");
		
		
	//	Thread.sleep(5000);
		//explWaitToClick(leads.SecondaryAssign());
		//jsScroll(driver, leads.SecondaryAssign());
		//jsClick(driver,leads.SecondaryAssign());
		//logger.info("click on SecondaryAssign");
		//jsClick(driver,driver.findElement(By.xpath("//div[text()='Chaitra Shetty']")));
		//jsClick(driver,driver.findElement(By.xpath("//div[text()='John Claw']")));
		//jsClick(driver,leads.SecondaryAssign());
		//logger.info("SecondaryAssign is added");
	
		
		Thread.sleep(5000);
		leads.ClickAssignLead().click();
		logger.info("Clicked on ClickAssignLead");
		
		
		
		
		
		Thread.sleep(5000);
		leads.AssignSave().click();
		logger.info("Clicked on AssignSave");
		
		
	}

}
