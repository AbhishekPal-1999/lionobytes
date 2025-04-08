package com.liono360.accounts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.AccountsPage;

public class TC_004DeleteAccount extends Baseclass {
	
	@Test
	public void TC004_DeleteAccount () throws InterruptedException, IOException {
		//redirectToCRM();


		AccountsPage account = new AccountsPage(driver);

	    waitUntilPageLoad();
	  
		//account.DropdownSelectAccount().click();
		waitUntilPageLoad();
		String AccountNameBeforeDelete=account.ListedAccount().getText();
		mouseActionRightClick(driver, account.AccountNameClick());
		TryClick(account.clickondeletebtn());
		logger.info("Clicked on clickondeletebtn button");
		
		TryClick(account.clickOnYesbtn ());
		logger.info("Clicked on clickOnYesbtn button");
        waitUntilPageLoad();
        
        account.Search().clear();
        TryClick(account.refresh());
	    waitUntilPageLoad();
        
		String AccountNameAfterDelete=account.ListedAccount().getText();
		System.out.println("Deleted Account: "+AccountNameBeforeDelete);
		System.out.println("Listed Account after delete : "+AccountNameAfterDelete);
		if (AccountNameBeforeDelete.equalsIgnoreCase(AccountNameAfterDelete)) {
			Assert.assertTrue(false);
			logger.info("Edit account test failed");
		} 

		else {
			Assert.assertTrue(true);
			logger.info("Edit account test passed");
			
		}

	}
		
		
		
	}


