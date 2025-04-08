package com.liono360.contacts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ContactsPage;
import com.liono360.utility.ExcelDataProvider;

public class TC_002ViewContact extends Baseclass {

	@Test
	public void TC002_ViewContact() throws InterruptedException, IOException {

		//redirectToCRM();
		
		ContactsPage contacts = new ContactsPage(driver);
		ExcelDataProvider exceldata=new ExcelDataProvider();
		TryClick(contacts.ClickContacts());
		waitUntilPageLoad();
		logger.info("Clicked on contacts button");
		
		explWaitToClick(contacts.Clickonbtn());
		mouseActionRightClick(driver, contacts.Clickonbtn());

	
		contacts.ViewBtn().click();
		logger.info("Clicked on view button");
		
// ASSERTION====================================================================================================		

 		if(contacts.ViewLeadHeader().isDisplayed())
 		{ 

 			Assert.assertTrue(true);
 			logger.info("View Contact test passed");
 		}
 		else
 		{
 			Assert.assertTrue(false);
 			captureScreen(driver, "View Account test ");
 			logger.info("view Contact test failed");
 		}
 		TryClick(contacts.clickCancel());
 		logger.info("clicked on cancel");
 	
 	}
		 
	}

