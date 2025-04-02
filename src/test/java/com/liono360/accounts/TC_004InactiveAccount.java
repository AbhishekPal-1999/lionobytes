package com.liono360.accounts;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.AccountPage;
import com.liono360.pageObject.LoginPage;

public class TC_004InactiveAccount extends Baseclass{
	
	@Test
	public void TC005InactiveAccount() throws InterruptedException, IOException
	{
		

		AccountPage accounts = new AccountPage(driver);
		//explWaitToClick(accounts.clickAccounts());
		Thread.sleep(12000);
		accounts.clickAccounts().click();
		logger.info("Clicked on Accounts button");


		Thread.sleep(8000); 
		accounts.AccountoptionDrp().click(); 
		explWaitToClick(driver.findElement(By.xpath("//span[text()='Automation']")));
		driver.findElement(By.xpath("//span[text()='Automation']")).click();
		logger.info("select on dropdown");



		
		
	//	explWaitToClick(accounts.addedAccount());
	    Thread.sleep(10000);
		mouseActionRightClick(driver, accounts.addedAccount());
		logger.info("Right clicked on added account");
		
		Thread.sleep(3000);
		accounts.clickInactiveAccount().click();
		logger.info("Clicked on inactive button");
		
		
		
		Thread.sleep(2000);
		accounts.InactiveReason().click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[normalize-space()='Inactive'])[1]"));
		driver.findElement(By.xpath("(//span[normalize-space()='Inactive'])[1]")).click();
		logger.info("select dropdown value");
		
		
		
		
		
		
		
		Thread.sleep(2000);
		accounts.setComment().sendKeys("Deactive account");
		
		Thread.sleep(9000);
		accounts.clickSave().click();
		
		//accounts.showInactiveAccountsList().click();
		Thread.sleep(10000);
		
		
		if(accounts.addedAccount().isDisplayed())
		{
			Assert.assertTrue(true);
			logger.info("Inactive account test passed");
		}
		else
		{
			Assert.assertTrue(false);
			captureScreen(driver, "InactiveAccount");
			logger.info("Inactive account test failed");
		}
		
	}

}
