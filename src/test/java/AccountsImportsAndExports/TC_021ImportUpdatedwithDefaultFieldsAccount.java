package AccountsImportsAndExports;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.AccountsPage;

import ExcelWriteCodeImports.TC_005UpdateDataExcelFileOnAccount;

public class TC_021ImportUpdatedwithDefaultFieldsAccount extends Baseclass {
	@Test
	public void ImportUpdatedwithDefaultFieldsTest()
			throws InterruptedException, AWTException, FileNotFoundException, IOException {
		//redirectToCRM();

		Actions action = new Actions(driver);
		AccountsPage account = new AccountsPage(driver);

		TryClick(account.clickAccounts());
		logger.info("Clicked on Account button");

		SelectDropdown(account.AccountoptionDrp(), 3);
		logger.info("select on Imports Channel");

		TryClick(account.ActionButton());
		logger.info("Clicked on Action");

		TryClick(account.clickImport());
		logger.info("Clicked on clickImport button");

		Thread.sleep(5000);
		TC_005UpdateDataExcelFileOnAccount update1 = new TC_005UpdateDataExcelFileOnAccount();
		update1.TryExcelFileWriteCodeTest();
		logger.info("Excel Data Write");

		Thread.sleep(4000);
		String filepath = System.getProperty("user.dir")
				+ "\\TestData\\Excel-Files-Accounts\\Account_Update Imports_With Default Fileds 1.1.xlsx";
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type=\"file\"]")).sendKeys(filepath);
		logger.info("File Upload");

		
		  TryClick(account.Next()); 
		  logger.info("Clicked on Next button");
		  
		  
		  
			/*
			 * Thread.sleep(20000); account.AccountOw().click(); Thread.sleep(2000);
			 * explWaitToClick(driver.findElement(By.xpath("//span[text()='Phone - phone']")
			 * )); driver.findElement(By.xpath("//span[text()='Phone - phone']")).click();
			 * logger.info("select on dropdown");
			 */
		  
		  
		  
		  
		  
		  
		  TryClick(account.Next()); 
		  logger.info("Clicked on Next button");
		  
		  
		  TryClick(account.ClickUpload());
		  logger.info("Clicked on ClickUpload button");
		  
		  //...................File Imported............................//
		  
		  
		  TryClick(account.ProfileClick());
		  logger.info("Clicked on ProfileClick button");
		  
		  
		  
		  TryClick(account.Cprofile()); 
		  logger.info("Clicked on Cprofile button");
		  
		  
		  TryClick(account.Cimport()); 
		  logger.info("Clicked on Cimport button");
		  
		  
		  TryClick(account.ClickImportedFile());
		  logger.info("Clicked on ClickImportedFile button");
		  
		  
		  //..............................//
		  
		  
		  Thread.sleep(5000); 
		  checkStatusOfFile();
		  
		  
		  
		  
		  TryClick(account.clickAccounts()); 
		  logger.info("Clicked on Account button");
		  
		  TryClick(account.AccountNameClick());
		  logger.info("Clicked on AccountNameClick button");
		  
		  
		  TryClick(account.ActivityC()); 
		  logger.info("Clicked on ActivityC button"); 
		  
		  TryClick(account.CrossSign()); 
		  logger.info("Clicked on CrossSign");
	
	
	}
		  public void checkStatusOfFile() throws InterruptedException { while(true) {
		  driver.findElement(By.xpath("//span[@ptooltip='Refresh']")).click();
		  logger.info("clicked on refresh button"); Thread.sleep(5000); String
		  CurrentStatus = driver.findElement(By.xpath("//tbody//tr[1]//td[5]")).getText();
		  
		  if(CurrentStatus.equals("Completed")) {
		  logger.info("import is completed now"); break; } 
		  Thread.sleep(8000);
		  
		  }
		 

	}

}
