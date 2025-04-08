package com.liono360.accounts;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.AccountsPage;
import com.liono360.pageObject.LoginPage;

public class TC_018CheckAllActivity extends Baseclass{
	
	@Test
	public void CheckAllActivityTest () throws InterruptedException {
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
		
		Actions action = new Actions(driver);
		AccountsPage account = new AccountsPage(driver);
		
		Thread.sleep(20000);
		//explWaitToClick(account.clickAccounts());
		account.clickAccounts().click();
		logger.info("Clicked on Account button");
		
		
		Thread.sleep(20000);
		//explWaitToClick(account.AccountoptionDrp());
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
		//explWaitToClick(account.CheckAllActivityicon());
		account.CheckAllActivityicon().click();
		logger.info("Clicked CheckAllActivityicon button");
		
		
		Thread.sleep(20000);
		//explWaitToClick(account.UserActivity());
		account.UserActivity().click();
		logger.info("Clicked UserActivity button");
		
		
		Thread.sleep(20000);
		//explWaitToClick(account.CheckAllActivityicon());
		account.CheckAllActivityicon().click();
		logger.info("Clicked CheckAllActivityicon button");
		
		
		Thread.sleep(20000);
		//explWaitToClick(account.SystemActivity());
		account.SystemActivity().click();
		logger.info("Clicked SystemActivity button");
		
		Thread.sleep(20000);
		//explWaitToClick(account.CheckAllActivityicon());
		account.CheckAllActivityicon().click();
		logger.info("Clicked CheckAllActivityicon button");
		
		
		Thread.sleep(20000);
		//explWaitToClick(account.FavouriteActivity());
		account.FavouriteActivity().click();
		logger.info("Clicked FavouriteActivity button");
		
		
	}
	
}
