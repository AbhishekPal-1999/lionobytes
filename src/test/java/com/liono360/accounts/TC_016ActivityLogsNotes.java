

package com.liono360.accounts;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.AccountsPage;
import com.liono360.pageObject.LoginPage;

public class TC_016ActivityLogsNotes extends Baseclass {
	
	@Test
	public void ActivityLogsNotesTest () throws InterruptedException, AWTException {
		
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
		//explWaitToClick(account.accountOwner());
		account.AccountoptionDrp().click();
		Thread.sleep(2000);
//		explWaitToClick(driver.findElement(By.xpath("//span[text()='Automation']")));
//		driver.findElement(By.xpath("//span[text()='Automation']")).click();
//		logger.info("select on dropdown");
		
		
		Thread.sleep(7000);
		//explWaitToClick(account.clickactivityaccount());
		account.clickactivityaccount().click();
		logger.info("Clicked clickactivityaccount button");
		
		
		Thread.sleep(20000);
		//explWaitToClick(account.clickactivityaccount());
		account.Activitybtn().click();
		logger.info("Clicked Activitybtn button");
		
		
		Thread.sleep(5000);
		//explWaitToClick(account.Iconactivityaccount());
		account.Iconactivityaccount().click();
		logger.info("Clicked Iconactivityaccount button");
		
		Thread.sleep(5000);
		//explWaitToClick(account.NotesL());
		account.NotesL().click();
		logger.info("Clicked NotesL button");
		
		
		Thread.sleep(4000);
		//explWaitToClick(account.NotesC());
		account.NotesC().sendKeys("Notes Added");
		logger.info("sendKeys NotesC");
		
		
		Thread.sleep(4000);
		//explWaitToClick(account.NotesAttachements());
	//	account.NotesAttachements().click();
	
		
		String filepath=System.getProperty("user.dir") + "\\TestData\\Contact.png";
		/*
		 * Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null);
		 */
		  account.NotesAttachements().sendKeys(filepath);
			/*
			 * Robot robot=new Robot(); //now press CTRL robot.keyPress(KeyEvent.VK_ENTER);
			 * //releasing enter robot.keyRelease(KeyEvent.VK_ENTER); //pressing ctrl+v
			 * robot.keyPress(KeyEvent.VK_CONTROL); robot.keyPress(KeyEvent.VK_V);
			 * //releasing ctrl+v robot.keyRelease(KeyEvent.VK_CONTROL);
			 * robot.keyRelease(KeyEvent.VK_V); //pressing enter
			 * robot.keyPress(KeyEvent.VK_ENTER); //releasing enter
			 * robot.keyRelease(KeyEvent.VK_ENTER);
			 */
	
		
		Thread.sleep(5000);
		logger.info("File upload sucessfully");

		
		Thread.sleep(7000);
		// explWaitToClick(account.NotesS());
		account.NotesS().click();
		logger.info("Clicked NotesS button");
		
	
	//..............Edit Notes............//
	
	
	Thread.sleep(7000);
	// explWaitToClick(account.EditN());
	account.EditN().click();
	logger.info("Clicked EditN button");
	
	
	Thread.sleep(5000);
	// explWaitToClick(account.EditI());
	account.EditI().click();
	logger.info("Clicked EditI button");
	
	
	
	Thread.sleep(5000);
	// explWaitToClick(account.EditC());
	account.EditC().sendKeys("New Note Added");
	logger.info("Clicked EditC button");
	
	
	Thread.sleep(10000);
	// explWaitToClick(account.EditS());
	account.EditS().click();
	logger.info("Clicked EditS button");
	Thread.sleep(10000);
	driver.findElement(By.xpath("//span[contains(text(),'Save')]")).click();
	logger.info("Clicked Save button");

	
	
	}
}
