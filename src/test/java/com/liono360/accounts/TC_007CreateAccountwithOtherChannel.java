package com.liono360.accounts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.AccountPage;
import com.liono360.pageObject.LoginPage;

public class TC_007CreateAccountwithOtherChannel extends Baseclass {
	
	@Test
	public void CreateAccountwithOtherchannel() throws InterruptedException, IOException
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
		explWaitToClick(accounts.clickAccounts());
		accounts.clickAccounts().click();
		logger.info("Clicked on Accounts button");
		
		Thread.sleep(20000);
		
		accounts.selectAccountChannel().click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//span[contains(text(),'Sales')]")).click();
		Thread.sleep(2000);
		explWaitToClick(accounts.clickAddNewAccount());
		accounts.clickAddNewAccount().click();
		logger.info("Clicked on create Account");
		Thread.sleep(2000);
		accounts.setAccountName().sendKeys("scriptAcc"+randomnumber());
		logger.info("Account name added");
		Thread.sleep(3000);
		accounts.clickSave().click();
		logger.info("Clicked on save button");
		Thread.sleep(10000);
		
		if(accounts.addedAccount().isDisplayed())
		{
			Assert.assertTrue(true);
			logger.info("Add account test passed");
		}
		else
		{
			Assert.assertTrue(false);
			captureScreen(driver, "addAccount");
			logger.info("Add account test failed");
		}
	}

}
