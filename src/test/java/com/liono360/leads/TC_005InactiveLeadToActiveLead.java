package com.liono360.leads;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.LeadPage;
import com.liono360.pageObject.LoginPage;

public class TC_005InactiveLeadToActiveLead extends Baseclass{
	
	@Test
	public void TestLeadToInactive() throws InterruptedException {
		
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
		logger.info("Clicked on Lead Tab");
		
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
	   
		Thread.sleep(2000);
		leads.BtnInactiveLead().click();
		logger.info("Clicked on BtnInactiveLead Tab");
		
		
		

		Thread.sleep(20000);
		leads.SelectOneReason().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='Personal']")));
		driver.findElement(By.xpath("//span[text()='Personal']")).click();
		Thread.sleep(2000);
		leads.SelectOneReason().click();
		logger.info("select on dropdown");
		
		
		
		
		
		Thread.sleep(2000);
		leads.CommentsInactive().sendKeys("Inactive btn");
		logger.info("Clicked on CommentsInactive Tab");
		
		
		
		Thread.sleep(2000);
		leads.SaveInactive().click();
		logger.info("Clicked on SaveInactive Tab");
		
		
		
		Thread.sleep(5000);
		leads.ClickOnActive().click();
		logger.info("Clicked on ClickOnActive Tab");
		
		
		Thread.sleep(5000);
		mouseActionRightClick(driver, leads.RightclickActivebtn());
		logger.info("right clicked on added account");
		
		

		
		Thread.sleep(5000);
		leads.ActiveLeadClick().click();
		logger.info("Clicked on ActiveLeadClick Tab");
		
		Thread.sleep(20000);
		leads.ActiveLead().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='Active ']")));
		driver.findElement(By.xpath("//span[text()='Active ']")).click();
		Thread.sleep(1000);
		leads.ActiveLead().click();
		logger.info("select on dropdown");
		
		
		
		
		
		Thread.sleep(2000);
		leads.CoomentActive().sendKeys("activeLead");
		logger.info("Clicked on CoomentActive Tab");
		
		Thread.sleep(2000);
		leads.SaveA().click();
		logger.info("Clicked on SaveA Tab");
		
		Thread.sleep(8000);
		leads.InactiveLeadbbttnn().click();
		logger.info("Clicked on InactiveLeadbbttnn Tab");
		
		
		
	}
	

}
