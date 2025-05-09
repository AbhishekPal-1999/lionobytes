package com.liono360.leads;



import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.Import;
import com.liono360.pageObject.LeadPage;
import com.liono360.pageObject.LoginPage;
import com.opencsv.exceptions.CsvValidationException;

import ExcelWriteCodeImports.TC_007WriteCodeExportLead;



public class TC_015ExportWithDefaultFieldsLeads extends Baseclass {
    @Test
	public void ExportWithDefaultFieldsTest () throws InterruptedException, CsvValidationException, IOException {
		
	
    	redirectToCRM();

    	Import leads = new Import(driver);
		
		
	
		Thread.sleep(2000);
		leads.clickLead().click();
		logger.info("Clicked on Lead ");
			
		
		Thread.sleep(8000);
		leads.ClickList().click();
		logger.info("Clicked on ClickList ");
		
		
		
		Thread.sleep(2000);
		leads.ClickExport().click();
		logger.info("Clicked on ClickExport ");
		
		Thread.sleep(2000);
		leads.ClickExport1().click();
		logger.info("Clicked on ClickExport1 ");
		
		
		Thread.sleep(2000);
		leads.ExportYes().click();
		logger.info("Clicked on ExportYes ");
		
		
		
		Thread.sleep(2000);
		leads.AdminClick().click();
		logger.info("Clicked on AdminClick ");
		
		
		
		Thread.sleep(2000);
		leads.Profilec().click();
		logger.info("Clicked on Profilec ");
		
		
		
		
		Thread.sleep(2000);
		leads.ClickMydocuments().click();
		logger.info("Clicked on ClickMydocuments ");
		
		
		
		Thread.sleep(2000);
		leads.ClickDownloads().click();
		logger.info("Clicked on ClickDownloads ");
		
		
		
		Thread.sleep(2000);
		leads.ClickLeadFile().click();
		logger.info("Clicked on ClickLeadFile ");
		
		
		
		
		Thread.sleep(2000);
		leads.DownloadLeadFile().click();
		logger.info("Clicked on DownloadLeadFile ");
		
		
		
		
		
		Thread.sleep(6000);
		leads.Importclick1().click();
		logger.info("Clicked on Importclick1 ");
		
		
		Thread.sleep(6000);
		leads.plusimportbtn().click();
		logger.info("Clicked on plusimportbtn ");
		
		
		Thread.sleep(5000);
		leads.ModuleName().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[normalize-space()='Lead']")));
		driver.findElement(By.xpath("//span[normalize-space()='Lead']")).click();
		logger.info("select on dropdown");

		Thread.sleep(5000);
		leads.ChannelName().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("(//span[normalize-space()='Automation'])[1]")));
		driver.findElement(By.xpath("(//span[normalize-space()='Automation'])[1]")).click();
		logger.info("select on dropdown");

		
		
		
		Thread.sleep(5000);
		leads.Updatec().click();
		logger.info("Clicked on Updatec button");
		
		
		
		Thread.sleep(5000);
		TC_007WriteCodeExportLead exportToimport = new TC_007WriteCodeExportLead();
		exportToimport.updateCsvFile();
		logger.info("Update  Default Data In Excel File");
		
		
		
	

	
		
		Thread.sleep(4000);
		String filepath=System.getProperty("user.dir") + "\\TestData\\Export-Csv Files\\Lead-Export With Default Fileds.csv";
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type=\"file\"]")).sendKeys(filepath);
		logger.info("File Upload");
		
		
		
		
		
		Thread.sleep(5000);
		leads.Next().click();
		logger.info("Clicked on Next button");


		
		
		Thread.sleep(5000);
		leads.LabelSelect().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("(//span[normalize-space()='Name - businessName'])[1]")));
		driver.findElement(By.xpath("(//span[normalize-space()='Name - businessName'])[1]")).click();
		logger.info("select on dropdown");
		
		
		
		
		Thread.sleep(5000);
		leads.LabelSelect().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("(//span[normalize-space()='Timezone - timezoneName'])[1]")));
		driver.findElement(By.xpath("(//span[normalize-space()='Timezone - timezoneName'])[1]")).click();
		logger.info("select on dropdown");
		
		
		
	
		
		
		
		
		
		
		Thread.sleep(5000);
		leads.Next().click();
		logger.info("Clicked on Next button");
		
		
		Thread.sleep(5000);
		leads.Upload().click();
		logger.info("Clicked on Upload button");
		
		//..................................................................//		
		
		
		Thread.sleep(8000);
		leads.ProfileClick().click();
		logger.info("Clicked on ProfileClick button");

		Thread.sleep(5000);
		leads.Cprofile().click();
		logger.info("Clicked on Cprofile button");

		Thread.sleep(5000);
		leads.Cimport().click();
		logger.info("Clicked on Cimport button");
		
		Thread.sleep(5000);
		checkStatusOfFile();
		
		Thread.sleep(5000);
		leads.clickLead().click();
		logger.info("Clicked on Lead ");
		
		
		
		Thread.sleep(5000);
		leads.addedLead().click();
		logger.info("Clicked on addedLead ");
		
		
		
		
		
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

		
		
		
		
		
		
	
	

