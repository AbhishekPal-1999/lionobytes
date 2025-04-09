package com.liono360.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.liono360.loginPage.Baseclass;

public class AccountsPage extends Baseclass{
	WebDriver ldriver;
	
	public AccountsPage (WebDriver driver) {
		
		ldriver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//span[text()='Accounts']")
	WebElement CbtnAccount;

	public WebElement clickAccounts() {
		return CbtnAccount;	
	
	}
	@FindBy(xpath = "//p-dropdown[@placeholder=\"Choose Channel\"]")
	WebElement accountoptionDrp;

	public WebElement AccountoptionDrp() {
		return accountoptionDrp;	
	
	}
	
	
	
	
	@FindBy(xpath = "//span[text()='New']")
     WebElement Newaccountbtn;

	public WebElement NewButton() {
	return Newaccountbtn;	
	}
	
	
	@FindBy(xpath = "//span[@class=\"btnBars\"]//i[@class=\"pi pi-plus\"]")
    WebElement AddCase;

	public WebElement AddCaseBtn() {
	return AddCase;	
	}
	
	@FindBy(xpath = "//li[@role=\"presentation\"]//a[@role=\"tab\"]//span[text()='Cases']")
    WebElement CaseAccount;

	public WebElement Casebtn() {
	return CaseAccount;	
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
	
	@FindBy(xpath = "//span[contains(@class,'btnBars') ]//i[@class=\"pi pi-pencil\"]")
    WebElement EditCase;

	public WebElement EditCasebtn() {
	return EditCase;		
    }
	
	
	@FindBy(xpath = "//span[contains(@class,'btnBars') ]//i[@class=\"pi pi-trash\"]")
    WebElement DeleteCase;

	public WebElement DeleteCasebtn() {
	return DeleteCase;		
    }
	
	
	@FindBy(xpath = "//span[contains(@class,'btnBars') ]//i[@class=\"pi pi-eye\"]")
    WebElement ViewCase;

	public WebElement ViewCasebtn() {
	return ViewCase;		
    }
	
	
	
	
	@FindBy(xpath = "//input[@formcontrolname='contactFirstName']")
    WebElement firstname;

	public WebElement Firstname() {
	return firstname;	
	}
	@FindBy(xpath = "//input[@formcontrolname=\"firstName\"]")
    WebElement EditFirstname;

	public WebElement EditFirstname() {
	return EditFirstname;	
}
	@FindBy(xpath="//span[text()='Select label type ...']")
	WebElement AccountOw;

	public WebElement AccountOw() {
		return AccountOw;
	}
	
	
	@FindBy(xpath = "//input[@formcontrolname='contactMiddleName']")
    WebElement middlename;

	public WebElement middlename() {
	return middlename;	
	
	}
	
	@FindBy(xpath = "//input[@formcontrolname=\"middleName\"]")
    WebElement editmiddlename;

	public WebElement editmiddlename() {
	return editmiddlename;	
	
	}	
	@FindBy(xpath = "//input[@formcontrolname=\"lastName\"]")
    WebElement editlastname;

	public WebElement editLastName() {
	return editlastname;	
     }
	
	@FindBy(xpath = "//input[@formcontrolname='contactLastName']")
    WebElement lastname;

	public WebElement LastName() {
	return lastname;	
     }
	@FindBy(xpath = "//input[@formcontrolname='contactWorkEmail']")
    WebElement email;

	public WebElement Email() {
	return email;	
    }
	
	@FindBy(xpath = "//input[@formcontrolname=\"contactHomeEmail\"]")
    WebElement Homeemail;

	public WebElement HomeEmail() {
	return Homeemail;	
    }
	
	@FindBy(xpath = "//input[@formcontrolname=\"contactCE1Email\"]")
    WebElement CE1email;

	public WebElement CE1Email() {
	return CE1email;	
    }
	
	@FindBy(xpath = "//input[@formcontrolname=\"contactCE2Email\"]")
    WebElement ce2email;

	public WebElement CE2Email() {
	return ce2email;	
    }
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
	@FindBy(xpath = "//p-inputmask[@formcontrolname=\"contactWorkPhone\"]//input")
    WebElement phone;

	public WebElement WorkPhone() {
	return phone;	
}

	
	@FindBy(xpath = "//p-inputmask[@formcontrolname=\"contactHomePhone\"]//input")
    WebElement homephone;

	public WebElement HomePhone() {
	return homephone;	
}
	
	@FindBy(xpath = "//p-inputmask[@formcontrolname=\"contactMobilePhone\"]//input")
    WebElement mobilephone;

	public WebElement MobilePhone() {
	return mobilephone;	
}
	
	@FindBy(xpath = "//p-inputmask[@formcontrolname=\"contactCP1Phone\"]//input")
    WebElement CP1phone;

	public WebElement CP1() {
	return CP1phone;	
}
	
	@FindBy(xpath = "//p-inputmask[@formcontrolname=\"contactCP2Phone\"]//input")
    WebElement cp2phone;

	public WebElement CP2() {
	return cp2phone;	
}
	
	
	
	@FindBy(xpath = "(//input[@class='p-inputtext p-component p-element ng-valid ng-touched ng-dirty'])[1]")
    WebElement Phone89;

	public WebElement Phone89() {
	return Phone89;	
}
	
	
	
	
	@FindBy(xpath = "//p-dropdown[@formcontrolname=\"contactRoleId\"]")
    WebElement Designaion;

	public WebElement Designaion() {
	return Designaion;
	}
	
	@FindBy(xpath = "//li[@aria-label='testing']")
    WebElement jobfunctionoption;

	public WebElement JobFunoption() {
	return jobfunctionoption;
   }
	//...........Account Information...............//
	
	@FindBy(xpath = "//input[@formcontrolname='accountName']")
    WebElement accountname;

	public WebElement AccountName() {
	return accountname;
     }
	
	@FindBy(xpath = "//strong[@class=\"association-name\"]")
    WebElement parentaccount;

	public WebElement SelectParentAccount() {
	return parentaccount;
     }
	
	
	@FindBy(xpath = "//span[@class=\"p-input-icon-left\"]//input[@placeholder=\"Search...\"]")
    WebElement Searchparentaccount;

	public WebElement SearchParentAccount() {
	return Searchparentaccount;
     }
	
	
	@FindBy(xpath = "//div[@class=\"p-datatable-wrapper\"]//table[@class=\"p-datatable-table p-datatable-scrollable-table ng-star-inserted\"]//tbody//tr[1]")
    WebElement Selectparentaccount;

	public WebElement SelectsParentAccount() {
	return Selectparentaccount;
     }
	
	
	@FindBy(xpath = "//input[@formcontrolname=\"businessName\"]")
    WebElement editaccountname;

	
	
	
	public WebElement editAccountName() {
	return editaccountname;
     }
	
	
	@FindBy(xpath = "(//p-autocomplete[@id='parent'])[1]")
    WebElement parentname;

	public WebElement ParentName() {
	return parentname;
	}
	
	@FindBy(xpath = "//p-dropdown[@placeholder='Select Account Owner']")
    WebElement accountowner;

	public WebElement accountOwner() {
	return accountowner;
	}
	@FindBy(xpath = "//p-multiselect[@placeholder='Select Account Type(s)...']")
    WebElement accounttype;

	public WebElement accountType() {
	return accounttype;
    }
	
	@FindBy(xpath = "//input[@formcontrolname='accountNumber']")
    WebElement accountNumber;

	public WebElement accountNumber() {
	return accountNumber;
     }
	@FindBy(xpath = "//span[contains(text(),'Select Timezone')]")
    WebElement timezones;

	public WebElement Timezones() {
	return timezones;
	}
	@FindBy(xpath = "//p-dropdown[@placeholder='Select Currency...']")
    WebElement currency;

	public WebElement Currency() {
	return currency;
	}
	
	
	@FindBy(xpath = "//label[text()='Tags ']//span//i")
    WebElement TagPlusbtn;

	public WebElement TagPlusbtn() {
	return TagPlusbtn;
	}
	
	
	
	@FindBy(xpath = "//th//i[@class=\"pi pi-plus\"]")
    WebElement Addtag;

	public WebElement Addtag() {
	return Addtag;
	}
	
	
	@FindBy(xpath = "//label[text()='Tag Name']//following-sibling::input")
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
	
	@FindBy(xpath = "//p-colorpicker[@formcontrolname=\"color\"]")
	WebElement SelectColour;

	public WebElement SelectColour() {
		return SelectColour;
	}
	
	@FindBy(xpath = "//div[@data-pc-section=\"colorHandle\"]")
	WebElement ColorSelecter;

	public WebElement ColorSelecter() {
		return ColorSelecter;
	}
	
	@FindBy(xpath = "//div[@data-pc-section=\"hueHandle\"]")
	WebElement ChangeColor;

	public WebElement ChangeColor() {
		return ChangeColor;
	}
	
	@FindBy(xpath = "(//span[normalize-space()='Assign'])[1]")
	WebElement Assign;

	public WebElement Assign() {
		return Assign;
	}
	
	
	@FindBy(xpath = "(//input[@type='text'])[24]")
    WebElement tonyid;

	public WebElement Tonyid() {
	return tonyid;
	
	}
	@FindBy(xpath = "//span[text()='Select KayesDropdown']//ancestor::p-dropdown")
    WebElement kayesdropdowntest;

	public WebElement KayesDropdowntest() {
	return kayesdropdowntest;
	}
	@FindBy(xpath = "(//div[@class='p-checkbox-box'])[1]")
    WebElement IsUser;

	public WebElement Isuser() {
	return IsUser;
	
	
	}
	@FindBy(xpath = "//span[text()='Select Campaign']//ancestor::p-dropdown")
    WebElement Campaign;
	
	public WebElement Campaign() {
	return Campaign;
}
	@FindBy(xpath = "(//input[@type='text'])[27]")
    WebElement TestOmi;
	
	public WebElement TestOmi() {
	return TestOmi;
}
	@FindBy(xpath = "(//input[@type='text'])[24]")
    WebElement XR;
	
	public WebElement XR() {
	return XR;
}
	@FindBy(xpath = "//span[text()='Select drp']//ancestor::p-dropdown")
    WebElement drp;
	
	public WebElement Drp() {
	return drp;
}
	@FindBy(xpath = "(//p-calendar[@placeholder='dd/mm/yyyy'])[1]")
    WebElement datepicker;
	
	public WebElement Datepicker() {
	return datepicker;
	}
	@FindBy(xpath = "(//input[@autocomplete='off'])[3]")
    WebElement tn;
	
	public WebElement TNtwo() {
	return tn;
}
	@FindBy(xpath = "//span[text()='Select New field']//ancestor::p-dropdown")
    WebElement newfiled;
	
	public WebElement Newfiled() {
	return newfiled;
}
	@FindBy(xpath = "//span[text()='TN10']//ancestor::p-togglebutton")
    WebElement tnten;
	
	public WebElement TNten() {
	return tnten;
}
	@FindBy(xpath = "//div[text()='Select TN6']//ancestor::p-multiselect")
    WebElement tnsix;
	
	public WebElement TNsix() {
	return tnsix;
}
	@FindBy(xpath = "(//p-calendar[@placeholder='dd/mm/yyyy'])[3]")
    WebElement augdatepicker;
	
	public WebElement AugDatepicker() {
	return augdatepicker;
}

	@FindBy(xpath = "(//input[@type='text'])[35]")
    WebElement test;
	
	public WebElement Test() {
	return test;
}
	@FindBy(xpath = "(//input[@type='text'])[36]")
    WebElement simsales;
	
	public WebElement SimSales() {
	return simsales;
}
	@FindBy(xpath = "(//input[@type='text'])[37]")
    WebElement testappentwo;
	
	public WebElement TestAppentwo() {
	return testappentwo;
}
	@FindBy(xpath = "(//input[@type='text'])[38]")
    WebElement harry;
	
	public WebElement Harry() {
	return harry;
	
}
	@FindBy(xpath = "(//input[@type='text'])[39]")
    WebElement inputapp;
	
	public WebElement Inputapp() {
	return inputapp;
	}
	
	
	@FindBy(xpath = "//span[@class=\"p-menuitem-icon pi pi-refresh ng-star-inserted\"]")
    WebElement RefreshListing;
	
	public WebElement RefreshListing() {
	return RefreshListing;
	}
	@FindBy(xpath = "(//input[@autocomplete='off'])[5]")
    WebElement savesearchdob;
	
	public WebElement SaveSearchDob() {
	return savesearchdob;
}
	@FindBy(xpath = "//input[@type='text']//following::input[45]")
    WebElement testeleven;
	
	public WebElement Testeleven() {
	return testeleven;
}
	@FindBy(xpath = "//input[@type='text']//following::input[46]")
    WebElement leadcustom;
	
	public WebElement LeadCustom() {
	return leadcustom;
	}
	@FindBy(xpath = "//div[text()='Select Najrul_Custom_MDD']//ancestor::p-multiselect")
    WebElement narjulcustommdd;
	
	public WebElement NarjulCMDD() {
	return narjulcustommdd;
}
	@FindBy(xpath = "(//div[@class='p-checkbox-box'])[3]")
    WebElement narjulcustomCheckBox;
	
	public WebElement NarjulCheckBox() {
	return narjulcustomCheckBox;
}
	@FindBy(xpath = "//div[text()='Select tesssttt']//ancestor::p-multiselect")
    WebElement tessst;
	
	public WebElement Tessst() {
	return tessst;
	}
	@FindBy(xpath = "(//input[@type='text'])[45]")
    WebElement dasdasdsa;
	
	public WebElement DasDasDsa() {
	return dasdasdsa;
}
	@FindBy(xpath = "(//span[@class='p-rating-icon pi pi-star ng-star-inserted'])[2]")
    WebElement testRating;
	
	public WebElement TestRating() {
	return testRating;
	}
	
	@FindBy(xpath = "(//input[@type='text'])[46]")
    WebElement jyotishcustomfiled;
	
	public WebElement JyotishCustomFiled() {
	return jyotishcustomfiled;
	
	}
	
	@FindBy(xpath = "//span[text()='Select Required']//ancestor::p-dropdown")
    WebElement requried;
	
	public WebElement Requried() {
	return requried;
	
	}
	//...............Account Deatils.......................//
	
	@FindBy(xpath = "//span[text()='Account Details']")
    WebElement Accountdetails;
	
	public WebElement AccountDetails() {
	return Accountdetails;
	
	
	}
	@FindBy(xpath = "//input[@formcontrolname='doingBusinessAs']")
    WebElement DoingBusniess;
	
	public WebElement DoingBusiness() {
	return DoingBusniess;
	}
	@FindBy(xpath = "//input[@formcontrolname='taxId']")
    WebElement taxid;
	
	public WebElement TaxId() {
	return taxid;
}
	@FindBy(xpath = "(//p-dropdown[@placeholder='Select Employees...'])[1]")
    WebElement NumberofEmployees;
	
	public WebElement NumberOfEmp() {
	return NumberofEmployees;
}
	@FindBy(xpath = "(//p-dropdown[@formcontrolname=\"annualRevenueId\"])[1]")
    WebElement EstimatedannualRevenue;
	
	public WebElement EstimateAnnualRevenue() {
	return EstimatedannualRevenue;	
	}
	
	@FindBy(xpath = "(//p-dropdown[@placeholder='Select Ownership...'])[1]")
    WebElement Ownershiptype;
	
	public WebElement OwnershipType() {
	return Ownershiptype;	
}
	@FindBy(xpath = "//p-dropdown[@placeholder=\"Select Current Category...\"]")
    WebElement Businessclassification;
	
	public WebElement BusinessClassification() {
	return Businessclassification;		
}
	@FindBy(xpath = "//input[@formcontrolname='foundedYear']")
    WebElement Foundedyear;
	
	public WebElement FoundedYear() {
	return Foundedyear;	
}
	@FindBy(xpath = "(//p-dropdown[@placeholder='Select Industry...'])[1]")
    WebElement Industrys;
	
	public WebElement IndustrysI() {
	return Industrys;	
	}
	@FindBy(xpath = "//input[@formcontrolname='accountEmail']")
    WebElement txtAccountemail;
	
	public WebElement AccountEmail() {
	return txtAccountemail;	
}
	
	@FindBy(xpath = "//input[@formcontrolname='accountPhone']")
    WebElement accountphone;
	
	public WebElement AccountPhone() {
	return accountphone;		
}
	@FindBy(xpath = "//textarea[@type='text']")
    WebElement notess;
	
	public WebElement Notess() {
	return notess;	
	}
	@FindBy(xpath = "//div[text()='Select Lead Multiselect']//ancestor::p-multiselect")
    WebElement leadmultiselect;
	
	public WebElement LeadMultiselect() {
	return leadmultiselect;	
	}
	@FindBy(xpath = "//span[text()='Select Najrul_Custom_DD']//ancestor::p-dropdown")
    WebElement narjulcustomdd;
	
	public WebElement Narjulcustomdd() {
	return narjulcustomdd;	
}

	@FindBy(xpath="//span[text()='Select abc test 3']//ancestor::p-dropdown")
	 WebElement abctest3;
	
	public WebElement Abctest() {
		return abctest3;	

	}
		
	@FindBy(xpath="(//p-dropdown[@placeholder='Select Account Source...'])[1]")
     WebElement AccountSource;
		
	 public WebElement AccountSource() {
	 return AccountSource;	
		}
		
     @FindBy(xpath="(//p-dropdown[@placeholder='Select Rating...'])[1]")
	  WebElement AccountRating;
	
     public WebElement AccountRating() {
	 return AccountRating;	
		
		
		}
		
//.........................AdressDetails.........................//	
	
	
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
	@FindBy(xpath = "//div[@class=\"p-checkbox-box\"]")
    WebElement shippingicon;
	
	public WebElement ShippingIiIcon() {
	return shippingicon;	
}
	@FindBy(xpath = "(//span[@class='p-inputswitch-slider'])[1]")
    WebElement slyder;
	
	public WebElement Slyders() {
	return slyder;	
	
	}
	
	@FindBy(xpath = "//p-dropdown[@name=\"addressTypes\"]")
    WebElement AsdressTypeOptions;
	
	public WebElement AddressType() {
	return AsdressTypeOptions;	
}
	@FindBy(xpath = "//p-dropdown[@name=\"addressClasses\"]")
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
	@FindBy(xpath = "//button[@label=\"Save\"]")
    WebElement SaveAllDeatils;
	
	public WebElement SaveAllDeatilsBtn() {
	return SaveAllDeatils;
}
	
	//..................View Account........................//
	
	@FindBy(xpath = "//span[text()='Accounts']")
	WebElement VCbtncontact;

	public WebElement clickAccountsV() {
		return VCbtncontact;	
	
	}	
	@FindBy(xpath = "(//td[@class='ng-star-inserted'])[1]")
	WebElement Accountnameclick;

	public WebElement AccountNameClick() {
		return Accountnameclick;	
}


	@FindBy(xpath = "//span[text()='View']")
	WebElement clickonviewbtn;

	public WebElement clickonviewbtn() {
		return clickonviewbtn;	
}
	@FindBy(xpath = "//span[text()='Activity']")
	WebElement ActivityC;

	public WebElement ActivityC() {
		return ActivityC;	
}
	@FindBy(xpath = "//h5[text()=' View Account ']")
	WebElement accountviewornot;

	public WebElement AccountViewOrNot() {
		return accountviewornot;	
	
}
	
	@FindBy(xpath = "(//i[@class='pi pi-times'])[1]")
	WebElement CrossSign;

	public WebElement CrossSign() {
		return CrossSign;
	}
	
	//....................Edit Account...............//
	
	@FindBy(xpath = "//span[text()='Accounts']")
	WebElement Editaccountbtn;

	public WebElement EditAccountBtn() {
		return Editaccountbtn;	
	
	
	}
	@FindBy(xpath = "//td[normalize-space()='SName502']")
	WebElement clickeditaccountname;

	public WebElement ClickEditaccountname() {
		return clickeditaccountname;	
	
	}
	

	@FindBy(xpath = "//span[text()='Edit']")
	WebElement clickOnedit;

	public WebElement ClickOnEdit() {
		return clickOnedit;	
}
	@FindBy(xpath = "(//input[@type='email'])[1]")
	WebElement editemail;

	public WebElement Editemail() {
		return editemail;	
}
	
	@FindBy(xpath = "//span[text()='Account Details']")
	WebElement editclickonaccountdetails;

	public WebElement EditclickonAccountDetails() {
		return editclickonaccountdetails;
	}
	
	
	
	@FindBy(xpath = "//span[text()='Save']")
	WebElement EditsaveClick;

	public WebElement EditSaveClick() {
		return EditsaveClick;	
}
	
	@FindBy(xpath = "(//span[@class=\"p-element ng-star-inserted\"])[3]")
	WebElement ListedAccountname;

	public WebElement ListedAccountName() {
		return ListedAccountname;	
	
}
	//................CheckInaccount..............//
	
	@FindBy(xpath = "//span[text()='Accounts']")
	WebElement checkaccountbtn;

	public WebElement CheckAccountbtn() {
		return checkaccountbtn;	
	}
	@FindBy(xpath = "//td[normalize-space()='SName502']")
	WebElement checkaccountnamebtn;

	public WebElement CheckAccountnamebtn() {
		return checkaccountnamebtn;	
	}
	@FindBy(xpath = "(//i[@class='pi pi-bars'])[2]")
	WebElement checkaccountIcon;

	public WebElement CheckAccountIcon() {
		return checkaccountIcon;	
}
	@FindBy(xpath = "//span[text()='Check In']")
	WebElement clickoncheckin;

	public WebElement ClickOnCheckIn() {
		return clickoncheckin;	
}
	@FindBy(xpath = "//span[text()='Yes']")
	WebElement clickonyes;

	public WebElement clickonYes() {
		return clickonyes;	
}
	@FindBy(xpath = "//span[text()='Checkout']")
	WebElement clickoncheckout;

	public WebElement ClickonCheckout() {
		return clickoncheckout;	
	
}
	@FindBy(xpath = "//td[@class='ng-star-inserted'][2]")
	WebElement listedcheckInaccount;

	public WebElement ListedCheckInAccount() {
		return listedcheckInaccount;	
	
	}
	//...........DeleteAccount...................//
	
	@FindBy(xpath = "//span[text()='Accounts']")
	WebElement deleteaccountbtn;

	public WebElement Deleteaccountbtn() {
		return deleteaccountbtn;	
	
	
	}
	@FindBy(xpath = "//td[normalize-space()='SName502']")
	WebElement deleteaccountname;

	public WebElement DeleteAccountName() {
		return deleteaccountname;	
	}
	@FindBy(xpath = "(//i[@class='pi pi-bars'])[2]")
	WebElement deleteaccounticonbar;

	public WebElement DeleteAccountIconbar() {
		return deleteaccounticonbar;
}
	@FindBy(xpath = "//span[text()='Delete']")
	WebElement clickondeletebtn;

	public WebElement clickondeletebtn() {
		return clickondeletebtn;
}
	
	@FindBy(xpath = "//span[text()='Edit']")
	WebElement clickoneditbtn;

	public WebElement clickoneditbtn() {
		return clickoneditbtn;
}
	
	@FindBy(xpath = "//h5[text()=' Edit Account ']")
	WebElement EditAccountPage;

	public WebElement EditAccount() {
		return EditAccountPage;
}
	
	@FindBy(xpath = "//h5[text()=' Address Details ']")
	WebElement AddresDetailsLabel;

	public WebElement AddressDetailspage() {
		return AddresDetailsLabel;
}
	
	@FindBy(xpath = "//tr//td[contains(text(),'Billing')]")
	WebElement BillingAddress;

	public WebElement BillingAddressEdit() {
		return BillingAddress;
}
	
	@FindBy(xpath = "//tr//td[contains(text(),'Shipping')]")
	WebElement ShippingAddress;

	public WebElement ShippingAddressEdit() {
		return ShippingAddress;
}
	
	
	@FindBy(xpath = "//span[text()='Delete']")
	WebElement AddressDeletebtn;

	public WebElement AddressDeletebutton() {
		return AddressDeletebtn;
}
	
	@FindBy(xpath = "//span[text()='Yes']")
	WebElement clickonyesbtn;

	public WebElement clickOnYesbtn() {
		return clickonyesbtn;
}
	
	@FindBy(xpath = "//td[@class='ng-star-inserted']//div[1]")
	WebElement listeddeleteaccount;

	public WebElement ListeddeleteAccount() {
		return listeddeleteaccount;
}
	//......................Inactive Account................//
	
	@FindBy(xpath = "//span[text()='Accounts']")
	WebElement inactiveeaccountbtn;

	public WebElement InaAtiveeAccountbtn() {
		return inactiveeaccountbtn;	
	
	
	}
	@FindBy(xpath = "//td[normalize-space()='SName502']")
	WebElement inactiveaccountname;

	public WebElement InaAtiveAccountname() {
		return inactiveaccountname;	
	}
	
	@FindBy(xpath = "//span[normalize-space()='Refresh']")
	WebElement refresh;

	public WebElement refresh() {
		return refresh;	
	}
	@FindBy(xpath = "(//i[@class='pi pi-bars'])[2]")
	WebElement Inactiveaccounticonbar;

	public WebElement InactiveAccountIconbar() {
		return Inactiveaccounticonbar;
}
	@FindBy(xpath = "//span[text()='Inactive Account']")
	WebElement clickoninactiveaccount;

	public WebElement ClickonInactiveaccount() {
		return clickoninactiveaccount;
}
//	@FindBy(xpath = "//p-multiselect[@id='inActivatingReason']")
	//WebElement inactivereason;

//	public WebElement InactiveReason() {
	//	return inactivereason;
//}
	
	@FindBy(xpath = "//textarea[@name='comment']")
	WebElement comments;

	public WebElement Comments() {
		return comments;
}
	@FindBy(xpath = "//span[text()='Save']")
	WebElement inactivesavebtn;

	public WebElement InactiveSaveBtn() {
		return inactivesavebtn;
}
	@FindBy(xpath = "//td[@class='ng-star-inserted'][2]")
	WebElement listedInactiveaccount;

	public WebElement listedInactiveAccount() {
		return listedInactiveaccount;	
	}
	
	
	//.......................verifyGlobalSearch............................//
	
	
	@FindBy(xpath = "//span[text()='Accounts']")
	WebElement verifyaccountbtn;

	public WebElement Verifyaccountbtn() {
		return verifyaccountbtn;	
	
	}
	
	@FindBy(xpath = "//input[@placeholder='Global Search']")
	WebElement verifyglobalsearch;

	public WebElement VerifyGlobalSearch() {
		return verifyglobalsearch;	
}
	
	@FindBy(xpath = "//div[@role='checkbox']")
	WebElement Activeclickglobalsearch;

	public WebElement Activeclickglobalsearch() {
		return Activeclickglobalsearch;	
}
	
	
	@FindBy(xpath = "//td[@class='ng-star-inserted'][2]")
	WebElement listedlobalsearch;

	public WebElement ListedGlobalSearch() {
		return listedlobalsearch;	
	}
	
	//........................ActiveToInactive..................//
	
	@FindBy(xpath = "//span[text()='Accounts']")
	WebElement activetoinactiveclickonaccount;

	public WebElement ClickOnActiveToInactiveaccountbtn() {
		return activetoinactiveclickonaccount;	
	
	}
	@FindBy(xpath = "//span[text()='InActive']")
	WebElement InactiveAccountbutton;

	public WebElement ClickActiveInactive() {
		return InactiveAccountbutton;	
}
	@FindBy(xpath = "//span[text()='Active']")
	WebElement ActiveAccount;

	public WebElement ActiveAccountBtn() {
		return ActiveAccount;	
	
}
	@FindBy(xpath = "//td[@class='ng-star-inserted'][2]")
	WebElement ListedactiveInactive;

	public WebElement ListedActiveInactive() {
		return listedlobalsearch;	
	}
	
//....................Configuration template.......................//
	
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
	@FindBy(xpath = "(//span[text()='Accounts'])[2]")
	WebElement clickoncrmaccount;

	public WebElement ClickOnCrmAccount() {
		return clickoncrmaccount;		
	
	}
	
	@FindBy(xpath = "//span[text()='Template']")
	WebElement clickontemplate;

	public WebElement ClickOnTemplate() {
		return clickontemplate;	
	}
	@FindBy(xpath = "//body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-configurations[1]/div[1]/div[3]/div[1]/div[1]/div[1]/app-crm-account[1]/p-tabview[1]/div[1]/div[2]/p-tabpanel[2]/div[1]/app-crm-shared-template[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[6]/span[1]/i[1]")
	WebElement clickonEdittemplate;

	public WebElement clickonEditTemplate() {
		return clickonEdittemplate;	
		
	}
	//.............  Select CheckBox On Contact Details..............//
		
	@FindBy(xpath = "//body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-configurations[1]/div[1]/div[3]/div[1]/div[1]/div[1]/app-crm-account[1]/p-tabview[1]/div[1]/div[2]/p-tabpanel[2]/div[1]/app-crm-shared-template[1]/p-dialog[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/p-checkbox[1]")
	WebElement SelectTitle1check1;

	public WebElement SelectTitle1check1() {
		return SelectTitle1check1;		
}
	@FindBy(xpath = "//body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-configurations[1]/div[1]/div[3]/div[1]/div[1]/div[1]/app-crm-account[1]/p-tabview[1]/div[1]/div[2]/p-tabpanel[2]/div[1]/app-crm-shared-template[1]/p-dialog[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/p-checkbox[1]/div[1]/div[2]")
	WebElement SelectTitle1check2;

	public WebElement SelectTitle1check2() {
		return SelectTitle1check2;		
}
	
	@FindBy(xpath = "//body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-configurations[1]/div[1]/div[3]/div[1]/div[1]/div[1]/app-crm-account[1]/p-tabview[1]/div[1]/div[2]/p-tabpanel[2]/div[1]/app-crm-shared-template[1]/p-dialog[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[4]/p-checkbox[1]")
	WebElement SelectFirstname2;

	public WebElement SelectFirstname2() {
		return SelectFirstname2;		
	}
	@FindBy(xpath = "//body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-configurations[1]/div[1]/div[3]/div[1]/div[1]/div[1]/app-crm-account[1]/p-tabview[1]/div[1]/div[2]/p-tabpanel[2]/div[1]/app-crm-shared-template[1]/p-dialog[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[3]/p-checkbox[1]")
	WebElement selectmiddleinitial1;

	public WebElement Selectmiddleinitial1() {
		return selectmiddleinitial1;		
	
	}
	@FindBy(xpath = "//body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-configurations[1]/div[1]/div[3]/div[1]/div[1]/div[1]/app-crm-account[1]/p-tabview[1]/div[1]/div[2]/p-tabpanel[2]/div[1]/app-crm-shared-template[1]/p-dialog[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[4]/p-checkbox[1]")
	WebElement selectmiddleinitial2;

	public WebElement Selectmiddleinitial2() {
		return selectmiddleinitial2;		
}
	@FindBy(xpath = "//body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-configurations[1]/div[1]/div[3]/div[1]/div[1]/div[1]/app-crm-account[1]/p-tabview[1]/div[1]/div[2]/p-tabpanel[2]/div[1]/app-crm-shared-template[1]/p-dialog[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[3]/p-checkbox[1]")
	WebElement selectlastname1;

	public WebElement selectlastname1() {
		return selectlastname1;	
}
	@FindBy(xpath = "//body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-configurations[1]/div[1]/div[3]/div[1]/div[1]/div[1]/app-crm-account[1]/p-tabview[1]/div[1]/div[2]/p-tabpanel[2]/div[1]/app-crm-shared-template[1]/p-dialog[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[4]/p-checkbox[1]")
	WebElement selectlastname2;

	public WebElement selectlastname2() {
		return selectlastname2;	
}
	@FindBy(xpath = "//body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-configurations[1]/div[1]/div[3]/div[1]/div[1]/div[1]/app-crm-account[1]/p-tabview[1]/div[1]/div[2]/p-tabpanel[2]/div[1]/app-crm-shared-template[1]/p-dialog[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[8]/td[3]/p-checkbox[1]/div[1]/div[2]")
	WebElement selectprofileimage1;

	public WebElement selectprofileimage1() {
		return selectprofileimage1;	
	}
	@FindBy(xpath = "//body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-configurations[1]/div[1]/div[3]/div[1]/div[1]/div[1]/app-crm-account[1]/p-tabview[1]/div[1]/div[2]/p-tabpanel[2]/div[1]/app-crm-shared-template[1]/p-dialog[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[8]/td[4]/p-checkbox[1]")
	WebElement selectprofileimage2;

	public WebElement selectprofileimage2() {
		return selectprofileimage2;	
	
	}
	@FindBy(xpath = "//body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-configurations[1]/div[1]/div[3]/div[1]/div[1]/div[1]/app-crm-account[1]/p-tabview[1]/div[1]/div[2]/p-tabpanel[2]/div[1]/app-crm-shared-template[1]/p-dialog[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[9]/td[3]/p-checkbox[1]")
	WebElement selectjobFun1;

	public WebElement selectjobFun1() {
		return selectjobFun1;	
	}
	
	@FindBy(xpath = "//body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-configurations[1]/div[1]/div[3]/div[1]/div[1]/div[1]/app-crm-account[1]/p-tabview[1]/div[1]/div[2]/p-tabpanel[2]/div[1]/app-crm-shared-template[1]/p-dialog[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[9]/td[4]/p-checkbox[1]")
	WebElement selectjobFun2;

	public WebElement selectjobFun2() {
		return selectjobFun2;	
	}
	@FindBy(xpath = "//body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-configurations[1]/div[1]/div[3]/div[1]/div[1]/div[1]/app-crm-account[1]/p-tabview[1]/div[1]/div[2]/p-tabpanel[2]/div[1]/app-crm-shared-template[1]/p-dialog[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[10]/td[3]/p-checkbox[1]")
	WebElement selectcontactname1;

	public WebElement selectcontactname1() {
		return selectcontactname1;	
	}
	
	@FindBy(xpath = "//body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-configurations[1]/div[1]/div[3]/div[1]/div[1]/div[1]/app-crm-account[1]/p-tabview[1]/div[1]/div[2]/p-tabpanel[2]/div[1]/app-crm-shared-template[1]/p-dialog[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[10]/td[4]/p-checkbox[1]")
	WebElement selectcontactname2;

	public WebElement selectcontactname2() {
		return selectcontactname2;	
}
	//............... Select Account Information................//
	
	@FindBy(xpath = "//body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-configurations[1]/div[1]/div[3]/div[1]/div[1]/div[1]/app-crm-account[1]/p-tabview[1]/div[1]/div[2]/p-tabpanel[2]/div[1]/app-crm-shared-template[1]/p-dialog[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[3]/p-checkbox[1]")
	WebElement selectparentaccountname1;

	public WebElement selectparentaccountname1() {
		return selectparentaccountname1;	
	}
	@FindBy(xpath = "//body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-configurations[1]/div[1]/div[3]/div[1]/div[1]/div[1]/app-crm-account[1]/p-tabview[1]/div[1]/div[2]/p-tabpanel[2]/div[1]/app-crm-shared-template[1]/p-dialog[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[4]/p-checkbox[1]")
	WebElement selectparentaccountname2;

	public WebElement selectparentaccountname2() {
		return selectparentaccountname2;
   }
	@FindBy(xpath = "//body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-configurations[1]/div[1]/div[3]/div[1]/div[1]/div[1]/app-crm-account[1]/p-tabview[1]/div[1]/div[2]/p-tabpanel[2]/div[1]/app-crm-shared-template[1]/p-dialog[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[4]/p-checkbox[1]")
	WebElement selectaccountowner2;

	public WebElement selectaccountowner2() {
		return selectaccountowner2;
	}
	
	@FindBy(xpath = "//body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-configurations[1]/div[1]/div[3]/div[1]/div[1]/div[1]/app-crm-account[1]/p-tabview[1]/div[1]/div[2]/p-tabpanel[2]/div[1]/app-crm-shared-template[1]/p-dialog[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[3]/p-checkbox[1]")
	WebElement selectaccounttype1;

	public WebElement selectaccounttype1() {
		return selectaccounttype1;
	}	
	@FindBy(xpath = "//body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-configurations[1]/div[1]/div[3]/div[1]/div[1]/div[1]/app-crm-account[1]/p-tabview[1]/div[1]/div[2]/p-tabpanel[2]/div[1]/app-crm-shared-template[1]/p-dialog[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[4]/p-checkbox[1]")
	WebElement selectaccounttype2;

	public WebElement selectaccounttype2() {
		return selectaccounttype2;
   }	
	
	@FindBy(xpath = "//body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-configurations[1]/div[1]/div[3]/div[1]/div[1]/div[1]/app-crm-account[1]/p-tabview[1]/div[1]/div[2]/p-tabpanel[2]/div[1]/app-crm-shared-template[1]/p-dialog[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[5]/td[3]/p-checkbox[1]")
	WebElement selecttimezone1;

	public WebElement Selecttimezone1() {
		return selecttimezone1;
	
   }
	@FindBy(xpath = "//body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-configurations[1]/div[1]/div[3]/div[1]/div[1]/div[1]/app-crm-account[1]/p-tabview[1]/div[1]/div[2]/p-tabpanel[2]/div[1]/app-crm-shared-template[1]/p-dialog[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[5]/td[4]/p-checkbox[1]")
	WebElement selecttimezone2;

	public WebElement Selecttimezone2() {
		return selecttimezone2;
	
	}
	@FindBy(xpath = "//body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-configurations[1]/div[1]/div[3]/div[1]/div[1]/div[1]/app-crm-account[1]/p-tabview[1]/div[1]/div[2]/p-tabpanel[2]/div[1]/app-crm-shared-template[1]/p-dialog[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[6]/td[3]/p-checkbox[1]")
	WebElement selectCurrency1;

	public WebElement selectCurrency1() {
		return selectCurrency1;
	
	}
	
	@FindBy(xpath = "//body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-configurations[1]/div[1]/div[3]/div[1]/div[1]/div[1]/app-crm-account[1]/p-tabview[1]/div[1]/div[2]/p-tabpanel[2]/div[1]/app-crm-shared-template[1]/p-dialog[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[6]/td[4]/p-checkbox[1]")
	WebElement selectCurrency2;

	public WebElement selectCurrency2() {
		return selectCurrency2;
	}
	
	//..........Select Account Details...........//
	
	@FindBy(xpath = "//body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-configurations[1]/div[1]/div[3]/div[1]/div[1]/div[1]/app-crm-account[1]/p-tabview[1]/div[1]/div[2]/p-tabpanel[2]/div[1]/app-crm-shared-template[1]/p-dialog[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[3]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/p-checkbox[1]")
	WebElement selectdoingbusiness1;

	public WebElement selectdoingbusiness1() {
		return selectdoingbusiness1;
	
	}
	
	@FindBy(xpath = "//body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-configurations[1]/div[1]/div[3]/div[1]/div[1]/div[1]/app-crm-account[1]/p-tabview[1]/div[1]/div[2]/p-tabpanel[2]/div[1]/app-crm-shared-template[1]/p-dialog[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[3]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/p-checkbox[1]/div[1]/div[2]")
	WebElement selectdoingbusiness2;

	public WebElement selectdoingbusiness2() {
		return selectdoingbusiness2;
	
	
   }
	@FindBy(xpath = "//body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-configurations[1]/div[1]/div[3]/div[1]/div[1]/div[1]/app-crm-account[1]/p-tabview[1]/div[1]/div[2]/p-tabpanel[2]/div[1]/app-crm-shared-template[1]/p-dialog[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[3]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[3]/p-checkbox[1]")
	WebElement selectTaxid1;

	public WebElement selectTaxid1() {
		return selectTaxid1;
	}
	
	@FindBy(xpath = "//body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-configurations[1]/div[1]/div[3]/div[1]/div[1]/div[1]/app-crm-account[1]/p-tabview[1]/div[1]/div[2]/p-tabpanel[2]/div[1]/app-crm-shared-template[1]/p-dialog[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[3]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[4]/p-checkbox[1]")
	WebElement selectTaxid2;

	public WebElement selectTaxid2() {
		return selectTaxid2;
	}
	
	@FindBy(xpath = "//body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-configurations[1]/div[1]/div[3]/div[1]/div[1]/div[1]/app-crm-account[1]/p-tabview[1]/div[1]/div[2]/p-tabpanel[2]/div[1]/app-crm-shared-template[1]/p-dialog[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[3]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[3]/p-checkbox[1]")
	WebElement selectnoofemp1;

	public WebElement selectnoofemp1() {
		return selectnoofemp1;
	}
	
	@FindBy(xpath = "//body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-configurations[1]/div[1]/div[3]/div[1]/div[1]/div[1]/app-crm-account[1]/p-tabview[1]/div[1]/div[2]/p-tabpanel[2]/div[1]/app-crm-shared-template[1]/p-dialog[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[3]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[4]/p-checkbox[1]")
	WebElement selectnoofemp2;

	public WebElement selectnoofemp2() {
		return selectnoofemp2;	
	}
	
	@FindBy(xpath = "//body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-configurations[1]/div[1]/div[3]/div[1]/div[1]/div[1]/app-crm-account[1]/p-tabview[1]/div[1]/div[2]/p-tabpanel[2]/div[1]/app-crm-shared-template[1]/p-dialog[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[3]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[3]/p-checkbox[1]")
	WebElement selectestimatedannualR1;

	public WebElement selectestimatedannualR1() {
		return selectestimatedannualR1;	
	
	}
	
	@FindBy(xpath = "//body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-configurations[1]/div[1]/div[3]/div[1]/div[1]/div[1]/app-crm-account[1]/p-tabview[1]/div[1]/div[2]/p-tabpanel[2]/div[1]/app-crm-shared-template[1]/p-dialog[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[3]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[4]/p-checkbox[1]")
	WebElement selectestimatedannualR2;

	public WebElement selectestimatedannualR2() {
		return selectestimatedannualR2;	
	
    }
	@FindBy(xpath = "//body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-configurations[1]/div[1]/div[3]/div[1]/div[1]/div[1]/app-crm-account[1]/p-tabview[1]/div[1]/div[2]/p-tabpanel[2]/div[1]/app-crm-shared-template[1]/p-dialog[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[3]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[5]/td[3]/p-checkbox[1]")
	WebElement selectownershiptype1;

	public WebElement selectownershiptype1() {
		return selectownershiptype1;	
	}
	
	@FindBy(xpath = "//body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-configurations[1]/div[1]/div[3]/div[1]/div[1]/div[1]/app-crm-account[1]/p-tabview[1]/div[1]/div[2]/p-tabpanel[2]/div[1]/app-crm-shared-template[1]/p-dialog[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[3]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[5]/td[4]/p-checkbox[1]")
	WebElement selectownershiptype2;

	public WebElement selectownershiptype2() {
		return selectownershiptype2;
		
	}
	
	@FindBy(xpath = "//body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-configurations[1]/div[1]/div[3]/div[1]/div[1]/div[1]/app-crm-account[1]/p-tabview[1]/div[1]/div[2]/p-tabpanel[2]/div[1]/app-crm-shared-template[1]/p-dialog[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[3]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[6]/td[3]/p-checkbox[1]")
	WebElement selectbussiClassification1;

	public WebElement selectbussiClassification1() {
		return selectbussiClassification1;
	}
	
	@FindBy(xpath = "//body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-configurations[1]/div[1]/div[3]/div[1]/div[1]/div[1]/app-crm-account[1]/p-tabview[1]/div[1]/div[2]/p-tabpanel[2]/div[1]/app-crm-shared-template[1]/p-dialog[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[3]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[6]/td[4]/p-checkbox[1]")
	WebElement selectbussiClassification2;

	public WebElement selectbussiClassification2() {
		return selectbussiClassification2;
}
	@FindBy(xpath = "//body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-configurations[1]/div[1]/div[3]/div[1]/div[1]/div[1]/app-crm-account[1]/p-tabview[1]/div[1]/div[2]/p-tabpanel[2]/div[1]/app-crm-shared-template[1]/p-dialog[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[3]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[7]/td[3]/p-checkbox[1]")
	WebElement selectFoundedyear1;

	public WebElement selectFoundedyear1() {
		return selectFoundedyear1;	
}
	@FindBy(xpath = "//body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-configurations[1]/div[1]/div[3]/div[1]/div[1]/div[1]/app-crm-account[1]/p-tabview[1]/div[1]/div[2]/p-tabpanel[2]/div[1]/app-crm-shared-template[1]/p-dialog[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[3]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[7]/td[4]/p-checkbox[1]")
	WebElement selectFoundedyear2;

	public WebElement selectFoundedyear2() {
		return selectFoundedyear2;	
}
	@FindBy(xpath = "//body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-configurations[1]/div[1]/div[3]/div[1]/div[1]/div[1]/app-crm-account[1]/p-tabview[1]/div[1]/div[2]/p-tabpanel[2]/div[1]/app-crm-shared-template[1]/p-dialog[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[3]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[8]/td[3]/p-checkbox[1]")
	WebElement selectindustrys1;

	public WebElement selectindustrys1() {
		return selectindustrys1;	
}
	
	@FindBy(xpath = "//body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-configurations[1]/div[1]/div[3]/div[1]/div[1]/div[1]/app-crm-account[1]/p-tabview[1]/div[1]/div[2]/p-tabpanel[2]/div[1]/app-crm-shared-template[1]/p-dialog[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[3]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[8]/td[4]/p-checkbox[1]")
	WebElement selectindustrys2;

	public WebElement selectindustrys2() {
		return selectindustrys2;	
}
	@FindBy(xpath = "//body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-configurations[1]/div[1]/div[3]/div[1]/div[1]/div[1]/app-crm-account[1]/p-tabview[1]/div[1]/div[2]/p-tabpanel[2]/div[1]/app-crm-shared-template[1]/p-dialog[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[3]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[12]/td[3]/p-checkbox[1]")
	WebElement selectSiccode1;

	public WebElement selectSiccode1() {
		return selectSiccode1;	
}
	@FindBy(xpath = "//body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-configurations[1]/div[1]/div[3]/div[1]/div[1]/div[1]/app-crm-account[1]/p-tabview[1]/div[1]/div[2]/p-tabpanel[2]/div[1]/app-crm-shared-template[1]/p-dialog[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[3]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[12]/td[4]/p-checkbox[1]")
	WebElement selectSiccode2;

	public WebElement selectSiccode2() {
		return selectSiccode2;	
}
	@FindBy(xpath = "//body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-configurations[1]/div[1]/div[3]/div[1]/div[1]/div[1]/app-crm-account[1]/p-tabview[1]/div[1]/div[2]/p-tabpanel[2]/div[1]/app-crm-shared-template[1]/p-dialog[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[3]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[13]/td[3]/p-checkbox[1]")
	WebElement selectNaics1;

	public WebElement selectNaics1() {
		return selectNaics1;		
	
	}
	@FindBy(xpath = "//body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-configurations[1]/div[1]/div[3]/div[1]/div[1]/div[1]/app-crm-account[1]/p-tabview[1]/div[1]/div[2]/p-tabpanel[2]/div[1]/app-crm-shared-template[1]/p-dialog[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[3]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[13]/td[4]/p-checkbox[1]")
	WebElement selectNaics2;

	public WebElement selectNaics2() {
		return selectNaics2;
	}
	@FindBy(xpath = "//body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-configurations[1]/div[1]/div[3]/div[1]/div[1]/div[1]/app-crm-account[1]/p-tabview[1]/div[1]/div[2]/p-tabpanel[2]/div[1]/app-crm-shared-template[1]/p-dialog[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[3]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[14]/td[3]/p-checkbox[1]")
	WebElement selectnotes1;

	public WebElement selectnotes1() {
		return selectnotes1;
	}
	@FindBy(xpath = "//body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-configurations[1]/div[1]/div[3]/div[1]/div[1]/div[1]/app-crm-account[1]/p-tabview[1]/div[1]/div[2]/p-tabpanel[2]/div[1]/app-crm-shared-template[1]/p-dialog[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[3]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[14]/td[4]/p-checkbox[1]")
	WebElement selectnotes2;

	public WebElement selectnotes2() {
		return selectnotes2;
	}
	
	///................Select Address Details..................///
	
	@FindBy(xpath = "//body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-configurations[1]/div[1]/div[3]/div[1]/div[1]/div[1]/app-crm-account[1]/p-tabview[1]/div[1]/div[2]/p-tabpanel[2]/div[1]/app-crm-shared-template[1]/p-dialog[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[4]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/p-checkbox[1]")
	WebElement selectStreetadress1;

	public WebElement selectStreetadress1() {
		return selectStreetadress1;
	
	}
	@FindBy(xpath = "//body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-configurations[1]/div[1]/div[3]/div[1]/div[1]/div[1]/app-crm-account[1]/p-tabview[1]/div[1]/div[2]/p-tabpanel[2]/div[1]/app-crm-shared-template[1]/p-dialog[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[4]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/p-checkbox[1]")
	WebElement selectStreetadress2;

	public WebElement selectStreetadress2() {
		return selectStreetadress2;
	}
	@FindBy(xpath = "//body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-configurations[1]/div[1]/div[3]/div[1]/div[1]/div[1]/app-crm-account[1]/p-tabview[1]/div[1]/div[2]/p-tabpanel[2]/div[1]/app-crm-shared-template[1]/p-dialog[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[4]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[3]/p-checkbox[1]")
	WebElement selectStreetadress21;

	public WebElement selectStreetadress21() {
		return selectStreetadress21;
	
	}
	@FindBy(xpath = "//body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-configurations[1]/div[1]/div[3]/div[1]/div[1]/div[1]/app-crm-account[1]/p-tabview[1]/div[1]/div[2]/p-tabpanel[2]/div[1]/app-crm-shared-template[1]/p-dialog[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[4]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[4]/p-checkbox[1]")
	WebElement selectStreetadress22;

	public WebElement selectStreetadress22() {
		return selectStreetadress22;
	}
	
	@FindBy(xpath = "//body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-configurations[1]/div[1]/div[3]/div[1]/div[1]/div[1]/app-crm-account[1]/p-tabview[1]/div[1]/div[2]/p-tabpanel[2]/div[1]/app-crm-shared-template[1]/p-dialog[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[4]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[3]/p-checkbox[1]")
	WebElement selectcountry1;

	public WebElement selectcountry1() {
		return selectcountry1;
	
	}
	@FindBy(xpath = "//body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-configurations[1]/div[1]/div[3]/div[1]/div[1]/div[1]/app-crm-account[1]/p-tabview[1]/div[1]/div[2]/p-tabpanel[2]/div[1]/app-crm-shared-template[1]/p-dialog[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[4]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[4]/p-checkbox[1]")
	WebElement selectcountry2;

	public WebElement selectcountry2() {
		return selectcountry2;
		
}
	
	@FindBy(xpath = "//body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-configurations[1]/div[1]/div[3]/div[1]/div[1]/div[1]/app-crm-account[1]/p-tabview[1]/div[1]/div[2]/p-tabpanel[2]/div[1]/app-crm-shared-template[1]/p-dialog[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[4]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[3]/p-checkbox[1]")
	WebElement selectstate1;

	public WebElement selectstate1() {
		return selectstate1;
	}
	@FindBy(xpath = "//body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-configurations[1]/div[1]/div[3]/div[1]/div[1]/div[1]/app-crm-account[1]/p-tabview[1]/div[1]/div[2]/p-tabpanel[2]/div[1]/app-crm-shared-template[1]/p-dialog[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[4]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[4]/p-checkbox[1]")
	WebElement selectstate2;

	public WebElement selectstate2() {
		return selectstate2;
	
	}
	
	@FindBy(xpath = "//body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-configurations[1]/div[1]/div[3]/div[1]/div[1]/div[1]/app-crm-account[1]/p-tabview[1]/div[1]/div[2]/p-tabpanel[2]/div[1]/app-crm-shared-template[1]/p-dialog[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[4]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[5]/td[3]/p-checkbox[1]")
	WebElement selectcity1;

	public WebElement selectcity1() {
		return selectcity1;
	
	}
	
	@FindBy(xpath = "//body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-configurations[1]/div[1]/div[3]/div[1]/div[1]/div[1]/app-crm-account[1]/p-tabview[1]/div[1]/div[2]/p-tabpanel[2]/div[1]/app-crm-shared-template[1]/p-dialog[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[4]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[5]/td[4]/p-checkbox[1]")
	WebElement selectcity2;

	public WebElement selectcity2() {
		return selectcity2;
	
	}
	
	@FindBy(xpath = "//body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-configurations[1]/div[1]/div[3]/div[1]/div[1]/div[1]/app-crm-account[1]/p-tabview[1]/div[1]/div[2]/p-tabpanel[2]/div[1]/app-crm-shared-template[1]/p-dialog[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[4]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[6]/td[3]/p-checkbox[1]")
	WebElement selectzipcode1;

	public WebElement selectzipcode1() {
		return selectzipcode1;
	
	}
	
	@FindBy(xpath = "//body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-configurations[1]/div[1]/div[3]/div[1]/div[1]/div[1]/app-crm-account[1]/p-tabview[1]/div[1]/div[2]/p-tabpanel[2]/div[1]/app-crm-shared-template[1]/p-dialog[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[4]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[6]/td[4]/p-checkbox[1]")
	WebElement selectzipcode2;

	public WebElement selectzipcode2() {
		return selectzipcode2;
	
	}
	
	@FindBy(xpath = "//body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-configurations[1]/div[1]/div[3]/div[1]/div[1]/div[1]/app-crm-account[1]/p-tabview[1]/div[1]/div[2]/p-tabpanel[2]/div[1]/app-crm-shared-template[1]/p-dialog[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[4]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[7]/td[3]/p-checkbox[1]")
	WebElement selectAttn1;

	public WebElement selectAttn1() {
		return selectAttn1;
	}
	
	@FindBy(xpath = "//body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-configurations[1]/div[1]/div[3]/div[1]/div[1]/div[1]/app-crm-account[1]/p-tabview[1]/div[1]/div[2]/p-tabpanel[2]/div[1]/app-crm-shared-template[1]/p-dialog[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[4]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[7]/td[4]/p-checkbox[1]")
	WebElement selectAttn2;

	public WebElement selectAttn2() {
		return selectAttn2;
	}
	
	@FindBy(xpath = "//body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-configurations[1]/div[1]/div[3]/div[1]/div[1]/div[1]/app-crm-account[1]/p-tabview[1]/div[1]/div[2]/p-tabpanel[2]/div[1]/app-crm-shared-template[1]/p-dialog[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[4]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[8]/td[3]/p-checkbox[1]")
	WebElement selectAdress1;

	public WebElement selectAdress1() {
		return selectAdress1;
	}
	@FindBy(xpath = "//body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-configurations[1]/div[1]/div[3]/div[1]/div[1]/div[1]/app-crm-account[1]/p-tabview[1]/div[1]/div[2]/p-tabpanel[2]/div[1]/app-crm-shared-template[1]/p-dialog[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[4]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[8]/td[4]/p-checkbox[1]")
	WebElement selectAdress2;

	public WebElement selectAdress2() {
		return selectAdress2;
}
	@FindBy(xpath = "//button[@class='p-element p-button p-component']")
	WebElement selectSave;

	public WebElement SelectSave() {
		return selectSave;
	
	}
	//.........Create Account Without Custom Filed.........//
	
	@FindBy(xpath = "//p-dropdown[@placeholder='Choose Channel']")
	WebElement Dropdownselectaccount;

	public WebElement DropdownSelectAccount() {
		return Dropdownselectaccount;
	
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
	
	@FindBy(xpath = "//td[normalize-space()='SName987']")
	WebElement Rightclickonaccountname;

	public WebElement RightClickonAccountname() {
		return Rightclickonaccountname;
	}
	
	@FindBy(xpath = "//span[text()='View']")
	WebElement viewaccountnamecustomfiled;

	public WebElement viewaccountnamecustomfiled() {
		return viewaccountnamecustomfiled;
	}
	
	@FindBy(xpath = "//h5[text()=' View Account ']")
	WebElement ViewAccountopt;

	public WebElement ViewAccountopt() {
		return ViewAccountopt;
	}
	
	@FindBy(xpath = "//span[text()='Delete']")
	WebElement deleteAccountopt;

	public WebElement DeleteAccountopt() {
		return deleteAccountopt;
	}
	@FindBy(xpath = "//span[text()='Yes']")
	WebElement yescustomfiled;

	public WebElement YesCustomFiled() {
		return yescustomfiled;
	}
	
	@FindBy(xpath = "//td[@class='ng-star-inserted'][2]")
	WebElement DeleteListedCase;

	public WebElement DeleteListedCase() {
		return DeleteListedCase;
	}	
	
	//...........ActivityLogs.......................//


@FindBy(xpath = "(//td[@class='ng-star-inserted'])[1]")
WebElement clickactivityaccount;

public WebElement clickactivityaccount() {
	return clickactivityaccount;
}


@FindBy(xpath = "//i[@class='pi pi-plus']")
WebElement Iconactivityaccount;

public WebElement Iconactivityaccount() {
	return Iconactivityaccount;
}

@FindBy(xpath = "//span[text()='Activity']")
WebElement Activitybtn;

public WebElement Activitybtn() {
	return Activitybtn;
}

@FindBy(xpath = "//li[@role=\"option\"]//div//div[text()='Email']")
WebElement Email;

public WebElement SelectEmail() {
	return Email;
}


@FindBy(xpath = "//div[@class=\"btnBars\"]//i[@class=\"pi pi-times\"]")
WebElement CloseAccountRecord;

public WebElement Corssbtn() {
	return CloseAccountRecord;
}



@FindBy(xpath = "//span[contains(@class,'btnBars')]//i[@class=\"pi pi-plus\"]")
WebElement AddLogs;

public WebElement AddLogsbtn() {
	return AddLogs;
}


@FindBy(xpath = "//div[@id=\"logType\"]//span")
WebElement LogsOptions;

public WebElement SelecttheLogs() {
	return LogsOptions;
}

@FindBy(xpath = "//p-tabpanel[@header=\"Opportunities\"]//tr//td//span[@class=\"hyper-link\"]")
WebElement ListedOpportunity;

public WebElement ListedOpportunityAccount() {
	return ListedOpportunity;
}

@FindBy(xpath = "//span[contains(@class,'btnBars')]//i[@class=\"pi pi-plus\"]")
WebElement AddOppty;

public WebElement AddOpportunity() {
	return AddOppty;
}

@FindBy(xpath = "//a[@role=\"tab\"]//span[text()='Opportunities']")
WebElement Oppty;

public WebElement Opportunity() {
	return Oppty;
}

@FindBy(xpath = "(//p-tabpanel[@header=\"Opportunities\"]//table//tbody//tr//td)[1]")
WebElement ListedAccountOpportunity;

public WebElement ListedAccountOpportunitys() {
	return ListedAccountOpportunity;
}


@FindBy(xpath = "//span[contains(@class,'p-element')]//i[@class=\"pi pi-eye\"]")
WebElement ViewOppty;

public WebElement ViewOpportunity() {
	return ViewOppty;
}

@FindBy(xpath = "//span[contains(@class,'p-element')]//i[@class=\"pi pi-pencil\"]")
WebElement EditOppty;

public WebElement EditOpportunity() {
	return EditOppty;
}

@FindBy(xpath = "//span[contains(@class,'p-element')]//i[@class=\"pi pi-pencil\"]")
WebElement DellOppty;

public WebElement DeleteOpportunity() {
	return DellOppty;
}




@FindBy(xpath = "//span[normalize-space()='Email']")
WebElement Emailactivityaccount;

public WebElement Emailactivityaccount() {
	return Emailactivityaccount;
}

@FindBy(xpath = "//div[contains(text(),'Gmail')]")
WebElement AgainEmailactivityaccount;

public WebElement AgainEmailactivityaccount() {
	return AgainEmailactivityaccount;
}

@FindBy(xpath = "//input[@type=\"email\"]")
WebElement usernameEmail;

public WebElement usernameEmail() {
	return usernameEmail;
}


@FindBy(xpath = "//span[normalize-space()='Next']")
WebElement Next1;

public WebElement Next1() {
	return Next1;
}

@FindBy(xpath = "//input[@name='password']")
WebElement usernamePass;

public WebElement usernamePass() {
	return usernamePass;
}
@FindBy(xpath = "//span[normalize-space()='Next']")
WebElement Next2;

public WebElement Next2() {
	return Next2;
}
	
@FindBy(xpath = "//span[normalize-space()='Continue']")
WebElement Continue;

public WebElement Continue() {
	return Continue;
}

//......................email fill ...............
@FindBy(xpath = "//input[@role='searchbox']")
WebElement To;

public WebElement To() {
	return To;
}


@FindBy(xpath = "//input[@id='subject']")
WebElement Subject;

public WebElement Subject() {
	return Subject;
}

@FindBy(xpath = "//div[@class='ql-editor ql-blank']")
WebElement WriteEmail;

public WebElement WriteEmail() {
	return WriteEmail;
}
@FindBy(xpath = "//span[normalize-space()='Send']")
WebElement Send;

public WebElement Send() {
	return Send;
}

//................Logs..........................

@FindBy(xpath = "//span[normalize-space()='Logs']")
WebElement ClickLogs;

public WebElement ClickLogs() {
	return ClickLogs;
}


@FindBy(xpath = "//p-dropdown[@id='logType']")
WebElement SelectLogtype;

public WebElement SelectLogtype() {
	return SelectLogtype;
}
@FindBy(xpath = "(//div[@data-placeholder=\"Enter your comment\"])[1]")
WebElement commentsLogs;

public WebElement commentsLogs() {
	return commentsLogs;
}


@FindBy(xpath = "(//div[@data-placeholder=\"Enter your comment\"])[2]")
WebElement NewcommentsLogs;

public WebElement EditcommentsLogs() {
	return NewcommentsLogs;
}

@FindBy(xpath = "//div[@class=\"activity-content\"]//h6")
WebElement OpenEmailLog;

public WebElement OpenEmailLogs() {
	return OpenEmailLog;
}


@FindBy(xpath = "//span[contains(@class,'btnBars ')]//i[@class=\"pi pi-pencil\"]")
WebElement EditLog;

public WebElement EditLogs() {
	return EditLog;
}



@FindBy(xpath = "//span[contains(text(),'Choose')]")
WebElement Attachements;

public WebElement Attachements() {
	return Attachements;
}

@FindBy(xpath = "//span[normalize-space()='Save']")
WebElement SaveLogs;

public WebElement SaveLogs() {
	return SaveLogs;
}

@FindBy(xpath = "(//span[text()='Save'])[2]")
WebElement SaveEditLogs;

public WebElement SaveEditLog() {
	return SaveEditLogs;
}

@FindBy(xpath ="(//span[contains(@class,'btnBars')]//i[@class=\"pi pi-trash\"])[1]")
WebElement DeleteLogs;

public WebElement DeleteLogs() {
	return DeleteLogs;
}

@FindBy(xpath = "//button[@type=\"button\"]//span[text()='Yes']")
WebElement Comfirmed;

public WebElement YesDeleteLogs() {
	return Comfirmed;
}

//Edit Log
@FindBy(xpath = "(//div[@class='activity-icon bg-log p-shadow-3 ng-star-inserted'])[1]")
WebElement clickEditLogbtn;

public WebElement clickEditLogbtn() {
	return clickEditLogbtn;
}

@FindBy(xpath = "//i[@class='pi pi-pencil']")
WebElement Elogs;

public WebElement Elogs() {
	return Elogs;
}




@FindBy(xpath = "//textarea[@class='p-inputtextarea p-inputtext p-component p-element ng-untouched ng-pristine ng-valid']")
WebElement Clogs;

public WebElement Clogs() {
	return Clogs;
}

@FindBy(xpath = "//span[normalize-space()='Save']")
WebElement Slogs;

public WebElement Slogs() {
	return Slogs;
}

//...........ActivityNotes.......................//


@FindBy(xpath = "//span[normalize-space()='Notes']")
WebElement NotesL;

public WebElement NotesL() {
	return NotesL;
}


@FindBy(xpath = "//textarea[@id='comment']")
WebElement NotesC;

public WebElement NotesC() {
	return NotesC;
}

@FindBy(xpath = "//input[@type=\"file\"]")
WebElement NotesAttachements;

public WebElement NotesAttachements() {
	return NotesAttachements;
}

@FindBy(xpath = "//span[normalize-space()='Save']")
WebElement NotesS;

public WebElement NotesS() {
	return NotesS;
}
//.............Edit Notes....................//

@FindBy(xpath = "(//span[@class='pi pi-user-edit'])[1]")
WebElement EditN;

public WebElement EditN() {
	return EditN;
}

@FindBy(xpath = "//i[@class='pi pi-pencil']")
WebElement EditI;

public WebElement EditI() {
	return EditI;
}

@FindBy(xpath = "//textarea[@class='p-inputtextarea p-inputtext p-component p-element ng-untouched ng-pristine ng-valid']")
WebElement EditC;

public WebElement EditC() {
	return EditC;
}

@FindBy(xpath = "//span[normalize-space()='Save']")
WebElement EditS;

public WebElement EditS() {
	return EditS;
}

//...............AllActivityList......................//

@FindBy(xpath = "(//span[@class='btnBars p-mr-0 p-ml-2'])[1]")
WebElement AllActivityClick;

public WebElement AllActivityClick() {
	return AllActivityClick;
}

@FindBy(xpath = "(//div[@role='button']//ancestor::p-dropdown)[4]")
WebElement MostRecentdrp;

public WebElement MostRecentdrp() {
	return MostRecentdrp;
}



@FindBy(xpath = "(//div[@class='activity-content'])[1]//i")
WebElement Favourite1;

public WebElement Favourite1() {
	return Favourite1;
}

@FindBy(xpath = "(//div[@class='activity-content'])[2]//i")
WebElement Favourite2;

public WebElement Favourite2() {
	return Favourite2;
}


//................CheckAllActivity.................//

@FindBy(xpath = "(//span[@class='btnBars p-mr-0'])[1]")
WebElement CheckAllActivityicon;

public WebElement CheckAllActivityicon() {
	return CheckAllActivityicon;
}


@FindBy(xpath = "//span[normalize-space()='User Activity']")
WebElement UserActivity;

public WebElement UserActivity() {
	return UserActivity;
}
@FindBy(xpath = "//span[normalize-space()='System Activity']")
WebElement SystemActivity;

public WebElement SystemActivity() {
	return SystemActivity;
}


@FindBy(xpath = "//span[normalize-space()='Favorite']")
WebElement FavouriteActivity;

public WebElement FavouriteActivity() {
	return FavouriteActivity;
}
///......................Import..............................///

@FindBy(xpath = "//span[normalize-space()='List']")
WebElement clickList;

public WebElement ClickList() {
	return clickList;
}

@FindBy(xpath = "//span[text()='Import']")
WebElement clickImport;

public WebElement clickImport() {
	return clickImport;
}

@FindBy(xpath = "//input[@type=\"file\"]")
WebElement ChooseFile;

public WebElement ChooseFile() {
	return ChooseFile;
}

//@FindBy(xpath = "//span[text()='Next']")
//WebElement Next;
//
//public WebElement Next() {
//	return Next;
//}

@FindBy(xpath = "//span[text()='Upload']")
WebElement clickUpload;

public WebElement ClickUpload() {
	return clickUpload;
}

@FindBy(xpath = "//span[@class='pi pi-refresh']")
WebElement LoadConfig;

public WebElement LoadConfig() {
	return LoadConfig;
}
@FindBy(xpath = "//span[text()='Custom_Append']//parent::*//div[2]")
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

public WebElement ClickBBox() {
	return ClickBBox;
}

@FindBy(xpath = "(//div[@class='p-radiobutton-box'])[2]")
WebElement AddUpdate;

public WebElement AddUpdate() {
	return AddUpdate;
}

///.............Export................................//

@FindBy(xpath = "//span[text()='Export']")
WebElement ExportClick;

public WebElement ExportClick() {
	return ExportClick;
}

@FindBy(xpath = "(//span[text()='Export'])[2]")
WebElement ExportClick2;

public WebElement ExportClick2() {
	return ExportClick2;
}
@FindBy(xpath = "//span[text()='Yes']")
WebElement Yes1;

public WebElement Yes1() {
	return Yes1;
}


@FindBy(xpath = "//span[text()='A_CustomInput']//parent::*//div[2]")
WebElement ClickCustomBox;

public WebElement ClickCustomBox() {
	return ClickCustomBox;
	
	
}


//......................import profile..................................//


@FindBy(xpath="//a[@id='user-display']//img[@alt='main logo']")
WebElement ProfileClick;

public WebElement ProfileClick() {
	return ProfileClick;
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

@FindBy(xpath="(//span[@ptooltip='Logs'])[1]//parent::span")
WebElement Replay1;

public WebElement Replay1() {
	return Replay1;
}
@FindBy(xpath="//tbody/tr[1]/td[8]")
WebElement ClickImportedFile;

public WebElement ClickImportedFile() {
	return ClickImportedFile;
}
@FindBy(xpath="//span[text()='Save']")
WebElement Save56;

public WebElement Save56() {
	return Save56;
}
@FindBy(xpath="//div[@class='p-dialog-header-icons ng-tns-c92-75']")
WebElement Clickcross;

public WebElement Clickcross() {
	return Clickcross;
}



@FindBy(xpath="(//span[@class='btnBars p-mr-0 ng-star-inserted'])[1]")
WebElement importPlus;

public WebElement importPlus() {
	return importPlus;
}


@FindBy(xpath="//p-dropdown[@placeholder='Select Module']")
WebElement ModuleName1;

public WebElement ModuleName1() {
	return ModuleName1;
}

@FindBy(xpath="//p-dropdown[@placeholder='Select Channel']")
WebElement ChannelName1;

public WebElement ChannelName1() {
	return ChannelName1;
}


@FindBy(xpath="(//div[@class='p-radiobutton-box'])[1]")
WebElement Update;

public WebElement Update() {
	return Update;
}

@FindBy(xpath="(//span[text()='Contacts'])[2]")
WebElement Contacts;

public WebElement Contacts() {
	return Contacts;
}
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

@FindBy(xpath="//span[normalize-space()='Tasks']")
WebElement AccountTask;

public WebElement AccountTask() {
	return AccountTask;
}

@FindBy(xpath="(//span[@class='btnBars'])[2]")
WebElement AddPlus;

public WebElement AddPlus() {
	return AddPlus;
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

@FindBy(xpath = "//span[contains(text(),'Show More')]")
WebElement btnShowMore;

public WebElement clickShowMore() {
	return btnShowMore;
}
@FindBy(xpath = "//span[text()='Save']")
WebElement SaveA;

public WebElement SaveA() {
	return SaveA;
}
@FindBy(xpath="//p-dropdown[@placeholder='Case Association']")
WebElement drpCaseAssociation;

public WebElement selectCaseAssociation() {
	return drpCaseAssociation;
}

@FindBy(xpath="//input[@placeholder='Search by name']")
WebElement txtSearchbyname;

public WebElement setAssociationName() {
	return txtSearchbyname;
}

@FindBy(xpath="//input[@name='contactNames']")
WebElement txtcontactNames;

public WebElement setcontactNames() {
	return txtcontactNames;
}

@FindBy(xpath="//input[@name='emailAddressSuggestion']")
WebElement txtEmailAddress;

public WebElement setEmailAddress() {
	return txtEmailAddress;
}

@FindBy(xpath="//input[@name='phoneNumberSuggestion']")
WebElement txtPhoneNumber;

public WebElement setPhoneNumber() {
	return txtPhoneNumber;
}
@FindBy(xpath="//p-dropdown[@placeholder='Select Source']")
WebElement drpSelectSource;

public WebElement selectSelectSource() {
	return drpSelectSource;
}

@FindBy(xpath="//p-dropdown[@placeholder='Select Category']")
WebElement drpSelectCategory;

public WebElement selectCategory() {
	return drpSelectCategory;
}

@FindBy(xpath="//p-dropdown[@placeholder='Select Sub Category']")
WebElement drpSelectSubCategory;

public WebElement selectSubCategory() {
	return drpSelectSubCategory;
}

@FindBy(xpath="//p-dropdown[@placeholder='Select Priority']")
WebElement drpSelectPriority;

public WebElement SelectPriority() {
	return drpSelectPriority;
}


@FindBy(xpath="//input[@name='subject']")
WebElement txtSubject;

public WebElement setSubject() {
	return txtSubject;
}


@FindBy(xpath="//span[contains(text(),'Choose')]")
WebElement chooseFile;

public WebElement chooseFile() {
	return chooseFile;
}


@FindBy(xpath="//textarea[@name='description']")
WebElement txtDescription;

public WebElement setCaseDeatils() {
	return txtDescription;
}

@FindBy(xpath="//p-calendar[@formcontrolname='resolutionDate']")
WebElement calenderesolutionDate;

public WebElement setResolutionDate() {
	return calenderesolutionDate;
}


@FindBy(xpath="//p-dropdown[@placeholder='Select Groups']")
WebElement drpSelectGroups;

public WebElement SelectGroups() {
	return drpSelectGroups;
}


@FindBy(xpath="//p-dropdown[@placeholder='Select Users']")
WebElement drpSelectUsers;

public WebElement SelectUsers() {
	return drpSelectUsers;
}

@FindBy(xpath="//*[@label='Save']")
WebElement btnSaveLead;

public WebElement clickSubmit() {
	return btnSaveLead;
}
@FindBy(xpath = "//input[@type='file']")
WebElement SharedFiles;

public WebElement attachSharedFiles() {
return SharedFiles;
   }
@FindBy(xpath="//tbody//tr[1]")
WebElement listedCases;

public WebElement addedCase() {
	return listedCases;
}

@FindBy(xpath="(//span[@class='p-tabview-title ng-star-inserted'][normalize-space()='Opportunities'])[1]")
WebElement opp;

public WebElement opp() {
	return opp;
}

@FindBy(xpath="(//span[@class='btnBars ng-star-inserted'])[1]")
WebElement AddPlus1;

public WebElement AddPlus1() {
	return AddPlus1;
}

@FindBy(xpath = "(//span[contains(text(),'Opportunities')])[1]")
WebElement btnOpportunity;

public WebElement clickOpportunity() {
	return btnOpportunity;
}


@FindBy(xpath = "//span[text()='New']")
WebElement btnAddOpportunity;

public WebElement clickAddOpportunity() {
	return btnAddOpportunity;
}

@FindBy(xpath = "//input[@placeholder='Opportunity Name']")
WebElement txtOpportunityName;

public WebElement setOpportunityName() {
	return txtOpportunityName;
}

@FindBy(xpath = "(//input[@name='accountNameEdit'])[1]")
WebElement txtAccountname;

public WebElement setAccountname() {
	return txtAccountname;
}

@FindBy(xpath = "(//span[@id='pr_id_13_label'])[1]")
WebElement drpOwner;

public WebElement selectOwner() {
	return drpOwner;
}

@FindBy(xpath = "//input[@name='contactNames']")
WebElement txtContactNames;

public WebElement ContactNames() {
	return txtContactNames;
}

@FindBy(xpath = "//input[@name='contactEmail']")
WebElement txtContactEmail;

public WebElement setContactEmail() {
	return txtContactEmail;
}

@FindBy(xpath = "//input[@name='contactPhone']")
WebElement txtcontactPhone;

public WebElement setcontactPhone() {
	return txtcontactPhone;
}

@FindBy(xpath = "(//p-dropdown[@id='ratingEdit'])[1]")
WebElement drpQuality;

public WebElement selectQuality() {
	return drpQuality;
}

@FindBy(xpath = "(//p-dropdown[@id='sourceEdit'])[1]")
WebElement drpSource;

public WebElement selectSource() {
	return drpSource;
}

@FindBy(xpath = "(//p-calendar[@id='closeDateAdd'])[1]")
WebElement drpClosedate;

public WebElement selectClosedate() {
	return drpClosedate;
}

@FindBy(xpath = "(//p-dropdown[@id='stagesAdd'])[1]")
WebElement drpStage;

public WebElement selectStage() {
	return drpStage;
}

@FindBy(xpath = "//input[@name='repConfidence']")
WebElement textRepConfidence;

public WebElement setRepConfidence() {
	return textRepConfidence;
}

@FindBy(xpath = "//input[@name=\"totalAmount\"]")
WebElement textTotalAmount;

public WebElement setTotalAmount() {
	return textTotalAmount;
}

@FindBy(xpath = "(//textarea[@name='description'])[1]")
WebElement textNotes;

public WebElement setNotes() {
	return textNotes;
}

@FindBy(xpath = "//span[@class='p-button-icon pi pi-plus']")
WebElement btnPlusIcon;

public WebElement clickPlusIcon() {
	return btnPlusIcon;
}

@FindBy(xpath = "(//p-dropdown[@id='productChannels'])[1]")
WebElement drpProductList;

public WebElement selectProductList() {
	return drpProductList;
}
@FindBy(xpath = "//input[@placeholder=\"Global Search\"]")
WebElement globalSearch;

public WebElement GloabalSearch() {
	return globalSearch;
}

@FindBy(xpath = "//span[text()='Save']")
WebElement btnSave;

public WebElement clickSave() {
	return btnSave;
}

@FindBy(xpath = "(//span[text()='Save'])[2]")
WebElement Save2;

public WebElement SecondSaveButton() {
	return Save2;
}

@FindBy(xpath = "//span[text()='Add']")
WebElement btnAdd;

public WebElement clickAdd() {
	return btnAdd;
}
//........................column setting......................//

@FindBy(xpath = "//span[normalize-space()='Settings']")
WebElement Setting;

public WebElement Setting() {
	return Setting;	
}



@FindBy(xpath = "//h6[normalize-space()='Contact Details']")
WebElement contact;

public WebElement contact() {
	return contact;	
}



@FindBy(xpath = "//h6[normalize-space()='Account Details']")
WebElement Account;

public WebElement Account() {
	return Account;	
}


@FindBy(xpath = "//h6[normalize-space()='Address Details']")
WebElement Adress;

public WebElement Adress() {
	return Adress;	
}


@FindBy(xpath = "//span[text()='Street Address 1']//parent::*//div[2]")
WebElement StreetAdress;

public WebElement StreetAdress() {
	return StreetAdress;	
}


@FindBy(xpath = "//span[text()='Last Name']//parent::*//div[2]")
WebElement LastnameCheckbox;

public WebElement LastnameCheckbox() {
	return LastnameCheckbox;	
}

@FindBy(xpath = "//span[text()='Middle Initial']//parent::*//div[2]")
WebElement Middlename;

public WebElement Middlename() {
	return Middlename;	
}


@FindBy(xpath = "//span[text()='First Name']//parent::*//div[2]")
WebElement FirstName;

public WebElement FirstName() {
	return FirstName;	
}






@FindBy(xpath = "//span[text()='Timezone']//parent::*//div[2]")
WebElement Timezone;

public WebElement Timezone() {
	return Timezone;	
}

@FindBy(xpath = "//span[text()='Account Type(s)']//parent::*//div[2]")
WebElement AccountType;

public WebElement AccountType() {
	return AccountType;	
}

@FindBy(xpath = "//a[normalize-space()='Details View Block']")
WebElement DViewBlock;

public WebElement DViewBlock() {
	return DViewBlock;	
}


@FindBy(xpath = "//h6[normalize-space()='Account Information']")
WebElement AccountInfo;

public WebElement AccountInfo() {
	return AccountInfo;	
}


@FindBy(xpath = "//h6[normalize-space()='Address Details']")
WebElement AdressDetail;

public WebElement AdressDetail() {
	return AdressDetail;	
}







@FindBy(xpath = "//span[text()='Attn.']//parent::*//div[2]")
WebElement Attncheckbox;

public WebElement Attncheckbox() {
	return Attncheckbox;	
}



@FindBy(xpath = "//span[text()='Address']//parent::*//div[2]")
WebElement Adresscheckbox;

public WebElement Adresscheckbox() {
	return Adresscheckbox;	
}



@FindBy(xpath = "//span[text()='NAICS Code']//parent::*//div[2]")
WebElement NAICSCodecheckbox;

public WebElement NAICSCodecheckbox() {
	return NAICSCodecheckbox;	
}


@FindBy(xpath = "//span[text()='Tax ID (EIN)']//parent::*//div[2]")
WebElement TaxIdcheckbox;

public WebElement TaxIdcheckbox() {
	return TaxIdcheckbox;	
}

@FindBy(xpath = "//span[text()='Account No.']//parent::*//div[2]")
WebElement Accountnocheckbox;

public WebElement Accountnocheckbox() {
	return Accountnocheckbox;	
}

@FindBy(xpath = "//span[text()='Account Type(s)']//parent::*//div[2]")
WebElement AccountTypesCheckbox;

public WebElement AccountTypesCheckbox() {
	return AccountTypesCheckbox;	
}



@FindBy(xpath = "//span[text()='Parent Account']//parent::*//div[2]")
WebElement ParentAccount;

public WebElement ParentAccount() {
	return ParentAccount;	
}


@FindBy(xpath = "//span[text()='First Name']//parent::*//div[2]")
WebElement FirstNamecheckbox;

public WebElement FirstNamecheckbox() {
	return FirstNamecheckbox;	
}


@FindBy(xpath = "//span[text()='SIC Code']//parent::*//div[2]")
WebElement Siccode;

public WebElement Siccode() {
	return Siccode;	
	
	
}	
	
//	================================================Updated POM===========================================
	
@FindBy(xpath = "//span[text()='Action']")
WebElement btnAction;

public WebElement ActionButton() {
	return btnAction;	
}
@FindBy(xpath="//input[@placeholder=\"Search...\"]")
WebElement btnSearch;

public WebElement Search() {
	return btnSearch;
	}

@FindBy(xpath="//tbody//tr[1]//td[3]")
WebElement listedAccount;

public WebElement ListedAccount() {
	return listedAccount;
	}
@FindBy(xpath="//p-dropdown[@optionlabel=\"name\"]//div[@id=\"logType\"]")
WebElement SelectType;

public WebElement SelectLogsType() {
	return SelectType;
	}


@FindBy(xpath="//p-dropdownitem[@class=\"p-element ng-star-inserted\"]//div[text()='Note']")
WebElement LogsNotes;

public WebElement AddNotes() {
	return LogsNotes;
	}

@FindBy(xpath="//p-dropdownitem[@class=\"p-element ng-star-inserted\"]//div[text()='Field Visit']")
WebElement LogsFieldVisit;

public WebElement LogsFieldVisits() {
	return LogsFieldVisit;
	}


@FindBy(xpath="//p-dropdownitem[@class=\"p-element ng-star-inserted\"]//div[text()='Mobile']")
WebElement LogsMobile;

public WebElement LogsMobiles() {
	return LogsMobile;
	}

@FindBy(xpath="//p-dropdownitem[@class=\"p-element ng-star-inserted\"]//div[text()='Work']")
WebElement LogsWork;

public WebElement LogsWorks() {
	return LogsWork;
	}


@FindBy(xpath="//div[@id=\"subLogType\"]//div//div")
WebElement SubType;

public WebElement SubTypes() {
	return SubType;
	}

@FindBy(xpath="//li[@role=\"option\"]//div[text()='Outbound Call']")
WebElement SubTypeOutbond;

public WebElement Outbond() {
	return SubTypeOutbond;
	}


@FindBy(xpath = "//span[text()='Inactive Account']")
WebElement BtnInactiveAccount;

public WebElement InactiveAccount() {
	return BtnInactiveAccount;
}

@FindBy(xpath = "//span[text()='Active Account']")
WebElement BtnActiveAccount;

public WebElement ActiveAccount() {
	return BtnActiveAccount;
}

@FindBy(xpath = "//p-multiselect[@id='inActivatingReason']")
WebElement SelectOneReason;

public WebElement SelectOneReason() {
	return SelectOneReason;
}
@FindBy(xpath = "//p-multiselect[@id=\"activatingReason\"]")
WebElement SelectActiveReason;

public WebElement SelectActiveReason() {
	return SelectActiveReason;
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

@FindBy(xpath = "//span[text()='InActive']")
WebElement ClickOninActive;

public WebElement ClickInActive() {
	return ClickOninActive;
}




@FindBy(xpath = "//span[text()='Make Copy']")
WebElement btnCopy;

public WebElement Copy() {
	return btnCopy;
}

@FindBy(xpath = "//span[text()='Move Account']")
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

@FindBy(xpath = "//button[@type=\"button\"]//span[text()='Next']")
WebElement btnNext;

public WebElement Next() {
	return btnNext;
}
@FindBy(xpath = "//span[text()='Next']")
WebElement AgainbtnNext;

public WebElement AgainNext() {
	return AgainbtnNext;
}



@FindBy(xpath = "//input[@formcontrolname=\"contactSocialFacebook\"]")
WebElement contactFacbook;

public WebElement contactFacbook() {
	return contactFacbook;
}

@FindBy(xpath = "//input[@formcontrolname=\"contactSocialTwitter\"]")
WebElement contactTwitter;

public WebElement contactTwitter() {
	return contactTwitter;
}

@FindBy(xpath = "//input[@formcontrolname=\"contactSocialLinkedIn\"]")
WebElement contactLinkedin;

public WebElement contactLinkedin() {
	return contactLinkedin;
}

@FindBy(xpath = "//input[@formcontrolname=\"contactSocialInstagram\"]")
WebElement contactInstagram;

public WebElement contactInstagram() {
	return contactInstagram;
}


@FindBy(xpath = "//input[@formcontrolname=\"contactSocialWebsite\"]")
WebElement contactWebsite;

public WebElement contactWebsite() {
	return contactWebsite;
}


@FindBy(xpath = "//input[@formcontrolname=\"accountSocialInstagram\"]")
WebElement instagram;

public WebElement instagram() {
	return instagram;
}

@FindBy(xpath = "//input[@formcontrolname=\"accountSocialLinkedIn\"]")
WebElement linkedin;

public WebElement linkedin() {
	return linkedin;
}

@FindBy(xpath = "//input[@formcontrolname=\"accountSocialFacebook\"]")
WebElement facebook;

public WebElement facebook() {
	return facebook;
}

@FindBy(xpath = "//input[@formcontrolname=\"accountSocialTwitter\"]")
WebElement twitter;

public WebElement twitter() {
	return twitter;
}

@FindBy(xpath = "//input[@formcontrolname=\"accountSocialWebsite\"]")
WebElement Website;

public WebElement Website() {
	return Website;
}

@FindBy(xpath = "//p-dropdown[@formcontrolname=\"accountPhoneCountry\"]")
WebElement accountPhoneCountry;

public WebElement accountPhoneCountry() {
	return accountPhoneCountry;
}

@FindBy(xpath = "//p-inputmask[@formcontrolname=\"accountPhone\"]//input")
WebElement accountPhone;

public WebElement accountPhone() {
	return accountPhone;
}

}
	
	
	
	
	
