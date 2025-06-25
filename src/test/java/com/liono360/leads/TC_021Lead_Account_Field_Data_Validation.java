package com.liono360.leads;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.AccountsPage;
import com.liono360.pageObject.LeadPage;
import com.liono360.pageObject.LoginPage;
import com.liono360.utility.ExcelDataProvider;

public class TC_021Lead_Account_Field_Data_Validation extends Baseclass {

	@SuppressWarnings("unused")
	@Test
	public void TC021_Lead_Account_Field_Data_Validation() throws InterruptedException, IOException {

		LeadPage leads = new LeadPage(driver);
		AccountsPage account = new AccountsPage(driver);
		Actions action = new Actions(driver);
		ExcelDataProvider exceldata=new ExcelDataProvider();
		
		waitUntilPageLoad();
		Thread.sleep(10000);
		
		TryClick(leads.clickLead());
		logger.info("Clicked on Lead ");
		
		waitUntilPageLoad();
		Thread.sleep(5000);
		action.moveToElement(leads.ActionButton()).build().perform();
		logger.info("Mousehover on Action button");

		TryClick(leads.NewLead());
		logger.info("Clicked on add new button");

		// Title selection - no input text, so no getAttribute needed
		SelectDropdown(leads.selectTitle(),2);
		String Titile= leads.selectTitle().getAttribute("value");
		logger.info("Title selected");

		// First Name
		explWaitToClick(leads.setFirstName());
		leads.setFirstName().sendKeys(exceldata.FirstName());
		logger.info("First Name Added");
		String Firstname= leads.setFirstName().getAttribute("value");

		// Middle Name
		explWaitToClick(leads.setMiddlename());
		leads.setMiddlename().sendKeys(exceldata.MiddleName());
		logger.info("Middle Name Added");
		String Middlename = leads.setMiddlename().getAttribute("value");

		// Last Name
		explWaitToClick(leads.setLastname());
		leads.setLastname().sendKeys(exceldata.LastName());
		logger.info("Last Name Added");
		String LastName= leads.setLastname().getAttribute("value");

		// Email addresses - multiple fields, added getAttribute for one example
		explWaitToClick(leads.setEmailAddress());
		String email1 = Firstname + randomnumber() + "@lionobytes.com";
		leads.setEmailAddress().sendKeys(email1);
		String email1Value = leads.setEmailAddress().getAttribute("value");

		leads.homeemail().sendKeys(Firstname+"homemail"+randomnumber()+"@lionobytes.com");
		String homeEmailValue = leads.homeemail().getAttribute("value");

		leads.emailce1().sendKeys(Firstname+"ce1email"+randomnumber()+"@lionobytes.com");
		String emailCE1Value = leads.emailce1().getAttribute("value");

		leads.emailce2().sendKeys(Firstname+"ce2email"+randomnumber()+"@lionobytes.com");
		String emailCE2Value = leads.emailce2().getAttribute("value");
		logger.info("Email for contact is added");

		// Phone numbers with countries - added getAttribute for phones only

		SelectDropdown(leads.PhoneCountry1(), 1);
		Thread.sleep(500);
		leads.WorkPhone().click();
		String workPhoneVal = randomnumber()+"1811"+randomnumber();
		leads.WorkPhone().sendKeys(workPhoneVal);
		String workPhoneValue = leads.WorkPhone().getAttribute("value");

		SelectDropdown(leads.PhoneCountry2(), 1);
		leads.HomePhone().click();
		Thread.sleep(500);
		String homePhoneVal = randomnumber()+"2822"+randomnumber();
		leads.HomePhone().sendKeys(homePhoneVal);
		String homePhoneValue = leads.HomePhone().getAttribute("value");

		SelectDropdown(leads.PhoneCountry3(), 2);
		leads.MobilePhone().click();
		Thread.sleep(500);
		String mobilePhoneVal = randomnumber()+"3833"+randomnumber();
		leads.MobilePhone().sendKeys(mobilePhoneVal);
		String mobilePhoneValue = leads.MobilePhone().getAttribute("value");

		SelectDropdown(leads.PhoneCountry4(), 1);
		leads.CP1().click();
		Thread.sleep(500);
		String cp1Val = randomnumber()+"4844"+randomnumber();
		leads.CP1().sendKeys(cp1Val);
		String cp1Value = leads.CP1().getAttribute("value");

		SelectDropdown(leads.PhoneCountry5(),1);
		Thread.sleep(500);
		leads.CP2().click();
		String cp2Val = randomnumber()+"5855"+randomnumber();
		leads.CP2().sendKeys(cp2Val);
		String cp2Value = leads.CP2().getAttribute("value");

		// Lead Name
		leads.setLeadName().sendKeys(exceldata.OrganizationName());
		logger.info("Lead name added");
		String AddedLeadName= leads.setLeadName().getAttribute("value");
		System.out.println(AddedLeadName);

		// Designation dropdown no sendKeys, no getAttribute

		SelectDropdown(leads.Designaion(),1);
		logger.info("selectJobFunction is added");

		// Lead types multi-select no sendKeys, no getAttribute

		TrySelectMultiDropdown(leads.selectLeadType(),1,2);
		logger.info("Lead types added");

		// Lead Number
		explWaitToClick(leads.setLeadNumber());
		leads.setLeadNumber().click();
		String leadNumVal = randomnumber()+"327" + randomnumber();
		leads.setLeadNumber().sendKeys(leadNumVal);
		String leadNumValue = leads.setLeadNumber().getAttribute("value");
		logger.info("Lead number is added");

		// TimeZone, Currency dropdowns - no sendKeys, no getAttribute

		SelectDropdown(leads.selectTimeZone(),2);
		logger.info("click on selectTimeZone");

		SelectDropdown(leads.selectCurrency(),2);
		logger.info("Currency added");

		// Tags section - clicks only, no sendKeys

		TryClick(leads.TagPlusbtn());
		logger.info("Click On plus sign to Add Tag");

		TryClick(leads.SelectTag());
		logger.info("Click On Select Tag");

		TryClick(leads.Assign());
		logger.info("tag assigned");

		// Lead Details section - multiple sendKeys

		TryClick(leads.clickonleadDetails());
		logger.info("click on lead details ");

		// DBA Name
		String dbaVal = "DBA" + randomnumber();
		leads.setDBAName().sendKeys(dbaVal);
		String dbaValue = leads.setDBAName().getAttribute("value");
		logger.info("DBA name added");

		// Tax ID
		String taxIdVal = "tax"+randomnumber();
		leads.setTaxId().sendKeys(taxIdVal);
		String taxIdValue = leads.setTaxId().getAttribute("value");
		logger.info("Tax id added");

		// Employee dropdown no sendKeys, no getAttribute

		SelectDropdown(leads.selectEmployee(),2);
		logger.info("Number of employee added");

		// Revenue dropdown

		SelectDropdown(leads.selectRevenue(),2);
		logger.info("Revenue selected");

		// Ownership dropdown

		SelectDropdown(leads.selectOwenership(),2);
		logger.info("Ownership added");

		// Founded Year
		String foundedYearVal = "1"+randomnumber();
		leads.setFoundedYear().sendKeys(foundedYearVal);
		String foundedYearValue = leads.setFoundedYear().getAttribute("value");
		logger.info("Founded year added");

		// Industry dropdown

		SelectDropdown(leads.selectIndustry(),2);
		logger.info("selectIndustry is added");

		// Lead Email
		String leadEmailVal = LastName+randomnumber()+"@lionobytes.com";
		leads.LeadsEmail().sendKeys(leadEmailVal);
		String leadEmailValue = leads.LeadsEmail().getAttribute("value");
		logger.info("Lead email added");

		// Lead Phone Country dropdown no sendKeys

		SelectDropdown(leads.leadphoneCountry(),1);

		Thread.sleep(500);

		// Lead Phone number
		String leadPhoneVal = randomnumber()+"4844"+randomnumber();
		leads.leadPhone().sendKeys(leadPhoneVal);
		String leadPhoneValue = leads.leadPhone().getAttribute("value");
		logger.info("lead phone number added");

		// Social media fields

		leads.twitter().sendKeys(exceldata.Twitter());
		String twitterValue = leads.twitter().getAttribute("value");
		logger.info("twitter added");

		leads.facebook().sendKeys(exceldata.Facebook());
		String facebookValue = leads.facebook().getAttribute("value");
		logger.info("Facebook added");

		leads.linkedin().sendKeys(exceldata.Linkedin());
		String linkedinValue = leads.linkedin().getAttribute("value");
		logger.info("Linkedin added");

		leads.instagram().sendKeys(exceldata.Instagram());
		String instagramValue = leads.instagram().getAttribute("value");
		logger.info("Instagram added");

		//Website
		leads.Website().sendKeys(exceldata.Websites());
		String websiteValue = leads.Website().getAttribute("value");
		logger.info("Website added");

		// SIC Code
		String sicVal = randomnumber();
		leads.setSICCode().sendKeys(sicVal);
		String sicValue = leads.setSICCode().getAttribute("value");
		logger.info("SIC code added");

		// NAICS Code
		String naicsVal = randomnumber();
		leads.setNAICSCode().sendKeys(naicsVal);
		String naicsValue = leads.setNAICSCode().getAttribute("value");
		logger.info("NAICS code added");

		// Lead Source dropdown

		SelectDropdown(leads.selectLeadSource(),2);
		logger.info("selectLeadSource is added");

		// Rating dropdown

		SelectDropdown(leads.selectRating(),2);
		logger.info("selectRating is added");

		// Status dropdown

		SelectDropdown(leads.Status(),2);
		logger.info("Status is added");

		// Notes

		leads.Notess().sendKeys("Lead Details");
		String notesValue = leads.Notess().getAttribute("value");
		logger.info("Notes added");

		// Address details - mostly clicks, but street address has sendKeys

		TryClick(leads.clickAddAddress());
		logger.info("Clicked on add address");

		TryClick(leads.IconAdressbtn());
		logger.info("Clicked on IconAdressbtn");

		TrySelectDropdown(leads.selectAddressType(),"Billing");
		logger.info("selectAddressType is added");

		TryClick(leads.AddressActiveToggle());
		logger.info("Address set as active");

		TryClick(leads.ShippingBillingCheckBox());
		logger.info("Shipping billing check box clicked");

		SelectDropdown(leads.AdressClass(),2);
		logger.info("AdressClass is added");

		leads.setLocation().sendKeys(exceldata.StreetAddress());
		String locationValue = leads.setLocation().getAttribute("value");

		Thread.sleep(2000);
		waitUntilDisplay(leads.setLocation(),20);
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		action.sendKeys(Keys.ENTER).build().perform();

		waitUntilPageLoad();

		leads.StreetAdress2().sendKeys("b-block");
		String streetAddress2Value = leads.StreetAdress2().getAttribute("value");
		logger.info("sendkeys on StreetAdress2");

		TryClick(leads.clickSaveAddress());
		logger.info("Click on Save button for Address");

		Thread.sleep(2000);
		TryClick(leads.SaveLead());
		logger.info("Clicked on save button to add lead");

		
		waitUntilPageLoad();
		Thread.sleep(5000);
		
		TryClick(account.clickAccounts());
		logger.info("Clicked on Account Module");
		

		waitUntilPageLoad();
		Thread.sleep(10000);
		
		waitUntilDisplay(account.ListedAccount(), 20);
		mouseActionRightClick(driver, account.ListedAccount());
		Thread.sleep(1000);
		account.ClickOnEdit().click();
		logger.info("Clicked on ClickOnEdit button");
		
// Account Fields============================================================================================	
		
		String titleText = account.Title1().getText();
		logger.info("Title text fetched: " + titleText);

		String Account_Firstname = account.EditFirstname().getAttribute("value");
		logger.info("First Name fetched: " + Account_Firstname);

		String Account_Middlename = account.editmiddlename().getAttribute("value");
		logger.info("Middle Name fetched: " + Account_Middlename);

		String Account_LastName = account.editLastName().getAttribute("value");
		logger.info("Last Name fetched: " + Account_LastName);

		String emailValue = account.EditEmail().getAttribute("value");
		logger.info("Email fetched: " + emailValue);
		String AccounthomeEmailValue = account.EditHomeEmail().getAttribute("value");
		logger.info("Home Email fetched: " + homeEmailValue);
		String ce1EmailValue = account.EditCE1Email().getAttribute("value");
		logger.info("CE1 Email fetched: " + ce1EmailValue);
		String ce2EmailValue = account.EditCE2Email().getAttribute("value");
		logger.info("CE2 Email fetched: " + ce2EmailValue);

	
		String phoneCountry1 = account.PhoneCountry1().getText();
		logger.info("PhoneCountry1 fetched: " + phoneCountry1);

		String AccountworkPhoneValue = account.WorkPhone().getAttribute("value");
		logger.info("Work Phone fetched: " + workPhoneValue);

		String phoneCountry2 = account.PhoneCountry2().getText();
		logger.info("PhoneCountry2 fetched: " + phoneCountry2);

		String AccounthomePhoneValue = account.HomePhone().getAttribute("value");
		logger.info("Home Phone fetched: " + homePhoneValue);

		String phoneCountry3 = account.PhoneCountry3().getText();
		logger.info("PhoneCountry3 fetched: " + phoneCountry3);

		String AccountmobilePhoneValue = account.MobilePhone().getAttribute("value");
		logger.info("Mobile Phone fetched: " + mobilePhoneValue);

		String phoneCountry4 = account.PhoneCountry4().getText();
		logger.info("PhoneCountry4 fetched: " + phoneCountry4);

		String Accountcp1Value = account.CP1().getAttribute("value");
		logger.info("CP1 fetched: " + cp1Value);

		String phoneCountry5 = account.PhoneCountry5().getText();
		logger.info("PhoneCountry5 fetched: " + phoneCountry5);

		String Accountcp2Value = account.CP2().getAttribute("value");
		logger.info("CP2 fetched: " + cp2Value);

		// Social media fetched values
		String twitterVal = account.contactTwitter().getAttribute("value");
		logger.info("Twitter fetched: " + twitterVal);

		String facebookVal = account.contactFacbook().getAttribute("value");
		logger.info("Facebook fetched: " + facebookVal);

		String linkedinVal = account.contactLinkedin().getAttribute("value");
		logger.info("Linkedin fetched: " + linkedinVal);

		String instagramVal = account.contactInstagram().getAttribute("value");
		logger.info("Instagram fetched: " + instagramVal);

		String websiteVal = account.contactWebsite().getAttribute("value");
		logger.info("Website fetched: " + websiteVal);

		String SetAccountName = account.AccountName().getAttribute("value");
		logger.info("Account Name fetched: " + SetAccountName);

		Thread.sleep(2000);
		// Designation dropdown replaced with getText()
		String designationText = account.Designaion().getText();
		logger.info("Job function fetched: " + designationText);

		Thread.sleep(2000);
		String accountTypeText = account.accountType().getText();
		logger.info("Account type text: " + accountTypeText);

		Thread.sleep(1000);
		String multipleDropdownValue = account.ClickMultipleDropdownValue(1).getText();
		logger.info("Account type selected: " + multipleDropdownValue);

		String accountNumberValue = account.accountNumber().getAttribute("value");
		logger.info("Account Number fetched: " + accountNumberValue);

		String currencyText = account.Currency().getText();
		logger.info("Currency fetched: " + currencyText);

		String tagPlusBtnText = account.TagPlusbtn().getText();
		logger.info("Tag plus button text: " + tagPlusBtnText);

		String addTagText = account.Addtag().getText();
		logger.info("Add Tag button text: " + addTagText);

		String tagNameValue = account.AddtagName().getAttribute("value");
		logger.info("Tag name fetched: " + tagNameValue);

		String secondSaveBtnText = account.SecondSaveButton().getText();
		logger.info("Second Save Button text: " + secondSaveBtnText);

		String selectTagText = account.SelectTag().getText();
		logger.info("Select Tag text: " + selectTagText);

		String assignText = account.Assign().getText();
		logger.info("Assign button text: " + assignText);

		// Account Details section
		logger.info("Account Details section started");

		String doingBusinessVal = account.DoingBusiness().getAttribute("value");
		logger.info("Doing Business fetched: " + doingBusinessVal);

		String AccounttaxIdValue = account.TaxId().getAttribute("value");
		logger.info("Tax ID fetched: " + taxIdValue);

		String numberOfEmpText = account.NumberOfEmp().getText();
		logger.info("Number of Employees fetched: " + numberOfEmpText);

		String estimateAnnualRevenueText = account.EstimateAnnualRevenue().getText();
		logger.info("Estimated Annual Revenue fetched: " + estimateAnnualRevenueText);

		String ownershipTypeText = account.OwnershipType().getText();
		logger.info("Ownership Type fetched: " + ownershipTypeText);

		String businessClassificationText = account.BusinessClassification().getText();
		logger.info("Business Classification fetched: " + businessClassificationText);

		String AccountfoundedYearValue = account.FoundedYear().getAttribute("value");
		logger.info("Founded Year fetched: " + foundedYearValue);

		String industryText = account.IndustrysI().getText();
		logger.info("Industry fetched: " + industryText);

		String sicCodeValue = account.SICCodes().getAttribute("value");
		logger.info("SIC Codes fetched: " + sicCodeValue);

		String naicsCodeValue = account.NAICScodes().getAttribute("value");
		logger.info("NAICS Codes fetched: " + naicsCodeValue);

		String accountSourceText = account.AccountSource().getText();
		logger.info("Account Source fetched: " + accountSourceText);

		String accountRatingText = account.AccountRating().getText();
		logger.info("Account Rating fetched: " + accountRatingText);

		String accountEmailValue = account.AccountEmail().getAttribute("value");
		logger.info("Account Email fetched: " + accountEmailValue);

		String accountPhoneCountryText = account.accountPhoneCountry().getText();
		logger.info("Account Phone Country fetched: " + accountPhoneCountryText);

		String accountPhoneValue = account.accountPhone().getAttribute("value");
		logger.info("Account Phone fetched: " + accountPhoneValue);

		String twitterVal2 = account.twitter().getAttribute("value");
		logger.info("Twitter fetched: " + twitterVal2);

		String facebookVal2 = account.facebook().getAttribute("value");
		logger.info("Facebook fetched: " + facebookVal2);

		String linkedinVal2 = account.linkedin().getAttribute("value");
		logger.info("Linkedin fetched: " + linkedinVal2);

		String instagramVal2 = account.instagram().getAttribute("value");
		logger.info("Instagram fetched: " + instagramVal2);

		String websiteVal2 = account.Website().getAttribute("value");
		logger.info("Website fetched: " + websiteVal2);

		String notesVal = account.Notess().getAttribute("value");
		logger.info("Notes fetched: " + notesVal);

		// Address Details

		String adressDetailsText = account.AdressDetails().getText();
		logger.info("Address Details fetched: " + adressDetailsText);

		String adressDetailsIconText = account.AdressDetailsIcon().getText();
		logger.info("Address Details Icon fetched: " + adressDetailsIconText);

		String slydersText = account.Slyders().getText();
		logger.info("Slyders fetched: " + slydersText);

		waitUntilDisplay(account.AddressType(), 20);
		TrySelectDropdown(account.AddressType(), "Billing");
		logger.info("AddressType set to Billing");

		String shippingIiIconText = account.ShippingIiIcon().getText();
		logger.info("ShippingIiIcon fetched: " + shippingIiIconText);

		String adressClassText = account.AdressClass().getText();
		logger.info("Address Class fetched: " + adressClassText);

		String streetAdress1Val = account.StreetAdress1().getAttribute("value");
		logger.info("Street Address 1 fetched: " + streetAdress1Val);

		String streetAdress2Val = account.StreetAdress2().getAttribute("value");
		logger.info("Street Address 2 fetched: " + streetAdress2Val);

		waitUntilDisplay(account.SaveAccountDetails(),20);
		Thread.sleep(2000);
		TryClick(account.SaveAccountDetails());
		logger.info("click on SaveAccountDetails button");

		waitUntilDisplay(account.SaveAllDeatilsBtn(),20);
		Thread.sleep(2000);
		TryClick(account.SaveAllDeatilsBtn());
		logger.info("click on SaveAllDeatilsBtn button");
		
		
		
	}
	
	

	
}
