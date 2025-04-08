package com.liono360.leads;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.LeadPage;
import com.liono360.pageObject.LoginPage;

public class TC_006AddNewContactsOnLead extends Baseclass {
	
	
	@Test
	public void AddNewContactsOnLeadTest () throws InterruptedException {
		
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
		
		Thread.sleep(5000);
		leads.addedLead().click();
		logger.info("Clicked addedLeadTab");
		
		Thread.sleep(5000);
		leads.ContactLead().click();
		logger.info("Clicked ContactLead Tab");
		
		
		Thread.sleep(5000);
		leads.ContactLead().click();
		logger.info("Clicked ContactLead Tab");
		
		
		Thread.sleep(5000);
		leads.IconBarLead().click();
		logger.info("Clicked IconBarLead Tab");
		
		
		Thread.sleep(5000);
		leads.Titlemr().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='Mr']")));
		driver.findElement(By.xpath("//span[text()='Mr']")).click();
		logger.info("select on dropdown");
	
		
		
		
		Thread.sleep(2000);
		leads.Firstname().sendKeys("FName" + randomnumber());
		logger.info("Sendkeys Firstname Tab");
		
		Thread.sleep(2000);
		leads.Lastname().sendKeys("FName" + randomnumber());
		logger.info("Sendkeys Lastname Tab");
		
		Thread.sleep(2000);
		leads.Email().sendKeys("leadcontact" + randomnumber() + "@lionobytes.com");
		logger.info("Sendkeys email Tab");
		
		Thread.sleep(2000);
		leads.Phone().sendKeys("87885266" + randomnumber());
		logger.info("Sendkeys Lastname Tab");
		
		
		
		Thread.sleep(5000);
		leads.SaveSecondary().click();
		logger.info("Clicked save Tab");
		
		//Thread.sleep(2000);
		//leads.COnSecondaryAccount().click();
		//logger.info("Clicked ClickOnSecondaryAccountbtn Tab");
		
		
	}
	

}
