package com.liono360.EnableTerritory;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ConfigFsmTerritory;
import com.liono360.pageObject.LoginPage;

public class TC_001EnableDisabledTerritory extends Baseclass{

	@Test
	public void EnableTerritoryTest () throws InterruptedException {
		
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
		
		
		ConfigFsmTerritory Territory = new ConfigFsmTerritory(driver);
		
		Thread.sleep(2000);
		Territory.Clickconfig().click();
		logger.info("Clicked on Clickconfig button");
		
		Thread.sleep(2000);
		Territory.ClickFsm().click();
		logger.info("Clicked on ClickFsm button");
		
		Thread.sleep(2000);
		Territory.Clickterritory().click();
		logger.info("Clicked on Clickterritory button");
		
		
		Thread.sleep(2000);
		Territory.Yesbtn().click();
		logger.info("Clicked on Yesbtn button");
		
		Thread.sleep(2000);
		Territory.Yesbtn1().click();
		logger.info("Clicked on Yesbtn1 button");
		
		Thread.sleep(2000);
		Territory.clickLead().click();
		logger.info("Clicked on Lead ");
		
		Thread.sleep(10000);
		mouseActionRightClick(driver, Territory.addedLead());
		logger.info("rigt clicked on added account");
		
		Thread.sleep(2000);
		Territory.Edit().click();
		logger.info("Clicked on Edit ");
		
		Actions action = new Actions(driver);
		
		
		Thread.sleep(5000);
		Territory.LeadOwner().click();
		Thread.sleep(2000);
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		action.sendKeys(Keys.ENTER).build().perform();
		logger.info("select on dropdown");
		
		Thread.sleep(9000);
		Territory.Save().click();
		logger.info("Clicked on Save button");
		
		
		
		Thread.sleep(9000);
		Territory.clickAccounts().click();
		logger.info("Clicked on Account button");
		
		
		Thread.sleep(6000);
		mouseActionRightClick(driver, Territory.AccountNameClick());
		
		
		Thread.sleep(2000);
		Territory.Edit().click();
		logger.info("Clicked on Edit ");
		
		
		
		
		Thread.sleep(5000);
		Territory.Accountowner().click();
		Thread.sleep(2000);
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		action.sendKeys(Keys.ENTER).build().perform();
		logger.info("select on dropdown");
		
		Thread.sleep(9000);
		Territory.Save().click();
		logger.info("Clicked on Save button");
		
		
		
		
		
		
		
		Thread.sleep(2000);
		Territory.Clickconfig().click();
		logger.info("Clicked on Clickconfig button");
		
		Thread.sleep(2000);
		Territory.ClickFsm().click();
		logger.info("Clicked on ClickFsm button");
		
		Thread.sleep(2000);
		Territory.Clickterritory().click();
		logger.info("Clicked on Clickterritory button");
		
		
		Thread.sleep(2000);
		Territory.NOc().click();
		logger.info("Clicked on NOc button");
		
		
		Thread.sleep(2000);
		Territory.Yesbtn1().click();
		logger.info("Clicked on Yesbtn1 button");
		
		
		Thread.sleep(2000);
		Territory.clickLead().click();
		logger.info("Clicked on Lead ");
		
		Thread.sleep(10000);
		mouseActionRightClick(driver, Territory.addedLead());
		logger.info("rigt clicked on added account");
		
		
		
		Thread.sleep(2000);
		Territory.Edit().click();
		logger.info("Clicked on Edit ");
		
		
		Thread.sleep(2000);
		Territory.LeadInfoClick().click();
		logger.info("Clicked on LeadInfoClick ");
		
		
		jsScroll(driver, Territory.LeadInfoClick());
		
		
		
		
		Thread.sleep(9000);
		Territory.clickAccounts().click();
		logger.info("Clicked on Account button");
		
		
		Thread.sleep(6000);
		mouseActionRightClick(driver, Territory.AccountNameClick());
		
		Thread.sleep(2000);
		Territory.Edit().click();
		logger.info("Clicked on Edit ");
		
		
		Thread.sleep(2000);
		Territory.AccountInfoClick().click();
		logger.info("Clicked on AccountInfoClick ");
		
		
		jsScroll(driver, Territory.AccountInfoClick());
	}
	
	
}
