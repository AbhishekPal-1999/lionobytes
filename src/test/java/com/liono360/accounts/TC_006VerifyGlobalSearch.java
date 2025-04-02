package com.liono360.accounts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.AccountPage;
import com.liono360.pageObject.LoginPage;

public class TC_006VerifyGlobalSearch extends Baseclass {
	
	@Test
	public void GlobalSearchTest() throws InterruptedException, IOException
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
		Thread.sleep(15000);
		
		accounts.setAccountToSearch().sendKeys("ScriptAcc");
		Thread.sleep(10000);
		
		if(accounts.setAccountToSearch().isDisplayed())
		{
			Assert.assertTrue(true);
			logger.info("Search account test passed");
		}
		else
		{
			Assert.assertTrue(false);
			captureScreen(driver, "SearchAccount");
			logger.info("Search account test failed");
		}
	}

}
