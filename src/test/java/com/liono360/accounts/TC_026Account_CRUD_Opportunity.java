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
import com.liono360.utility.ExcelDataProvider;

public class TC_026Account_CRUD_Opportunity extends Baseclass{

	@Test
	public void TC026Account_CRUD_Oppty() throws InterruptedException, IOException {
		
		//redirectToCRM();

		Actions action = new Actions(driver);
		AccountsPage account = new AccountsPage(driver);
		Faker faker = new Faker();
		ExcelDataProvider exceldata=new ExcelDataProvider();
		
		
		TryClick(account.clickAccounts());
		logger.info("Clicked on Account Module");
		
		
		waitUntilPageLoad();
		
		
	}

}
