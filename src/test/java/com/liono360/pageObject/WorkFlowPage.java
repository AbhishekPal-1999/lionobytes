package com.liono360.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WorkFlowPage {
	WebDriver ldriver;

	public WorkFlowPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//span[text()='Accounts']")
	WebElement CbtnAccount;

	public WebElement clickAccounts() {
		return CbtnAccount;	
	
	}
	@FindBy(xpath = "//p-dropdown[@placeholder='Choose One']")
	WebElement accountoptionDrp;

	public WebElement AccountoptionDrp() {
		return accountoptionDrp;	
	
	}
	
	@FindBy(xpath = "(//a[@aria-expanded='false'])[1]")
     WebElement Newaccountbtn;

	public WebElement NewAbtn() {
	return Newaccountbtn;	
	}
	
	@FindBy(xpath = "//p-dropdown[@placeholder='Select Title...']")
    WebElement title;

	public WebElement Title1() {
	return title;	
   }
	
	@FindBy(xpath = "(//li[@role='option'])[5]")
    WebElement slectopt;

	public WebElement Selectopt() {
	return slectopt;		
    }
	@FindBy(xpath = "//input[@formcontrolname='contactFirstName']")
    WebElement firstname;

	public WebElement Firstname() {
	return firstname;	
}
	@FindBy(xpath = "//input[@formcontrolname='contactMiddleName']")
    WebElement middlename;

	public WebElement middlename() {
	return middlename;	
	
	}	
	@FindBy(xpath = "//input[@formcontrolname='contactLastName']")
    WebElement lastname;

	public WebElement Latname() {
	return lastname;	
     }
	@FindBy(xpath = "//input[@formcontrolname='contactWorkEmail']")
    WebElement email;

	public WebElement Email() {
	return email;	
    }
	@FindBy(xpath = "//input[@formcontrolname='contactWorkPhone']")
    WebElement phone;

	public WebElement Phone1() {
	return phone;	
}
	@FindBy(xpath = "//p-multiselect[@placeholder='Select Job Function...']")
    WebElement jobfunction;

	public WebElement JobFun() {
	return jobfunction;
	}
	
	@FindBy(xpath = "(//p-multiselectitem/li/div/div/span[1])[1]")
    WebElement jobfunctionoption;

	public WebElement JobFunoption() {
	return jobfunctionoption;
   }
	@FindBy(xpath = "//input[@formcontrolname='accountName']")
    WebElement accountname;

	public WebElement AccountName() {
	return accountname;
     }
	
	@FindBy(xpath="(//input[@type='text'])[10]")
	WebElement btnphone;
	
	public WebElement clickphone() {
		return btnphone;
	}
	@FindBy(xpath = "//input[@formcontrolname='accountNumber']")
    WebElement accountNumber;

	public WebElement accountNumber() {
	return accountNumber;
     }
	@FindBy(xpath = "//span[text()='Select Timezone...']")
    WebElement timezones;

	public WebElement Timezones() {
	return timezones;
	}
	@FindBy(xpath = "//span[text()='Select Currency...']")
    WebElement currency;

	

	public WebElement Currency() {
	return currency;
	}
	@FindBy(xpath = "//span[text()='Account Details']")
    WebElement Accountdetails;
	
	public WebElement AccountDetails() {
	return Accountdetails;
	
	
	}
	@FindBy(xpath="//div[@tooltipposition='top']//span[contains(text(),'Account No.')]")
	WebElement btnAccountNo;
	
	public WebElement clickAccountNo() {
		return btnAccountNo;
	}
	@FindBy(xpath = "//input[@formcontrolname='doingBusinessAs']")
    WebElement DoingBusniess;
	
	public WebElement DoingBusiness() {
	return DoingBusniess;
	}
	
	@FindBy(xpath="//li[@aria-label='Add Task']")
	WebElement btnAddTask;
	
	public WebElement clickAddTask() {
		return btnAddTask;
	}
	
	@FindBy(xpath = "//input[@formcontrolname='taxId']")
    WebElement taxid;
	
	public WebElement TaxId() {
	return taxid;
}
	@FindBy(xpath = "//span[text()='Select Employees...']")
    WebElement NumberofEmployees;
	
	public WebElement NumberOfEmp() {
	return NumberofEmployees;
}
	@FindBy(xpath = "//p-dropdown[@placeholder='Select Revenue...']")
    WebElement EstimatedannualRevenue;
	
	public WebElement EstimatedAnnualRevenue() {
	return EstimatedannualRevenue;	
	}
	
	@FindBy(xpath = "//p-dropdown[@placeholder='Select Ownership...']")
    WebElement Ownershiptype;
	
	public WebElement OwnershipType() {
	return Ownershiptype;	
}
	@FindBy(xpath = "//span[text()='Prospect']")
    WebElement Businessclassification;
	
	public WebElement BusinessClassification() {
	return Businessclassification;		
}
	@FindBy(xpath="//span[text()=\"Select Ownership...\"]")

	WebElement drpOwnership ;

	 

	public WebElement SelectOwnership() {

	return drpOwnership ;

	}
	@FindBy(xpath = "//input[@formcontrolname='foundedYear']")
    WebElement Foundedyear;
	
	public WebElement FoundedYear() {
	return Foundedyear;	
}
	@FindBy(xpath = "//span[normalize-space()='Select Industry...']")
    WebElement Industrys;
	
	public WebElement IndustrysI() {
	return Industrys;	
	}
	@FindBy(xpath = "//input[@formcontrolname='contactWorkEmail']")
    WebElement Accountemail;
	
	public WebElement AccountEmail() {
	return Accountemail;	
}
	
	@FindBy(xpath = "//input[@formcontrolname='contactWorkPhone']")
    WebElement accountphone;
	
	public WebElement AccountPhone() {
	return accountphone;		
}
	@FindBy(xpath = "//textarea[@type='text']")
    WebElement notess;
	
	public WebElement Notess() {
	return notess;	
	}
	@FindBy(xpath = "//input[@formcontrolname='sicCode']")
	WebElement SICcodes;

	public WebElement SICCodes() {
		return SICcodes;
	}
	@FindBy(xpath = "//input[@formcontrolname='naicsCode']")
	WebElement NAICScodes;

	public WebElement NAICScodes() {
		return NAICScodes;
	}
	@FindBy(xpath="//p-dropdown[@placeholder='Select Account Source...']")
    WebElement AccountSource;
		
	 public WebElement AccountSource() {
	 return AccountSource;	
		}
		
    @FindBy(xpath="//p-dropdown[@placeholder='Select Rating...']")
	  WebElement AccountRating;
	
    public WebElement AccountRating() {
	 return AccountRating;	
    }

	@FindBy(xpath = "//span[text()='Address Details']")
    WebElement AdressDetails;
	
	public WebElement AdressDetails() {
	return AdressDetails;	
}
	@FindBy(xpath = "//span[@style='position: relative; float: right;']")
    WebElement AdressDetailsicon;
	
	public WebElement AdressDetailsIcon() {
	return AdressDetailsicon;	
}
	@FindBy(xpath = "//p-checkbox[@inputid='binary']")
    WebElement shippingicon;
	
	public WebElement ShippingIiIcon() {
	return shippingicon;	
}
	@FindBy(xpath = "(//span[@class='p-inputswitch-slider'])[1]")
    WebElement slyder;
	
	public WebElement Slyders() {
	return slyder;	
	
	}
	
	@FindBy(xpath = "//p-dropdown[@placeholder='Select Address Type']")
    WebElement AdressType;
	
	public WebElement AdressType1() {
	return AdressType;	
}
	@FindBy(xpath = "//p-dropdown[@placeholder='Select Address Class']")
    WebElement Adressclass;
	
	public WebElement AdressClass() {
	return Adressclass;	
}
	
	
	@FindBy(xpath = "//input[@placeholder='Enter a location']")
    WebElement Streetadress1;
	
	public WebElement StreetAdress1() {
	return Streetadress1;	
}

	@FindBy(xpath = "//input[@name='streetAddress2']")
    WebElement Streetadress2;
	
	public WebElement StreetAdress2() {
	return Streetadress2;	           	
}
	@FindBy(xpath = "(//span[text()='Save'])[1]")
    WebElement saveaccountdetails;
	
	public WebElement SaveAccountDetails() {
	return saveaccountdetails;
}
	@FindBy(xpath = "//span[text()='Save']")
    WebElement SaveAllDeatils; 
	
	public WebElement SaveAllDeatilsBtn() {
	return SaveAllDeatils;
}
	@FindBy(xpath="//span[contains(text(),'Misc.')]")
	WebElement btnMisc;
	
	public WebElement clickMisc() {
		return btnMisc;
	}
	@FindBy(xpath="//span[contains(text(),'Workflow')]")
	WebElement btnWorkflow;
	
	public WebElement clickWorkflow() {
		return btnWorkflow;
		
	}
	@FindBy(xpath="//li[@aria-label='CreatedDate']//div[@tooltipposition='top']")
	WebElement btncreateddate;
	
	public WebElement clickCreatedDate() {
		return btncreateddate;
	}
	@FindBy(xpath="//span[normalize-space()='New']")
	WebElement btnNew;
	
	public WebElement clickNew() {
		return btnNew;
	}
	@FindBy(xpath="(//tbody/tr[1]/td)[3]")
	WebElement btnclicktask;
	
	public WebElement clickAccounttaskclick() {
		return btnclicktask;
	}

	/**********************************
	 * WorkFlow Detail
	 *********************************************/
	@FindBy(xpath="//input[@formcontrolname='name']")
	WebElement btnName;
	
	public WebElement clickWorkflowName() {
		return btnName;
	}
	@FindBy(xpath="//input[@placeholder='mm/dd/yyyy']")
	WebElement btnDateplaceholder;
	
	public WebElement clickDatePlaceholder() {
		return btnDateplaceholder;
	}
	@FindBy(xpath="//span[normalize-space()='Select Module']")
	WebElement btnModule;
	
	public WebElement clickSelectModule() {
		return btnModule;
	}
	
	@FindBy(xpath="//button[@label='Next']")
	WebElement btnNext;
	 
	public WebElement clickNext() {
		return btnNext;
	}
	@FindBy(xpath="//button[@ptooltip='Add Saved Search Condition']")
	WebElement btnSavedSearchCondition;
	
	public WebElement clickSavedSearchCondition() {
		return btnSavedSearchCondition;
	}
	
	@FindBy(xpath="//span[normalize-space()='Country']")
	WebElement btnCountry;
	
	public WebElement clickCountry() {
		return btnCountry;
	}
	@FindBy(xpath="//button[@ptooltip='Add Manual Condition']")
	WebElement btnManualCondition;
	
	public WebElement clickManualCondition() {
		return btnManualCondition;
	}
	@FindBy(xpath="//span[contains(text(),'Select Items')]")
	WebElement btnselectitem;
	
	public WebElement clickselectitem() {
		return btnselectitem;
	}
	@FindBy(xpath="(//span[@tooltipposition='top'])[2]")
	WebElement btnAddRule;
	
	public WebElement clickAddRule() {
		return btnAddRule;
		
	}
	@FindBy(xpath="(//p-dropdown[@id='ruleFilter'])[1]")
	WebElement btnSelectFilter;
	
	public WebElement clickSelectFilter() {
		return btnSelectFilter;
		
	}
	@FindBy(xpath="//span[normalize-space()='Select a Save Search']")
	WebElement btnSelectSavedSearch;
	
	public WebElement clickSelectsaveSearch() {
		return btnSelectSavedSearch;
	}
	@FindBy(xpath="//span[normalize-space()='CreatedBy']")
	WebElement btncreatedby;
	
	public WebElement clickCreatedBy() {
		return btncreatedby;
	}
	@FindBy(xpath="(//span[contains(text(),'Account Email')])")
	WebElement btnaccountemail;
	
	public WebElement clickAccountEmail() {
		return btnaccountemail;
	}
	@FindBy(xpath="//div[normalize-space()='SavedSearchAutomation01']")
	WebElement btncreatedSavedSearch;
	
	public WebElement clickCreatedSavedSearch() {
		return btncreatedSavedSearch;
	}
	
	@FindBy(xpath="(//li[@aria-label='Account Name'])[1]")
	WebElement btnAccountName;
	
	public WebElement clickAccountName() {
		return btnAccountName;
	}
	
	@FindBy(xpath="(//div[@aria-label='dropdown trigger'])[3]")
	WebElement btnSelectOperator;
	
	
	public WebElement clickSelectOperator() {
		return btnSelectOperator;
		
	}
	@FindBy(xpath="//span[normalize-space()='Street Address 1']")
	WebElement btnStreetAddress1;
	public WebElement clickStreetAddress1() {
		return btnStreetAddress1;
	}
	@FindBy(xpath="//span[normalize-space()='Account No.']")
	WebElement btnAccountNo1;
	
	public WebElement clickAccountNo1() {
		return btnAccountNo1;
	}
	@FindBy(xpath="(//p-dropdown[@id='ruleFilter'])[2]")
	WebElement btnrulefilter2;
	
	public WebElement clickSelectRuleFilter2() {
		return btnrulefilter2;
	}
	
	@FindBy(xpath="(//p-dropdown[@id='ruleFilter'])[3]")
	WebElement btnrulefilter3;
	
	public WebElement clickSelectRuleFilter3() {
		return btnrulefilter3;
	}
	
	@FindBy(xpath="(//p-dropdown[@id='ruleFilter'])[4]")
	WebElement btnrulefilter4;
	
	public WebElement clickSelectRuleFilter4() {
		return btnrulefilter4;
	}
	@FindBy(xpath="(//p-dropdown[@id='ruleFilter'])[5]")
	WebElement btnrulefilter5;
	
	public WebElement clickSelectRuleFilter5() {
		return btnrulefilter5;
	}
	@FindBy(xpath="(//p-dropdown[@id='ruleFilter'])[6]")
	WebElement btnrulefilter6;
	
	public WebElement clickSelectRuleFilter6() {
		return btnrulefilter6;
	}
	
	@FindBy(xpath="(//p-dropdown[@id='ruleFilter'])[7]")
	WebElement btnrulefilter7;
	
	public WebElement clickSelectRuleFilter7() {
		return btnrulefilter7;
	}
	@FindBy(xpath="(//p-dropdown[@id='ruleFilter'])[8]")
	WebElement btnrulefilter8;
	
	public WebElement clickSelectRuleFilter8() {
		return btnrulefilter8;
	}
	@FindBy(xpath="(//p-dropdown[@id='ruleFilter'])[9]")
	WebElement btnrulefilter9;
	
	public WebElement clickSelectRuleFilter9() {
		return btnrulefilter9;
	}
	@FindBy(xpath="(//p-dropdown[@id='ruleFilter'])[10]")
	WebElement btnrulefilter10;
	
	public WebElement clickSelectRuleFilter10() {
		return btnrulefilter10;
	}
	@FindBy(xpath="(//p-dropdown[@id='ruleFilter'])[11]")
	WebElement btnrulefilter11;
	
	public WebElement clickSelectRuleFilter11() {
		return btnrulefilter11;
	}
	@FindBy(xpath="(//p-dropdownitem/li[@role='option'])[1]")
	WebElement btnOperatorOptionIsEqual;
	
	public WebElement clickOperatorOptionIsEqual() {
		return btnOperatorOptionIsEqual;
	}
	@FindBy(xpath="//span[normalize-space()='Account No.']")
	WebElement btnAccountno;
	
	public WebElement clickAccountno() {
		return btnAccountno;
	}
	
	@FindBy(xpath="//span[normalize-space()='Account Phone']")
	
	WebElement btnAccountPhone;
	
	public WebElement clickAccountPhone() {
		return btnAccountPhone;
	}
	
	@FindBy(xpath="//span[normalize-space()='Account Source']")
	WebElement btnACcountSource;
	
	public WebElement clickAccountSource() {
		return btnACcountSource;
	}
	@FindBy(xpath="(//input[@placeholder='Enter'])[1]")
	WebElement btnValueEnter;
	
	public WebElement clickValueEnter() {
		return btnValueEnter;
	}
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement btnSubmit;
	
	public WebElement clickSubmit() {
		return btnSubmit;
	}
	@FindBy(xpath="//li[@aria-label='Currency']")
	WebElement btncurrency;
	
	public WebElement clickCurrency() {
		return btncurrency;
	}
	@FindBy(xpath="//button[@label='Preview Data']")
	WebElement btnPreviewData;
	
	public WebElement clickPreviewData() {
		return btnPreviewData;
	}
	@FindBy(xpath="(//p-dropdownitem//li[@role='option'])[5]")
	WebElement btnselectcountryoption;
	
	public WebElement clickSelectcountryitem() {
		return btnselectcountryoption;
	}
	@FindBy(xpath="(//span[contains(text(),'Cancel')])[2]")
	WebElement btncancel;
	
	public WebElement clickCancel() {
		return btncancel;
	}
	@FindBy(xpath="//span[normalize-space()='Andrew']")
	WebElement btnselectitemandre;
	
	public WebElement clickSelectandrew() {
		return btnselectitemandre;
	}
	
	@FindBy(xpath="//span[normalize-space()='Add Actions']")
	WebElement btnAction;
	
	public WebElement clickAddAction() {
		return btnAction;
	}
	
	@FindBy(xpath="//span[normalize-space()='Add E-mail Alert']")
	WebElement btnEmailAlert;
	
	public WebElement clickEmailAlert() {
		return btnEmailAlert;
		
	}
	@FindBy(xpath="//liono-treeselect[@placeholder='Select Users']")
	WebElement btnSelectUser;
	
	public WebElement clickSelectuser() {
	  return btnSelectUser;
	}
	
	@FindBy(xpath="//div[@title='Add Rule']")
	WebElement btnAddRulemanual;
	
	public WebElement clickAddRuleManual() {
		return btnAddRulemanual;
				
	}
	
	
	@FindBy(xpath="(//p-tree//button[@type='button']//span[1])[4]")
	WebElement btnselectUserOption;
	
	public WebElement clickSelectUserOption() {
		return btnselectUserOption;
	}
	@FindBy(xpath="//div[contains(text(),'Select Users')]")
	WebElement btnassigntoselectuser;
	
	public WebElement clickassigntoselectuser() {
		return btnassigntoselectuser;
	}
	@FindBy(xpath="(//button[@type='button'])[27]")
	WebElement btnSelectUserSent;
	
	public WebElement clickSentTo() {
		return btnSelectUserSent;
	}
	
	@FindBy(xpath="//span[normalize-space()='Select Template']")
	WebElement btnSelectTemplate;
	
	public WebElement clickSelectTemplate() {
		return btnSelectTemplate;
	}
	@FindBy(xpath="//p-dropdownitem//li[@role='option']")
	WebElement btnemailtemplateoption;
	
	public WebElement clickSelectTemplateoption() {
		return btnemailtemplateoption;
	}
	@FindBy(xpath="//textarea[@formcontrolname='description']")
	WebElement btndescription;
	
	public WebElement clicktaskDescription() {
		return btndescription;
	}
	@FindBy(xpath="//label[text()='Checklist']//parent::div//following-sibling::span//i")
	WebElement btnchecklist;
	
	public WebElement clickchecklist() {
		return btnchecklist;
		
	}
	@FindBy(xpath="//div[contains(text(),'Select Users')]")
	WebElement btnselectuser;
	
	public WebElement clickSelectUsertask() {
		return btnselectuser;
	}
	@FindBy(xpath="(//input[@type='text'])[12]")
	WebElement btnchecklistfill;
	public WebElement clickchecklistfill() {
		return btnchecklistfill;
	}
	@FindBy(xpath="//p-button[@label='Add Trigger Time']//button[@type='button']")
	WebElement btntriggertime;
	
	public WebElement clicktriggertime() {
		return btntriggertime;
		
	}
	@FindBy(xpath="//input[@id='withoutgrouping']")
	WebElement btntime;
	
	public WebElement clicktime() {
		return btntime;
		
	}
	@FindBy(xpath="(//div[@aria-label=\"dropdown trigger\"])[3]")
	WebElement btntriggertime2;
	
	public WebElement clicktriggertime2() {
		return btntriggertime2;
	}
	@FindBy(xpath="//button[@label='Save']")
	WebElement btnSave;
	
	public WebElement clickSave() {
		return btnSave;
	}
	
	@FindBy(xpath="//p-tree//button[@type='button']//span[1]")
	WebElement btnuserhirecarchy;
	
	public WebElement clickuserhirerachy() {
		return btnuserhirecarchy;
	}
	@FindBy(xpath="(//tbody//tr/td[1])[1]")
	WebElement workflowlist;
	
	public WebElement clickWorklowlist() {
		return workflowlist;
	}
	
	@FindBy(xpath="//button[@label='Run Scheduler']")
	WebElement btnworkflowscheduler;
	
	public WebElement clickRunSchduler() {
		return btnworkflowscheduler;
	}
	@FindBy(xpath="//span[contains(text(),'Yes')]")
	WebElement btnyes;
	
	public WebElement clickOnYes() {
		return btnyes;
	}
	
	@FindBy(xpath="//span[normalize-space()='History']")
	WebElement btnhistory;
	
	public WebElement clickHistory() {
		return btnhistory;
	}
	
	@FindBy(xpath="//span[normalize-space()='All Actions Type']")
	WebElement btnactiontype;
	
	public WebElement clickAllActionType() {
		return btnactiontype;
	}
	@FindBy(xpath="//span[normalize-space()='Close']")
	WebElement btnclose;
	
	public WebElement clickclose() {
		return btnclose;
	}
	@FindBy(xpath="//tbody/tr[1]")
	WebElement btnaccountlist;
	
	public WebElement clickAccountList() {
		return btnaccountlist;
	}
	@FindBy(xpath="//span[normalize-space()='All Execution Status']")
	WebElement btnAllExecutionStatus;
	
	public WebElement clickAllExecutionStatus() {
		return btnAllExecutionStatus;
	}
	@FindBy(xpath="//span[normalize-space()='Email Alert']")
	WebElement buttonEmailAlert;
	
	@FindBy(xpath="//span[normalize-space()='Executed']")
	WebElement btnexecuted;
	
	public WebElement clickExecuted() {
		return btnexecuted;
	}
	public WebElement clickButtonemailAlert() {
		return buttonEmailAlert;
	}
	
	@FindBy(xpath="//span[normalize-space()='Delete']")
	WebElement btnDelete;
	
	public WebElement clickDelete() {
		return btnDelete;
	}
	
	@FindBy(xpath="//input[@formcontrolname='accountNumber']")
	WebElement btnAccountAcNo;
	
	public WebElement clickAccountAcNo() {
		return btnAccountAcNo;
	}
	@FindBy(xpath="//span[normalize-space()='Tasks']")
	WebElement btnAccountTask;
	
	public WebElement clickAccountTask() {
		return btnAccountTask;
	}
	@FindBy(xpath="(//i)[30]")
	WebElement btnRefresh;
	
	public WebElement clickRefresh() {
		return btnRefresh;
	}
	
	@FindBy(xpath="//span[contains(text(),'Overview')]")
	WebElement btnOverview;
	
	public WebElement clickOverview() {
		return btnOverview;
	}
	@FindBy(xpath="(//div[@class='p-radiobutton-box'])[2]")
	WebElement btnCreatedEveryTimeEdited;
	
	public WebElement clickCreatedEveryTimeEdited() {
		return btnCreatedEveryTimeEdited;
	}
	@FindBy(xpath="//span[contains(text(),'Edit')]")
	WebElement btnEdit;
	
	public WebElement clickEdit() {
		return btnEdit;
	}
	@FindBy(xpath="//input[@placeholder='Global Search']")
	WebElement btnGlobalSearch;
	
	public WebElement clickGlobalSearch() {
		return btnGlobalSearch;
	}
	
	@FindBy(xpath="(//input[@type='email'])[1]")
	WebElement btnEditEmail;
	
	public WebElement clickEditEmail() {
		return btnEditEmail;
	}
	@FindBy(xpath = "//span[text()='Edit']")
	WebElement clickOnedit;

	public WebElement ClickOnEdit() {
		return clickOnedit;	
}
}