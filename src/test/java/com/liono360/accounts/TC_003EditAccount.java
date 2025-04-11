package com.liono360.accounts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;
import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.AccountsPage;
import com.liono360.pageObject.LoginPage;
import com.liono360.utility.ExcelDataProvider;

public class TC_003EditAccount extends Baseclass{
	
	@Test
	public void TC003_EditAccount () throws InterruptedException, IOException {
		Actions action = new Actions(driver);
		AccountsPage account = new AccountsPage(driver);
		Faker faker = new Faker();
		ExcelDataProvider exceldata=new ExcelDataProvider();
		
        TryClick(account.clickAccounts());
		logger.info("Clicked on Account button");
		waitUntilPageLoad();
		waitUntilDisplay(account.ListedAccount(), 20);
		mouseActionRightClick(driver, account.ListedAccount());
		Thread.sleep(1000);
		account.ClickOnEdit().click();
		logger.info("Clicked on ClickOnEdit button");
		
		account.EditFirstname().clear();
		account.EditFirstname().sendKeys(exceldata.FirstName());
		logger.info("First Name Added");
	
		String Firstname= account.EditFirstname().getAttribute("value");
		
	
		account.editmiddlename().clear();
		account.editmiddlename().sendKeys(exceldata.MiddleName());
		logger.info("Middle Name Added");
		
		
		account.editLastName().clear();
		account.editLastName().sendKeys(exceldata.LastName());
		
		logger.info("Last Name Added");
	  
		String SetAccountName= account.editAccountName().getAttribute("value");
		
		
		
		account.editAccountName().clear();
		account.editAccountName().sendKeys(exceldata.OrganizationName());
		logger.info("sendkeys on accountname");
		

	
		TryClick(account.SaveAllDeatilsBtn());
	
		logger.info("click on SaveAllDeatilsBtn button");
		
// ASSERTION====================================================================================================
		
	    waitUntilPageLoad();
	    account.refresh();
	    waitUntilPageLoad();
	    Thread.sleep(5000);
		String AccountNameAfterEdit=account.ListedAccount().getText();
		System.out.println("provided account name to edit: "+SetAccountName);
		System.out.println("Listed account name after edit: "+AccountNameAfterEdit);
		if (SetAccountName.equalsIgnoreCase(AccountNameAfterEdit)) {
			Assert.assertTrue(false);
			logger.info("Edit account test Fail");
		} 

		else {
			Assert.assertTrue(true);
			logger.info("Edit account test Passes");
		}
		
		
	}
}


