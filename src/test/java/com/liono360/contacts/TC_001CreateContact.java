package com.liono360.contacts;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ContactsPage;
import com.liono360.pageObject.LoginPage;
import com.liono360.utility.ExcelDataProvider;

public class TC_001CreateContact extends Baseclass {
	@Test
	public void TC001_CreateContact() throws InterruptedException, IOException {
		//redirectToCRM();
	
		ContactsPage contacts = new ContactsPage(driver);
		ExcelDataProvider exceldata=new ExcelDataProvider();
		TryClick(contacts.ClickContacts());
		waitUntilPageLoad();
		logger.info("Clicked on contacts button");
		
		TryClick(contacts.clicknewbtn());
		logger.info("Clicked on newbtn button");

		SelectDropdown(contacts.ContactType(),1);
		logger.info("Contact type selected");
		
		TrySelectDropdown(contacts.ContactA(),"Organization");
		logger.info("Contact association selected");
//		
//		contacts.Associationname().sendKeys("a");
//		logger.info("sendkeys on association name");
//		Thread.sleep(6000);
	   
		logger.info("select dropdown on associationname");
		
		SelectDropdown(contacts.title(),1);
     
		logger.info("Title selected");
		
		contacts.Fname().sendKeys(exceldata.FirstName() );
		logger.info("sendkeys on first name");
		String Firstname= contacts.Fname().getAttribute("value");
		
	
		contacts.Mname().sendKeys(exceldata.MiddleName() );
		logger.info("sendkeys on middle name");
		
		
		contacts.Lname().sendKeys(exceldata.LastName());
		logger.info("sendkeys on last name");
		
		contacts.Email().sendKeys(Firstname+ randomnumber() + "@lionobytes.com");
		logger.info("sendkeys on email adress");
		
		contacts.HomeEmail().sendKeys(Firstname+"homeemail"+ randomnumber() + "@lionobytes.com");
		logger.info("Home email added");
		
		contacts.CE1().sendKeys(Firstname+"ce1"+ randomnumber() + "@lionobytes.com");
		logger.info("CE1 email added");
		
		contacts.CE2().sendKeys(Firstname+"ce2"+ randomnumber() + "@lionobytes.com");
		logger.info("CE2 email added");
		TrySelectDropdown(contacts.PhoneCountry1(), "USA");
		Thread.sleep(500);
		contacts.WorkPhone().click();
		contacts.WorkPhone().sendKeys(randomnumber()+"1811"+randomnumber());
		TrySelectDropdown(contacts.PhoneCountry2(), "USA");

		contacts.HomePhone().click();
		Thread.sleep(500);
		contacts.HomePhone().sendKeys(randomnumber()+"2822"+randomnumber());
		TrySelectDropdown(contacts.PhoneCountry3(), "India");
		
		contacts.MobilePhone().click();
		Thread.sleep(500);
		contacts.MobilePhone().sendKeys(randomnumber()+"3833"+randomnumber());
		TrySelectDropdown(contacts.PhoneCountry4(), "India");
		
		contacts.CP1().click();
		Thread.sleep(500);
		contacts.CP1().sendKeys(randomnumber()+"4844"+randomnumber());
		TrySelectDropdown(contacts.PhoneCountry5(), "Nepal");
		Thread.sleep(500);
		contacts.CP2().click();
		contacts.CP2().sendKeys(randomnumber()+"5855"+randomnumber());
		

		TryClick(contacts.ShowMore());
		logger.info("Clicked on showmore button");
	
	
		SelectDropdown(contacts.gender(),1);
		logger.info("Geneder selected");
	
		contacts.Dept().sendKeys("IT");
		logger.info("Department Added");
	
		TryClick(contacts.Dob());
		logger.info("Start date added");
		
		TrySelectMultiDropdown(contacts.LangSp(),1,2);
		logger.info("selected Language Spoken");
	
		
		TryClick(contacts.StartDate());
		logger.info("select dropdown");
		
		TrySelectMultiDropdown(contacts.JobF(),1,2);
		logger.info("Job Function Added");
	
		SelectDropdown(contacts.RelationshipS(),1);
		logger.info("Relationship Added");
		
		SelectDropdown(contacts.MaritalS(),2);
		logger.info("marital status Added");
	    jsScroll(driver,contacts.sourceofcontact());
	    Thread.sleep(2000);
		SelectDropdown(contacts.sourceofcontact(),1);
		logger.info("source of contact Added");
		
		SelectDropdown(contacts.AnnualI(),1);
		logger.info("annual income added");
		
		SelectDropdown(contacts.Degree(),2);
		logger.info("degree added");

		SelectDropdown(contacts.FieldOfStudy(),2);
		logger.info("field of study added");

		
		contacts.ReportT().sendKeys(Firstname);
		logger.info("reporting added");



		contacts.Notes().sendKeys("all details are filled");
		logger.info("sendkeys on Notes");
		
	
		
// Address details-------------------------------------------
		
//		TryClick(contacts.AdressIcon());
//		logger.info("click on AdressIcon");
//		
//		SelectDropdown(contacts.AdressType(),1);
//		logger.info("Address type selected");
//	
//		
//		SelectDropdown(contacts.Adressclass(),1);
//		logger.info("Address class selected");
//		
//		contacts.StreetAdress1().sendKeys(exceldata.StreetAddress());
//		Thread.sleep(4000);
//		action.sendKeys(Keys.ARROW_DOWN).build().perform();
//		action.sendKeys(Keys.ENTER).build().perform();
//		Thread.sleep(5000);
//		TryClick(contacts.clickCheckbox());
//		
//		TryClick(contacts.ActiveAddress());
//		
//		//Thread.sleep(2000);
//		explWaitToClick(contacts.StreetAdress2());
//		contacts.StreetAdress2().sendKeys("d-block");
//		logger.info("street address2 added");
//		Thread.sleep(3000);
//		contacts.SaveInf().click();
//		logger.info("click on save");
			
		Thread.sleep(2000);
		contacts.SaveInfAll().click();
		logger.info("click on saveall");


// ASSERTION=======================================================================================

		waitUntilPageLoad();
		contacts.Search().sendKeys(Firstname);
		logger.info("Lead name passed to search");
		waitUntilPageLoad();
		//Thread.sleep(6000);
		String FirstNameAfterCreate=contacts.listedContacts().getText();
		System.out.println("Provided Contact name to create: "+Firstname);
		System.out.println("Listed Contact name after create: "+FirstNameAfterCreate);
		if (Firstname.equalsIgnoreCase(FirstNameAfterCreate)) {
			Assert.assertTrue(true);
			logger.info("Create Contact test passed");
		} 

		else {
			Assert.assertTrue(false);
			logger.info("create Contact test failed");
		}
			 
	}
}
