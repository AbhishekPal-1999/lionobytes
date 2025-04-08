package AccountsImportsAndExports;


import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.AccountsPage;
import com.liono360.pageObject.LoginPage;

import ExcelWriteCodeImports.TC_015WriteCodeAddAndUpdateMultiContactsAccounts;



public class TC_029AddAndUpdateMultipleContactsOnAccounts extends Baseclass{

	@Test
	public void TC_029AddExistingAccountMultiContactsTest () throws InterruptedException, FileNotFoundException, IOException {
		
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

		Thread.sleep(10000);
		//explWaitToClick(account.clickAccounts());
		account.clickAccounts().click();
		logger.info("Clicked on Account button");
		
		Thread.sleep(20000);
		account.AccountoptionDrp().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("(//span[normalize-space()='Automation'])[1]")));
		driver.findElement(By.xpath("(//span[normalize-space()='Automation'])[1]")).click();
		logger.info("select on dropdown");
		
		Thread.sleep(16000);
		account.ActionButton().click();
		logger.info("Clicked on Action");
		
		
		
		
		Thread.sleep(5000);
		account.clickImport().click();
		logger.info("Clicked on clickImport button");


		
		
	        Thread.sleep(2000);
	 		account.ModuleName1().click();
			Thread.sleep(2000);
			explWaitToClick(driver.findElement(By.xpath("(//span[text()='Account'])[2]")));
			driver.findElement(By.xpath("(//span[text()='Account'])[2]")).click();
			logger.info("select on dropdown for module name");
			
		
		
			    Thread.sleep(2000);
		 		account.ChannelName1().click();
				Thread.sleep(2000);
				explWaitToClick(driver.findElement(By.xpath("(//span[text()='Default Channel'])[2]")));
				driver.findElement(By.xpath("(//span[text()='Default Channel'])[2]")).click();
				logger.info("select on dropdown NumberOfEmp ");
				
		
				
				
				Thread.sleep(5000);
				account.AddUpdate().click();
				logger.info("Clicked on Add&Update");
		
		
		
		Thread.sleep(5000);
		TC_015WriteCodeAddAndUpdateMultiContactsAccounts multiexisting = new TC_015WriteCodeAddAndUpdateMultiContactsAccounts ();
		multiexisting.TryExcelFileWriteCodeTest();
		logger.info("Excel Data Write");
		
		
		Thread.sleep(4000);
		String filepath=System.getProperty("user.dir") + "\\TestData\\Excel-Files-Accounts\\Account_AddAndUpdateMultipleContacts.xlsx";
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type=\"file\"]"))
		.sendKeys(filepath);
		logger.info("File Upload");

		
		Thread.sleep(10000);
		account.Next().click();
		logger.info("Clicked on Next button");

		
		//Thread.sleep(20000);
		//explWaitToClick(account.accountOwner());
		//account.AccountOw().click();
		//Thread.sleep(2000);
		//explWaitToClick(driver.findElement(By.xpath("//span[text()='Phone - phone']")));
		//driver.findElement(By.xpath("//span[text()='Phone - phone']")).click();
		//logger.info("select on dropdown");
		
		
		
		
		
		
		Thread.sleep(5000);
		account.Next().click();
		logger.info("Clicked on Next button");
		
		Thread.sleep(5000);
		account.ClickUpload().click();
		logger.info("Clicked on ClickUpload button");	
		
		//...................File Imported............................//
		
		
		Thread.sleep(10000);
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
		

		Thread.sleep(5000);
		checkStatusOfFile();
		
		
		
		//.............Replay....................//
		/*
		 * Thread.sleep(20000); account.Replay().click();
		 * logger.info("Clicked on Replay button");
		 * 
		 * Thread.sleep(40000); account.Replay().click();
		 * logger.info("Clicked on Replay button");
		 */
		
		//.....................................//
		
		
		Thread.sleep(5000);
		account.clickAccounts().click();
		logger.info("Clicked on Accounts btn");
		
		
		Thread.sleep(12000);
		account.AccountNameClick().click();
		logger.info("Clicked on 1st Accounts");
		
		Thread.sleep(12000);
		account.Contacts().click();
		logger.info("Clicked on Contacts");
	
	}
	public void checkStatusOfFile() throws InterruptedException {
        while(true) {
        driver.findElement(By.xpath("//span[@ptooltip='Refresh']")).click();
        logger.info("clicked on refresh button");
        Thread.sleep(5000);
        String CurrentStatus = driver.findElement(By.xpath("//tbody//tr[1]//td[5]")).getText();

        if(CurrentStatus.equals("Completed")) {
            logger.info("import is completed now");
            break;
        }
        Thread.sleep(8000);

        }
}
}
