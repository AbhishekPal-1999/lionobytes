package com.liono360.accounts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.AccountsPage;
import com.liono360.pageObject.LoginPage;

public class TC_013DeleteAccountWithoutCustomFiled extends Baseclass{
	
	@Test
	public void DeleteAccountWithoutCustomFiledTest () throws InterruptedException, IOException {
		
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
		
		explWaitToClick(account.clickAccounts());
		account.clickAccounts().click();
		logger.info("Clicked on clickAccounts button");
		
		Thread.sleep(2000);
		account.DropdownSelectAccount().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='Automation']")));
		driver.findElement(By.xpath("//span[text()='Automation']")).click();
		logger.info("select on DropdownSelectAccount");
		
		explWaitToClick(account.RightClickonAccountname());
		mouseActionRightClick(driver, account.RightClickonAccountname());
		
		explWaitToClick(account.DeleteAccountopt());
		account.DeleteAccountopt().click();
		logger.info("Clicked on DeleteAccountopt button");
		
		
		explWaitToClick(account.YesCustomFiled());
		account.YesCustomFiled().click();
		logger.info("Clicked on YesCustomFiled button");
		

		String deleteaccountname = account.DeleteListedCase().getText();	
		Thread.sleep(5000);
		String listedaccountAfterDelete = account.DeleteListedCase().getText();
		if (deleteaccountname.equalsIgnoreCase(listedaccountAfterDelete)) {
			Assert.assertTrue(true);
			logger.info("Add account DELETE test failed");

		}
		else {
			Assert.assertTrue(false);
			captureScreen(driver, "addAccount");
			logger.info("Add account DELETE test failed");
		
	    }
	}
}

	
	


