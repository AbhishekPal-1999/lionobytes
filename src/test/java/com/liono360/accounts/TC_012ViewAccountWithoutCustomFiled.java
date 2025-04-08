package com.liono360.accounts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.AccountsPage;
import com.liono360.pageObject.LoginPage;

public class TC_012ViewAccountWithoutCustomFiled extends Baseclass{
	
	@Test
	public void ViewAccountWithoutCustomFiledTest () throws InterruptedException, IOException {
		
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
		
		AccountsPage account = new AccountsPage(driver);
		
		explWaitToClick(account.clickAccounts());
		account.clickAccounts().click();
		logger.info("Clicked on clickAccounts button");
		
		Thread.sleep(2000);
		account.DropdownSelectAccount().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='Automation']")));
		driver.findElement(By.xpath("//span[text()='Automation']")).click();
		logger.info("select on DropdownSelectAccount");
		
		
		explWaitToClick(account.RightClickonAccountname());
		mouseActionRightClick(driver, account.RightClickonAccountname());
		
		explWaitToClick(account.viewaccountnamecustomfiled());
		account.viewaccountnamecustomfiled().click();
		logger.info("Clicked on viewaccountnamecustomfiled button");
		
		
		explWaitToClick(account.ViewAccountopt());
		if(account.ViewAccountopt().isDisplayed())
		{
			Thread.sleep(4000);
			Assert.assertTrue(true);
			logger.info("View Account Without Custom test passed");
		}
		else
		{
			Assert.assertTrue(false);
			captureScreen(driver, "viewAccount");
			logger.info("view Account Without Custom test failed");
		}
	}
				
}
	
	
	


