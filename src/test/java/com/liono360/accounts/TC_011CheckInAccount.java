package com.liono360.accounts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.AccountsPage;

public class TC_011CheckInAccount extends Baseclass{
	
	@Test
	public void CheckInTestAccount () throws InterruptedException, IOException {
		
		redirectToCRM();
		
		
		
		
		AccountsPage account = new AccountsPage(driver);
		
		
		Thread.sleep(15000);
		account.CheckAccountbtn().click();
		logger.info("Clicked on CheckAccountbtn button");
		
		
		 Thread.sleep(8000); 
		  account.AccountoptionDrp().click(); 
		  explWaitToClick(driver.findElement(By.xpath("//span[text()='Automation']")));
		  driver.findElement(By.xpath("//span[text()='Automation']")).click();
		  logger.info("select on dropdown");
		
		
		
	
		Thread.sleep(3000);
		//explWaitToClick(account.accountOwner());
		//account.AccountoptionDrp().click();
		Thread.sleep(2000);
		/*
		 * explWaitToClick(driver.findElement(By.xpath("//span[text()='Automation']")));
		 * driver.findElement(By.xpath("//span[text()='Automation']")).click();
		 * logger.info("select on dropdown");
		 */
		
		//explWaitToClick(account.VerifyGlobalSearch());
		//account.VerifyGlobalSearch().sendKeys("SName861");
		//logger.info("sendkeys on Global Search button");
		
		
		Thread.sleep(5000);
		mouseActionRightClick(driver, account.AccountNameClick());
		
		//Thread.sleep(10000);
	//	account.CheckAccountnamebtn().click();
		//logger.info("Clicked on CheckAccountnamebtn button");
		
	//	Thread.sleep(10000);
	//	account.CheckAccountIcon().click();
	//	logger.info("Clicked on CheckAccountIcon button");
		
		
		Thread.sleep(5000);
		account.ClickOnCheckIn().click();
		logger.info("Clicked on ClickOnCheckIn button");
		
		
		Thread.sleep(5000);
		account.clickonYes().click();
		logger.info("Clicked on clickonYes button");
		
		
		//Thread.sleep(5000);
		//account.ClickonCheckout().click();
		//logger.info("Clicked on ClickonCheckout button");
		
		
			
		/*
		 * Thread.sleep(5000); String resultCheckIn =
		 * account.ListedCheckInAccount().getText();
		 * 
		 * if (resultCheckIn.contains(resultCheckIn)) { Assert.assertTrue(true);
		 * logger.info("search ListedCheckInAccount name test passed");
		 * 
		 * } else { Assert.assertTrue(false); captureScreen(driver,
		 * "ListedCheckInAccount name");
		 * logger.info("search ListedCheckInAccount name test failed");
		 * 
		 * }
		 */

		}
	}


