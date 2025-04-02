package com.liono360.contacts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ContactsPage;
import com.liono360.pageObject.LoginPage;
import com.liono360.utility.ExcelDataProvider;

public class TC_003EditContact extends Baseclass {
	
	@Test
	public void TC003_EditContact () throws InterruptedException, IOException {
	   // redirectToCRM();
		
		ContactsPage contacts = new ContactsPage(driver);
		ExcelDataProvider exceldata=new ExcelDataProvider();
		TryClick(contacts.ClickContacts());
		waitUntilPageLoad();
		logger.info("Clicked on contacts button");
		
//		contacts.Editcontactbtn().click();
//		logger.info("Clicked on contact button");
		
		
		explWaitToClick(contacts.Clickonbtn());
		mouseActionRightClick(driver, contacts.Clickonbtn());
		
		contacts.ClickEditbutton().click();
		logger.info("Clicked on edit button");
		
		explWaitToClick(contacts.EmailClear());
//		contacts.EmailClear().clear();
//		contacts.EmailClear().sendKeys("ContactCreate" + randomnumber() + "@lionobytes.com");
//	    logger.info("Updated Email");

	    SelectDropdown(contacts.ContactType(),2);
		logger.info("Contact type selected");
	
		
		SelectDropdown(contacts.title(),2);
     
		logger.info("Title selected");
		
		contacts.Fname().clear();
		contacts.Fname().sendKeys(exceldata.FirstName() );
		logger.info("sendkeys on first name");
		String Firstname= contacts.Fname().getAttribute("value");
		
		contacts.Mname().clear();
		contacts.Mname().sendKeys(exceldata.MiddleName() );
		logger.info("sendkeys on middle name");
		
		contacts.Lname().clear();
		contacts.Lname().sendKeys(exceldata.LastName());
		logger.info("sendkeys on last name");
		
		contacts.Email().clear();
		contacts.Email().sendKeys(Firstname+ randomnumber() + "@lionobytes.com");
		logger.info("sendkeys on email adress");

		// Save the changes
		contacts.SaveInfAll().click();
		logger.info("Clicked on save button to save the changes");

		// ASSERTION=======================================================================================

		waitUntilPageLoad();
		contacts.Search().clear();
		Thread.sleep(2000);
		contacts.Search().sendKeys(Firstname);
		logger.info("Lead name passed to search");
		waitUntilPageLoad();
		//Thread.sleep(6000);
		String FirstNameAfterCreate=contacts.listedContacts().getText();
		System.out.println("Provided Contact name to Edit: "+Firstname);
		System.out.println("Listed Contact name after Edit: "+FirstNameAfterCreate);
		if (Firstname.equalsIgnoreCase(FirstNameAfterCreate)) {
			Assert.assertTrue(true);
			logger.info("Edit Contact test passed");
		} 

		else {
			Assert.assertTrue(false);
			logger.info("Edit Contact test failed");
		}
	 			 
	}
	}


