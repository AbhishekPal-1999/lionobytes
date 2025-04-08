package com.liono360.CasesImports;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.CasesPage;

public class TC_011ImportAddWithDefaultFiledCases extends Baseclass{

	@Test
	public void TC_011ImportAddWithDefaultFiledCasesTest () throws InterruptedException, FileNotFoundException, IOException {
		
		
		  // redirectToCRM();
		
		CasesPage cases= new CasesPage(driver);
		
		TryClick(cases.clickCases());
		logger.info("Clicked on Cases ");
	
		
		
		SelectDropdown(cases.CaseChannel(),2);
		logger.info("Select On Case Channel");
		
		
		SelectDropdown(cases.AccountChannel(),1);
		logger.info("Select On Account Channel");
		
		
		
		TryClick(cases.ClickList());
		logger.info("Clicked on List ");
		
		

		TryClick(cases.clickImport());
		logger.info("Clicked on Import ");
		
		
		
		SelectDropdown(cases.ModuleName(),1);
		logger.info("Select On Module Name");
		
		
		SelectDropdown(cases.ChannelName(),2);
		logger.info("Select On Channel Name");
		
		
		
		Thread.sleep(5000);
		ExcelWriteCodeImports.TC_011AddDataExcelFileCases addcases = new ExcelWriteCodeImports.TC_011AddDataExcelFileCases ();
		addcases.TryExcelFileWriteCodeTest();
		logger.info("Excel Data Write");
		
		
		Thread.sleep(4000);
		String filepath=System.getProperty("user.dir") + "\\TestData\\Excel-Files-Cases\\Case_Add Imports_With Default Fileds 1.1.xlsx";
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type=\"file\"]"))
		.sendKeys(filepath);
		logger.info("File Upload");

		
		
		
		
		
		
		
		
		
		
		TryClick(cases.Next());
		logger.info("Clicked on Next ");
		
		
		TryClick(cases.Next());
		logger.info("Clicked on Next ");
		
		

		TryClick(cases.ClickUpload());
		logger.info("Clicked on Next ");
		
		
		TryClick(cases.ProfileClick());
		logger.info("Clicked on ProfileClick ");
		
		TryClick(cases.Cprofile());
		logger.info("Clicked on Cprofile ");
		

		TryClick(cases.Cimport());
		logger.info("Clicked on Cimport ");
		
		
		//................................//
		Thread.sleep(5000);
		checkStatusOfFile();
		
		
		
		
		TryClick(cases.clickCases());
		logger.info("Clicked on Cases ");
		
		
		TryClick(cases.RightClick());
		logger.info("Clicked on Right ");
		
		
		
		
		Actions action1 = new Actions(driver);

		action1.sendKeys(Keys.PAGE_DOWN).build().perform();
		action1.sendKeys(Keys.PAGE_DOWN).build().perform();
		logger.info("Scrolled");
		
		
	}

	public void checkStatusOfFile() throws InterruptedException {
		while (true) {
			driver.findElement(By.xpath("//span[@ptooltip='Refresh']")).click();
			logger.info("clicked on refresh button");
			Thread.sleep(5000);
			String CurrentStatus = driver.findElement(By.xpath("//tbody//tr[1]//td[5]")).getText();

			if (CurrentStatus.equals("Completed")) {
				logger.info("import is completed now");
				break;
			}
			Thread.sleep(8000);

		}
	}

}
	
	

