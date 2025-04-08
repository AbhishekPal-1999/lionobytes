package com.liono360.accounts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.AccountPage;
import com.liono360.pageObject.LoginPage;

public class TC_009VerifyViewAccount extends Baseclass {
	
	@Test
	public void VerifyViewAccounttest() throws InterruptedException, IOException
		{
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
		
		AccountPage accounts = new AccountPage(driver);
		Thread.sleep(2000);
		explWaitToClick(accounts.clickAccounts());
		accounts.clickAccounts().click();
		logger.info("Clicked on Accounts button");
		
		Thread.sleep(20000);
		accounts.addedAccount().click();
		logger.info("Clicked on account to show detail view");
		Thread.sleep(12000);
		
		accounts.clickAccountOption().click();
		Thread.sleep(2000);
		accounts.clickViewAccount().click();
		logger.info("clicked on view button");
		Thread.sleep(5000);
		

		
		
		driver.findElement(By.xpath("//span[normalize-space()='Cancel']")).click();
		logger.info("Clicked on cancel button");
		/*
		 * if(accounts.ViewAccount().isDisplayed()) { Thread.sleep(2000);
		 * Assert.assertTrue(true); logger.info("View account test passed"); } else {
		 * Assert.assertTrue(false); captureScreen(driver, "viewAccount");
		 * logger.info("view account test failed"); }
		 */
	}

}
