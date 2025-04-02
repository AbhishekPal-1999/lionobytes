package com.liono360.EnableTerritory;

import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ConfigFsmTerritory;
import com.liono360.pageObject.LoginPage;

public class TC_002AddJobFunction extends Baseclass {

	@Test
	public void AddJobFunctionTest () throws InterruptedException {
		
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
		Territory.AddPlus().click();
		logger.info("Clicked on AddPlus button");
		
		
		
		Thread.sleep(2000);
		Territory.S1().click();
		logger.info("Clicked on S1 button");
		
		
		Thread.sleep(2000);
		Territory.S2().click();
		logger.info("Clicked on S2 button");
		
		
		Thread.sleep(2000);
		Territory.Save().click();
		logger.info("Clicked on Save button");
		
		
		Thread.sleep(2000);
		Territory.Yesbtn().click();
		logger.info("Clicked on Yesbtn button");
		
		Thread.sleep(2000);
		Territory.Yesbtn1().click();
		logger.info("Clicked on Yesbtn1 button");
		
		
		
	}
	
}
