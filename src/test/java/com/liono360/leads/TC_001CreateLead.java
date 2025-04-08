package com.liono360.leads;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.LeadPage;
import com.liono360.utility.ExcelDataProvider;

public class TC_001CreateLead extends Baseclass {

	@Test
	public void TC001_CreateLead() throws InterruptedException, IOException {
		//redirectToCRM();

		LeadPage leads = new LeadPage(driver);
		ExcelDataProvider exceldata=new ExcelDataProvider();
		
		TryClick(leads.clickLead());
		logger.info("Clicked on Lead ");

		TryClick(leads.ActionButton());

		logger.info("Clicked on Action button");

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
		Actions action = new Actions(driver);


		explWaitToClick(leads.setEmailAddress());
		leads.setEmailAddress().sendKeys(Firstname+ randomnumber() + "@lionobytes.com");
		logger.info("Email for contact is added");


		explWaitToClick(leads.setPhoneNumber());
		leads.setPhoneNumber().sendKeys(randomnumber()+"3478" + randomnumber());
		logger.info("Email for phone is added");
		
		leads.setLeadName().sendKeys(exceldata.OrganizationName());
		logger.info("Lead name added");
		String AddedLeadName= leads.setLeadName().getAttribute("value");


		TrySelectMultiDropdown(leads.selectJobFunction (),1,2);
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

		TryClick(leads.Addtag());

		logger.info("Click On Add Tag");


		leads.AddtagName().sendKeys(exceldata.Tags());
		logger.info("Tag name added");

	//	TryClick(leads.AddColourClick());
	//	logger.info("Click On Colour");

		//Thread.sleep(4000);
		//TryClick(leads.SelectColour());
		//logger.info("Select On Colour");


		TryClick(leads.SecondSaveButton());
		logger.info("Click On Save");

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


		SelectDropdown(leads.selectAddressType(),1);
		logger.info("selectAddressType is added");

		TryClick(leads.AddressActiveToggle());
		//account.Slyders().click();
		
		logger.info("Address set as active");
		TryClick(leads.ShippingBillingCheckBox());
		//account.ShippingIiIcon().click();
		
		logger.info("Shipping  billing check box clicked");
		
		SelectDropdown(leads.AdressClass(),2);
		logger.info("AdressClass is added");

		leads.setLocation().sendKeys(exceldata.StreetAddress());
		Thread.sleep(4000);
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
		//Thread.sleep(6000);
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
