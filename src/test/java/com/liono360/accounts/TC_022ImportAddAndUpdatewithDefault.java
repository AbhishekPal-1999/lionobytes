package com.liono360.accounts;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.AccountsPage;
import com.liono360.pageObject.LoginPage;
public class TC_022ImportAddAndUpdatewithDefault extends Baseclass{
	@Test
	public void ImportAddAndUpdatewithDefaultTest () throws InterruptedException, AWTException {
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
		
		Thread.sleep(8000);
		//explWaitToClick(account.clickAccounts());
		account.clickAccounts().click();
		logger.info("Clicked on Account button");
		
		Thread.sleep(20000);
		//explWaitToClick(account.AccountoptionDrp());
		account.AccountoptionDrp().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='Akash_Automation']")));
		driver.findElement(By.xpath("//span[text()='Akash_Automation']")).click();
		logger.info("select on dropdown");
		
		Thread.sleep(5000);
		//explWaitToClick(account.clickAccounts());
		account.ClickList().click();
		logger.info("Clicked on ClickList button");
		
		Thread.sleep(5000);
		//explWaitToClick(account.clickImport());
		account.clickImport().click();
		logger.info("Clicked on clickImport button");
		
		Thread.sleep(5000);
		explWaitToClick(account.AddUpdate());
		account.AddUpdate().click();
		logger.info("Clicked on AddUpdate button");
		
		Thread.sleep(10000);
		//explWaitToClick(account.ChooseFile());
		account.ChooseFile().click();
		Thread.sleep(5000);
		StringSelection filepath= new StringSelection("C:\\Users\\Upadpro User\\Downloads\\Account.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null);
		Robot robot=new Robot();	
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		logger.info("log 1");
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(10000);
		logger.info("File Upload");

		Thread.sleep(5000);
		account.Next().click();
		logger.info("Clicked on Next button");
		
		Thread.sleep(5000);
		account.Next().click();
		logger.info("Clicked on Next button");
		
		Thread.sleep(5000);
		account.ClickUpload().click();
		logger.info("Clicked on ClickUpload button");
		
		
		//...................File Imported............................//
		
		
		Thread.sleep(8000);
		account.ProfileClick().click();
		logger.info("Clicked on ProfileClick button");
			
		
		
		Thread.sleep(5000);
		account.Cprofile().click();
		logger.info("Clicked on Cprofile button");
			
		
		Thread.sleep(5000);
		account.Cimport().click();
		logger.info("Clicked on Cimport button");
			
		
		Thread.sleep(5000);
		account.ClickImportedFile().click();
		logger.info("Clicked on ClickImportedFile button");
			
		
		
		
		
			
	    }
   }
