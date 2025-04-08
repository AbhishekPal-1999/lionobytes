package com.liono360.accounts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.AccountsPage;

public class TC_005DeleteAccount extends Baseclass {
	
	@Test
	public void DeleteAccountTest () throws InterruptedException, IOException {
		redirectToCRM();
		
		
		AccountsPage account = new AccountsPage(driver);
		
		Thread.sleep(15000);
		account.Deleteaccountbtn().click();
		logger.info("Clicked on Deleteaccountbtn button");
		
		
		 Thread.sleep(8000); 
		 account.AccountoptionDrp().click(); 
		  explWaitToClick(driver.findElement(By.xpath("//span[text()='Automation']")));
		  driver.findElement(By.xpath("//span[text()='Automation']")).click();
		  logger.info("select on dropdown");
		
		
		
		Thread.sleep(8000);
		//account.DropdownSelectAccount().click();
		Thread.sleep(2000);
		/*
		 * explWaitToClick(driver.findElement(By.xpath("//span[text()='Automation']")));
		 * driver.findElement(By.xpath("//span[text()='Automation']")).click();
		 * logger.info("select on DropdownSelectAccount");
		 */
		
	//	explWaitToClick(account.VerifyGlobalSearch());
		//account.VerifyGlobalSearch().sendKeys("SName861");
		//logger.info("sendkeys on Global Search button");
		
		
		Thread.sleep(5000);
		mouseActionRightClick(driver, account.AccountNameClick());
		
	//	Thread.sleep(10000);
	//	account.DeleteAccountName().click();
	//	logger.info("Clicked on DeleteAccountName button");
		
	//	Thread.sleep(10000);
	//	account.DeleteAccountIconbar().click();
	//	logger.info("Clicked on DeleteAccountIconbar button");
		

		Thread.sleep(10000);
		account.clickondeletebtn().click();
		logger.info("Clicked on clickondeletebtn button");
		
		
		Thread.sleep(10000);
		account.clickOnYesbtn().click();
		logger.info("Clicked on clickOnYesbtn button");
		
		
		String deleteaccountname = account.ListeddeleteAccount().getText();	
		Thread.sleep(5000);
		String listedContactAfterDelete = account.ListeddeleteAccount().getText();
		if (deleteaccountname.equalsIgnoreCase(listedContactAfterDelete)) {
			Assert.assertTrue(true);
			logger.info("Add account DELETE test passed");

		}
		else {
			Assert.assertTrue(false);
			captureScreen(driver, "addAccount");
			logger.info("Add account DELETE test failed");

		
	}

	}
		
		
		
	}


