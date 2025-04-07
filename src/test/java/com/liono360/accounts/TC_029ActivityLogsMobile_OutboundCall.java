

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

public class TC_029ActivityLogsMobile_OutboundCall extends Baseclass {
	
	@SuppressWarnings({"unused"})
	@Test
	public void ActivityLogsMobile_OutboundCallTest () throws InterruptedException, AWTException {
		

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
		TryClick(account.AddLogsbtn());
		logger.info("Clicked on Add logs button");

//Logs_Mobile Outbound_Add:---------------------------------------------------------------------------------------------------------------------
		
		
		waitUntilPageLoad();
		Thread.sleep(1000);
		TryClick(account.SelectLogsType());
		logger.info("Clicked on Selet Type ");
		
		Thread.sleep(2000);
		TryClick(account.LogsMobiles());
		logger.info("Selected Mobile Option");
		
		
		TryClick( account.SubTypes());
		TryClick(account.Outbond());
		logger.info("Outbound option is Selected");
		
		account.commentsLogs().sendKeys("The Mobile Outbound Logs is Added");
		logger.info("sendKeys ClickLogs");
		
		
		account.Attachements().click();
		waitUntilPageLoad();
		Thread.sleep(2000);
		StringSelection filepath= new StringSelection("C:\\Users\\Testing\\Documents\\lead_records.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null);
		Robot robot=new Robot();	
		robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);  // CTRL+V to paste the file path
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        // Press Enter to upload the file
        robot.keyPress(KeyEvent.VK_ENTER);  // Press Enter to confirm file upload
        robot.keyRelease(KeyEvent.VK_ENTER);
       
        Thread.sleep(2000);
        logger.info("Fill Uploaded Successfully");
   
        Thread.sleep(2000);
        TryClick(account.SaveLogs());
        logger.info("Mobile Outbound Logs Saved Successfully");
        
 // Logs_Mobile Outbound_Edit -------------------------------------------------------------------------------------------------------------
        
        waitUntilPageLoad();
        TryClick(account.OpenEmailLogs());
        logger.info("Mobile Outbound Logs Open Successfully");
        
        TryClick(account.EditLogs());
        logger.info("Clicked on Edit Button");
        
        waitUntilPageLoad();
		Thread.sleep(2000);
		account.commentsLogs().clear();
		account.commentsLogs().sendKeys("This is the Updated Mobile Outbound Logs");
		logger.info("Mobile Inbound Comment is Updated");
		
		account.Attachements().click();
		waitUntilPageLoad();
		Thread.sleep(2000);
		StringSelection filepathUpdated= new StringSelection("C:\\Users\\Testing\\Documents\\us_lead_records.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepathUpdated, null);
		Robot robotUpdated=new Robot();	
		robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);  // CTRL+V to paste the file path
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);  // Press Enter to confirm file upload
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
        logger.info("Fill Uploaded Successfully");
        
       
        waitUntilPageLoad();
		Thread.sleep(2000);
		account.EditcommentsLogs().sendKeys("This is new Edited Comment");
		logger.info("New Mobile Outbound Comment is added on Editing");
        

        Thread.sleep(2000);
        TryClick(account.SaveEditLog());
        logger.info("Mobile Outbound Logs is Updated Successfully");
        
// Logs_Mobile Outbound_Delete----------------------------------------------------------------------------------------------------------       
       
        waitUntilPageLoad();
        TryClick(account.OpenEmailLogs());
        logger.info("Mobile Outbound Logs Open Successfully");
        
        waitUntilPageLoad();
        Thread.sleep(1000);
        TryClick(account.DeleteLogs());
        logger.info("Click on Delete Button");
        
        waitUntilPageLoad();
        Thread.sleep(1000);
        TryClick(account.YesDeleteLogs());
        logger.info("Click on Yes Button & Mobile Outbound Logs Deleted Successfully");
        
        waitUntilPageLoad();
        Thread.sleep(1000);
        TryClick(account.Corssbtn());
        logger.info("Account Record is closed");
	
	}
}
