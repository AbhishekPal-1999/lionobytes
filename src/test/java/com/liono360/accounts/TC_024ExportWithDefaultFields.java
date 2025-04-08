package com.liono360.accounts;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.AccountsPage;
import com.liono360.pageObject.LoginPage;
public class TC_024ExportWithDefaultFields extends Baseclass {
	  @Test
       public void	ExportWithDefaultFieldsTest () throws InterruptedException {
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
			
			Thread.sleep(10000);
			//explWaitToClick(account.clickAccounts());
			account.clickAccounts().click();
			logger.info("Clicked on Account button");
			
			Thread.sleep(20000);
			explWaitToClick(account.AccountoptionDrp());
			account.AccountoptionDrp().click();
			Thread.sleep(2000);
			explWaitToClick(driver.findElement(By.xpath("//span[text()='Akash_Automation']")));
			driver.findElement(By.xpath("//span[text()='Akash_Automation']")).click();
			logger.info("select on dropdown");
			
			Thread.sleep(5000);
			//explWaitToClick(account.ClickList());
			account.ClickList().click();
			logger.info("Clicked on ClickList button");
			
			Thread.sleep(5000);
			//explWaitToClick(account.ExportClick());
			account.ExportClick().click();
			logger.info("Clicked on ClickList button");
			
			Thread.sleep(5000);
			//explWaitToClick(account.ExportClick2());
			account.ExportClick2().click();
			logger.info("Clicked on ExportClick2 button");
			
			Thread.sleep(5000);
			//explWaitToClick(account.Yes1());
			account.Yes1().click();
			logger.info("Clicked on Yes1 button");
       }
    }
