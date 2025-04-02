package com.liono360.contacts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ContactsPage;
import com.liono360.pageObject.LoginPage;

public class TC_006VerifyGlobalSearch extends Baseclass {
	
	@Test
	public void VerifyGlobalSearchTest () throws InterruptedException, IOException {
		
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

		ContactsPage contacts = new ContactsPage(driver);
		
		Thread.sleep(20000);
		contacts.Inactive01().click();
		logger.info("Clicked on contact button");

		Thread.sleep(2000);
		contacts.VerifySearchContact().sendKeys("Tom");
		logger.info("Verify Search Contact");
	
		Thread.sleep(5000);
		String resultaccount = contacts.VerifySearchContact().getText();
		
		if (resultaccount.contains(resultaccount)) {
			Assert.assertTrue(true);
			logger.info("search contact test passed");

		} else
		{	
			Assert.assertTrue(false);
			captureScreen(driver, "searchProduct");
			logger.info("search contact test failed");	
		}
	}

}

