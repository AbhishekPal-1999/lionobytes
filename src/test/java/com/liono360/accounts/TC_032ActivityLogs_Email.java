

package com.liono360.accounts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.AccountsPage;
import com.liono360.pageObject.LoginPage;

public class TC_032ActivityLogs_Email extends Baseclass {
	
	@SuppressWarnings({ "unused"})
	@Test
	public void ActivityLogs_Email () throws InterruptedException, AWTException {
		

		Actions action = new Actions(driver);
		AccountsPage account = new AccountsPage(driver);
		
		waitUntilPageLoad();
		account.clickAccounts().click();
		logger.info("Clicked on Account button");
		
		
		waitUntilPageLoad();
		Thread.sleep(2000);
		TryClick(account.ListedAccount());
		logger.info("Clicked on Account Record");
		
		waitUntilPageLoad();
		Thread.sleep(2000);
		TryClick(account.Activitybtn());
		logger.info("Clicked on activityaccount button");
		
	
		waitUntilPageLoad();
		TryClick(account.Activity_Emails());
		logger.info("Clicked on Email Activity");

//Add Email Details---------------------------------------------------------------------------------------------------------------------
		waitUntilPageLoad();
		Thread.sleep(1000);
		
		TryClick(account.Emails_button());
		logger.info("Clicked on Add Email button");
		
		Thread.sleep(2000);
		account.Emails_To().sendKeys("abhishek@lionobytes.com");
		logger.info("Added Recipent Email");
		
		Thread.sleep(2000);
		account.Select_Emails_Template().click();
		SelectDropdown(account.Select_Emails_Template(),1);
		logger.info("Email Template Selected");
		
		Thread.sleep(2000);
		account.Subjects().clear();
		account.Subjects().sendKeys("Account Information"+randomnumber());
		String Email_Subject = account.Subjects().getAttribute("value");
		
		
		TryClick(account.Send_Email_button());
		logger.info("Clicked on Send button");
		
// ASSERTION====================================================================================================

		waitUntilPageLoad();
		Thread.sleep(2000);
		TryClick(account.Email_Refresh_bttn());
		logger.info("Clicked on Refresh button");
		waitUntilPageLoad();
		Thread.sleep(2000);
		String Email_Subject_AfterCreate=account.Email_Subject_Accounts().getText();
		String Actual_Email_Subject = Email_Subject_AfterCreate.split(":")[1].trim();
		System.out.println("Provided Email Subject: "+Email_Subject);
		System.out.println("Listed Email Subject: "+Actual_Email_Subject);
		if (Email_Subject.contains(Actual_Email_Subject)) {
		   Assert.assertTrue(true);
		   logger.info("Email is Sent succcessfully");
		} 

		else {
		       Assert.assertTrue(false);
	           logger.info("Email is not Sent");
				}
				
		}

     }	
	
	

