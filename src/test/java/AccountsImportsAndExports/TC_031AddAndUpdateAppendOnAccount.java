package AccountsImportsAndExports;


import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.AccountsPage;
import com.liono360.pageObject.LoginPage;



public class TC_031AddAndUpdateAppendOnAccount extends Baseclass {

	public void TC_031AddAndUpdateAppendOnAccountTest () throws InterruptedException, FileNotFoundException, IOException {
		
		
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
		
		//Thread.sleep(20000);
		//explWaitToClick(account.AccountoptionDrp());
		//account.AccountoptionDrp().click();
		//Thread.sleep(2000);
		//explWaitToClick(driver.findElement(By.xpath("//span[text()='Akash_Automation']")));
		//driver.findElement(By.xpath("//span[text()='Akash_Automation']")).click();
		//logger.info("select on dropdown");
		
		Thread.sleep(16000);
		account.ActionButton().click();
		logger.info("Clicked on Action");
		
		
		Thread.sleep(5000);
		account.clickImport().click();
		logger.info("Clicked on clickImport button");

		
		Thread.sleep(5000);
		explWaitToClick(account.AddUpdate());
		account.AddUpdate().click();
		logger.info("Clicked on AddUpdate button");
		
		
		
		
		Thread.sleep(5000);
		ExcelWriteCodeImports.TC_021AppendAddAndUpdateExcelCodeOnAccount AddupdateApp = new ExcelWriteCodeImports.TC_021AppendAddAndUpdateExcelCodeOnAccount ();
		AddupdateApp.TryExcelFileWriteCodeTest();
		logger.info("Excel Data Write");
		
		
		//Thread.sleep(4000);
		//driver.findElement(By.xpath("//input[@type=\"file\"]"))
		//.sendKeys("D:\\Akash\\Liono360\\TestData\\Account_ImportExcelFile.xlsx");
		//AAlogger.info("File Upload");

		
		
		Thread.sleep(4000);
		String filepath=System.getProperty("user.dir") + "\\TestData\\Account_ImportExcelFile.xlsx";
		//cases.clickserialfile().sendKeys(filepath);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type=\"file\"]"))
		.sendKeys(filepath);
		logger.info("File Upload");
		
		
		
		
		
	//	Thread.sleep(4000);
	//	driver.findElement(By.xpath("//input[@type=\"file\"]"))
	//	.sendKeys("//Liono360_V2.0//TestData//Account_ImportExcelFile.xlsx");
	//	logger.info("File Upload");
		
		
		
		
		
		
		
		
		/*
		 * Thread.sleep(10000); //explWaitToClick(account.ChooseFile());
		 * account.ChooseFile().click(); Thread.sleep(5000); StringSelection filepath=
		 * new StringSelection("C:\\Users\\Upadpro User\\Downloads\\Account.xlsx");
		 * Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null);
		 * Robot robot=new Robot();
		 * 
		 * robot.keyPress(KeyEvent.VK_CONTROL); robot.keyPress(KeyEvent.VK_V);
		 * robot.keyRelease(KeyEvent.VK_V); robot.keyRelease(KeyEvent.VK_CONTROL);
		 * robot.keyPress(KeyEvent.VK_ENTER); logger.info("log 1");
		 * robot.keyRelease(KeyEvent.VK_ENTER); Thread.sleep(10000);
		 * logger.info("File Upload");
		 */
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
			
		Thread.sleep(5000);
		checkStatusOfFile();
		
		//.............Replay....................//
		
	     	
		
		
//		Thread.sleep(20000);
//		account.Replay().click();
//		logger.info("Clicked on Cimport button");
	//
//		Thread.sleep(20000);
//		account.Replay().click();
//		logger.info("Clicked on Cimport button");

		//.....................................//
		
		
		Thread.sleep(5000);
		account.clickAccounts().click();
		logger.info("Clicked on Accounts btn");
		
		
		Thread.sleep(2000);
		mouseActionRightClick(driver, account.AccountNameClick());
		
		Thread.sleep(2000);
		account.ClickOnEdit().click();
		logger.info("Clicked on ClickOnEdit button");
		
		
		Actions action1 = new Actions(driver);

		action1.sendKeys(Keys.PAGE_DOWN).build().perform();
		action1.sendKeys(Keys.PAGE_DOWN).build().perform();
		logger.info("Scrolled");
		
		
		
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

		
		
		
		
		
		
	
	


			
	    
  

		
		
		
		
	
	
	
	

