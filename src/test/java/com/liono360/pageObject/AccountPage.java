package com.liono360.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.liono360.loginPage.Baseclass;

public class AccountPage extends Baseclass {

	WebDriver ldriver;

	public AccountPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//span[contains(text(),'Accounts')]")
	WebElement btnAccount;

	public WebElement clickAccounts() {
		return btnAccount;
	}
	@FindBy(xpath = "//span[contains(text(),'Default Channel')]")
	WebElement accountoptionDrp;

	public WebElement AccountoptionDrp() {
		return accountoptionDrp;	
	
	}
	@FindBy(xpath = "(//tr[@class='p-element p-selectable-row ng-star-inserted'])[1]")
	WebElement btnAccountList;

	public WebElement clickAccountListing() {
		return btnAccountList;
	}

	@FindBy(xpath = "//p-menubarsub[@class='p-element']/child::ul/child::li[1]")
	WebElement btnAddAccount;

	public WebElement clickAddNewAccount() {
		return btnAddAccount;
	}

	@FindBy(xpath = "(//input[@placeholder='Search...'])[1]")
	WebElement txtGlobalSearch;

	public WebElement setAccountToSearch() {
		return txtGlobalSearch;
	}

	@FindBy(xpath = "//span[contains(text(),'Default Channel')]")
	WebElement drpChannel;

	public WebElement selectAccountChannel() {
		return drpChannel;
	}

	@FindBy(xpath = "//span[@class='p-button-label']")
	WebElement btnInActiveAccountList;

	public WebElement showInactiveAccountsList() {
		return btnInActiveAccountList;
	}

	@FindBy(xpath = "//input[@name='firstName']")
	WebElement txtFirstName;

	public WebElement setFirstname() {
		return txtFirstName;
	}

	@FindBy(xpath = "//input[@formcontrolname='middleName']")
	WebElement txtMiddleName;

	public WebElement setMiddlename() {
		return txtMiddleName;
	}

	@FindBy(xpath = "//input[@id='lastName']")
	WebElement txtLastName;

	public WebElement setLastname() {
		return txtLastName;
	}

	@FindBy(xpath = "//input[@formcontrolname='emailAddress']")
	WebElement txtEmailAddress;

	public WebElement setEmailAddress() {
		return txtEmailAddress;
	}

	//@FindBy(xpath = "//div[contains(text(),'Job Function')]")
	@FindBy(xpath="//p-multiselect[@placeholder='Select Job Function']")
	WebElement drpJobFunction;

	public WebElement selectJobFunction() {
		return drpJobFunction;
	}

	// Account information

	@FindBy(xpath = "//input[@formcontrolname='businessName']")
	WebElement txtAccountName;

	public WebElement setAccountName() {
		return txtAccountName;
	}

	@FindBy(xpath = "//input[@id='parent']")
	WebElement drpParentAccount;

	public WebElement selectParentAccount() {
		return drpParentAccount;
	}

	@FindBy(xpath = "//button[@type='submit']")
	WebElement btnSave;

	public WebElement clickSaveAccount() {
		return btnSave;
	}

	@FindBy(xpath = "//tbody//tr[1]//td[2]")
	WebElement listAccount;

	public WebElement addedAccount() {
		return listAccount;
	}

	@FindBy(xpath = "//h5[.='Edit Account']")
	WebElement editAccount;

	public WebElement editedAccount() {
		return editAccount;
	}

	@FindBy(xpath = "//span[contains(text(),'Delete')]")
	WebElement btnDeleteAccount;

	public WebElement deleteAccount() {
		return btnDeleteAccount;
	}

	@FindBy(xpath = "//span[@class='p-button-icon p-button-icon-left pi pi-check']")
	WebElement btnAcceptDelete;

	public WebElement acceptDelete() {
		return btnAcceptDelete;
	}

	@FindBy(xpath = "//span[contains(text(),'Edit')]")
	WebElement btnEditAccount;

	public WebElement editAccount() {
		return btnEditAccount;
	}

	@FindBy(xpath = "//span[@id='pr_id_34_label']")
	WebElement drpTitle;

	public WebElement selectTitle() {
		return drpTitle;
	}

	@FindBy(xpath = "//div[contains (text(),'Select Account Type(s)')]")
	WebElement drpAccountType;

	public WebElement selectAccountType() {
		return drpAccountType;
	}

	@FindBy(xpath = "//input[@formcontrolname='accountNumber']")
	WebElement txtAccountCode;

	public WebElement setAccountCode() {
		return txtAccountCode;
	}

	@FindBy(xpath = "//span[contains(text(),'Show More')]")
	WebElement btnShowMore;

	public WebElement clickShowMore() {
		return btnShowMore;
	}

	@FindBy(xpath = "//span[contains(text(),'Select Time Zone')]")
	WebElement drpTimeZone;

	public WebElement selectTimeZone() {
		return drpTimeZone;
	}

	@FindBy(xpath = "//p-dropdown[@placeholder='Select currency']")

	WebElement drpCurrency;

	public WebElement selectCurrency() {
		return drpCurrency;
	}

	// -------------Account Details------------------

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

	//@FindBy(xpath = "//span[contains(text(),'Select Employee')]")
	@FindBy(xpath="//p-dropdown[@placeholder='Select Employee']")
	WebElement drpEmployee;

	public WebElement selectEmployee() {
		return drpEmployee;
	}

	@FindBy(xpath = "//span[contains(text(),'Select Revenue')]")
	WebElement drpRevenue;

	public WebElement selectRevenue() {
		return drpRevenue;
	}

	@FindBy(xpath = "//span[contains(text(),'Select ownership')]")
	WebElement drpOwenership;

	public WebElement selectOwenership() {
		return drpOwenership;
	}

	@FindBy(xpath = "(//input[@formcontrolname='number'])[last()]")
	WebElement txtAccountPhoneNumber;

	public WebElement setPhoneNumber() {
		return txtAccountPhoneNumber;
	}

	@FindBy(xpath = "//span[contains(text(),'Prospect')]")
	WebElement drpBusinessClassification;

	public WebElement selectBusinessClassification() {
		return drpBusinessClassification;
	}

	@FindBy(xpath = "//input[@formcontrolname='foundedYear']")
	WebElement txtFoundedYear;

	public WebElement setFoundedYear() {
		return txtFoundedYear;
	}

	@FindBy(xpath = "//span[contains(text(),'Industry')]")
	WebElement drpIndustry;

	public WebElement selectIndustry() {
		return drpIndustry;
	}

	@FindBy(xpath = "//input[@name='email-0']")
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

	@FindBy(xpath = "//span[contains(text(),'Account Source')]")
	WebElement drpAccountSource;

	public WebElement selectAccountSource() {
		return drpAccountSource;
	}

	@FindBy(xpath = "//span[contains(text(),'Rating')]")
	WebElement drpRating;

	public WebElement selectRating() {
		return drpRating;
	}
	
	@FindBy(xpath="(//input[@formcontrolname='value'])[4]")
	WebElement activationNumber;
	
	public WebElement setActivationNumber() {
		return activationNumber;
	}

	@FindBy(xpath = "//span[@class='btnBars p-mr-0 ng-star-inserted']")
	WebElement btnAddAddress;

	public WebElement clickAddAddress() 
	{
		return btnAddAddress;
	}

	@FindBy(xpath = "//span[contains(text(),'Select Address Type')]")
	WebElement drpAddressType;

	public WebElement selectAddressType() 
	{
		return drpAddressType;
	}
	
	@FindBy(xpath="//span[text()='Select Address Class']")
	WebElement drpAddressClass;
	
	public WebElement selectAddressClass() {
		return drpAddressClass;
	}

	@FindBy(xpath = "//input[@placeholder='Enter a location']")
	WebElement txtLocation;

	public WebElement setLocation() 
	{
		return txtLocation;
	}
	@FindBy(xpath = "//span[contains(text(),'Save')]")
	WebElement btnSaveAddress;

	public WebElement clickSave() 
	{
		return btnSaveAddress;
	}
	
	@FindBy(xpath="//span[@aria-hidden='true']")
	WebElement btnExpandParent;
	
	public WebElement clickExpandParent() 
	{
		return btnExpandParent;
	}
	
	@FindBy(xpath="//span[contains(text(),'Inactive Account')]")
	WebElement btnInactiveAccount;
	
	public WebElement clickInactiveAccount()
	{
		return btnInactiveAccount;
		
	}
	
	
	@FindBy(xpath="(//p-multiselect[@id='inActivatingReason'])[1]")
	WebElement InactiveReason;
	
	public WebElement InactiveReason()
	{
		return InactiveReason;
		
	}
	
	
	
	
	
	@FindBy(xpath="//textarea[@id='comment']")
	WebElement txtComment;
	
	public WebElement setComment()
	{
		return txtComment;
	}
	@FindBy(xpath="//div[@class='btnBars']//i[@class='pi pi-bars']")
	WebElement btnAccountOption;
	
	public WebElement clickAccountOption()
	{
		return btnAccountOption;
	}
	
	@FindBy(xpath="//a[@role='menuitem']//span[@class='p-menuitem-text ng-star-inserted'][text()='View']")
	WebElement btnViewAccount;
	
	public WebElement clickViewAccount()
	{
		return btnViewAccount;
	}
	
	@FindBy(xpath="//h5[contains(text(),'View Account')]")
	WebElement txtViewAccountHeader;
	
	public WebElement ViewAccount()
	{
		return txtViewAccountHeader;
	}
	
	@FindBy(xpath="//h5[text()=' Account 360 View ']")
	WebElement header;

	public WebElement ViewHeader() {
		return header;
		}
	
	
	
	@FindBy(xpath = "//span[text()='Cancel']")
	WebElement btnCancel;

	public WebElement clickCancel() {
		return btnCancel;
	}
	
	
}
