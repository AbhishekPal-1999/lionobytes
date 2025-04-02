package com.liono360.accounts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.AccountsPage;
import com.liono360.pageObject.LoginPage;

public class TC_004DeleteAccount extends Baseclass {
	
	@Test
	public void TC004_DeleteAccount () throws InterruptedException, IOException {

		
		AccountsPage account = new AccountsPage(driver);
		Actions actions = new Actions(driver);
	    waitUntilPageLoad();
	    TryClick(account.clickAccounts());
	  	logger.info("Clicked on Account button");
		waitUntilPageLoad();
		waitUntilDisplay(account.ListedAccount(), 20);
		String AccountNameBeforeDelete=account.ListedAccount().getText();
		mouseActionRightClick(driver, account.ListedAccount());
		
		Thread.sleep(2000);
		TryClick(account.clickoneditbtn());
		logger.info("Clicked on clickoneditbtn button");
		
		
		waitUntilDisplay(account.EditAccount(), 30);
		TryClick(account.AdressDetails());
		logger.info("Clicked on AddressDetails");
		
		waitUntilDisplay(account.AddressDetailspage(), 30);
		TryClick(account.BillingAddressEdit());
		logger.info("Clicked on BillingAddessEditbtn");
		
		Thread.sleep(3000);
		TryClick(account.clickondeletebtn());
		logger.info("Clicked on clickondeletebtn button");
		
		
		Thread.sleep(2000);
		TryClick(account.clickOnYesbtn());
		logger.info("Clicked on clickOnYesbtn button");
		
		
		waitUntilDisplay(account.AddressDetailspage(), 30);
		TryClick(account.ShippingAddressEdit());
		logger.info("Clicked on ShippingAddressEdit");
		
		Thread.sleep(3000);
		TryClick(account.clickondeletebtn());
		logger.info("Clicked on clickondeletebtn button");
		
		
		Thread.sleep(2000);
		TryClick(account.clickOnYesbtn());
		logger.info("Clicked on clickOnYesbtn button");
		
		Thread.sleep(2000);
		TryClick(account.SaveAllDeatilsBtn());
		logger.info("Clicked on SaveAllDeatilsBtn");
			
		
	//Delete Process--------------------------------------------------------------------------------------------------	
		
		
		waitUntilPageLoad();
		Thread.sleep(2000);
		TryClick(account.RefreshListing());
		waitUntilPageLoad();
		TryClick(account.RefreshListing());
		Thread.sleep(3000);
		mouseActionRightClick(driver, account.ListedAccount());
		TryClick(account.clickondeletebtn());
		logger.info("Clicked on clickondeletebtn button");
		TryClick(account.clickOnYesbtn ());
		logger.info("Clicked on clickOnYesbtn button");       
        waitUntilPageLoad();
        TryClick(account.RefreshListing());
        waitUntilPageLoad();
		String AccountNameAfterDelete=account.ListedAccount().getText();
		System.out.println("Deleted Account: "+AccountNameBeforeDelete);
		System.out.println("Listed Account after delete : "+AccountNameAfterDelete);
		if (AccountNameBeforeDelete.equalsIgnoreCase(AccountNameAfterDelete)) {
			Assert.assertTrue(false);
			logger.info("Delete account test failed");
		} 

		else {
			Assert.assertTrue(true);
			logger.info("Delete account test passed");
			
		}

	}
		
}


