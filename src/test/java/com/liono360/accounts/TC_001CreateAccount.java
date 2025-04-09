package com.liono360.accounts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;
import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.AccountsPage;
import com.liono360.utility.ExcelDataProvider;

public class TC_001CreateAccount extends Baseclass{

	@SuppressWarnings("static-access")
	@Test
	public void TC001CreateAccount() throws InterruptedException, IOException {
		

		Actions action = new Actions(driver);
		AccountsPage account = new AccountsPage(driver);
		Faker faker = new Faker();
		ExcelDataProvider exceldata=new ExcelDataProvider();
		
		
		TryClick(account.clickAccounts());
		logger.info("Clicked on Account Module");
		
		
		waitUntilPageLoad();
		Thread.sleep(2000);
		action.moveToElement(account.ActionButton()).build().perform();
		logger.info("Mousehover on Action button");
	
		TryClick(account.NewButton());
		logger.info("Clicked on new button");
		
		
		SelectDropdown(account.Title1(),2);
		Thread.sleep(1000);
		logger.info("Clicked on title button and select dropdown value");

		account.Firstname().sendKeys(exceldata.FirstName());
		logger.info("First Name Added");
	
		String Firstname= account.Firstname().getAttribute("value");
		
		account.middlename().sendKeys(exceldata.MiddleName());
		logger.info("Middle Name Added");
		
		
		account.LastName().sendKeys(exceldata.LastName());
		logger.info("Last Name Added");
		String LastName = account.LastName().getAttribute("value");
		account.Email().sendKeys(Firstname+"workemail"+randomnumber()+"@lionobytes.com");
		account.HomeEmail().sendKeys(Firstname+"homemail"+randomnumber()+"@lionobytes.com");
		account.CE1Email().sendKeys(Firstname+"ce1email"+randomnumber()+"@lionobytes.com");
		account.CE2Email().sendKeys(Firstname+"ce2email"+randomnumber()+"@lionobytes.com");
		logger.info("Sendkeys on email");
		
		SelectDropdown(account.PhoneCountry1(), 1);
		waitUntilDisplay(account.WorkPhone(),20);
		account.WorkPhone().click();
		account.WorkPhone().sendKeys(randomnumber()+"1811"+randomnumber());
		SelectDropdown(account.PhoneCountry2(), 1);

		account.HomePhone().click();
		waitUntilDisplay(account.HomePhone(),20);
		account.HomePhone().sendKeys(randomnumber()+"2822"+randomnumber());
		SelectDropdown(account.PhoneCountry3(), 1);
		
		account.MobilePhone().click();
		waitUntilDisplay(account.MobilePhone(),20);
		account.MobilePhone().sendKeys(randomnumber()+"3833"+randomnumber());
		SelectDropdown(account.PhoneCountry4(),1);
		
		account.CP1().click();
		waitUntilDisplay(account.CP1(),20);
		
		account.CP1().sendKeys(randomnumber()+"4844"+randomnumber());
		SelectDropdown(account.PhoneCountry5(), 1);
		waitUntilDisplay(account.CP2(),20);
		account.CP2().click();
		account.CP2().sendKeys(randomnumber()+"5855"+randomnumber());
		logger.info("Sendkeys on phone1");
		
		
		account.contactTwitter().sendKeys(exceldata.Twitter());
		logger.info("twitter added");
		
		account.contactFacbook().sendKeys(exceldata.Facebook());
		logger.info("Facebook added");
		
		account.contactLinkedin().sendKeys(exceldata.Linkedin());
		logger.info("Linkedin added");
		
		account.contactInstagram().sendKeys(exceldata.Instagram());
		logger.info("Instagram added");
		
		
		account.contactWebsite().sendKeys(exceldata.Websites());
		logger.info("Website added");
		
		
		account.AccountName().sendKeys(exceldata.OrganizationName());
		logger.info("sendkeys on accountname");
		String SetAccountName= account.AccountName().getAttribute("value");

		
		SelectDropdown(account.Designaion(),1);
		logger.info("job function selected");
		waitUntilDisplay(account.accountType(),20);
		TryClick(account.accountType());
		
		
		Thread.sleep(1000);		
		TryClick(account.ClickMultipleDropdownValue(1));
		logger.info("Account type selected");

		account.accountNumber().sendKeys("102" + randomnumber());
		logger.info("Sendkeys on accountNumber");
		jsScroll(driver,account.Timezones());
	
		SelectDropdown(account.Timezones(),5);
	 	
     	logger.info("time zones selected");
		jsScroll(driver,account.Timezones());
		
		
		SelectDropdown(account.Currency(),2);
		logger.info("Currency selected");

		TryClick(account.TagPlusbtn());
		logger.info("Click On plus sign to Add Tag");
        
	   
		TryClick(account.Addtag());
	
		logger.info("Click On Add Tag");
		
	   
		account.AddtagName().sendKeys(exceldata.Tags());
		logger.info("Tag name added");
        
		TryClick(account.AddColourClick());
		waitUntilDisplay(account.SecondSaveButton(),20);
		
		TryClick(account.SecondSaveButton());
		
		logger.info("Click On Save");

		TryClick(account.SelectTag());
		
		logger.info("Click On Select Tag");

		TryClick(account.Assign());
		logger.info("tag assigned");



//..............account details.................//

		
		TryClick(account.AccountDetails());
		
		logger.info("sendkeys on account details");

		
		account.DoingBusiness().sendKeys("yes");
		logger.info("sendkeys on doing business");

		account.TaxId().sendKeys("tax"+randomnumber());

		SelectDropdown(account.NumberOfEmp(),4);
		logger.info("select on dropdown NumberOfEmp ");


		waitUntilDisplay(account.EstimateAnnualRevenue(),20);
		SelectDropdown(account.EstimateAnnualRevenue(),3);
		logger.info("select on dropdown EstimatedAnnualRevenue ");

		SelectDropdown(account.OwnershipType(),6);
		logger.info("select on dropdown OwnershipType ");

		
		SelectDropdown(account.BusinessClassification(),2);
		logger.info("select on dropdown BusinessClassification");

		
		account.FoundedYear().sendKeys("1"+randomnumber());
		logger.info("sendkeys on founded years");

		
		SelectDropdown(account.IndustrysI(),5);
		logger.info("select on dropdown IndustrysI");


		account.SICCodes().sendKeys("123");
		logger.info("sendkeys on SICCodes");

	
		account.NAICScodes().sendKeys("12345");
		logger.info("sendkeys on SICCodes");


		SelectDropdown(account.AccountSource(),1);
		
		logger.info("Account source is selected");

		
		SelectDropdown(account.AccountRating(),2);
		logger.info("select on dropdown AccountRating");

	
		account.AccountEmail().sendKeys(LastName+randomnumber()+"@lionobytes.com");
		logger.info("Account email added");
		

        SelectDropdown(account.accountPhoneCountry(),1);
		
		account.accountPhone().click();
		Thread.sleep(500);
		account.accountPhone().sendKeys(randomnumber()+"4844"+randomnumber());
		
		logger.info("account phone number added");
		
		account.twitter().sendKeys(exceldata.Twitter());
		logger.info("twitter added");
		
		account.facebook().sendKeys(exceldata.Facebook());
		logger.info("Facebook added");
		
		account.linkedin().sendKeys(exceldata.Linkedin());
		logger.info("Linkedin added");
		
		account.instagram().sendKeys(exceldata.Instagram());
		logger.info("Instagram added");
		
		
		account.Website().sendKeys(exceldata.Websites());
		logger.info("Website added");
		

		account.Notess().sendKeys("Fill account details");
		logger.info("sendkeys on Notess");

// Address Details========================================================================================
		
		
		TryClick(account.AdressDetails());
		logger.info("click on AdressDetails");

		
		TryClick(account.AdressDetailsIcon());
		logger.info("click on AdressDetails Icon");
		

		TryClick(account.Slyders());
		logger.info("click on ShippingIiIcon");

		waitUntilDisplay(account.AddressType(),20);
		TrySelectDropdown(account.AddressType(),"Billing");
		logger.info("select on AddressType");

		
		TryClick(account.ShippingIiIcon());
		logger.info("click on ShippingIiIcon");
		
		SelectDropdown(account.AdressClass(),2);
		logger.info("select on AdressClass");

		
		account.StreetAdress1().sendKeys(exceldata.StreetAddress());
		Thread.sleep(5000);
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		action.sendKeys(Keys.ENTER).build().perform();
	
		waitUntilPageLoad();
		account.StreetAdress2().sendKeys("b-block");
		logger.info("sendkeys on StreetAdress2");

		waitUntilDisplay(account.SaveAccountDetails(),20);
		TryClick(account.SaveAccountDetails());
		logger.info("click on SaveAccountDetails button");

		waitUntilDisplay(account.SaveAllDeatilsBtn(),20);
		TryClick(account.SaveAllDeatilsBtn());
		
	
		logger.info("click on SaveAllDeatilsBtn button");
		
// ASSERTION====================================================================================================

		waitUntilPageLoad();
		waitUntilDisplay(account.ListedAccount(),20);
		String AccountNameAfterCreate=account.ListedAccount().getText();
		System.out.println("provided account name to create: "+SetAccountName);
		System.out.println("Listed account name after create: "+AccountNameAfterCreate);
		if (SetAccountName.equalsIgnoreCase(AccountNameAfterCreate)) {
			Assert.assertTrue(true);
			logger.info("Create account test passed");
		} 

		else {
			Assert.assertTrue(false);
			logger.info("create account test failed");
		}
		
	}

}
