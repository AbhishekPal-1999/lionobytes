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

public class TC_015ActivityLogsLogs extends Baseclass{
	
	
	@Test
	public void ActivityLogsLogsTest () throws InterruptedException, AWTException {
		
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
		
		
		
		
		
		Thread.sleep(10000);
		//explWaitToClick(account.Iconactivityaccount());
		account.Iconactivityaccount().click();
		logger.info("Clicked Iconactivityaccount button");
		
		
		Thread.sleep(10000);
		//explWaitToClick(account.ClickLogs());
		account.ClickLogs().click();
		logger.info("Clicked ClickLogs button");
		
		
		Thread.sleep(10000);
		//explWaitToClick(account.SelectLogtype());
		account.SelectLogtype().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='Field Visit']")));
		driver.findElement(By.xpath("//span[text()='Field Visit']")).click();
		logger.info("select on dropdown");
		
		
		Thread.sleep(10000);
		//explWaitToClick(account.commentsLogs());
		account.commentsLogs().sendKeys("Add Logs");
		logger.info("sendKeys ClickLogs ");
		
		
		Thread.sleep(10000);
		//explWaitToClick(account.Attachements());
		account.Attachements().click();
		Thread.sleep(20000);
		StringSelection filepath= new StringSelection("");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null);
		Robot robot=new Robot();	
		//now press CTRL
		robot.keyPress(KeyEvent.VK_ENTER);
	      //releasing enter
		robot.keyRelease(KeyEvent.VK_ENTER);
	      //pressing ctrl+v
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
	      //releasing ctrl+v
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
	      //pressing enter
		robot.keyPress(KeyEvent.VK_ENTER);
	      //releasing enter
		robot.keyRelease(KeyEvent.VK_ENTER);
	    Thread.sleep(10000);  
	    logger.info("File upload sucessfully");
	     
	    
		Thread.sleep(10000);
		// explWaitToClick(account.commentsLogs());
		account.SaveLogs().click();
		logger.info("click on SaveLogs ");

		
		Thread.sleep(10000);
		// explWaitToClick(account.commentsLogs());
		account.clickEditLogbtn().click();
		logger.info("click on clickEditLogbtn ");

		
		Thread.sleep(10000);
		// explWaitToClick(account.commentsLogs());
		account.Elogs().click();
		logger.info("click on Elogs ");

		
		Thread.sleep(10000);
		// explWaitToClick(account.commentsLogs());
		account.Clogs().sendKeys("New Log Added");
		logger.info("sendKeys on Clogs ");

		
		Thread.sleep(10000);
		// explWaitToClick(account.commentsLogs());
		account.Slogs().click();
		logger.info("click on Slogs ");
		
		
		Thread.sleep(10000);
		// explWaitToClick(account.commentsLogs());
		account.Save56().click();
		logger.info("click on Save56 ");
		
		
	}

}
