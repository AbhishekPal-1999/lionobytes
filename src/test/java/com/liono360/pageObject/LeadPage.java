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
	@FindBy(xpath = "//i[@class=\"pi pi-bars\"]")
	WebElement hamburgerIcon;

	public WebElement hamburgerIcon() {
		return hamburgerIcon;
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

	@FindBy(xpath = "//span[text()='View']")
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
	
	@FindBy(xpath = "(//input[@type='email'])[2]")
	WebElement Homeemail;

	public WebElement homeemail() {
		return Homeemail;
	}
	@FindBy(xpath = "(//input[@type='email'])[3]")
	WebElement emailce1;

	public WebElement emailce1() {
		return emailce1;
	}
	@FindBy(xpath = "(//input[@type='email'])[4]")
	WebElement emailce2;

	public WebElement emailce2() {
		return emailce2;
	}

	@FindBy(xpath = "(//input[@type='text'])[10]")
	WebElement txtPhoneNumber;

	@FindBy(xpath = "(//p-dropdown[@filterby=\"CountryName\"])[1]")
    WebElement Country1;

	public WebElement PhoneCountry1() {
	return Country1;
	}
	@FindBy(xpath = "(//p-dropdown[@filterby=\"CountryName\"])[2]")
    WebElement Country2;

	public WebElement PhoneCountry2() {
	return Country2;
	}
	@FindBy(xpath = "(//p-dropdown[@filterby=\"CountryName\"])[3]")
    WebElement Country3;
    
	public WebElement PhoneCountry3() {
	return Country3;
	}
	@FindBy(xpath = "(//p-dropdown[@filterby=\"CountryName\"])[4]")
    WebElement Country4;

	public WebElement PhoneCountry4() {
	return Country4;
	}
	@FindBy(xpath = "(//p-dropdown[@filterby=\"CountryName\"])[5]")
    WebElement Country5;

	public WebElement PhoneCountry5() {
	return Country5;
	}
	@FindBy(xpath = "(//p-inputmask//input)[1]")
    WebElement phone;

	public WebElement WorkPhone() {
	return phone;	
}

	
	@FindBy(xpath = "(//p-inputmask//input)[2]")
    WebElement homephone;

	public WebElement HomePhone() {
	return homephone;	
}
	
	@FindBy(xpath = "(//p-inputmask//input)[3]")
    WebElement mobilephone;

	public WebElement MobilePhone() {
	return mobilephone;	
}
	
	@FindBy(xpath = "(//p-inputmask//input)[4]")
    WebElement CP1phone;

	public WebElement CP1() {
	return CP1phone;	
}
	
	@FindBy(xpath = "(//p-inputmask//input)[5]")
    WebElement cp2phone;

	public WebElement CP2() {
	return cp2phone;	
}

	@FindBy(xpath = "//p-multiselect[@formcontrolname=\"contactRoles\"]")
	WebElement drpJobFunction;

	public WebElement selectJobFunction() {
		return drpJobFunction;
	}

	@FindBy(xpath = "//div//input[@formcontrolname='businessName']")
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

	@FindBy(xpath = "//p-dropdown[@name=\"leadStatusId\"]")
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

	@FindBy(xpath = "//button[@label=\"Save\"]")
	WebElement AllbtnSaveAddress;

	public WebElement AllbtnSaveAddress() {
		return AllbtnSaveAddress;
	}
	
	@FindBy(xpath = "//span[text()='Save']")
	WebElement Save1;

	public WebElement Save1() {
		return Save1;
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

	@FindBy(xpath = "//p-dropdown[@placeholder=\"Select a primary user\"]")
	WebElement PrimaryAssign;

	public WebElement PrimaryAssign() {
		return PrimaryAssign;
	}

	@FindBy(xpath = "//p-multiselect[@placeholder=\"Select secondary users\"]")
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
	
	
	@FindBy(xpath = "//i[@class=\"pi pi-times\"]")
	WebElement CloseLead;

	public WebElement CloseLeads() {
		return CloseLead;
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
	
	@FindBy(xpath="//span[@class=\"p-menuitem-icon pi pi-refresh ng-star-inserted\"]")
	WebElement btnrefresh;

	public WebElement Refresh() {
		return btnrefresh;
		}
	
	
	
	@FindBy(xpath="(//div[@class=\"p-datatable-wrapper\"]//table//tbody//tr//td)[2]")
	WebElement listedLeads;

	public WebElement listedLeads() {
		return listedLeads;
		}
	
	
	
	
	@FindBy(xpath="(//span//div[@class=\"p-element ng-star-inserted\"])[1]")
	WebElement listedLeadNames;

	public WebElement listedLeadName() {
		return listedLeadNames;
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
	
	@FindBy(xpath = "//span[text()='Assign']")
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
	

	@FindBy(xpath = "//span[text()='Make Copy']")
	WebElement btnCopy;

	public WebElement Copy() {
		return btnCopy;
	}
	
	@FindBy(xpath = "//span[text()='Move Lead']")
	WebElement btnMove;

	public WebElement Move() {
		return btnMove;
	}
	
	@FindBy(xpath = "//p-dropdown[@placeholder=\"Select a Channel\"]")
	WebElement drpSelectChannel;

	public WebElement SelectChannel() {
		return drpSelectChannel;
	}
	
	@FindBy(xpath = "//p-dropdown[@id=\"stages\"]")
	WebElement drpSelectSatge;

	public WebElement SelectStage() {
		return drpSelectSatge;
	}
	
	@FindBy(xpath = "//span[text()='Next']")
	WebElement btnNext;

	public WebElement Next() {
		return btnNext;
	}
	
	@FindBy(xpath = "//p-tabpanel//span[text()=' New ']")
	WebElement NewStage;

	public WebElement NewStage() {
		return NewStage;
	}
	
	@FindBy(xpath = "//p-tabpanel//span[text()=' Assigned ']")
	WebElement AssignedStage;

	public WebElement AssignedStage() {
		return AssignedStage;
	}
	
	@FindBy(xpath = "//p-tabpanel//span[text()=' Sales Qualified ']")
	WebElement SalesQualified;

	public WebElement SalesQualified() {
		return SalesQualified;
	}
	
	@FindBy(xpath = "//p-tabpanel//span[text()=' Working - not contacted ']")
	WebElement WorkingNotContacted;

	public WebElement WorkingNotContacted() {
		return WorkingNotContacted;
	}
	
	@FindBy(xpath = "//p-tabpanel//span[text()=' Working - contacted ']")
	WebElement WorkingContactedStage;

	public WebElement WorkingContactedStage() {
		return WorkingContactedStage;
	}
	
	@FindBy(xpath = "//p-tabpanel//span[text()=' Closed ']")
	WebElement ClosedSatge;

	public WebElement ClosedSatge() {
		return ClosedSatge;
	}
	
	@FindBy(xpath = "//textarea[@formcontrolname=\"comment\"]")
	WebElement txtstageComment;

	public WebElement Comment() {
		return txtstageComment;
	}
	
	@FindBy(xpath = "//p-dropdown[@formcontrolname=\"stageId\"]")
	WebElement drpClosedStage;

	public WebElement SelectClosedStage() {
		return drpClosedStage;
	}
	
	
	@FindBy(xpath = "//p-multiselect[@formcontrolname=\"reasonId\"]")
	WebElement drpSelectReason;

	public WebElement SelectReason() {
		return drpSelectReason;
	}
	
	@FindBy(xpath = "//p-multiselect[@formcontrolname=\"reasonId\"]")
	WebElement drpSelectClosedReason;

	public WebElement SelectClosedReason() {
		return drpSelectClosedReason;
	}
	
	@FindBy(xpath = "//p-calendar[@formcontrolname=\"closedDate\"]")
	WebElement closedDate;

	public WebElement closedDate() {
		return closedDate;
	}
	
	
	@FindBy(xpath = "//span[text()='Convert']")
	WebElement convert;

	public WebElement convertLead() {
		return convert;
	}
	
	@FindBy(xpath = "//span[text()='Check In']")
	WebElement Checkin;

	public WebElement Checkin() {
		return Checkin;
	}
	
	@FindBy(xpath = "//span[text()='Checkout']")
	WebElement btnCheckout;

	public WebElement Checkout() {
		return btnCheckout;
	}
	
	@FindBy(xpath = "//span[text()='Yes']")
	WebElement btnYes;

	public WebElement btnYes() {
		return btnYes;
	}
	

	@FindBy(xpath = "//i[@class=\"pi pi-plus\"]")
	WebElement btnPlusIcon;

	public WebElement PlusIcon() {
		return btnPlusIcon;
	}
	
	@FindBy(xpath = "//li//span[text()='Logs']")
	WebElement btnLogs;

	public WebElement AddLogs() {
		return btnLogs;
	}
	
	@FindBy(xpath = "//p-dropdown[@placeholder=\"Select log type\"]")
	WebElement drpLogType;

	public WebElement SelectLogType() {
		return drpLogType;
	}
	
	@FindBy(xpath = "//input[@accept=\"undefined\"]")
	WebElement Attachments;

	public WebElement addAttachments() {
		return Attachments;
	}
	
	@FindBy(xpath = "//textarea[@id=\"comment\"]")
	WebElement txtlogComment;

	public WebElement addComment() {
		return txtlogComment;
	}
	
	@FindBy(xpath = "//a[@role=\"tab\"]//span[text()='Activity']")
	WebElement tabactivity;

	public WebElement activity() {
		return tabactivity;
	}
	
	@FindBy(xpath = "//p-dropdown[@id=\"subLogType\"]")
	WebElement drpSubtype;

	public WebElement SelectSubLogType() {
		return drpSubtype;
	}
	
	@FindBy(xpath = "(//div[@class=\"activity-content\"])[1]//p")
	WebElement CommentInLog;

	public WebElement ListedLog() {
		return CommentInLog;
	}
	
	@FindBy(xpath = "//i[@class=\"pi pi-trash\"]")
	WebElement btndlteLog;

	public WebElement DeleteLog() {
		return btndlteLog;
	}
	
	@FindBy(xpath = "//i[@class=\"pi pi-pencil\"]")
	WebElement btnlogEdit;

	public WebElement logEdit() {
		return btnlogEdit;
	}
	
	@FindBy(xpath = "(//textarea[@name=\"description\"])[1]")
	WebElement editComment;

	public WebElement editComment() {
		return editComment;
	}
	@FindBy(xpath = "//p-dropdown[@formcontrolname=\"contactRoleId\"]")
    WebElement Designaion;

	public WebElement Designaion() {
	return Designaion;
	}
	
	@FindBy(xpath = "//i[@class=\"p-element fa fa-twitter\"]//following-sibling::input")
	WebElement contactFacbook;

	public WebElement contactFacbook() {
		return contactFacbook;
	}

	@FindBy(xpath = "//i[@class=\"p-element fa fa-twitter\"]//following-sibling::input")
	WebElement contactTwitter;

	public WebElement contactTwitter() {
		return contactTwitter;
	}

	@FindBy(xpath = "//i[@class=\"p-element fa fa-linkedin\"]//following-sibling::input")
	WebElement contactLinkedin;

	public WebElement contactLinkedin() {
		return contactLinkedin;
	}

	@FindBy(xpath = "//i[@class=\"p-element fa fa-instagram\"]//following-sibling::input")
	WebElement contactInstagram;

	public WebElement contactInstagram() {
		return contactInstagram;
	}


	@FindBy(xpath = "//i[@class=\"p-element fa fa-desktop\"]//following-sibling::input")
	WebElement contactWebsite;

	public WebElement contactWebsite() {
		return contactWebsite;
	}


	@FindBy(xpath = "//label[text()=' Instagram ']//following-sibling::input")
	WebElement instagram;

	public WebElement instagram() {
		return instagram;
	}

	@FindBy(xpath = "//label[text()=' Linkedin ']//following-sibling::input")
	WebElement linkedin;

	public WebElement linkedin() {
		return linkedin;
	}

	@FindBy(xpath = "//label[text()=' Facebook ']//following-sibling::input")
	WebElement facebook;

	public WebElement facebook() {
		return facebook;
	}

	@FindBy(xpath = "//label[text()=' Twitter ']//following-sibling::input")
	WebElement twitter;

	public WebElement twitter() {
		return twitter;
	}

	@FindBy(xpath = "//label[text()=' Website ']//following-sibling::input")
	WebElement Website;

	public WebElement Website() {
		return Website;
	}

	@FindBy(xpath = "//p-dropdown[@formcontrolname=\"accountPhoneCountry\"]")
	WebElement accountPhoneCountry;

	public WebElement accountPhoneCountry() {
		return accountPhoneCountry;
	}

	@FindBy(xpath = "(//input[@type=\"email\"])[5]")
	WebElement LeadsEmail;

	public WebElement LeadsEmail() {
		return LeadsEmail;
	}
	
	@FindBy(xpath = "(//p-dropdown[@filterby=\"CountryName\"])[6]")
	WebElement leadPhoneCountry;

	public WebElement leadphoneCountry() {
		return leadPhoneCountry;
	}

	@FindBy(xpath = "(//p-inputmask)[6]/input")
	WebElement leadPhone;

	public WebElement leadPhone() {
		return leadPhone;
	}
	
	@FindBy(xpath = "//div[@ptooltip=\"Show Menu Bar\"]")
	WebElement showMenu;

	public WebElement showMenu() {
		return showMenu;
	}
	
	@FindBy(xpath = "//div[@ptooltip=\"Hide Menu Bar\"]")
	WebElement hideMenu;

	public WebElement hideMenu() {
		return hideMenu;
	}
	
}

