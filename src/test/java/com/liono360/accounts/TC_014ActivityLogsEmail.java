package com.liono360.accounts;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.AccountsPage;
import com.liono360.pageObject.LoginPage;

public class TC_014ActivityLogsEmail extends Baseclass {
	@Test

	public void ActivityLogsTest() throws InterruptedException {
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
		// explWaitToClick(account.clickAccounts());
		account.clickAccounts().click();
		logger.info("Clicked on Account button");

		Thread.sleep(20000);
		// explWaitToClick(account.accountOwner());
		account.AccountoptionDrp().click();
		Thread.sleep(2000);
		/*
		 * explWaitToClick(driver.findElement(By.xpath("//span[text()='Automation']")));
		 * driver.findElement(By.xpath("//span[text()='Automation']")).click();
		 * logger.info("select on dropdown");
		 */

		Thread.sleep(20000);
		// explWaitToClick(account.clickactivityaccount());
		account.clickactivityaccount().click();
		logger.info("Clicked clickactivityaccount button");

		Thread.sleep(20000);
		// explWaitToClick(account.clickactivityaccount());
		account.Activitybtn().click();
		logger.info("Clicked Activitybtn button");

		Thread.sleep(5000);
		// explWaitToClick(account.Iconactivityaccount());
		account.Iconactivityaccount().click();
		logger.info("Clicked Iconactivityaccount button");

		Thread.sleep(10000);
		// explWaitToClick(account.Iconactivityaccount());
		account.Emailactivityaccount().click();
		logger.info("Clicked Emailactivityaccount button");

		// ...........email link following..................

		// comment needed
		
		  
		  Thread.sleep(10000); // explWaitToClick(account.Iconactivityaccount());
		  account.AgainEmailactivityaccount().click();
		  logger.info("Clicked AgainEmailactivityaccount button");
		  
		  Thread.sleep(5000); // explWaitToClick(account.Iconactivityaccount());
		  account.usernameEmail().sendKeys("liono3602022@gmail.com");
		  logger.info("sendkeys on usernameEmail ");
		  
		  Thread.sleep(10000); // explWaitToClick(account.Iconactivityaccount());
		  account.Next1().click(); logger.info("click on Next1 ");
		  
		  Thread.sleep(10000); // explWaitToClick(account.Iconactivityaccount());
		  account.usernamePass().sendKeys("prd@12345");
		  logger.info("sendkeys on usernamePass ");
		  
		  Thread.sleep(10000); // explWaitToClick(account.Iconactivityaccount());
		  account.Next2().click(); logger.info("click on Next2 ");
		  
		  Thread.sleep(10000); // explWaitToClick(account.Iconactivityaccount());
		  account.Next2().click(); logger.info("click on Next2");
		  
		  Thread.sleep(10000); // explWaitToClick(account.Iconactivityaccount());
		  account.Continue().click(); logger.info("click on Continue"); // Email Link
		  
		  
		  
		  Thread.sleep(10000); // explWaitToClick(account.Iconactivityaccount());
		  account.Iconactivityaccount().click();
		  logger.info("Clicked Iconactivityaccount button");
		  
		  Thread.sleep(10000); // explWaitToClick(account.Iconactivityaccount());
		  account.Emailactivityaccount().click();
		  logger.info("Clicked Emailactivityaccount button");
		  
		 

		Thread.sleep(10000);
		// explWaitToClick(account.Iconactivityaccount());
		account.To().sendKeys("akashmogdul15@gmail.com");
		logger.info("sendKeys To");

		Thread.sleep(10000);
		// explWaitToClick(account.Iconactivityaccount());
		account.Subject().sendKeys("Automation Testing");
		logger.info("sendKeys Subject");

		Thread.sleep(10000);
		// explWaitToClick(account.Iconactivityaccount());
		account.WriteEmail().sendKeys("All Test Case Automated");
		logger.info("sendKeys WriteEmail");

		Thread.sleep(10000);
		// explWaitToClick(account.Iconactivityaccount());
		account.Send().click();
		logger.info("click on  Send btn");
	}

}
