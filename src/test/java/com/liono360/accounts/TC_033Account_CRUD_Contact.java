package com.liono360.accounts;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;
import com.liono360.LeadWorkFlow.CommonMethods;
import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.AccountsPage;
import com.liono360.pageObject.ContactsPage;
import com.liono360.pageObject.OpportunitiesPage;
import com.liono360.utility.ExcelDataProvider;

public class TC_033Account_CRUD_Contact extends Baseclass{

	@Test
	public void TC033Account_CRUD_Contac() throws InterruptedException, IOException {
		
		//redirectToCRM();

		Actions action = new Actions(driver);
		AccountsPage account = new AccountsPage(driver);
		Faker faker = new Faker();
		ExcelDataProvider exceldata=new ExcelDataProvider();
		ContactsPage contacts = new ContactsPage(driver);
		
		
		TryClick(account.clickAccounts());
		logger.info("Clicked on Account Module");
		
		
		waitUntilPageLoad();
		waitUntilDisplay(account.ListedAccount(), 20);
		
		TryClick(account.ListedAccount());
		logger.info("Clicked on Account Record");

		waitUntilDisplay(account.Contact_Tab(), 20);
		TryClick(account.Contact_Tab());
		logger.info("Clicked on Contact Tab");
		
//Add Contact to Account----------------------------------------------------------------------------------------------------------------------
		waitUntilPageLoad();
		TryClick(account.Add_Contact());
		
		waitUntilPageLoad();
		SelectDropdown(contacts.ContactType(),1);
		logger.info("Contact type selected");
		
		contacts.Fname().sendKeys(exceldata.FirstName());
		logger.info("sendkeys on first name");
		String Firstname= contacts.Fname().getAttribute("value");
		
	
		contacts.Mname().sendKeys(exceldata.MiddleName() );
		logger.info("sendkeys on middle name");
		
		
		contacts.Lname().sendKeys(exceldata.LastName());
		logger.info("sendkeys on last name");
		
		contacts.Email().sendKeys(Firstname+ randomnumber() + "@lionobytes.com");
		logger.info("sendkeys on email adress");
		
		TrySelectDropdown(contacts.PhoneCountry1(),"USA");
		
		Thread.sleep(1000);
		contacts.WorkPhone().click();
		contacts.WorkPhone().sendKeys(randomnumber()+"1811"+randomnumber());
		logger.info("Phone Number is added");

		TryClick(contacts.ShowMore());
		logger.info("Clicked on showmore button");
	
	    Thread.sleep(1000);
		SelectDropdown(contacts.gender(),1);
		logger.info("Geneder selected");
	
		Thread.sleep(1000);
		contacts.Dept().sendKeys("IT");
		logger.info("Department Added");
	
		Thread.sleep(1000);
		TryClick(contacts.Dob());
		TryClick(contacts.Dob_Date());
		logger.info("DOB date added");
		
		Thread.sleep(1000);
		TrySelectMultiDropdown(contacts.LangSp(),1,2);
		logger.info("selected Language Spoken");
	
		Thread.sleep(1000);
		TryClick(contacts.StartDate());
		TryClick(contacts.Joining_Date());
		logger.info("selected Joining Date");
		
		Thread.sleep(1000);
		SelectDropdown(contacts.JobF(),1);
		logger.info("Job Function Added");
	
		Thread.sleep(1000);
		SelectDropdown(contacts.RelationshipS(),1);
		logger.info("Relationship Added");
		
		Thread.sleep(1000);
		SelectDropdown(contacts.MaritalS(),2);
		logger.info("marital status Added");
	    jsScroll(driver,contacts.sourceofcontact());
	    
	    Thread.sleep(2000);
		SelectDropdown(contacts.sourceofcontact(),1);
		logger.info("source of contact Added");
		
		Thread.sleep(1000);
		SelectDropdown(contacts.AnnualI(),1);
		logger.info("annual income added");
		
		Thread.sleep(1000);
		SelectDropdown(contacts.Degree(),2);
		logger.info("degree added");

		Thread.sleep(1000);
		SelectDropdown(contacts.FieldOfStudy(),2);
		logger.info("field of study added");


		contacts.Notes().sendKeys("all details are filled");
		logger.info("sendkeys on Notes");

//Address Details======================================================================================================
		
		TryClick(contacts.AdressIcon());
		logger.info("click on AdressIcon");
		
		TryClick(contacts.AdressType());
		TryClick(contacts.Select_Adress_Type());
		logger.info("Address type selected");
	
		
		SelectDropdown(contacts.Adressclass(),1);
		logger.info("Address class selected");
		
		contacts.StreetAdress1().sendKeys(exceldata.StreetAddress());
		Thread.sleep(4000);
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		action.sendKeys(Keys.ENTER).build().perform();
		
		waitUntilPageLoad();
		Thread.sleep(1000);
		
		TryClick(contacts.clickCheckbox());
		
		TryClick(contacts.ActiveAddress());
		
		Thread.sleep(2000);
		explWaitToClick(contacts.StreetAdress2());
		contacts.StreetAdress2().sendKeys("d-block");
		logger.info("street address2 added");
		
		Thread.sleep(3000);
		contacts.SaveInf().click();
		logger.info("click on Save button for Address Page");	
		
		Thread.sleep(2000);
		contacts.SaveInfAll().click();
		logger.info("click on Save button for Contact");
		
//Edit Contact============================================================================================================
		waitUntilPageLoad();
		Thread.sleep(1000);
		
		TryClick(account.Edit_Contact_btn());
		logger.info("click on Edit button");
		
		waitUntilPageLoad();
		SelectDropdown(contacts.title(),2);
	     
		logger.info("Title selected");
		
		contacts.Fname().clear();
		contacts.Fname().sendKeys(exceldata.FirstName() );
		logger.info("sendkeys on first name");
		String FirstnameEdit= contacts.Fname().getAttribute("value");
		
		contacts.Mname().clear();
		contacts.Mname().sendKeys(exceldata.MiddleName() );
		logger.info("sendkeys on middle name");
		
		contacts.Lname().clear();
		contacts.Lname().sendKeys(exceldata.LastName());
		logger.info("sendkeys on last name");
		
		contacts.Email().clear();
		contacts.Email().sendKeys(Firstname+ randomnumber() + "@lionobytes.com");
		logger.info("sendkeys on email adress");
		
		contacts.SaveInfAll().click();
		logger.info("click on Save button for Contact");
		
//View Contact====================================================================================================
		waitUntilPageLoad();
		Thread.sleep(1000);
		
		TryClick(account.View_Contact_bttn());
		logger.info("click on View Contact button");
		
		waitUntilPageLoad();
		
		TryClick(contacts.Cancel_Bttn());
		logger.info("click on Cancel button");

//Make Contact Primary====================================================================================================
		waitUntilPageLoad();
		Thread.sleep(1000);
		
		TryClick(account.Primary_bttn());
		logger.info("click on Primary button");
		
//Delete Contact========================================================================================================
		waitUntilPageLoad();
		Thread.sleep(1000);
		
		TryClick(account.Delete_bttn());
		logger.info("click on Delete button");
		
		Thread.sleep(1000);
		TryClick(account.Yes_bttn());
		logger.info("click on Yes button");
	}
	

		
}


