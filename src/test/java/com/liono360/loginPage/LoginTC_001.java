package com.liono360.loginPage;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.pageObject.LoginPage;

public class LoginTC_001 extends Baseclass{

	@Test
	public void LoginTest() throws InterruptedException, IOException
	{
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
		explWaitToClick(lp.btnProfile());
		
		if(lp.btnProfile().isDisplayed())
		{
			Assert.assertTrue(true);
			logger.info("Login test passed");
		}
		else
		{
			captureScreen(driver, "LoginTest");
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
		
	}

}
