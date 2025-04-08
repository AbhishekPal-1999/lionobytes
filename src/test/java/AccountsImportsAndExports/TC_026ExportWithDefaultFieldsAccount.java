package AccountsImportsAndExports;


import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.AccountsPage;
import com.opencsv.exceptions.CsvValidationException;

import ExcelWriteCodeImports.TC_008WriteCodeExportAccount;




public class TC_026ExportWithDefaultFieldsAccount extends Baseclass {
	@Test
	public void ExportWithDefaultFieldsTest()
			throws InterruptedException, IOException, CsvValidationException, AWTException {
		redirectToCRM();

		Actions action = new Actions(driver);
		AccountsPage account = new AccountsPage(driver);

		Thread.sleep(10000);
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
		account.ExportClick().click();
		logger.info("Clicked on Export button");

		Thread.sleep(5000);
		account.ExportClick2().click();
		logger.info("Clicked on ExportClick2 button");

		Thread.sleep(5000);
		account.Yes1().click();
		logger.info("Clicked on Yes1 button");

		Thread.sleep(5000);
		account.ProfileClick().click();
		logger.info("Clicked on ProfileClick button");

		Thread.sleep(5000);
		account.Cprofile().click();
		logger.info("Clicked on Cprofile button");

		Thread.sleep(5000);
		account.Cimport().click();
		logger.info("Clicked on Cimport button");

		Thread.sleep(5000);
		account.importPlus().click();
		logger.info("Clicked on importPlus button");

		Thread.sleep(5000);
		account.ModuleName1().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[normalize-space()='Account']")));
		driver.findElement(By.xpath("//span[normalize-space()='Account']")).click();
		logger.info("select on dropdown");

		Thread.sleep(5000);
		account.ChannelName1().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("(//span[normalize-space()='Automation'])[1]")));
		driver.findElement(By.xpath("(//span[normalize-space()='Automation'])[1]")).click();
		logger.info("select on dropdown");

		Thread.sleep(5000);
		account.Update().click();
		logger.info("Clicked on Update button");

		Thread.sleep(5000);
		TC_008WriteCodeExportAccount Exportimport = new TC_008WriteCodeExportAccount();
		Thread.sleep(2000);
		Exportimport.updateCsvFile();
		logger.info("Excel Data Write");

		
		  
		 
		
		Thread.sleep(4000);
		String filepath=System.getProperty("user.dir") + "\\TestData\\Export-Csv Files\\Account-Export With Default Fileds.csv";
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type=\"file\"]"))
		.sendKeys(filepath);
		logger.info("File Upload");
		
		
		
	
		Thread.sleep(10000);
		account.Next().click();
		logger.info("Clicked on Next button");

		/*
		 * Thread.sleep(20000); account.AccountOw().click(); Thread.sleep(2000);
		 * explWaitToClick(driver.findElement(By.
		 * xpath("//span[normalize-space()='Account Number - accountNumber']")));
		 * driver.findElement(By.
		 * xpath("//span[normalize-space()='Account Number - accountNumber']")).click();
		 * logger.info("select on dropdown");
		 */

		Thread.sleep(5000);
		account.Next().click();
		logger.info("Clicked on Next button");

		Thread.sleep(5000);
		account.ClickUpload().click();
		logger.info("Clicked on ClickUpload button");

		// ...................File Imported............................//

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

		//..............................//
		
				Thread.sleep(5000);
				checkStatusOfFile();
				
				
				
				Thread.sleep(8000);
				account.clickAccounts().click();
				logger.info("Clicked on Account button");
				
				Thread.sleep(10000);
				account.AccountNameClick().click();
				logger.info("Clicked on AccountNameClick button");
				
				
				Thread.sleep(10000);
				account.ActivityC().click();
				logger.info("Clicked on ActivityC button");
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
				