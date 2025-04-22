package com.liono360.leads;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.LeadPage;
import com.liono360.pageObject.LoginPage;

public class TC_008VerifySearchLead extends Baseclass{
	
	@Test
	public void VerifySearchLeadTest() throws InterruptedException, IOException {
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

	
		Thread.sleep(5000);
		leads.setLeadToSearch().sendKeys("scriptLead125");
		Thread.sleep(5000);
		logger.info("Entered text to search");

		
		
	}

}
