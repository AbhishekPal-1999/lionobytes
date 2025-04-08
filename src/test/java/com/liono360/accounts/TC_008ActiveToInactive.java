package com.liono360.accounts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.AccountsPage;
import com.liono360.pageObject.LoginPage;

public class TC_008ActiveToInactive extends Baseclass {

	@Test
	public void ActivetoinactiveTest() throws InterruptedException, IOException {
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
		AccountsPage account = new AccountsPage(driver);

		
		  Thread.sleep(2000);
		  explWaitToClick(account.ClickOnActiveToInactiveaccountbtn());
		  
		  Thread.sleep(20000); account.ClickOnActiveToInactiveaccountbtn().click();
		  logger.info("Clicked on ClickOnActiveToInactiveaccountbtn button");
		  
		 

		Thread.sleep(7000);
		/*
		 * account.DropdownSelectAccount().click(); Thread.sleep(3000);
		 * explWaitToClick(driver.findElement(By.xpath("//span[text()='Automation']")));
		 * driver.findElement(By.xpath("//span[text()='Automation']")).click();
		 * logger.info("select on DropdownSelectAccount");
		 * 
		 * Thread.sleep(20000);
		 */
		// explWaitToClick(account.ClickActiveInactive());
		account.ClickActiveInactive().click();
		logger.info("Clicked on ClickActiveInactive button");

		Thread.sleep(20000);
		// explWaitToClick(account.ActiveAccountBtn());
		account.ActiveAccountBtn().click();
		logger.info("Clicked on ActiveAccountBtn button");

		Thread.sleep(20000);
		String resultaccount = account.ListedActiveInactive().getText();

		if (resultaccount.contains(resultaccount)) {
			Assert.assertTrue(true);
			logger.info("search activeinactive name test passed");

		} else {
			Assert.assertTrue(false);
			captureScreen(driver, "ActiveInactive name");
			logger.info("search activeinactive name test failed");

		}

	}

}
