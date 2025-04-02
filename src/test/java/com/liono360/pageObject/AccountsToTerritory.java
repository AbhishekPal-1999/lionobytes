package com.liono360.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountsToTerritory {
WebDriver ldriver;
	
	public AccountsToTerritory (WebDriver driver) {
		
		ldriver = driver;
		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath = "//span[text()='Accounts']")
	WebElement CbtnAccount1;

	public WebElement clickAccounts1() {
		return CbtnAccount1;	
	
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
	@FindBy(xpath = "//input[@formcontrolname='foundedYear']")
    WebElement Foundedyear;
	
	public WebElement FoundedYear() {
	return Foundedyear;	
}
	@FindBy(xpath = "//span[text()='Accounting and Tax Preparation']")
    WebElement Industrys;
	
	public WebElement IndustrysI() {
	return Industrys;	
	}
	@FindBy(xpath = "//input[@formcontrolname='accountEmail']")
    WebElement Accountemailshubham;
	
	public WebElement AccountEmailShubham() {
	return Accountemailshubham;	
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
	//@FindBy(xpath = "//div[text()='Select Jan Multiselects']//ancestor::p-multiselect")
   // WebElement janmultiselect;
	
	//public WebElement JanMultiselect() {
	//return janmultiselect;	
	//}
	@FindBy(xpath="//span[text()='Select abc test 3']//ancestor::p-dropdown")
	 WebElement abctest3;
	
	public WebElement Abctest() {
		return abctest3;	
//	}
//	@FindBy(xpath="(//input[@type='text'])[63]")
	// WebElement Testsinp;
	
	//public WebElement TestSInp() {
	//	return Testsinp;	
	
	//}
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
//	@FindBy(xpath = "//p-dropdown[@placeholder='Select Country']")
 //   WebElement countrys;
	
//	public WebElement Countrys() {
	//return countrys;
//}
//	@FindBy(xpath = "//p-dropdown[@placeholder='Select State']")
  //  WebElement states;
	
	//public WebElement States() {
	//return states;
//}
//	@FindBy(xpath = "//p-dropdown[@placeholder='Select City']")
   // WebElement citys;
	
	//public WebElement Citys() {
	//return citys;
//}
//	@FindBy(xpath = "//input[@name='zipcode']")
 //   WebElement Zippostalcode;
	
//	public WebElement ZipPostalCode() {
	//return Zippostalcode;
//}
//	@FindBy(xpath = "//p-dropdown[@placeholder='Select Attn']")
  //  WebElement attn;
//	
//	public WebElement Attn() {
	//return attn;
//}
	
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

	
	
	@FindBy(xpath = "//span[text()='FSM']")
    WebElement ClickFsm;
	
	public WebElement ClickFsm() {
	return ClickFsm;
}
	
	@FindBy(xpath = "//span[text()='Territory']")
    WebElement ClickTerritory;
	
	public WebElement ClickTerritory() {
	return ClickTerritory;
}

	@FindBy(xpath = "(//button[@type='button'])[1]")
    WebElement ClickIndaiaIcon;
	
	public WebElement ClickIndaiaIcon() {
	return ClickIndaiaIcon;
}
	
	
	@FindBy(xpath = "//span[text()=' Akbk ']")
    WebElement ClickAkBk;
	
	public WebElement ClickAkBk() {
	return ClickAkBk;
}
	
	@FindBy(xpath = "//span[text()='Assign']")
    WebElement ClickAssign;
	
	public WebElement ClickAssign() {
	return ClickAssign;
}	
	
	
	
	
}
	

