package com.liono360.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadToTerritory {

	
WebDriver ldriver;
	
	public LeadToTerritory (WebDriver driver) {
		
		ldriver = driver;
		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath="//span[contains(text(),'Leads')]")
	WebElement btnLead;

	public WebElement clickLead() {
		return btnLead;
	}
	@FindBy(xpath="//span[text()='New']")
	WebElement btnAddLead;

	public WebElement clickAddLead() {
		return btnAddLead;
	}
		
	@FindBy(xpath="//p-dropdown[@placeholder='Choose One']")
	WebElement ledsDrp;

	public WebElement LedsDrp() {
		return ledsDrp;
	}
	
	@FindBy(xpath = "//input[@placeholder='Global Search']")
	WebElement txtGlobalSearch;

	public WebElement setLeadToSearch() {
		return txtGlobalSearch;
	}

	@FindBy(xpath = "//span[contains(text(),'Default Channel')]")
	WebElement drpChannel;

	public WebElement selectLeadChannel() {
		return drpChannel;
	}
	
	@FindBy(xpath="//p-dropdown[@placeholder='Select Title']")
	WebElement drpTitle;
	
	public WebElement selectTitle() {
		return drpTitle;
	}
	
	@FindBy(xpath="//input[@formcontrolname='firstName']")
	WebElement txtFirstName;
	
	public WebElement setFirstName() {
		return txtFirstName;
	}
	
	@FindBy(xpath="//*[@label='Save']")
	WebElement btnSaveLead;

	public WebElement clickSave() {
		return btnSaveLead;
	}
	
	@FindBy(xpath = "(//td[@class='ng-star-inserted'])[1]")
	WebElement listLead;

	public WebElement addedLead() {
		return listLead;
	}
	
	@FindBy(xpath = "//div[contains(text(),'scriptLead')]")
	String listedLead;

	public String ListedLead() {
		return listedLead;
	}
	
	@FindBy(xpath = "//span[contains(text(),'Edit')]")
	WebElement btneditLead;

	public WebElement clickeditLead() {
		return btneditLead;
	}
	
	@FindBy(xpath="//span[@class='p-menuitem-text ng-star-inserted'][text()='View']")
	WebElement btnViewLead;
	
	public WebElement clickViewLead()
	{
		return btnViewLead;
	}
	
	@FindBy(xpath="//h5[contains(text(),'View Lead')]")
	WebElement txtViewLeadHeader;
	
	public WebElement ViewLeadHeader()
	{
		return txtViewLeadHeader;
	}
	
	@FindBy(xpath = "//input[@formcontrolname='middleName']")
	WebElement txtMiddleName;

	public WebElement setMiddlename() {
		return txtMiddleName;
	}

	@FindBy(xpath = "//input[@formcontrolname='lastName']")
	WebElement txtLastName;

	public WebElement setLastname() {
		return txtLastName;
	}

	@FindBy(xpath = "(//input[@type='email'])[1]")
	WebElement txtEmailAddress;

	public WebElement setEmailAddress() {
		return txtEmailAddress;
	}
	
	@FindBy(xpath = "(//input[@type='text'])[10]")
	WebElement txtPhoneNumber;

	public WebElement setPhoneNumber() {
		return txtPhoneNumber;
	}
	
	@FindBy(xpath = "//div[text()='Select Job Function']")
	WebElement drpJobFunction;

	public WebElement selectJobFunction() {
		return drpJobFunction;
	}
	
	@FindBy(xpath = "//input[@formcontrolname='businessName']")
	WebElement txtLeadName;

	public WebElement setLeadName() {
		return txtLeadName;
	}
	
	
	@FindBy(xpath = "//span[text()='Mark Zuckerberg']")
	WebElement LeadOwnerdrp;

	public WebElement LeadOwnerDrp() {
		return LeadOwnerdrp;
	}
	
	@FindBy(xpath = "//div[text()='Lead types']")
	WebElement drpAccountType;

	public WebElement selectLeadType() {
		return drpAccountType;
	}

	@FindBy(xpath = "//input[@formcontrolname='leadNumber']")
	WebElement txtLeadNumber;

	public WebElement setLeadNumber() {
		return txtLeadNumber;
	}

	//@FindBy(xpath = "//span[contains(text(),'Show More')]")
	//WebElement btnShowMore;

	//public WebElement clickShowMore() {
	//	return btnShowMore;
//	}

	@FindBy(xpath = "//span[text()='Select Time Zone']")
	WebElement drpTimeZone;

	public WebElement selectTimeZone() {
		return drpTimeZone;
	}

	@FindBy(xpath = "//p-dropdown[@id='currency']")
	WebElement drpCurrency;

	public WebElement selectCurrency() {
		return drpCurrency;
	}
	
	
	
	//@FindBy(xpath = "//div[@id='p-tabpanel-0']//p-checkbox[1]")
	//WebElement leadnarjulcustomcheckbox;

	//public WebElement Leadnarjulcustomcheckbox() {
	//	return leadnarjulcustomcheckbox;
	//}
	
	
	//@FindBy(xpath = "(//p-dropdown[@datakey='name'])[1]")
	//WebElement leadFildDDL;

	//public WebElement LeadFildDDL() {
	//	return leadFildDDL;
	//}
	
	//@FindBy(xpath = "(//p-multiselect[@datakey='name'])[1]")
	//WebElement leadFildMDDL;

	//public WebElement leadFildMDDL() {
	//	return leadFildMDDL;
	//}
	
	//@FindBy(xpath = "(//div[@class='p-radiobutton-box'])[2]")
	//WebElement leadFildRatio;

	//public WebElement LeadFildRatio() {
	//	return leadFildRatio;
	//}
	
	
	//@FindBy(xpath = "//p-calendar[@placeholder='dd/mm/yyyy']")
	//WebElement leaddatepicker;

	//public WebElement leadDatepicker() {
	//	return leaddatepicker;
	//}
	
	
	
	//@FindBy(xpath = "(//input[@type='text'])[30]")
	//WebElement Leadinputinfo1;

	//public WebElement Leadinputinfo1() {
	//	return Leadinputinfo1;
	//}
	
	
	//@FindBy(xpath = "//body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-leads[1]/app-add-update-view-lead[1]/p-dialog[1]/div[1]/div[1]/div[2]/form[1]/p-tabview[1]/div[1]/div[2]/p-tabpanel[1]/div[1]/div[1]/app-shared-custom-fields-template[1]/div[1]/div[7]/input[1]")
	//WebElement Leadinputinfo2;

	//public WebElement Leadinputinfo2() {
	//	return Leadinputinfo2;
	//}
	
	
	//@FindBy(xpath = "(//p-dropdown[@appendto='body'])[7]")
	//WebElement DDinfoR;

	//public WebElement DDinfoR() {
	//	return DDinfoR;
	//}
	
	
	//@FindBy(xpath = "(//p-dropdown[@appendto='body'])[8]")
	//WebElement DDinfo;

  //	public WebElement DDinfo() {
	//	return DDinfo;
	//}
	
	//@FindBy(xpath = "(//p-multiselect[@appendto='body'])[3]")
    //	WebElement MultiDD1;

    //	public WebElement MultiDD1() {
	//	return MultiDD1;
	//}
	

	@FindBy(xpath = "//span[text()='Lead Details']")
	WebElement clickonleadDetails;

	public WebElement clickonleadDetails() {
		return clickonleadDetails;
	}
	
	
	///...........Lead Details.................//
	
	
	
	@FindBy(xpath = "//input[@formcontrolname='doingBusinessAs']")
	WebElement txtDBAName;

	public WebElement setDBAName() {
		return txtDBAName;
	}

	@FindBy(xpath = "//input[@formcontrolname='taxId']")
	WebElement txtTaxId;

	public WebElement setTaxId() {
		return txtTaxId;
	}

	@FindBy(xpath = "//span[text()='Select Employee']")
	WebElement drpEmployee;

	public WebElement selectEmployee() {
		return drpEmployee;
	}

	@FindBy(xpath = "//span[text()='Select Revenue']")
	WebElement drpRevenue;

	public WebElement selectRevenue() {
		return drpRevenue;
	}

	@FindBy(xpath = "//span[text()='Select ownership']")
	WebElement drpOwenership;

	public WebElement selectOwenership() {
		return drpOwenership;
	}
	
	@FindBy(xpath = "(//span[text()='New'])[2]")
	WebElement Stage1;

	public WebElement Stage1() {
		return Stage1;
	}
	
	
	@FindBy(xpath= "//input[@formcontrolname='foundedYear']")
	WebElement txtFoundedYear;

	public WebElement setFoundedYear() {
		return  txtFoundedYear;
	}
	
	@FindBy(xpath = "//span[text()='Accounting and Tax Preparation']")
	WebElement drpIndustry;

	public WebElement selectIndustry() {
		return drpIndustry;
	}

	

	@FindBy(xpath = "(//input[@type='email'])[5]")
	WebElement txtAccountEmail;

	public WebElement setAccountEmail() {
		return txtAccountEmail;
	}

	
	
	
	
	
	@FindBy(xpath = "//input[@formcontrolname='sicCode']")
	WebElement txtSICCode;

	public WebElement setSICCode() {
		return txtSICCode;
	}
	
	@FindBy(xpath = "//input[@formcontrolname='naicsCode']")
	WebElement txtNAICSCode;

	public WebElement setNAICSCode() {
		return txtNAICSCode;
	}

	@FindBy(xpath = "//span[text()='Select Lead Source']")
	WebElement drpAccountSource;

	public WebElement selectLeadSource() {
		return drpAccountSource;
	}

	@FindBy(xpath = "//span[text()='Select Rating']")
	WebElement drpRating;

	public WebElement selectRating() {
		return drpRating;
	}
	
	@FindBy(xpath = "//span[text()='Select Status']")
	WebElement Satus;

	public WebElement Status() {
		return Satus;
	}
	@FindBy(xpath = "//textarea[@rows='2']")
	WebElement Notess;

	public WebElement Notess() {
		return Notess;
	}
	

	@FindBy(xpath = "//span[text()='Address Details']")
	WebElement btnAddAddress;

	public WebElement clickAddAddress() 
	{
		return btnAddAddress;
	}

	
	
	//.................Address Details.................//
	
	@FindBy(xpath = "//span[@style='position: relative; float: right;']")
	WebElement IconAdressbtn;

	public WebElement IconAdressbtn() 
	{
		return IconAdressbtn;
	}
	
	
	
	@FindBy(xpath = "//span[text()='Billing']")
	WebElement drpAddressType;

	public WebElement selectAddressType() 
	{
		return drpAddressType;
	}
	
	
	@FindBy(xpath = "//span[text()='Commercial']")
	WebElement AdressClass;

	public WebElement AdressClass() 
	{
		return AdressClass;
	}
	
	

	@FindBy(xpath = "//input[@placeholder='Enter a location']")
	WebElement txtLocation;

	public WebElement setLocation() {
		return txtLocation;
	}
	
	
	@FindBy(xpath = "(//span[text()='Save'])[1]")
	WebElement btnSaveAddress;

	public WebElement clickSaveAddress() 
	{
		return btnSaveAddress;
	}
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement AllbtnSaveAddress;

	public WebElement AllbtnSaveAddress() 
	{
		return AllbtnSaveAddress;
	}
	

}
