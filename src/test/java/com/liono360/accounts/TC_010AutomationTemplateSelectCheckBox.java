package com.liono360.accounts;

import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.AccountsPage;
import com.liono360.pageObject.LoginPage;

public class TC_010AutomationTemplateSelectCheckBox extends Baseclass {
	
	@Test
	public void EditdefaultchanneltemplateTest() throws InterruptedException {
		
		driver.get(baseURL);
		logger.info("URL is opened");
		LoginPage lp = new LoginPage(driver);

		lp.setUserName(username);
		logger.info("Username added");
		lp.setPassword(password);
		logger.info("password added");
		Thread.sleep(2000);
		lp.clickSubmit();
		logger.info("Clicked on submit button");
		
		AccountsPage account = new AccountsPage(driver);
		
		//explWaitToClick(account.ConfigurationBtnClick());
		Thread.sleep(10000);
		account.ConfigurationBtnClick().click();
		logger.info("Clicked on configuration button");
		
		//explWaitToClick(account.ClickOnCrm());
		Thread.sleep(5000);
		account.ClickOnCrm().click();
		logger.info("Clicked on ClickOnCrm button");
		
		
		explWaitToClick(account.ClickOnCrmAccount());
		account.ClickOnCrmAccount().click();
		logger.info("Clicked on ClickOnCrmAccount button");
		
		explWaitToClick(account.ClickOnTemplate());
		account.ClickOnTemplate().click();
		logger.info("Clicked on ClickOnTemplate button");
		
		//Thread.sleep(4000);
		explWaitToClick(account.clickonEditTemplate());
		account.clickonEditTemplate().click();
		logger.info("Clicked on clickonEditTemplate button");
		
		explWaitToClick(account.SelectTitle1check1());
		account.SelectTitle1check1().click();
		logger.info("Clicked on SelectTitle1check1 button");
		
		explWaitToClick(account.SelectTitle1check2());
		account.SelectTitle1check2().click();
		logger.info("Clicked on SelectTitle1check2 button");
		
		
		explWaitToClick(account.SelectFirstname2());
		account.SelectFirstname2().click();
		logger.info("Clicked on SelectFirstname2 button");
		
		
		explWaitToClick(account.Selectmiddleinitial1());
		account.Selectmiddleinitial1().click();
		logger.info("Clicked on Selectmiddleinitial1 button");
		
		
		explWaitToClick(account.Selectmiddleinitial2());
		account.Selectmiddleinitial2().click();
		logger.info("Clicked on Selectmiddleinitial2 button");
		
		explWaitToClick(account.selectlastname1());
		account.selectlastname1().click();
		logger.info("Clicked on selectlastname1 button");
		
		explWaitToClick(account.selectlastname2());
		account.selectlastname2().click();
		logger.info("Clicked on selectlastname2 button");
		
		
		explWaitToClick(account.selectprofileimage1());
		account.selectprofileimage1().click();
		logger.info("Clicked on selectprofileimage1 button");
		
		explWaitToClick(account.selectprofileimage2());
		account.selectprofileimage2().click();
		logger.info("Clicked on selectprofileimage2 button");
		
		explWaitToClick(account.selectjobFun1());
		account.selectjobFun1().click();
		logger.info("Clicked on selectjobFun1 button");
		
		explWaitToClick(account.selectjobFun2());
		account.selectjobFun2().click();
		logger.info("Clicked on selectjobFun2 button");
		
		
		explWaitToClick(account.selectcontactname1());
		account.selectcontactname1().click();
		logger.info("Clicked on selectcontactname1 button");
		
		explWaitToClick(account.selectcontactname2());
		account.selectcontactname2().click();
		logger.info("Clicked on selectcontactname2 button");
		
		//...............Select Account Information.................//
		
		explWaitToClick(account.selectparentaccountname1());
		account.selectparentaccountname1().click();
		logger.info("Clicked on selectparentaccountname1 button");
		
		explWaitToClick(account.selectparentaccountname2());
		account.selectparentaccountname2().click();
		logger.info("Clicked on selectparentaccountname2 button");
		
		
		jsScroll(driver, account.selectparentaccountname2());
		
		
		
		
		
		explWaitToClick(account.selectaccountowner2());
		account.selectaccountowner2().click();
		logger.info("Clicked on selectaccountowner2 button");
		
		
		explWaitToClick(account.selectaccounttype1());
		account.selectaccounttype1().click();
		logger.info("Clicked on selectaccounttype1 button");
		
		
		explWaitToClick(account.selectaccounttype2());
		account.selectaccounttype2().click();
		logger.info("Clicked on selectaccounttype2 button");
		
		explWaitToClick(account.Selecttimezone1());
		account.Selecttimezone1().click();
		logger.info("Clicked on Selecttimezone1 button");
		
		
		explWaitToClick(account.Selecttimezone2());
		account.Selecttimezone2().click();
		logger.info("Clicked on Selecttimezone2 button");
		
		
		explWaitToClick(account.selectCurrency1());
		account.selectCurrency1().click();
		logger.info("Clicked on selectCurrency1 button");
		
		explWaitToClick(account.selectCurrency2());
		account.selectCurrency2().click();
		logger.info("Clicked on selectCurrency2 button");
		
		
	//..........   select Account Details	...............//
		
		explWaitToClick(account.selectdoingbusiness1());
		account.selectdoingbusiness1().click();
		logger.info("Clicked on selectdoingbusiness1 button");
		
		explWaitToClick(account.selectdoingbusiness2());
		account.selectdoingbusiness2().click();
		logger.info("Clicked on selectdoingbusiness2 button");
		
		
		explWaitToClick(account.selectTaxid1());
		account.selectTaxid1().click();
		logger.info("Clicked on selectTaxid1 button");
		
		
		explWaitToClick(account.selectTaxid2());
		account.selectTaxid2().click();
		logger.info("Clicked on selectTaxid2 button");
		
		
		explWaitToClick(account.selectnoofemp1());
		account.selectnoofemp1().click();
		logger.info("Clicked on selectnoofemp1 button");
		
		
		explWaitToClick(account.selectnoofemp2());
		account.selectnoofemp2().click();
		logger.info("Clicked on selectnoofemp2 button");
		
		
		explWaitToClick(account.selectestimatedannualR1());
		account.selectestimatedannualR1().click();
		logger.info("Clicked on selectestimatedannualR1 button");
		
		explWaitToClick(account.selectestimatedannualR2());
		account.selectestimatedannualR2().click();
		logger.info("Clicked on selectestimatedannualR2 button");
		
		explWaitToClick(account.selectownershiptype1());
		account.selectownershiptype1().click();
		logger.info("Clicked on selectownershiptype1 button");
		
		explWaitToClick(account.selectownershiptype2());
		account.selectownershiptype2().click();
		logger.info("Clicked on selectownershiptype2 button");
		
		
		explWaitToClick(account.selectbussiClassification1());
		account.selectbussiClassification1().click();
		logger.info("Clicked on selectbussiClassification1 button");
		
		explWaitToClick(account.selectbussiClassification2());
		account.selectbussiClassification2().click();
		logger.info("Clicked on selectbussiClassification2 button");
		
		explWaitToClick(account.selectFoundedyear1());
		account.selectFoundedyear1().click();
		logger.info("Clicked on selectFoundedyear1 button");
		
		
		explWaitToClick(account.selectFoundedyear2());
		account.selectFoundedyear2().click();
		logger.info("Clicked on selectFoundedyear2 button");
		
		explWaitToClick(account.selectindustrys1());
		account.selectindustrys1().click();
		logger.info("Clicked on selectindustrys1 button");
		
		
		explWaitToClick(account.selectindustrys2());
		account.selectindustrys2().click();
		logger.info("Clicked on selectindustrys2 button");
		
		
		explWaitToClick(account.selectSiccode1());
		account.selectSiccode1().click();
		logger.info("Clicked on selectSiccode1 button");
		
		
		explWaitToClick(account.selectSiccode2());
		account.selectSiccode2().click();
		logger.info("Clicked on selectSiccode2 button");
		
		explWaitToClick(account.selectNaics1());
		account.selectNaics1().click();
		logger.info("Clicked on selectNaics1 button");
		
		explWaitToClick(account.selectNaics2());
		account.selectNaics2().click();
		logger.info("Clicked on selectNaics2 button");
		
		
		explWaitToClick(account.selectnotes1());
		account.selectnotes1().click();
		logger.info("Clicked on selectnotes1 button");
		
		explWaitToClick(account.selectnotes2());
		account.selectnotes2().click();
		logger.info("Clicked on selectnotes2 button");
	
		
		//.............Select Address Details..................//
		
		explWaitToClick(account.selectStreetadress1());
		account.selectStreetadress1().click();
		logger.info("Clicked on selectStreetadress1 button");
		
		explWaitToClick(account.selectStreetadress2());
		account.selectStreetadress2().click();
		logger.info("Clicked on selectStreetadress2 button");
		
		explWaitToClick(account.selectStreetadress21());
		account.selectStreetadress21().click();
		logger.info("Clicked on selectStreetadress21 button");
		
		
		explWaitToClick(account.selectStreetadress22());
		account.selectStreetadress22().click();
		logger.info("Clicked on selectStreetadress22 button");
		
		
		explWaitToClick(account.selectcountry1());
		account.selectcountry1().click();
		logger.info("Clicked on selectcountry1 button");
		
		explWaitToClick(account.selectcountry2());
		account.selectcountry2().click();
		logger.info("Clicked on selectcountry2 button");
		
		
		explWaitToClick(account.selectstate1());
		account.selectstate1().click();
		logger.info("Clicked on selectstate1 button");
		
		
		explWaitToClick(account.selectstate2());
		account.selectstate2().click();
		logger.info("Clicked on selectstate2 button");
		
		
		explWaitToClick(account.selectcity1());
		account.selectcity1().click();
		logger.info("Clicked on selectcity1 button");
		
		
		explWaitToClick(account.selectcity2());
		account.selectcity2().click();
		logger.info("Clicked on selectcity2 button");
		
		explWaitToClick(account.selectzipcode1());
		account.selectzipcode1().click();
		logger.info("Clicked on selectzipcode1 button");
		
		
		explWaitToClick(account.selectzipcode2());
		account.selectzipcode2().click();
		logger.info("Clicked on selectzipcode2 button");
		
		
		explWaitToClick(account.selectAttn1());
		account.selectAttn1().click();
		logger.info("Clicked on selectAttn1 button");
		
		explWaitToClick(account.selectAttn2());
		account.selectAttn2().click();
		logger.info("Clicked on selectAttn2 button");
		
		explWaitToClick(account.selectAdress1());
		account.selectAdress1().click();
		logger.info("Clicked on selectAdress1 button");
		
		
		explWaitToClick(account.selectAdress2());
		account.selectAdress2().click();
		logger.info("Clicked on selectAdress2 button");
		
		explWaitToClick(account.SelectSave());
		account.SelectSave().click();
		logger.info("Clicked on SelectSave button");
				
		
	}
}