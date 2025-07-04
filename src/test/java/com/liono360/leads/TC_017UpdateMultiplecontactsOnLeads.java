package com.liono360.leads;


import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.Import;
import com.liono360.pageObject.LoginPage;



public class TC_017UpdateMultiplecontactsOnLeads extends Baseclass{

	@Test
	public void TC_017AddMultipleContactsOnLeadsTest () throws InterruptedException, FileNotFoundException, IOException {
		

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
		Thread.sleep(20000);

		Import leads = new Import(driver);

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
		leads.PlusImportClick().click();
		logger.info("Clicked on PlusImportClick button");

		Thread.sleep(5000);
		leads.ModuleName().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[normalize-space()='Lead']")));
		driver.findElement(By.xpath("//span[normalize-space()='Lead']")).click();
		logger.info("select on dropdown");

		Thread.sleep(5000);
		leads.ChannelName().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[normalize-space()='Default Channel']")));
		driver.findElement(By.xpath("//span[normalize-space()='Default Channel']")).click();
		logger.info("select on dropdown");
		
		
		
		Thread.sleep(5000);
		leads.Updatec().click();
		logger.info("Clicked on Updatec button");
		
		
		Thread.sleep(5000);
		
		
		logger.info("Update  Default Data In Excel File");
		
		
		
		
		
		
		Thread.sleep(4000);
		String filepath=System.getProperty("user.dir") + "\\TestData\\Excel-Files\\Lead_UpdateMultipleContacts.xlsx";
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type=\"file\"]"))
		.sendKeys(filepath);
		logger.info("File Upload");
		
		Thread.sleep(5000);
		leads.Next().click();
		logger.info("Clicked on Next button");


		Thread.sleep(5000);
		leads.Next().click();
		logger.info("Clicked on Next button");
		
		
		Thread.sleep(5000);
		leads.Upload().click();
		logger.info("Clicked on Upload button");
		
		
		
		Thread.sleep(5000);
		checkStatusOfFile();
		
		Thread.sleep(5000);
		leads.clickLead().click();
		logger.info("Clicked on Lead button");
		
		
		Thread.sleep(7000);
		leads.addedLead().click();
		logger.info("Clicked on first Lead");
		
		
		Thread.sleep(5000);
		leads.ContactsClick().click();
		logger.info("Clicked on Contacts tab");
		
		
		
		
		
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