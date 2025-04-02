package com.liono360.contacts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ContactsPage;
import com.liono360.pageObject.LoginPage;
import com.liono360.utility.ExcelDataProvider;

public class TC_004DeleteContact extends Baseclass {
	
	@Test
	public void TC004_DeleteContact () throws InterruptedException, IOException {
		//redirectToCRM();

		ContactsPage contacts = new ContactsPage(driver);
		ExcelDataProvider exceldata=new ExcelDataProvider();
		TryClick(contacts.ClickContacts());
		waitUntilPageLoad();
		logger.info("Clicked on contacts button");
		String listedContactBeforeDelete = contacts.listedContacts().getText();
		
		//contacts.listedContacts().click();
		logger.info("Clicked on contact button");
		
		explWaitToClick(contacts.Clickonbtn());
		mouseActionRightClick(driver, contacts.Clickonbtn());
		
		TryClick(contacts.ClickOnDeleteButton());
		logger.info("Clicked on confirmation Delete button");
	
		TryClick(contacts.ConfirmDelete());
		logger.info("Clicked on confirmation Delete button");
		
		waitUntilPageLoad();
		contacts.Search().clear();
		Thread.sleep(2000);
		contacts.Search().sendKeys(" ");
		Thread.sleep(1000);
		contacts.Search().clear();
		waitUntilPageLoad();
		String listedContactAfterDelete = contacts.listedContacts().getText();
		System.out.println("Provided Contact name to delete: "+listedContactBeforeDelete);
		System.out.println("Listed Contact name after delete: "+listedContactAfterDelete);
		if (listedContactBeforeDelete.equalsIgnoreCase(listedContactAfterDelete)) {
			Assert.assertTrue(false);
			
			logger.info(" contact DELETE test failed");
			

		}
		else {
			Assert.assertTrue(true);
			
			logger.info(" contact DELETE test passed");

		
	}

	}
}
