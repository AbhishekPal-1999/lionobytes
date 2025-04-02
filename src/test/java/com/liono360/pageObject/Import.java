package com.liono360.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.liono360.loginPage.Baseclass;

public class Import extends Baseclass{
	
	WebDriver ldriver;

	public Import(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//span[contains(text(),'Leads')]")
	WebElement btnLead;

	public WebElement clickLead() {
		return btnLead;
	}

	@FindBy(xpath = "//span[text()='New']")
	WebElement btnAddLead;

	public WebElement clickAddLead() {
		return btnAddLead;
	}

	@FindBy(xpath = "//p-dropdown[@placeholder='Choose One']")
	WebElement ledsDrp;

	public WebElement LedsDrp() {
		return ledsDrp;
	}

	@FindBy(xpath = "(//input[@placeholder='Search...'])[1]")
	WebElement txtGlobalSearch;

	public WebElement setLeadToSearch() {
		return txtGlobalSearch;
	}

	@FindBy(xpath = "//span[contains(text(),'Default Channel')]")
	WebElement drpChannel;

	public WebElement selectLeadChannel() {
		return drpChannel;
	}

	@FindBy(xpath = "(//p-dropdown[@placeholder='Select Title'])[1]")
	WebElement drpTitle;

	public WebElement selectTitle() {
		return drpTitle;
	}

	@FindBy(xpath = "//input[@formcontrolname='firstName']")
	WebElement txtFirstName;

	public WebElement setFirstName() {
		return txtFirstName;
	}

	@FindBy(xpath = "//*[@label='Save']")
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

	@FindBy(xpath = "//span[normalize-space()='Lead Information']")
	WebElement LeadInformation;

	public WebElement LeadInformation() {
		return LeadInformation;
	}
	
	
	@FindBy(xpath = "//span[@class='p-menuitem-text ng-star-inserted'][text()='View']")
	WebElement btnViewLead;

	public WebElement clickViewLead() {
		return btnViewLead;
	}

	
	@FindBy(xpath = "(//span[normalize-space()='Show More'])[1]")
	WebElement ShowMore;

	public WebElement ShowMore() {
		return ShowMore;
	}

	
	
	
	
	
	
	@FindBy(xpath = "(//h5[normalize-space()='View Lead'])[1]")
	WebElement txtViewLeadHeader;

	public WebElement ViewLeadHeader() {
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

	@FindBy(xpath = "//span[text()='Automation lob']")
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

	@FindBy(xpath = "//span[contains(text(),'Show More')]")
	WebElement btnShowMore;

	public WebElement clickShowMore() {
		return btnShowMore;
	}

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
	
	
	
	
	@FindBy(xpath = "(//span[@class='btnBars'])[1]")
	WebElement PlusTags;

	public WebElement PlusTags() {
		return PlusTags;
	}
	
	
	@FindBy(xpath = "(//i[@class='pi pi-plus'])[3]")
	WebElement AgainPlusTags;

	public WebElement AgainPlusTags() {
		return AgainPlusTags;
	}
	
	
	@FindBy(xpath = "(//input[@formcontrolname='name'])[1]")
	WebElement TagName;

	public WebElement TagName() {
		return TagName;
	}
	
	
	@FindBy(xpath = "(//span[@class='p-button-label'][normalize-space()='Save'])[2]")
	WebElement Save;

	public WebElement Save() {
		return Save;
	}
	@FindBy(xpath = "(//td[@class='p-col-6']//p-tag[1])[1]")
	WebElement SelectTag;

	public WebElement SelectTag() {
		return SelectTag;
	}
	
	@FindBy(xpath = "(//span[@class='p-button-label'][normalize-space()='Assign'])[1]")
	WebElement Assign;

	public WebElement Assign() {
		return Assign;
	}
	// @FindBy(xpath = "//div[@id='p-tabpanel-0']//p-checkbox[1]")
	// WebElement leadnarjulcustomcheckbox;

	// public WebElement Leadnarjulcustomcheckbox() {
	// return leadnarjulcustomcheckbox;
	// }

	// @FindBy(xpath = "(//p-dropdown[@datakey='name'])[1]")
	// WebElement leadFildDDL;

	// public WebElement LeadFildDDL() {
	// return leadFildDDL;
	// }

	// @FindBy(xpath = "(//p-multiselect[@datakey='name'])[1]")
	// WebElement leadFildMDDL;

	// public WebElement leadFildMDDL() {
	// return leadFildMDDL;
	// }

	// @FindBy(xpath = "(//div[@class='p-radiobutton-box'])[2]")
	// WebElement leadFildRatio;

	// public WebElement LeadFildRatio() {
	// return leadFildRatio;
	// }

	// @FindBy(xpath = "//p-calendar[@placeholder='dd/mm/yyyy']")
	// WebElement leaddatepicker;

	// public WebElement leadDatepicker() {
	// return leaddatepicker;
	// }

	// @FindBy(xpath = "(//input[@type='text'])[30]")
	// WebElement Leadinputinfo1;

	// public WebElement Leadinputinfo1() {
	// return Leadinputinfo1;
	// }

	// @FindBy(xpath =
	// "//body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-leads[1]/app-add-update-view-lead[1]/p-dialog[1]/div[1]/div[1]/div[2]/form[1]/p-tabview[1]/div[1]/div[2]/p-tabpanel[1]/div[1]/div[1]/app-shared-custom-fields-template[1]/div[1]/div[7]/input[1]")
	// WebElement Leadinputinfo2;

	// public WebElement Leadinputinfo2() {
	// return Leadinputinfo2;
	// }

	// @FindBy(xpath = "(//p-dropdown[@appendto='body'])[7]")
	// WebElement DDinfoR;

	// public WebElement DDinfoR() {
	// return DDinfoR;
	// }

	// @FindBy(xpath = "(//p-dropdown[@appendto='body'])[8]")
	// WebElement DDinfo;

	// public WebElement DDinfo() {
	// return DDinfo;
	// }

	// @FindBy(xpath = "(//p-multiselect[@appendto='body'])[3]")
	// WebElement MultiDD1;

	// public WebElement MultiDD1() {
	// return MultiDD1;
	// }

	@FindBy(xpath = "//span[text()='Lead Details']")
	WebElement clickonleadDetails;

	public WebElement clickonleadDetails() {
		return clickonleadDetails;
	}

	/// ...........Lead Details.................//

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

	@FindBy(xpath = "(//p-dropdown[@placeholder='Select Employee'])[1]")
	WebElement drpEmployee;

	public WebElement selectEmployee() {
		return drpEmployee;
	}

	@FindBy(xpath = "(//p-dropdown[@placeholder='Select Revenue'])[1]")
	WebElement drpRevenue;

	public WebElement selectRevenue() {
		return drpRevenue;
	}

	@FindBy(xpath = "(//p-dropdown[@placeholder='Select ownership'])[1]")
	WebElement drpOwenership;

	public WebElement selectOwenership() {
		return drpOwenership;
	}

	@FindBy(xpath = "(//p-dropdown[@placeholder='Select lead stage'])[1]")
	WebElement Stage1;

	public WebElement Stage1() {
		return Stage1;
	}

	@FindBy(xpath = "//input[@formcontrolname='foundedYear']")
	WebElement txtFoundedYear;

	public WebElement setFoundedYear() {
		return txtFoundedYear;
	}

	@FindBy(xpath = "(//p-dropdown[@placeholder='Select Industry'])[1]")
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

	@FindBy(xpath = "(//p-dropdown[@placeholder='Select Lead Source'])[1]")
	WebElement drpAccountSource;

	public WebElement selectLeadSource() {
		return drpAccountSource;
	}

	@FindBy(xpath = "(//p-dropdown[@placeholder='Select Rating'])[1]")
	WebElement drpRating;

	public WebElement selectRating() {
		return drpRating;
	}

	@FindBy(xpath = "(//p-dropdown[@placeholder='Select Status'])[1]")
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

	public WebElement clickAddAddress() {
		return btnAddAddress;
	}

	// .................Address Details.................//

	@FindBy(xpath = "//span[@style='position: relative; float: right;']")
	WebElement IconAdressbtn;

	public WebElement IconAdressbtn() {
		return IconAdressbtn;
	}

	@FindBy(xpath = "(//p-dropdown[@placeholder='Select Address Type'])[1]")
	WebElement drpAddressType;

	public WebElement selectAddressType() {
		return drpAddressType;
	}

	@FindBy(xpath = "(//p-dropdown[@placeholder='Select Address Class'])[1]")
	WebElement AdressClass;

	public WebElement AdressClass() {
		return AdressClass;
	}

	@FindBy(xpath = "//input[@placeholder='Enter a location']")
	WebElement txtLocation;

	public WebElement setLocation() {
		return txtLocation;
	}

	
	@FindBy(xpath = "(//span[@class='p-inputswitch-slider'])[1]")
	WebElement Slyder;

	public WebElement Slyder() {
		return Slyder;
	}
	
	
	
	
	@FindBy(xpath = "(//span[text()='Save'])[1]")
	WebElement btnSaveAddress;

	public WebElement clickSaveAddress() {
		return btnSaveAddress;
	}

	@FindBy(xpath = "//button[@type='submit']")
	WebElement AllbtnSaveAddress;

	public WebElement AllbtnSaveAddress() {
		return AllbtnSaveAddress;
	}

	@FindBy(xpath = "//span[contains(text(),'Inactive Lead')]")
	WebElement btnInactiveLead;

	public WebElement clickInactiveLead() {
		return btnInactiveLead;

	}

	@FindBy(xpath = "//textarea[@id='comment']")
	WebElement txtComment;

	public WebElement setComment() {
		return txtComment;
	}

	@FindBy(xpath = "//div[@class='p-ripple p-element p-button p-togglebutton p-component p-highlight']")
	WebElement inActiveLeadList;

	public WebElement inActiveLeadList() {
		return inActiveLeadList;
	}

	@FindBy(xpath = "//div[@class='p-ripple p-element p-button p-togglebutton p-component']")
	WebElement activeLeadList;

	public WebElement activeLeadList() {
		return inActiveLeadList;
	}

	@FindBy(xpath = "//span[text()='Select Address Class']")
	WebElement drpAddressClass;

	public WebElement selectAddressClass() {
		return drpAddressClass;
	}

	@FindBy(xpath = "//span[text()='Closed']")
	WebElement btnStatusClosed;

	public WebElement clickStatusToClosed() {
		return btnStatusClosed;
	}

	@FindBy(xpath = "//div[@class='btnBars']")
	WebElement btnHamburgerOption;

	public WebElement clickHamburgerOption() {
		return btnHamburgerOption;
	}

	@FindBy(xpath = "//span[text()='Convert']")
	WebElement btnConvert;

	public WebElement clickConvert() {
		return btnConvert;
	}

	@FindBy(xpath = "//input[@formcontrolname='businessName']")
	WebElement txtAccountName;

	public WebElement accountName() {
		return txtAccountName;
	}

	// ........extra.........//

	@FindBy(xpath = "//span[text()='Assign to']")
	WebElement ClickAssignLead;

	public WebElement ClickAssignLead() {
		return ClickAssignLead;
	}

	@FindBy(xpath = "(//p-dropdown[@placeholder='Select Title'])[1]")
	WebElement Titlemr;

	public WebElement Titlemr() {
		return Titlemr;
	}

	@FindBy(xpath = "(//input[@type='text'])[55]")
	WebElement InputDetails1;

	public WebElement InputDetails1() {
		return InputDetails1;
	}

	@FindBy(xpath = "(//div[@class='p-checkbox-box'])[8]")
	WebElement Check2;

	public WebElement Check2() {
		return Check2;
	}

	@FindBy(xpath = "(//p-fileupload[@chooselabel='Choose'])[3]")
	WebElement File2;

	public WebElement File2() {
		return File2;
	}

	@FindBy(xpath = "(//span[@class='p-ripple p-element p-button p-component p-fileupload-choose'])[4]")
	WebElement Pic2;

	public WebElement Pic2() {
		return Pic2;
	}

	@FindBy(xpath = "//span[text()='Inactive Lead']")
	WebElement BtnInactiveLead;

	public WebElement BtnInactiveLead() {
		return BtnInactiveLead;
	}

	@FindBy(xpath = "//p-multiselect[@id='inActivatingReason']")
	WebElement SelectOneReason;

	public WebElement SelectOneReason() {
		return SelectOneReason;
	}

	@FindBy(xpath = "//p-multiselect[@id='activatingReason']")
	WebElement ActiveLead;

	public WebElement ActiveLead() {
		return ActiveLead;
	}

	@FindBy(xpath = "//textarea[@placeholder='Enter Comment']")
	WebElement CommentsInactive;

	public WebElement CommentsInactive() {
		return CommentsInactive;
	}

	@FindBy(xpath = "//span[text()='Save']")
	WebElement SaveInactive;

	public WebElement SaveInactive() {
		return SaveInactive;
	}

	@FindBy(xpath = "//span[text()='Active']")
	WebElement ClickOnActive;

	public WebElement ClickOnActive() {
		return ClickOnActive;
	}

	@FindBy(xpath = "(//td[@class='ng-star-inserted'])[1]")
	WebElement RightclickActivebtn;

	public WebElement RightclickActivebtn() {
		return RightclickActivebtn;
	}

	@FindBy(xpath = "//span[text()='Active Lead']")
	WebElement ActiveLeadClick;

	public WebElement ActiveLeadClick() {
		return ActiveLeadClick;
	}

	@FindBy(xpath = "//textarea[@name='comment']")
	WebElement CoomentActive;

	public WebElement CoomentActive() {
		return CoomentActive;
	}

	@FindBy(xpath = "//span[text()='Save']")
	WebElement SaveA;

	public WebElement SaveA() {
		return SaveA;
	}

	@FindBy(xpath = "//span[text()='InActive']")
	WebElement InactiveLeadbbttnn;

	public WebElement InactiveLeadbbttnn() {
		return InactiveLeadbbttnn;
	}

	@FindBy(xpath = "(//span[text()='Contacts'])[2]")
	WebElement ContactLead;

	public WebElement ContactLead() {
		return ContactLead;
	}

	@FindBy(xpath = "//i[@class='pi pi-plus']")
	WebElement IconBarLead;

	public WebElement IconBarLead() {
		return IconBarLead;
	}

//....................... create Lead Secondary Account...................//

	@FindBy(xpath = "//input[@id='firstName']")
	WebElement Firstname;

	public WebElement Firstname() {
		return Firstname;
	}

	@FindBy(xpath = "//input[@id='lastName']")
	WebElement Lastname;

	public WebElement Lastname() {
		return Lastname;
	}

	@FindBy(xpath = "(//input[@id='email0'])[1]")
	WebElement Email;

	public WebElement Email() {
		return Email;
	}

	@FindBy(xpath = "(//input[@id='phone0'])[1]")
	WebElement Phone;

	public WebElement Phone() {
		return Phone;
	}

	@FindBy(xpath = "//span[text()='Save']")
	WebElement SaveSecondary;

	public WebElement SaveSecondary() {
		return SaveSecondary;
	}

	/// .............Assign.............///

	@FindBy(xpath = "//span[text()='Assign']")
	WebElement AssignClick;

	public WebElement AssignClick() {
		return AssignClick;
	}

	@FindBy(xpath = "//span[text()='Select a primary user']")
	WebElement PrimaryAssign;

	public WebElement PrimaryAssign() {
		return PrimaryAssign;
	}

	@FindBy(xpath = "//div[text()='Select secondary users']")
	WebElement secondaryAssign;

	public WebElement SecondaryAssign() {
		return secondaryAssign;
	}

	@FindBy(xpath = "//span[text()='Save']")
	WebElement AssignSave;

	public WebElement AssignSave() {
		return AssignSave;
	}

	@FindBy(xpath = "//div[@class='primary-checkbox unchecked']")
	WebElement COnSecondaryAccount;

	public WebElement COnSecondaryAccount() {
		return COnSecondaryAccount;
	}

	//////// ............OverView..................////

	@FindBy(xpath = "(//span[contains(text(),'New')])[3]")
	WebElement NewOverview;

	public WebElement NewOverview() {
		return NewOverview;
	}

	@FindBy(xpath = "//span[@class='p-button-icon pi pi-ellipsis-v']")
	WebElement NewOverviewIcon;

	public WebElement NewOverviewIcon() {
		return NewOverviewIcon;
	}

	@FindBy(xpath = "(//span[text()='Edit'])[2]")
	WebElement NewOverviewEdit;

	public WebElement NewOverviewEdit() {
		return NewOverviewEdit;
	}

	@FindBy(xpath = "//textarea[@id='comment']")
	WebElement CommentsNewOverview;

	public WebElement CommentsNewOverview() {
		return CommentsNewOverview;
	}

	@FindBy(xpath = "//span[text()='Save']")
	WebElement SaveCommentsNewOverview;

	public WebElement SaveCommentsNewOverview() {
		return SaveCommentsNewOverview;
	}

	@FindBy(xpath = "(//div[@class='step ng-star-inserted'])[2]")
	WebElement Workingvpnotcontacted;

	public WebElement WorkingvpnotContacted() {
		return Workingvpnotcontacted;
	}

	@FindBy(xpath = "//textarea[@name='comment']")
	WebElement CommentsWorkingvpnotcontacted;

	public WebElement CommentsWorkingvpnotcontacted() {
		return CommentsWorkingvpnotcontacted;
	}

	@FindBy(xpath = "//span[text()='Save']")
	WebElement SaveCommentsWorkingvpnotcontacted;

	public WebElement SaveCommentsWorkingvpnotcontacted() {
		return SaveCommentsWorkingvpnotcontacted;
	}

	@FindBy(xpath = "(//div[@class='step ng-star-inserted'])[3]")
	WebElement WorkingContacted;

	public WebElement WorkingContacted() {
		return WorkingContacted;
	}

	@FindBy(xpath = "//textarea[@placeholder='Enter Comment']")
	WebElement commentsWorkingContacted;

	public WebElement CommentsWorkingContacted() {
		return commentsWorkingContacted;
	}

	@FindBy(xpath = "//span[text()='Save']")
	WebElement SaveWorkingContacted;

	public WebElement SaveWorkingContacted() {
		return SaveWorkingContacted;
	}

	@FindBy(xpath = "(//span[contains(text(),'Closed')])[2]")
	WebElement Closed;

	public WebElement Closed() {
		return Closed;
	}

	@FindBy(xpath = "//p-dropdown[@id='closedStages']")
	WebElement ClosedStage;

	public WebElement ClosedStage() {
		return ClosedStage;
	}

	@FindBy(xpath = "//p-multiselect[@id='closeWonQualifiedReasons']")
	WebElement QualiefiedReason;

	public WebElement QualiefiedReason() {
		return QualiefiedReason;
	}

	@FindBy(xpath = "//textarea[@placeholder='Enter Comment']")
	WebElement commentsClosed;

	public WebElement CommentsClosed() {
		return commentsClosed;
	}

	@FindBy(xpath = "//span[text()='Save']")
	WebElement SavecommentsClosed;

	public WebElement SavecommentsClosed() {
		return SavecommentsClosed;
	}

	@FindBy(xpath = "(//i[@class='pi pi-bars'])[2]")
	WebElement ConvertIcon;

	public WebElement ConvertIcon() {
		return ConvertIcon;
	}

	@FindBy(xpath = "(//span[@class='p-menuitem-text ng-star-inserted'][normalize-space()='Convert'])[2]")
	WebElement ConverleadToaccount;

	public WebElement ConverleadToaccount() {
		return ConverleadToaccount;
	}

	@FindBy(xpath = "//span[text()='Save']")
	WebElement SaveConverleadToaccount;

	public WebElement SaveConverleadToaccount() {
		return SaveConverleadToaccount;
	}
	@FindBy(xpath="//a[@id='user-display']//img[@alt='main logo']")
	WebElement ProfileClick;

	public WebElement ProfileClick() {
		return ProfileClick;
	}

	
	@FindBy(xpath = "//span[text()='Action']")
	WebElement btnAction;

	public WebElement ActionButton() {
		return btnAction;	
	}
	@FindBy(xpath = "//span[text()='Import']")
	WebElement clickImport;

	public WebElement clickImport() {
		return clickImport;
	}
	
	
	@FindBy(xpath="//span[text()='Profile']")
	WebElement Cprofile;

	public WebElement Cprofile() {
		return Cprofile;
	}
	@FindBy(xpath="//span[text()='Import']")
	WebElement Cimport;

	public WebElement Cimport() {
		return Cimport;
	}
	@FindBy(xpath="(//span[@ptooltip='Retry'])[1]//parent::span")
	WebElement Replay;

	public WebElement Replay() {
		return Replay;
	}
	@FindBy(xpath="//tbody/tr[1]/td[8]")
	WebElement ClickImportedFile;

	public WebElement ClickImportedFile() {
		return ClickImportedFile;
	}
	
	@FindBy(xpath="(//span[@class='btnBars p-mr-0 ng-star-inserted'])[1]")
	WebElement PlusImportClick;

	public WebElement PlusImportClick() {
		return PlusImportClick;
	}
	
	@FindBy(xpath="//p-dropdown[@placeholder='Select Module']")
	WebElement ModuleName;

	public WebElement ModuleName() {
		return ModuleName;
	}
	
	
	@FindBy(xpath="//p-dropdown[@placeholder='Select Channel']")
	WebElement ChannelName;

	public WebElement ChannelName() {
		return ChannelName;
	}
	
	
	
	@FindBy(xpath="//label[normalize-space()='Download Format File']")
	WebElement DownloadFile;

	public WebElement DownloadFormaytFile() {
		return DownloadFile;
	}
	
	
	

	@FindBy(xpath="//span[normalize-space()='Proceed']")
	WebElement Proceed;

	public WebElement Proceed() {
		return Proceed;
	}
	
	
	@FindBy(xpath="//p-dropdown[@placeholder='Select Currency ...']")
	WebElement Currency;

	public WebElement Currency() {
		return Currency;
	}
	
	@FindBy(xpath="//p-dropdown[@placeholder='Select Country ...']")
	WebElement Country;

	public WebElement Country() {
		return Country;
	}
	@FindBy(xpath="//span[normalize-space()='Download']")
	WebElement Download;

	public WebElement Download() {
		return Download;
	}
	
	@FindBy(xpath="//span[normalize-space()='Yes']")
	WebElement YesClickbtn;

	public WebElement YesClickbtn() {
		return YesClickbtn;
	}
	@FindBy(xpath = "//span[text()='Choose']")
	WebElement ChooseFile;

	public WebElement ChooseFile() {
		return ChooseFile;
	}
	
	
	@FindBy(xpath = "//span[text()='Next']")
	WebElement Next;

	public WebElement Next() {
		return Next;
	}
	
	
	@FindBy(xpath = "//span[normalize-space()='Select label type ...']")
	WebElement LabelSelect;

	public WebElement LabelSelect() {
		return LabelSelect;
	}
	
	
	
	
	
	@FindBy(xpath = "//span[text()='Upload']")
	WebElement Upload;

	public WebElement Upload() {
		return Upload;
	}
	@FindBy(xpath = "//span[@class='pi pi-refresh']")
	WebElement LoadConfig;

	public WebElement LoadConfig() {
		return LoadConfig;
	}
	@FindBy(xpath = "//span[text()='Back']")
	WebElement Back;

	public WebElement Back() {
		return Back;
	}
	@FindBy(xpath = "//span[text()='A_CustomInput']//parent::*//div[2]")
	WebElement clickCheckbox;

	public WebElement CClickCheckbox() {
		return clickCheckbox;
	}
	@FindBy(xpath = "//span[text()='Load']")
	WebElement Load;

	public WebElement Load() {
		return Load;
	}
	@FindBy(xpath = "(//div[@class='p-radiobutton-box'])[1]")
	WebElement ClickBBox;

	public WebElement Updatec() {
		return ClickBBox;
	}
	@FindBy(xpath = "(//div[@class='p-radiobutton-box'])[2]")
	WebElement AddUpdate;

	public WebElement AddUpdate() {
		return AddUpdate;
	}
	
	//..................Export.............................//
	
	@FindBy(xpath = "//span[text()='List']")
	WebElement ClickList;

	public WebElement ClickList() {
		return ClickList;
	}
	
	@FindBy(xpath = "//span[text()='Export']")
	WebElement ClickExport;

	public WebElement ClickExport() {
		return ClickExport;
	}
	
	

	@FindBy(xpath = "//span[text()='A_CustomInput']//parent::*//div[2]")
	WebElement AddCustomInput;

	public WebElement AddCustomInput() {
		return AddCustomInput;
	}
	
	
	
	
	
	
	@FindBy(xpath = "(//span[text()='Export'])[2]")
	WebElement ClickExport1;

	public WebElement ClickExport1() {
		return ClickExport1;
	}
	
	@FindBy(xpath = "//span[text()='Yes']")
	WebElement ExportYes;

	public WebElement ExportYes() {
		return ExportYes;
	}
	
	@FindBy(xpath = "//a[@id='user-display']//img[@alt='main logo']")
	WebElement AdminClick;

	public WebElement AdminClick() {
		return AdminClick;
	}
	
	@FindBy(xpath = "//span[normalize-space()='Profile']")
	WebElement Profilec;

	public WebElement Profilec() {
		return Profilec;
	}
	@FindBy(xpath = "//span[normalize-space()='My Documents']")
	WebElement ClickMydocuments;

	public WebElement ClickMydocuments() {
		return ClickMydocuments;
	}
	@FindBy(xpath = "//span[normalize-space()='Downloads']")
	WebElement ClickDownloads;

	public WebElement ClickDownloads() {
		return ClickDownloads;
	}
	
	@FindBy(xpath = "//td[normalize-space()='Lead']")
	WebElement ClickLeadFile;

	public WebElement ClickLeadFile() {
		return ClickLeadFile;
	}
	
	@FindBy(xpath = "(//i[@class='pi pi-download'])[1]")
	WebElement DownloadLeadFile;

	public WebElement DownloadLeadFile() {
		return DownloadLeadFile;
	}
	
	
	
	@FindBy(xpath = "//span[normalize-space()='Import']")
	WebElement Importclick1;

	public WebElement Importclick1() {
		return Importclick1;
	}
	
	
	@FindBy(xpath = "(//span[@class='btnBars p-mr-0 ng-star-inserted'])[1]")
	WebElement plusimportbtn;

	public WebElement plusimportbtn() {
		return plusimportbtn;
	}
	
	@FindBy(xpath = "(//span[text()='Contacts'])[2]")
	WebElement ContactsClick;

	public WebElement ContactsClick() {
		return ContactsClick;
	}
	//.............Documents tab.................................//
	@FindBy(xpath="//span[text()='Documents']")
	WebElement Documentsc;

	public WebElement Documentsc() {
		return Documentsc;
	}

	@FindBy(xpath="(//span[@class='pi pi-plus p-button-icon ng-star-inserted'])[1]")
	WebElement AddDocuments;

	public WebElement AddDocuments() {
		return AddDocuments;
	}
	@FindBy(xpath="//span[text()='Save']")
	WebElement SaveDocClick;

	public WebElement SaveDocClick() {
		return SaveDocClick;
	}
	@FindBy(xpath="(//i[@class='pi pi-trash'])[1]")
	WebElement DeleteFile;

	public WebElement DeleteFile() {
		return DeleteFile;
	}
	@FindBy(xpath="(//i[@class='pi pi-pencil'])[1]")
	WebElement EditDocuments;

	public WebElement EditDocuments() {
		return EditDocuments;
	}

	@FindBy(xpath="(//i[@class='pi pi-trash'])[1]")
	WebElement DeleteDocuments;

	public WebElement DeleteDocuments() {
		return DeleteDocuments;
	}

	@FindBy(xpath="(//i[@class='pi pi-download'])[1]")
	WebElement DownloadsDocuments;

	public WebElement DownloadsDocuments() {
		return DownloadsDocuments;
	}
	@FindBy(xpath="//label[text()='Document Name']//following-sibling::input")
	WebElement DocumentsName;

	public WebElement DocumentsName() {
		return DocumentsName;
	}

	@FindBy(xpath="(//tr[@class='ng-star-inserted'])[3]")
	WebElement Open1st;

	public WebElement Open1st() {
		return Open1st;
	}
	@FindBy(xpath="(//div[@class='btnBars'])[2]")
	WebElement CloseTab;

	public WebElement CloseTab() {
		return CloseTab;
	}

	@FindBy(xpath = "//span[text()='Yes']")
	WebElement Yes1;

	public WebElement Yes1() {
		return Yes1;
	}
	@FindBy(xpath = "//span[normalize-space()='Overview']")
	WebElement Overview;

	public WebElement Overview() {
		return Overview;
	}
	
	@FindBy(xpath = "//div[@class='btnBars']//i[@class='pi pi-bars']")
	WebElement Humbergicon;

	public WebElement Humbergicon() {
		return Humbergicon;
	}
	@FindBy(xpath = "(//span[normalize-space()='Move Lead'])[1]")
	WebElement MoveToLead;

	public WebElement MoveToLead() {
		return MoveToLead;
	}
	@FindBy(xpath = "//span[text()='Accounts']")
	WebElement CbtnAccount;

	public WebElement clickAccounts() {
		return CbtnAccount;	
	
	}
	@FindBy(xpath = "(//td[@class='ng-star-inserted'])[1]")
	WebElement Accountnameclick;

	public WebElement AccountNameClick() {
		return Accountnameclick;	
}
	
	@FindBy(xpath = "//p-dropdown[@id='channel']")
	WebElement SelectChannel;

	public WebElement SelectChannel() {
		return SelectChannel;	
}
	
	@FindBy(xpath = "//p-dropdown[@id='stages']")
	WebElement SelectStage;

	public WebElement SelectStage() {
		return SelectStage;	
}
	
	@FindBy(xpath = "(//tbody)[2]")
	WebElement VerifyDocuments;

	public WebElement VerifyDocuments() {
		return VerifyDocuments;	
}
	@FindBy(xpath = "//span[normalize-space()='Make Copy']")
	WebElement MakeCopy;

	public WebElement MakeCopy() {
		return MakeCopy;	
}
	@FindBy(xpath = "//span[normalize-space()='Tasks']")
	WebElement Task;

	public WebElement Task() {
		return Task;	
}
	
	@FindBy(xpath = "(//div[@class='btnBarsKanban ng-star-inserted'])[1]")
	WebElement Taskplus;

	public WebElement Taskplus() {
		return Task;	
}
	@FindBy(xpath = "//textarea[@name='taskName']")
	WebElement TaskDetails;

	public WebElement TaskDetails() {
		return TaskDetails;	
}
	@FindBy(xpath = "//p-multiselect[@placeholder='Select Users']")
	WebElement AssignedTo;

	public WebElement AssignedTo() {
		return AssignedTo;	
}
	
	@FindBy(xpath = "//span[text()='Document Received']")
	WebElement TaskCategory;

	public WebElement TaskCategory() {
		return TaskCategory;	
}
	
	@FindBy(xpath = "//p-dropdown[@placeholder='Selected Reminder Type']")
	WebElement ReminderType;

	public WebElement ReminderType() {
		return ReminderType;	
}
	@FindBy(xpath = "//p-dropdown[@placeholder='Selected Reminder']")
	WebElement Reminder;

	public WebElement Reminder() {
		return ReminderType;	
}
	@FindBy(xpath = "//p-dropdown[@placeholder='Selected Repeat']")
	WebElement Repeat;

	public WebElement Repeat() {
		return Repeat;	
}
	
	@FindBy(xpath = "//p-dropdown[@placeholder='Selected Priority']")
	WebElement Prirority;

	public WebElement Prirority() {
		return Prirority;	
}
	@FindBy(xpath = "//span[normalize-space()='Settings']")
	WebElement Setting;

	public WebElement Setting() {
		return Setting;	
}
	@FindBy(xpath = "//span[text()='Lead Settings']")
	WebElement Scrolledleadsetting;

	public WebElement Scrolledleadsetting() {
		return Scrolledleadsetting;	
}
	
	@FindBy(xpath = "//h6[normalize-space()='Lead Information']")
	WebElement LeadInfo;

	public WebElement LeadInfo() {
		return LeadInfo;	
}
	
	
	@FindBy(xpath = "//h6[normalize-space()='Lead Details']")
	WebElement LeadDetails;

	public WebElement LeadDetails() {
		return LeadDetails;	
}
	
	
	
	@FindBy(xpath = "//h6[normalize-space()='Address Details']")
	WebElement AddressDetails;

	public WebElement AddressDetails() {
		return AddressDetails;	
}
	
	
	
	@FindBy(xpath = "//span[text()='State']//parent::*//div[2]")
	WebElement State;

	public WebElement State() {
		return State;	
}

	@FindBy(xpath = "//span[text()='Address']//parent::*//div[2]")
	WebElement Addresscolumn;

	public WebElement Addresscolumn() {
		return Addresscolumn;	
}
	@FindBy(xpath = "//span[text()='Stage']//parent::*//div[2]")
	WebElement Stage;

	public WebElement Stage() {
		return Stage;	
}
	
	@FindBy(xpath = "//span[text()='Ownership Type']//parent::*//div[2]")
	WebElement OwnershipType;

	public WebElement OwnershipType() {
		return OwnershipType;	
}
	
	@FindBy(xpath = "//span[text()='Lead Type(s)']//parent::*//div[2]")
	WebElement LeadTypes;

	public WebElement LeadTypes() {
		return LeadTypes;	
}
	
	@FindBy(xpath = "//span[text()='Contact Name']//parent::*//div[2]")
	WebElement ContactName;

	public WebElement ContactName() {
		return ContactName;	
}
	
	//......details view Block..............//
	
	
	
	
	
	@FindBy(xpath = "//a[normalize-space()='Details View Block']")
	WebElement DViewBlock;

	public WebElement DViewBlock() {
		return DViewBlock;	
}

	@FindBy(xpath = "//span[text()='Notes']//parent::*//div[2]")
	WebElement Notes;

	public WebElement Notes() {
		return Notes;	
}
	@FindBy(xpath = "//span[text()='Business Card']//parent::*//div[2]")
	WebElement BusniessCard;

	public WebElement BusniessCard() {
		return BusniessCard;	
}
	
	@FindBy(xpath = "//span[text()='SIC Code']//parent::*//div[2]")
	WebElement SicCode;

	public WebElement SicCode() {
		return SicCode;	
}
	
	@FindBy(xpath = "//span[text()='Founded Year']//parent::*//div[2]")
	WebElement FoundedYear;

	public WebElement FoundedYear() {
		return FoundedYear;	
}
	@FindBy(xpath = "//span[text()='Lead Number']//parent::*//div[2]")
	WebElement LeadNumber;

	public WebElement LeadNumber() {
		return LeadNumber;	
}
//...................... Lead custom section .............................................................//	
	@FindBy(xpath = "//span[text()='Configurations']")
	WebElement configurationbtnclick;

	public WebElement ConfigurationBtnClick() {
		return configurationbtnclick;	
	}
	@FindBy(xpath = "//span[text()='CRM']")
	WebElement Clickoncrm;

	public WebElement ClickOnCrm() {
		return Clickoncrm;		
	}	
	@FindBy(xpath = "(//span[text()='Leads'])[2]")
	WebElement ClickOnCrmLead;

	public WebElement ClickOnCrmLead() {
		return ClickOnCrmLead;		
	
	}
	
	@FindBy(xpath = "//span[text()='Template']")
	WebElement clickontemplate;

	public WebElement ClickOnTemplate() {
		return clickontemplate;	
	}	
	@FindBy(xpath = "(//span[text()='Template'])[2]")
	WebElement Template;

	public WebElement Template() {
		return Template;
	}

	@FindBy(xpath = "(//i[@class='pi pi-pencil'])[1]")
	WebElement EditTemplate;

	public WebElement EditTemplate() {
		return EditTemplate;
	}

	@FindBy(xpath = "(//div[@class='p-checkbox-box'])[last()]")
	WebElement SelectCheckbox;

	public WebElement SelectCheckbox() {
		return SelectCheckbox;
	}

	@FindBy(xpath = "(//div[@class='p-checkbox-box'])[last()]")
	WebElement SelectCheckbox2;

	public WebElement SelectCheckbox2() {
		return SelectCheckbox2;
	}

	@FindBy(xpath = "(//span[normalize-space()='Other 1'])[1]")
	WebElement Section;

	public WebElement Section() {
		return Section;
	}

	@FindBy(xpath = "(//label[contains(normalize-space(),'Custom Text')])[1]")
	WebElement VerifyText;

	public WebElement VerifyText() {
		return VerifyText;
	}


	@FindBy(xpath = "(//label[contains(normalize-space(),'Custom Text')])[1]//following-sibling::input")
	WebElement CustomText;

	public WebElement CustomText() {
		return CustomText;
	}



	@FindBy(xpath="//a[@role='menuitem']//span[@class='p-menuitem-text ng-star-inserted'][text()='View']")
	WebElement btnViewAccount;

	public WebElement clickViewAccount()
	{
		return btnViewAccount;
	}
	
	

	@FindBy(xpath = "//span[contains(text(),'Leads')]")
	WebElement LeadClick;

	public WebElement LeadClick() {
		return LeadClick;
	}
	@FindBy(xpath = "//span[contains(text(),'Default Channel')]")
	WebElement LeadsoptionDrp;

	public WebElement LeadsoptionDrp() {
		return LeadsoptionDrp;	
	
	}

	@FindBy(xpath = "(//a[@role='menuitem'])[1]")
	WebElement Action;

	public WebElement Action() {
		return Action;	

	}
	@FindBy(xpath = "(//span[normalize-space()='New'])[1]")
	WebElement NewAbtn;

	public WebElement NewAbtn() {
	return NewAbtn;	
	}
	
	@FindBy(xpath = "(//span[normalize-space()='Save'])[1]")
	WebElement SaveCustom;

	public WebElement SaveCustom() {
		return SaveCustom;
	}
	
	@FindBy(xpath = "(//span[normalize-space()='Save'])[1]")
	WebElement SaveLead;

	public WebElement SaveLead() {
		return SaveLead;
	}

	@FindBy(xpath = "//span[text()='Save']")
	WebElement EditsaveClick;

	public WebElement EditSaveClick() {
		return EditsaveClick;	
}
	@FindBy(xpath = "(//span[normalize-space()='Edit'])[1]")
	WebElement EditButton;

	public WebElement EditButton() {
		return EditButton;
	}

	
	@FindBy(xpath = "(//i[@class='pi pi-times'])[1]")
	WebElement CrossSign;

	public WebElement CrossSign() {
		return CrossSign;
	}
	
	
}
