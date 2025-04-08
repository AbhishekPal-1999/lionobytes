package com.liono360.CasesImports;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.CasesPage;



@Test
public class TC_018ExportWithCustomFieldsCases extends Baseclass{

	@Test
	public void TC_018ExportWithCustomFieldsCasesTest () throws InterruptedException {
		
		// redirectToCRM();
		
		CasesPage cases= new CasesPage(driver);
		
		cases.clickCases().click();
		logger.info("Clicked on Cases ");
	
		SelectDropdown(cases.CaseChannel(),2);
		logger.info("Select On Case Channel");
		
		
		SelectDropdown(cases.AccountChannel(),1);
		logger.info("Select On Account Channel");
	
		cases.ExportClick().click();
		logger.info("Clicked on ExportClick ");
		
	
		cases.BoxAppend().click();
		logger.info("Clicked on ExportClick ");
		
		
		
		
		
		Thread.sleep(5000);
		cases.ExportClick2().click();
		logger.info("Clicked on ExportClick2 ");
		
		Thread.sleep(5000);
		cases.Yes().click();
		logger.info("Clicked on Yes ");
		
		
		
		Thread.sleep(5000);
		// explWaitToClick(account.Yes1());
		cases.ProfileClick().click();
		logger.info("Clicked on ProfileClick button");

		Thread.sleep(5000);
		cases.Cprofile().click();
		logger.info("Clicked on Cprofile button");

		
		
		
		
		Thread.sleep(2000);
		cases.ClickMydocuments().click();
		logger.info("Clicked on ClickMydocuments ");
		
		
		
		Thread.sleep(2000);
		cases.ClickDownloads().click();
		logger.info("Clicked on ClickDownloads ");
		
		
		
		Thread.sleep(2000);
		cases.ClickLeadFile().click();
		logger.info("Clicked on ClickLeadFile ");
		
		
		
		
		Thread.sleep(2000);
		cases.DownloadLeadFile().click();
		logger.info("Clicked on DownloadLeadFile ");
		
		
		
		
		
		Thread.sleep(6000);
		cases.Importclick1().click();
		logger.info("Clicked on Importclick1 ");
		
		
		Thread.sleep(6000);
		cases.plusimportbtn().click();
		logger.info("Clicked on plusimportbtn ");
		
		
		Thread.sleep(5000);
		cases.ModuleName().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[normalize-space()='Lead']")));
		driver.findElement(By.xpath("//span[normalize-space()='Lead']")).click();
		logger.info("select on dropdown");

		Thread.sleep(5000);
		cases.ChannelName().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[normalize-space()='Default Channel']")));
		driver.findElement(By.xpath("//span[normalize-space()='Default Channel']")).click();
		logger.info("select on dropdown");
		
		
		
		Thread.sleep(5000);
		cases.Updatec().click();
		logger.info("Clicked on Updatec button");
		
		
		
		Thread.sleep(5000);
		ExcelWriteCodeImports.TC_007WriteCodeExportLead exportToimport = new ExcelWriteCodeImports.TC_007WriteCodeExportLead();
		exportToimport.updateCsvFile();
		//TC_007WriteCodeExportLead.updateCSV(baseURL);
		logger.info("Update  Default Data In Excel File");
		
		
		
		
		
		
		Thread.sleep(4000);
		String filepath=System.getProperty("user.dir") + "\\TestData\\Excel-Files-Cases\\Case_Add Imports_With Default Fileds 1.1.xlsx";
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type=\"file\"]"))
		.sendKeys(filepath);
		logger.info("File Upload");

		
		Thread.sleep(5000);
		cases.Next().click();
		logger.info("Clicked on Next button");


		//...//
		
		
		
	//	Thread.sleep(5000);
	//	cases.LabelSelect().click();
	//	Thread.sleep(2000);
	//	explWaitToClick(driver.findElement(By.xpath("//span[normalize-space()='Name - businessName']")));
	//	driver.findElement(By.xpath("//span[normalize-space()='Name - businessName']")).click();
	//	logger.info("select on dropdown");
		
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(5000);
		cases.Next().click();
		logger.info("Clicked on Next button");
		
		
		Thread.sleep(5000);
		cases.Upload().click();
		logger.info("Clicked on Upload button");
		
		
	}
	
}
	
		
		
	
	

