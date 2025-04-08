package LeadsImportsAndExports;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.Import;

import ExcelWriteCodeImports.TC_001AddDataExcelFileLead;


public class TC_010ImportAddwithCustomFieldsLeads extends Baseclass{

	@Test
	public void ImportAddwithCustomFieldsTest () throws InterruptedException, AWTException, FileNotFoundException, IOException {
		
//redirectToCRM();
		
Import leads = new Import(driver);

		
		TryClick(leads.clickLead());
		logger.info("Clicked on Lead ");
		
		
		SelectDropdown(leads.LedsDrp(),3);
		logger.info("select on Imports Channel");
		
		

		TryClick(leads.ActionButton());
		logger.info("Clicked on Action");

		TryClick(leads.clickImport());
		logger.info("Clicked on clickImport button");
		
		
		
		
		SelectDropdown(leads.ModuleName(),1);
		logger.info("select on Module Name Is Lead");
		
		
		SelectDropdown(leads.ChannelName(),3);
		logger.info("select on Channel Name Is Imports Channel");
		
		
		
		Thread.sleep(5000);
		TC_001AddDataExcelFileLead add = new TC_001AddDataExcelFileLead ();
		add.AddwithcustomFileds();
		logger.info("Excel Data Write");
		
		 
		
		
		
		Thread.sleep(4000);
		String filepath=System.getProperty("user.dir") + "\\TestData\\Excel-Files\\Lead_Add Imports_With Custom Fileds 1.2.xlsx";
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type=\"file\"]")).sendKeys(filepath);
		logger.info("File Upload");
		
	
		
		TryClick(leads.Next());
		logger.info("Clicked on Next button");


		TryClick(leads.Next());
		logger.info("Clicked on Next button");
		
		
		TryClick(leads.Upload());
		logger.info("Clicked on Upload button");
		
		
		TryClick(leads.ProfileClick());
		logger.info("Clicked on ProfileClick button");

		TryClick(leads.Cprofile());
		logger.info("Clicked on Cprofile button");

		TryClick(leads.Cimport());
		logger.info("Clicked on Cimport button");
		
		
		  Thread.sleep(5000); checkStatusOfFile();
		  
		  TryClick(leads.clickLead()); 
		  logger.info("Clicked on Lead ");
		  
		  
		  
		  TryClick(leads.addedLead()); 
		  logger.info("Clicked on addedLead ");
		  
		  
		  TryClick(leads.CrossSign()); 
		  logger.info("Clicked on CrossSign");
		  
		  
		  } public void checkStatusOfFile() throws InterruptedException { while(true) {
		  driver.findElement(By.xpath("//span[@ptooltip='Refresh']")).click();
		  logger.info("clicked on refresh button"); Thread.sleep(5000); String
		  CurrentStatus =
		  driver.findElement(By.xpath("//tbody//tr[1]//td[5]")).getText();
		  
		  if(CurrentStatus.equals("Completed")) {
		  logger.info("import is completed now"); break; } Thread.sleep(8000);
		  
		  }
		 
	    }
	}

		
		
		
		
		
		
	
	

