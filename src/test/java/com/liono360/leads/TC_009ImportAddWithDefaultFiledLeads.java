package com.liono360.leads;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.Import;
import com.liono360.pageObject.LeadPage;
import com.liono360.pageObject.LoginPage;



public class TC_009ImportAddWithDefaultFiledLeads extends Baseclass {

	@Test
	public void ImportAddWithDefaultFiledTest() throws InterruptedException, AWTException, FileNotFoundException, IOException {
		
		//redirectToCRM();
		
		Import leads = new Import(driver);
		Actions action = new Actions(driver);
		
		waitUntilPageLoad();
		Thread.sleep(10000);
		
		TryClick(leads.clickLead());
		logger.info("Clicked on Lead ");
		
		waitUntilPageLoad();
		Thread.sleep(5000);
		action.moveToElement(leads.ActionButton()).build().perform();
		logger.info("Mousehover on Action button");


		TryClick(leads.clickImport());
		logger.info("Clicked on clickImport button");
		
		
		Thread.sleep(5000);
		
		logger.info("Excel Data Write");
		
	
		Thread.sleep(4000);
		String filepath=System.getProperty("user.dir") + "\\TestData\\Excel-Files\\Lead_Add Imports_With Default Fileds 1.1.xlsx";
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
		
		
		
		  Thread.sleep(5000); 
		  checkStatusOfFile();
		  
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

		
		
		
		
		
		
	
	

