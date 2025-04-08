package com.liono360.leads;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.LeadPage;
import com.liono360.utility.ExcelDataProvider;

public class TC_003EditLead extends Baseclass {
	
	@Test
	public void TC003_EditLead() throws InterruptedException, IOException {
		//redirectToCRM();

		LeadPage leads = new LeadPage(driver);
		ExcelDataProvider exceldata=new ExcelDataProvider();
		
		TryClick(leads.clickLead());
		logger.info("Clicked on Lead ");

		waitUntilPageLoad();
		mouseActionRightClick(driver, leads.listedLeads());
		Thread.sleep(1000);
		TryClick(leads.clickeditLead());
		logger.info("Clicked on ClickOnEdit button");

		SelectDropdown(leads.selectTitle(),1);
		logger.info("Title selected");

		explWaitToClick(leads.setFirstName());
		leads.setFirstName().clear();
		leads.setFirstName().sendKeys(exceldata.FirstName());
		logger.info("First Name Added");
		String Firstname= leads.setFirstName().getAttribute("value");

		explWaitToClick(leads.setMiddlename());
		leads.setMiddlename().clear();
		leads.setMiddlename().sendKeys(exceldata.MiddleName());
		logger.info("Middle Name Added");

		explWaitToClick(leads.setLastname());
		leads.setLastname().sendKeys(exceldata.LastName());
		logger.info("Last Name Added");
		String LastName= leads.setLastname().getAttribute("value");
		Actions action = new Actions(driver);


		explWaitToClick(leads.setEmailAddress());
		leads.setEmailAddress().clear();
		leads.setEmailAddress().sendKeys(Firstname+ randomnumber() + "@lionobytes.com");
		logger.info("Email for contact is added");


		explWaitToClick(leads.setPhoneNumber());
		leads.setPhoneNumber().clear();
		leads.setPhoneNumber().sendKeys(randomnumber()+"3478" + randomnumber());
		logger.info("Email for phone is added");
		
		leads.setLeadName().clear();
		leads.setLeadName().sendKeys(exceldata.OrganizationName());
		logger.info("Lead name added");
		String EditedLeadName= leads.setLeadName().getAttribute("value");


		TrySelectMultiDropdown(leads.selectJobFunction (),1,2);
		logger.info("selectJobFunction is added");
		
		

		TrySelectMultiDropdown(leads.selectLeadType(),1,3);
	
		logger.info("Lead types added");
		explWaitToClick(leads.setLeadNumber());
		leads.setLeadNumber().clear();
		leads.setLeadNumber().sendKeys(randomnumber()+"327" + randomnumber());
		logger.info("Lead number is added");

// Lead Details============================================================================

		TryClick(leads.clickonleadDetails());
		logger.info("click on lead details ");
		leads.setDBAName().clear();
		leads.setDBAName().sendKeys("DBA" + randomnumber());
		logger.info("DBA name added");
		
		leads.setTaxId().clear();
		leads.setTaxId().sendKeys("tax"+randomnumber());
		logger.info("Tax id added");

		SelectDropdown(leads.selectEmployee(),1);
		logger.info("Number of employee added");

		SelectDropdown(leads.selectRevenue(),1);
		logger.info("Revenue selected");


		SelectDropdown(leads.selectOwenership(),3);

		logger.info("Ownership added");
		SelectDropdown(leads.Stage1(),2);	
     	logger.info("Stage selected");
		
		leads.setFoundedYear().clear();
		leads.setFoundedYear().sendKeys("1"+randomnumber());
		logger.info("Founded year added");

		SelectDropdown(leads.selectIndustry(),2);
		logger.info("selectIndustry is added");

		leads.setSICCode().clear();
		leads.setSICCode().sendKeys(randomnumber());
		logger.info("SIC code added");

		leads.setNAICSCode().clear();
		leads.setNAICSCode().sendKeys(randomnumber());
		logger.info("NAICS code added");
//		SelectDropdown(leads.selectLeadSource(),2);
//		logger.info("selectLeadSource is added");
//
//		SelectDropdown(leads.selectRating(),2);
//		logger.info("selectRating is added");
//
//		SelectDropdown(leads.Status(),2);
//		logger.info("Status is added");
		leads.Notess().clear();
		leads.Notess().sendKeys("Lead Details");
		logger.info("Notes added");

//Address details=============================================================================		
		
//		TryClick(leads.clickAddAddress());
//		logger.info("Clicked on add address");
//		waitUntilPageLoad();
//		TryClick(leads.editAddress());
//		logger.info("Clicked on add address");
//        waitUntilPageLoad();
//		TryClick(leads.AddressActiveToggle());
//		logger.info("Address active/inactive toggle clicked");
//		
//		SelectDropdown(leads.AdressClass(),2);
//		logger.info("AdressClass is added");
//		
//		leads.setLocation().clear();
//		leads.setLocation().sendKeys(exceldata.StreetAddress());
//		Thread.sleep(4000);
//		action.sendKeys(Keys.ARROW_DOWN).build().perform();
//		action.sendKeys(Keys.ENTER).build().perform();
//
//		waitUntilPageLoad();
//		leads.StreetAdress2().clear();
//		leads.StreetAdress2().sendKeys("c-block");
//		logger.info("sendkeys on StreetAdress2");
//
//		TryClick(leads.clickSaveAddress());
//		logger.info("Address Added");

		TryClick(leads.AllbtnSaveAddress());
		logger.info("Clicked on save button to add lead");


// ASSERTION=======================================================================================
		
		waitUntilPageLoad();
		leads.Search().clear();
		leads.Search().sendKeys(EditedLeadName);
		logger.info("Lead name passed to search");
		waitUntilPageLoad();
		//Thread.sleep(6000);
		String LeadNameAfterEdit=leads.listedLeads().getText();
		System.out.println("Provided Lead name to edit: "+EditedLeadName);
		System.out.println("Listed Lead name after edit: "+LeadNameAfterEdit);
		if (EditedLeadName.equalsIgnoreCase(LeadNameAfterEdit)) {
			Assert.assertTrue(true);
			logger.info("Edit Lead test passed");
		} 

		else {
			Assert.assertTrue(false);
			logger.info("Edit Lead test failed");
		}
	 
	}

}
