package com.liono360.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Panchanan Lead page elements
 */

public class LeadPage {

	WebDriver ldriver;

	public LeadPage(WebDriver rdriver) {
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

	@FindBy(xpath = "//input[@placeholder='Global Search']")
	WebElement txtGlobalSearch;

	public WebElement setLeadToSearch() {
		return txtGlobalSearch;
	}
	@FindBy(xpath = "//span[text()='Cancel']")
	WebElement ViewCancel;

	public WebElement ViewCancel() {
		return ViewCancel;
	}

	@FindBy(xpath = "//span[contains(text(),'Default Channel')]")
	WebElement drpChannel;

	public WebElement selectLeadChannel() {
		return drpChannel;
	}

	@FindBy(xpath = "//p-dropdown[@placeholder='Select Title']")
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

	@FindBy(xpath = "//span[normalize-space()='Edit']")
	WebElement btneditLead;

	public WebElement clickeditLead() {
		return btneditLead;
	}

	@FindBy(xpath = "//span[@class='p-menuitem-text ng-star-inserted'][text()='View']")
	WebElement btnViewLead;

	public WebElement clickViewLead() {
		return btnViewLead;
	}

	@FindBy(xpath = "//h5[contains(text(),'View Lead')]")
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

	@FindBy(xpath = "//p-multiselect[@formcontrolname=\"contactRoles\"]")
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

	@FindBy(xpath = "//p-multiselect[@formcontrolname=\"selectedLeadTypes\"]")
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

	@FindBy(xpath = "//p-dropdown[@placeholder=\"Select Employee\"]")
	WebElement drpEmployee;

	public WebElement selectEmployee() {
		return drpEmployee;
	}

	@FindBy(xpath = "//p-dropdown[@placeholder='Select Revenue']")
	WebElement drpRevenue;

	public WebElement selectRevenue() {
		return drpRevenue;
	}

	@FindBy(xpath = "//p-dropdown[@placeholder='Select ownership']")
	WebElement drpOwenership;

	public WebElement selectOwenership() {
		return drpOwenership;
	}

	@FindBy(xpath = "//p-dropdown[@placeholder='Select lead stage']")
	WebElement Stage1;

	public WebElement Stage1() {
		return Stage1;
	}

	@FindBy(xpath = "//input[@formcontrolname='foundedYear']")
	WebElement txtFoundedYear;

	public WebElement setFoundedYear() {
		return txtFoundedYear;
	}

	@FindBy(xpath = "//p-dropdown[@placeholder='Select Industry']")
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

	@FindBy(xpath = "//p-dropdown[@placeholder='Select Lead Source']")
	WebElement drpAccountSource;

	public WebElement selectLeadSource() {
		return drpAccountSource;
	}

	@FindBy(xpath = "//p-dropdown[@placeholder='Select Rating']")
	WebElement drpRating;

	public WebElement selectRating() {
		return drpRating;
	}

	@FindBy(xpath = "//p-dropdown[@placeholder='Select Status']")
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

	@FindBy(xpath = "//p-dropdown[@placeholder='Select Address Type']")
	WebElement drpAddressType;

	public WebElement selectAddressType() {
		return drpAddressType;
	}

	@FindBy(xpath = "//p-dropdown[@placeholder='Select Address Class']")
	WebElement AdressClass;

	public WebElement AdressClass() {
		return AdressClass;
	}

	@FindBy(xpath = "//input[@placeholder='Enter a location']")
	WebElement txtLocation;

	public WebElement setLocation() {
		return txtLocation;
	}

	@FindBy(xpath = "(//span[text()='Save'])[1]")
	WebElement btnSaveAddress;

	public WebElement clickSaveAddress() {
		return btnSaveAddress;
	}

	@FindBy(xpath = "//span[normalize-space()='Save']")
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

	@FindBy(xpath = "//span[text()='Select Title']")
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

	@FindBy(xpath = "(//input[@pattern='[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}$'])[2]")
	WebElement Email;

	public WebElement Email() {
		return Email;
	}

	@FindBy(xpath = "//input[@id='phone0']")
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

	@FindBy(xpath = "(//div[@class='step ng-star-inserted'])[4]")
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

	@FindBy(xpath = "//span[text()='Accounts']")
	WebElement AccountC;

	public WebElement AccountC() {
		return AccountC;
	}

	@FindBy(xpath = "//tbody//tr[1]//td[2]")
	WebElement LeadAssertion;

	public WebElement LeadAssertion() {
		return LeadAssertion;
	}
	
	@FindBy(xpath = "//span[text()='Action']")
	WebElement btnAction;

	public WebElement ActionButton() {
		return btnAction;	
	}
	
	@FindBy(xpath = "//span[text()='New']")
    WebElement NewLead;

	public WebElement NewLead() {
	return NewLead;	
	}
	
	@FindBy(xpath="//input[@placeholder=\"Search...\"]")
	WebElement btnSearch;

	public WebElement Search() {
		return btnSearch;
		}
	
	@FindBy(xpath="//tbody//tr[1]//td[1]")
	WebElement listedLeads;

	public WebElement listedLeads() {
		return listedLeads;
		}
	@FindBy(xpath = "(//span[@class='btnBars'])[1]")
    WebElement TagPlusbtn;

	public WebElement TagPlusbtn() {
	return TagPlusbtn;
	}
	
	
	
	@FindBy(xpath = "//div[@class='tagHeader']//div//i[@class='pi pi-plus']")
    WebElement Addtag;

	public WebElement Addtag() {
	return Addtag;
	}
	
	
	@FindBy(xpath = "//input[@formcontrolname='name']")
    WebElement AddtagName;

	public WebElement AddtagName() {
	return AddtagName;
	}
	

	@FindBy(xpath = "//p-colorpicker[@formcontrolname='color']")
    WebElement AddColour;

	public WebElement AddColourClick() {
	return AddColour;
	}
	
	
	
	
	
	@FindBy(xpath = "//div[@class=\"p-colorpicker-color-selector ng-tns-c154-80\"]")
    WebElement ChooseColor;

	public WebElement ChooseColor() {
	return ChooseColor;
	}
	
	@FindBy(xpath = "(//td[@class='p-col-6']//p-tag[1])[1]")
	WebElement SelectTag;

	public WebElement SelectTag() {
		return SelectTag;
	}
	
	@FindBy(xpath = "(//div[@class=\"p-colorpicker-color-handle ng-tns-c154-82\"])[1]")
	WebElement SelectColour;

	public WebElement SelectColour() {
		return SelectColour;
	}
	
	@FindBy(xpath = "(//span[@ class=\"p-button-label\"  and normalize-space()='Assign'])[1]")
	WebElement Assign;

	public WebElement Assign() {
		return Assign;
	}
	
	@FindBy(xpath = "(//span[text()='Save'])[2]")
	WebElement Save2;

	public WebElement SecondSaveButton() {
		return Save2;
	}
	
	@FindBy(xpath = "//p-checkbox[@inputid='binary']")
    WebElement shippingicon;
	
	public WebElement ShippingBillingCheckBox() {
	return shippingicon;	
 }
	
	@FindBy(xpath = "(//span[@class='p-inputswitch-slider'])[1]")
    WebElement slyder;
	
	public WebElement AddressActiveToggle() {
	return slyder;	
	
	}
	
	@FindBy(xpath = "//input[@name='streetAddress2']")
    WebElement Streetadress2;
	
	public WebElement StreetAdress2() {
	return Streetadress2;	 
	}

	@FindBy(xpath = "(//tr/td//i)[1]")
    WebElement editAddress;
	
	public WebElement editAddress() {
	return editAddress;	 
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
