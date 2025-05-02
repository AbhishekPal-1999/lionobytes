package com.liono360.accounts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.AccountPage;
import com.liono360.pageObject.LoginPage;

public class TC_002ViewAccount extends Baseclass {
	
	@Test
	public void TC002_ViewAccount() throws InterruptedException, IOException
	{
		//redirectToCRM();
		AccountPage accounts = new AccountPage(driver);
		Thread.sleep(2000);
	   
		TryClick(accounts.clickAccounts());
		logger.info("Clicked on Accounts button");
		
		waitUntilPageLoad();
		Thread.sleep(10000);
		
		waitUntilDisplay(accounts.addedAccount(),10);
		mouseActionRightClick(driver,accounts.addedAccount());
		Thread.sleep(1000);
		logger.info("Right Clicked on listed accounts");
		
		TryClick(accounts.ViewBtn());
		logger.info("clicked on view button");
		
        waitUntilPageLoad();

// ASSERTION====================================================================================================		

		if(accounts.ViewHeader().isDisplayed())
		{ 

			Assert.assertTrue(true);
			logger.info("View Account test passed");
		}
		else
		{
			Assert.assertTrue(false);
			captureScreen(driver, "View Account test ");
			logger.info("view Account test failed");
		}
		TryClick(accounts.clickCancel());
		logger.info("clicked on cancel");
		
	}



}
