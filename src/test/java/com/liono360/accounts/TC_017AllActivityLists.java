package com.liono360.accounts;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.AccountsPage;
import com.liono360.pageObject.LoginPage;

public class TC_017AllActivityLists extends Baseclass{
	
	@Test
	public void AllActivityListsTest () throws InterruptedException {
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
		
		Thread.sleep(20000);
		//explWaitToClick(account.clickAccounts());
		account.clickAccounts().click();
		logger.info("Clicked on Account button");
		
		
		Thread.sleep(20000);
		//explWaitToClick(account.accountOwner());
		account.AccountoptionDrp().click();
		Thread.sleep(2000);
		/*
		 * explWaitToClick(driver.findElement(By.xpath("//span[text()='Automation']")));
		 * driver.findElement(By.xpath("//span[text()='Automation']")).click();
		 * logger.info("select on dropdown");
		 */
		
		
		
		Thread.sleep(20000);
		//explWaitToClick(account.clickactivityaccount());
		account.clickactivityaccount().click();
		logger.info("Clicked clickactivityaccount button");
		
		
		
		Thread.sleep(20000);
		//explWaitToClick(account.clickactivityaccount());
		account.Activitybtn().click();
		logger.info("Clicked Activitybtn button");
		
		
		Thread.sleep(20000);
		//explWaitToClick(account.AllActivityClick());
		account.AllActivityClick().click();
		logger.info("Clicked AllActivityClick button");
		
		
		Thread.sleep(20000);
		//explWaitToClick(account.MostRecentdrp());
		account.MostRecentdrp().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[normalize-space()='Last 15 days']")));
		driver.findElement(By.xpath("//span[normalize-space()='Last 15 days']")).click();
		logger.info("select on dropdown");
		
		
		

		Thread.sleep(8000);
		//explWaitToClick(account.Favourite1());
		account.Clickcross().click();
		logger.info("Clicked Clickcross button");
		
		
		
		
		Thread.sleep(8000);
		//explWaitToClick(account.Favourite1());
		account.Favourite1().click();
		logger.info("Clicked Favourite1 button");
		
		
		Thread.sleep(8000);
		//explWaitToClick(account.Favourite2());
		account.Favourite2().click();
		logger.info("Clicked Favourite2 button");
		
		
		
	}

}
