package com.liono360.leads;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.LeadPage;
import com.liono360.pageObject.LoginPage;
import com.liono360.utility.ExcelDataProvider;

public class TC_001CreateLead extends Baseclass {

	@Test
	public void TC001_CreateLead() throws InterruptedException, IOException {
		//redirectToCRM();

		LeadPage leads = new LeadPage(driver);
		ExcelDataProvider exceldata=new ExcelDataProvider();
		
		waitUntilPageLoad();
		TryClick(leads.clickLead());
		logger.info("Clicked on Lead ");
		Actions action = new Actions(driver);
		
		Thread.sleep(6000);
		action.moveToElement(leads.ActionButton()).build().perform();
		logger.info("Clicked on Account button");

		TryClick(leads.NewLead());
		logger.info("Clicked on add Lead button");

		SelectDropdown(leads.selectTitle(),2);
		logger.info("Title selected");

		explWaitToClick(leads.setFirstName());
		leads.setFirstName().sendKeys(exceldata.FirstName());
		logger.info("First Name Added");
		String Firstname= leads.setFirstName().getAttribute("value");

		explWaitToClick(leads.setMiddlename());
		leads.setMiddlename().sendKeys(exceldata.MiddleName());
		logger.info("Middle Name Added");

		explWaitToClick(leads.setLastname());
		leads.setLastname().sendKeys(exceldata.LastName());
		logger.info("Last Name Added");
		String LastName= leads.setLastname().getAttribute("value");
		


		explWaitToClick(leads.setEmailAddress());
		leads.setEmailAddress().sendKeys(Firstname+ randomnumber() + "@lionobytes.com");
		leads.homeemail().sendKeys(Firstname+"homemail"+randomnumber()+"@lionobytes.com");
		leads.emailce1().sendKeys(Firstname+"ce1email"+randomnumber()+"@lionobytes.com");
		leads.emailce2().sendKeys(Firstname+"ce2email"+randomnumber()+"@lionobytes.com");
		logger.info("Email for contact is added");


		//explWaitToClick(leads.setPhoneNumber());
		SelectDropdown(leads.PhoneCountry1(), 1);
		Thread.sleep(500);
		leads.WorkPhone().click();
		leads.WorkPhone().sendKeys(randomnumber()+"1811"+randomnumber());
		SelectDropdown(leads.PhoneCountry2(), 1);

		leads.HomePhone().click();
		Thread.sleep(500);
		leads.HomePhone().sendKeys(randomnumber()+"2822"+randomnumber());
		SelectDropdown(leads.PhoneCountry3(), 2);
		
		leads.MobilePhone().click();
		Thread.sleep(500);
		leads.MobilePhone().sendKeys(randomnumber()+"3833"+randomnumber());
		SelectDropdown(leads.PhoneCountry4(), 1);
		
		leads.CP1().click();
		Thread.sleep(500);
		leads.CP1().sendKeys(randomnumber()+"4844"+randomnumber());
		SelectDropdown(leads.PhoneCountry5(),1);
		Thread.sleep(500);
		leads.CP2().click();
		leads.CP2().sendKeys(randomnumber()+"5855"+randomnumber());
		
		
		leads.setLeadName().sendKeys(exceldata.OrganizationName());
		logger.info("Lead name added");
		String AddedLeadName= leads.setLeadName().getAttribute("value");


		SelectDropdown(leads.Designaion(),1);
		logger.info("selectJobFunction is added");

		TrySelectMultiDropdown(leads.selectLeadType(),1,2);
	
		logger.info("Lead types added");
		explWaitToClick(leads.setLeadNumber());
		leads.setLeadNumber().click();
		leads.setLeadNumber().sendKeys(randomnumber()+"327" + randomnumber());
		logger.info("Lead number is added");

		SelectDropdown(leads.selectTimeZone(),2);
		logger.info("click on selectTimeZone");

		SelectDropdown(leads.selectCurrency(),2);
		logger.info("Currency added");

// Add tags and select==========================================================================		
		TryClick(leads.TagPlusbtn());
		logger.info("Click On plus sign to Add Tag");


		TryClick(leads.SelectTag());
		logger.info("Click On Select Tag");

		TryClick(leads.Assign());
		logger.info("tag assigned");


// Lead Details============================================================================

		TryClick(leads.clickonleadDetails());
		logger.info("click on lead details ");

		leads.setDBAName().sendKeys("DBA" + randomnumber());
		logger.info("DBA name added");
		leads.setTaxId().sendKeys("tax"+randomnumber());
		logger.info("Tax id added");

		SelectDropdown(leads.selectEmployee(),2);
		logger.info("Number of employee added");

		SelectDropdown(leads.selectRevenue(),2);
		logger.info("Revenue selected");


		SelectDropdown(leads.selectOwenership(),2);

		logger.info("Ownership added");
		SelectDropdown(leads.Stage1(),3);	

		logger.info("Stage selected");

		leads.setFoundedYear().sendKeys("1"+randomnumber());
		logger.info("Founded year added");

		SelectDropdown(leads.selectIndustry(),2);
		logger.info("selectIndustry is added");
		
		leads.LeadsEmail().sendKeys(LastName+randomnumber()+"@lionobytes.com");
		logger.info("Lead email added");
		

        SelectDropdown(leads.leadphoneCountry(),1);
		
	
		Thread.sleep(500);
		leads.leadPhone().sendKeys(randomnumber()+"4844"+randomnumber());
		
		logger.info("lead phone number added");
		
		leads.twitter().sendKeys(exceldata.Twitter());
		logger.info("twitter added");
		
		leads.facebook().sendKeys(exceldata.Facebook());
		logger.info("Facebook added");
		
		leads.linkedin().sendKeys(exceldata.Linkedin());
		logger.info("Linkedin added");
		
		leads.instagram().sendKeys(exceldata.Instagram());
		logger.info("Instagram added");
		
		
		leads.Website().sendKeys(exceldata.Websites());
		logger.info("Website added");

		leads.setSICCode().sendKeys(randomnumber());
		logger.info("SIC code added");

		leads.setNAICSCode().sendKeys(randomnumber());
		logger.info("NAICS code added");
		SelectDropdown(leads.selectLeadSource(),2);
		logger.info("selectLeadSource is added");

		SelectDropdown(leads.selectRating(),2);
		logger.info("selectRating is added");

		SelectDropdown(leads.Status(),2);
		logger.info("Status is added");

		leads.Notess().sendKeys("Lead Details");
		logger.info("Notes added");

//Address details=============================================================================		
		TryClick(leads.clickAddAddress());
		logger.info("Clicked on add address");

		TryClick(leads.IconAdressbtn());
		logger.info("Clicked on IconAdressbtn");

		TrySelectDropdown(leads.selectAddressType(),"Billing");
		logger.info("selectAddressType is added");

		TryClick(leads.AddressActiveToggle());
		
		
		logger.info("Address set as active");
		TryClick(leads.ShippingBillingCheckBox());
		
		logger.info("Shipping  billing check box clicked");
		
		SelectDropdown(leads.AdressClass(),2);
		logger.info("AdressClass is added");

		leads.setLocation().sendKeys(exceldata.StreetAddress());
		Thread.sleep(2000);
		waitUntilDisplay(leads.setLocation(),20);
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		action.sendKeys(Keys.ENTER).build().perform();

		waitUntilPageLoad();
		leads.StreetAdress2().sendKeys("b-block");
		logger.info("sendkeys on StreetAdress2");

		TryClick(leads.clickSaveAddress());
		logger.info("Address Added");

		TryClick(leads.AllbtnSaveAddress());
		logger.info("Clicked on save button to add lead");


// ASSERTION=======================================================================================
		
		waitUntilPageLoad();
		leads.Search().sendKeys(AddedLeadName);
		logger.info("Lead name passed to search");
		waitUntilPageLoad();
		waitUntilDisplay(leads.listedLeads(),20);
		String LeadNameAfterCreate=leads.listedLeads().getText();
		System.out.println("Provided Lead name to create: "+AddedLeadName);
		System.out.println("Listed Lead name after create: "+LeadNameAfterCreate);
		if (AddedLeadName.equalsIgnoreCase(LeadNameAfterCreate)) {
			Assert.assertTrue(true);
			logger.info("Create Lead test passed");
		} 

		else {
			Assert.assertTrue(false);
			logger.info("create Lead test failed");
		}
	 
	}
	

	
}
