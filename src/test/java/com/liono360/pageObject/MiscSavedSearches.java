package com.liono360.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MiscSavedSearches {
	
	WebDriver ldriver;

	public MiscSavedSearches(WebDriver driver) {
		ldriver = driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//span[text()='Misc.']")
	WebElement Miscbtn;
	public WebElement Miscbtn() {
		return Miscbtn;
	}
	@FindBy(xpath = "//span[text()='Saved Searches']")
	WebElement ClickSavedS;
	public WebElement ClickSavedS() {
		return ClickSavedS;
	}
	
	@FindBy(xpath = "//span[text()='Saved Searches']")
	WebElement btnSaved;
	public WebElement Savedsearch() {
		return btnSaved;
	}
	@FindBy(xpath = "//span[text()='New']")
	WebElement Newbtn;
	public WebElement Newbtn() {
		return Newbtn;
	}
	@FindBy(xpath = "(//input[@type='text'])[4]")
	WebElement Name;
	public WebElement Name() {
		return Name;
	}
	@FindBy(xpath = "//p-multiselect[@name='selectedUser']")
	WebElement AccessPermission;

	public WebElement AccessPermission() {
		return AccessPermission;
	}
	@FindBy(xpath = "//p-multiselect[@name='selectedUser']")
	WebElement AccessPermission1;

	public WebElement AccessPermission1() {
		return AccessPermission1;
	}
	
	
	@FindBy(xpath = "//p-dropdown[@id='parentModules']")
	WebElement Module;

	public WebElement Module() {
		return Module;
	}
	@FindBy(xpath = "//p-dropdown[@id='parentTemplate']")
	WebElement Template;

	public WebElement Template() {
		return Template;
	}
	@FindBy(xpath = "(//span[@class='pi pi-plus p-button-icon ng-star-inserted'])[1]")
	WebElement PlusC;

	public WebElement PlusC() {
		return PlusC;
	}
	@FindBy(xpath = "//p-dropdown[@id='ruleFilter']")
	WebElement Filter;

	public WebElement Filter() {
		return Filter;
	}
	@FindBy(xpath = "//p-multiselect[@placeholder='Select Items']")
	WebElement Value;

	public WebElement Value() {
		return Value;
	}
	@FindBy(xpath = "(//span[text()='Save'])[2]")
	WebElement Save1;

	public WebElement Save1() {
		return Save1;
	}
	@FindBy(xpath = "(//span[text()='Save'])[1]")
	WebElement Save2;

	public WebElement Save2() {
		return Save2;
	}
	@FindBy(xpath = "//p-dropdown[@placeholder='select']")
	WebElement Operator;

	public WebElement Operator() {
		return Operator;
	}
	
	
	
	@FindBy(xpath = "(//p-dropdown[@placeholder='select'])[1]//parent::p-dropdown")
	WebElement Operator52;

	public WebElement Operator52() {
		return Operator52;
	}
	
	
	@FindBy(xpath = "(//p-dropdown[@placeholder='select'])[2]//parent::p-dropdown")
	WebElement Operator53;

	public WebElement Operator53() {
		return Operator53;
	}
	
	
	
	@FindBy(xpath = "(//td[@class='ng-star-inserted'])[1]")
	WebElement ClickNameopt;

	public WebElement ClickNameopt() {
		return ClickNameopt;
	}
	
	@FindBy(xpath = "//span[text()='Query']")
	WebElement List;

	public WebElement List() {
		return List;
	}	
	@FindBy(xpath = "//p-dropdown[@id='accountChannels']")
	WebElement AccountChannel;

	public WebElement AccountChannel() {
		return AccountChannel;
	}	
	@FindBy(xpath = "//span[text()='Select address']")
	WebElement SelectAdress;

	public WebElement SelectAdress() {
		return SelectAdress;
	
	}
	@FindBy(xpath = "//input[@placeholder='Enter a location']")
	WebElement Location;

	public WebElement Location() {
		return Location;
	
	}	
	@FindBy(xpath = "//input[@placeholder='In miles']")
	WebElement Radius;

	public WebElement Radius() {
		return Radius;
	
	}
	@FindBy(xpath = "(//span[text()='Save'])[3]")
	WebElement Save3;

	public WebElement Save3() {
		return Save3;
	
	}
	@FindBy(xpath = "(//input[@type='text'])[4]")
	WebElement Name2;

	public WebElement Name2() {
		return Name2;
}
	@FindBy(xpath = "//i[@class='pi pi-times']")
	WebElement Xcross;

	public WebElement Xcross() {
		return Xcross;
}
	@FindBy(xpath = "//input[@placeholder='Enter']")
	WebElement Value1;

	public WebElement Value1() {
		return Value1;
}
	
	
	@FindBy(xpath = "(//input[@placeholder='Enter'])[2]")
	WebElement Value120;

	public WebElement Value120() {
		return Value120;
}
	
	
	
	
	
	
	
	@FindBy(xpath = "//input[@placeholder='Enter']")
	WebElement SpaceValue1;

	public WebElement SpaceValue1() {
		return SpaceValue1;
}
	
	
	@FindBy(xpath = "//span[text()='Select Address & Radius']")
	WebElement SelectRadiusAdress;

	public WebElement SelectRadiusAdress() {
		return SelectRadiusAdress;
}
	
	@FindBy(xpath = "(//span[text()='Save'])[2]")
	WebElement RadiusSave;

	public WebElement RadiusSave() {
		return RadiusSave;
}
		
	
	//.................................plus.............................//
	
	
	@FindBy(xpath = "//i[@class='pi pi-plus']")
	WebElement ClickPlus;

	public WebElement ClickPlus() {
		return ClickPlus;
}
	
	
	@FindBy(xpath = "(//span[text()='Save'])[2]")
	WebElement ASave;

	public WebElement ASave() {
		return ASave;
}
	
	
	@FindBy(xpath = "//i[@class='pi pi-pencil']")
	WebElement Cpencil;

	public WebElement Cpencil() {
		return Cpencil;
}
		

	//............................choice...........................................//
	
	
	@FindBy(xpath = "(//span[text()='And'])[1]")
	WebElement Choice1;

	public WebElement Choice1() {
		return Choice1;
}
	
	
	@FindBy(xpath = "(//span[text()='And'])[1]")
	WebElement Choice2;

	public WebElement Choice2() {
		return Choice2;
}
	
	
	@FindBy(xpath = "(//span[text()='And'])[1]")
	WebElement Choice3;

	public WebElement Choice3() {
		return Choice3;
}
	@FindBy(xpath = "(//span[text()='And'])[1]")
	WebElement Choice4;

	public WebElement Choice4() {
		return Choice4;
}
	@FindBy(xpath = "(//span[text()='And'])[1]")
	WebElement Choice5;

	public WebElement Choice5() {
		return Choice5;
}
	@FindBy(xpath = "(//span[text()='And'])[1]")
	WebElement Choice6;

	public WebElement Choice6() {
		return Choice6;
}
	@FindBy(xpath = "(//span[text()='And'])[1]")
	WebElement Choice7;

	public WebElement Choice7() {
		return Choice7;
}
	@FindBy(xpath = "(//span[text()='And'])[1]")
	WebElement Choice8;

	public WebElement Choice8() {
		return Choice8;
}
	@FindBy(xpath = "(//span[text()='And'])[1]")
	WebElement Choice9;

	public WebElement Choice9() {
		return Choice9;
}
	@FindBy(xpath = "(//span[text()='And'])[1]")
	WebElement Choice10;

	public WebElement Choice10() {
		return Choice10;
}
	
	//...........................Filter................................................//
	@FindBy(xpath = "(//p-dropdown[@id='ruleFilter'])[2]")
	WebElement Filter1;

	public WebElement Filter1() {
		return Filter1;
}
	@FindBy(xpath = "(//p-dropdown[@id='ruleFilter'])[3]")
	WebElement Filter2;

	public WebElement Filter2() {
		return Filter2;
}
	@FindBy(xpath = "(//p-dropdown[@id='ruleFilter'])[4]")
	WebElement Filter3;

	public WebElement Filter3() {
		return Filter3;
}
	@FindBy(xpath = "(//p-dropdown[@id='ruleFilter'])[5]")
	WebElement Filter4;

	public WebElement Filter4() {
		return Filter4;
}
	@FindBy(xpath = "(//p-dropdown[@id='ruleFilter'])[6]")
	WebElement Filter5;

	public WebElement Filter5() {
		return Filter5;
}
	@FindBy(xpath = "(//p-dropdown[@id='ruleFilter'])[7]")
	WebElement Filter6;

	public WebElement Filter6() {
		return Filter6;
}
	@FindBy(xpath = "(//p-dropdown[@id='ruleFilter'])[8]")
	WebElement Filter7;

	public WebElement Filter7() {
		return Filter7;
}
	@FindBy(xpath = "(//p-dropdown[@id='ruleFilter'])[9]")
	WebElement Filter8;

	public WebElement Filter8() {
		return Filter8;
}
	@FindBy(xpath = "(//p-dropdown[@id='ruleFilter'])[10]")
	WebElement Filter9;

	public WebElement Filter9() {
		return Filter9;
}
	
	@FindBy(xpath = "(//p-dropdown[@id='ruleFilter'])[11]")
	WebElement Filter10;

	public WebElement Filter10() {
		return Filter10;
}

	@FindBy(xpath = "//span[text()='1XR']")
	WebElement F1;

	public WebElement  F1() {
		return  F1;
}

	@FindBy(xpath = "//span[text()='1XR']")
	WebElement F2;

	public WebElement  F2() {
		return  F2;
}
	
	
	@FindBy(xpath = "(//p-dropdown[@placeholder='select'])[2]//parent::p-dropdown")
	WebElement O1;

	public WebElement O1() {
		return  O1;
}
	@FindBy(xpath = "//span[text()='Select Items']")
	WebElement V1;

	public WebElement V1() {
		return  V1;
}
	
	@FindBy(xpath = "(//p-multiselect[@placeholder='Select Items'])[2]//parent::p-multiselect")
	WebElement withvalue;

	public WebElement withvalue() {
		return  withvalue;
}
	
	
	//..............................Operator.............................................//
	@FindBy(xpath = "(//p-dropdown[@placeholder='select'])[2]")
	WebElement Opeartor1;

	public WebElement Opeartor1() {
		return Opeartor1;
}
	@FindBy(xpath = "(//p-dropdown[@placeholder='select'])[3]")
	WebElement Opeartor2;

	public WebElement Opeartor2() {
		return Opeartor2;
}
	
	@FindBy(xpath = "(//p-dropdown[@placeholder='select'])[4]")
	WebElement Opeartor3;

	public WebElement Opeartor3() {
		return Opeartor3;
}
	
	@FindBy(xpath = "(//p-dropdown[@placeholder='select'])[5]")
	WebElement Opeartor4;

	public WebElement Opeartor4() {
		return Opeartor4;
}
	
	@FindBy(xpath = "(//p-dropdown[@placeholder='select'])[6]")
	WebElement Opeartor5;

	public WebElement Opeartor5() {
		return Opeartor5;
}
	
	@FindBy(xpath = "(//p-dropdown[@placeholder='select'])[7]")
	WebElement Opeartor6;

	public WebElement Opeartor6() {
		return Opeartor6;
}
	
	@FindBy(xpath = "(//p-dropdown[@placeholder='select'])[8]")
	WebElement Opeartor7;

	public WebElement Opeartor7() {
		return Opeartor7;
}
	@FindBy(xpath = "(//p-dropdown[@placeholder='select'])[9]")
	WebElement Opeartor8;

	public WebElement Opeartor8() {
		return Opeartor8;
}
	
	@FindBy(xpath = "(//p-dropdown[@placeholder='select'])[10]")
	WebElement Opeartor9;

	public WebElement Opeartor9() {
		return Opeartor9;
}
	
	@FindBy(xpath = "(//p-dropdown[@placeholder='select'])[11]")
	WebElement Opeartor10;

	public WebElement Opeartor10() {
		return Opeartor10;
}
	
	
	
	
	//..............................Value.....................................................//
	@FindBy(xpath = "//p-multiselect[@placeholder='Select Items']")
	WebElement Avalue1;

	public WebElement Avalue1() {
		return Avalue1;
}
	
	@FindBy(xpath = "//div[@class='p-grid']//input[@placeholder='Enter']")
	WebElement Avalue2;

	public WebElement Avalue2() {
		return Avalue2;
}
	@FindBy(xpath = "//div[@class='p-grid']//input[@placeholder='Enter']")
	WebElement Avalue3;

	public WebElement Avalue3() {
		return Avalue3;
}
	@FindBy(xpath = "//liono-treeselect[@placeholder='Select Territory']")
	WebElement Avalue4;

	public WebElement Avalue4() {
		return Avalue4;
}
	@FindBy(xpath = "//div[@class='p-grid']//input[@placeholder='Enter']")
	WebElement Avalue5;

	public WebElement Avalue5() {
		return Avalue5;
}
	@FindBy(xpath = "(//p-multiselect[@placeholder='Select Items'])[2]")
	WebElement Avalue6;

	public WebElement Avalue6() {
		return Avalue6;
}
	@FindBy(xpath = "//p-multiselect[@placeholder='Select Items']")
	WebElement Avalue7;

	public WebElement Avalue7() {
		return Avalue7;
}
	@FindBy(xpath = "(//p-multiselect[@placeholder='Select Items'])[2]")
	WebElement Avalue8;

	public WebElement Avalue8() {
		return Avalue8;
}
	@FindBy(xpath = "//span[text()='Select Items']")
	WebElement Avalue9;

	public WebElement Avalue9() {
		return Avalue9;
}
	@FindBy(xpath = "//p-dropdown[@id='code']")
	WebElement Avalue10;

	public WebElement Avalue10() {
		return Avalue10;
}
	
	@FindBy(xpath = "//p-dropdown[@placeholder='Select Value']")
	WebElement Avalue11;

	public WebElement Avalue11() {
		return Avalue11;
}
	@FindBy(xpath = "(//p-multiselect[@placeholder='Select Items'])[2]")
	WebElement Avalue12;

	public WebElement Avalue12() {
		return Avalue12;
}	
	@FindBy(xpath = "//p-dropdown[@placeholder='Select Items']")
	WebElement Avalue13;

	public WebElement Avalue13() {
		return Avalue13;
}		
	
	@FindBy(xpath = "//p-dropdown[@placeholder='Select Items']")
	WebElement Avalue14;

	public WebElement Avalue14() {
		return Avalue14;
}		
	@FindBy(xpath = "//input[@placeholder='mm/dd/yyyy']")
	WebElement Avalue15;

	public WebElement Avalue15() {
		return Avalue15;
}	
	
	
	@FindBy(xpath = "//input[@placeholder='mm/dd/yyyy to mm/dd/yyyy']")
	WebElement Avalue16;

	public WebElement Avalue16() {
		return Avalue16;
}		
	//...............................Account Dependent Module.............................//
	

	@FindBy(xpath = "//i[@class='pi pi-plus']")
	WebElement ADMplus;

	public WebElement ADMplus() {
		return ADMplus;
}
	
	
	@FindBy(xpath = "(//p-dropdown[@id='parentModules'])[2]")
	WebElement AsscociatedModule;

	public WebElement AsscociatedModule() {
		return AsscociatedModule;
}
	
	
	@FindBy(xpath = "//span[text()='Select Template']")
	WebElement ADMtemplate;

	public WebElement ADMtemplate() {
		return ADMtemplate;
}

	@FindBy(xpath = "//p-dropdown[@placeholder='Select Choice']")
	WebElement ADMchoice;

	public WebElement ADMchoice() {
		return ADMchoice;
}
	
	@FindBy(xpath = "//p-dropdown[@id='ruleFilter']")
	WebElement ADMFilter;

	public WebElement ADMFilter() {
		return ADMFilter;
}
	@FindBy(xpath = "//p-dropdown[@placeholder='select']")
	WebElement ADMoperator;

	public WebElement ADMoperator() {
		return ADMoperator;
}
	@FindBy(xpath = "//p-multiselect[@placeholder='Select Items']")
	WebElement ADMValue;

	public WebElement ADMValue() {
		return ADMValue;
}
	
	
	@FindBy(xpath = "(//span[@class='p-button-label'][normalize-space()='Save'])[2]")
	WebElement ADMSave;

	public WebElement ADMSave() {
		return ADMSave;
}
	
	
	
	@FindBy(xpath = "//span[text()='Preview']")
	WebElement Preview;

	public WebElement Preview() {
		return Preview;
}	
	
	@FindBy(xpath = "(//span[text()='Cancel'])[2]")
	WebElement Cancel;

	public WebElement Cancel() {
		return Cancel;
}	
	
	@FindBy(xpath = "(//span[text()='Cancel'])[1]")
	WebElement Cancelss;

	public WebElement Cancel1() {
		return Cancelss;
}	
	
	//..................setting.........................//
	@FindBy(xpath = "//i[@class='pi pi-cog']")
	WebElement Setting;

	public WebElement Setting() {
		return Setting;
}

	
	@FindBy(xpath="//span[text()='Delete']")
	WebElement btnDelete;

	public WebElement clickDelete() {
		return btnDelete;
	}
	

	@FindBy(xpath="//span[text()='Yes']")
	WebElement btnYes;

	public WebElement clickYes() {
		return btnYes;
	}
	
	@FindBy(xpath = "//span[text()='Timezone']//parent::*//div[2]")
	WebElement TimezoneClick1;

	public WebElement TimezoneClick1() {
		return TimezoneClick1;
}
	
	@FindBy(xpath = "//span[text()='Save']")
	WebElement SettingSave;

	public WebElement SettingSave() {
		return SettingSave;
}
	

	@FindBy(xpath = "//span[text()='Tax ID (EIN)']//parent::*//div[2]")
	WebElement Taxidc;

	public WebElement Taxidc() {
		return Taxidc;
}
	
	
	
	@FindBy(xpath = "//span[text()='Account Email']//following::button[1]")
	WebElement AccountEmail1;

	public WebElement AccountEmail1() {
		return AccountEmail1;
}
	
	
	@FindBy(xpath = "//li[text()=' Account Email ']//span//parent::*")
	WebElement AccountEmail2;

	public WebElement AccountEmail2() {
		return AccountEmail2;
}
	
	
	@FindBy(xpath = "//span[text()='Account Source']//parent::*//div[2]")
	WebElement AccountSource;

	public WebElement AccountSource() {
		return AccountSource;
}
	
	
	@FindBy(xpath = "//span[text()='Account Type(s)']//parent::*//div[1]")
	WebElement AccountType;

	public WebElement AccountType() {
		return AccountType;
}
	
	@FindBy(xpath = "//span[text()='Account No.']//parent::*//div[2]")
	WebElement AccountNo;

	public WebElement AccountNo() {
		return AccountNo;
}
	
	@FindBy(xpath = "//span[text()='Account Phone']//following::button[1]")
	WebElement AccountPhone1;

	public WebElement AccountPhone1() {
		return AccountPhone1;
}
	

	@FindBy(xpath = "//li[text()=' Account Phone ']//span//parent::*")
	WebElement AccountPhone2;

	public WebElement AccountPhone2() {
		return AccountPhone2;
}
	
	@FindBy(xpath = "//span[text()='Country']//parent::*//div[2]")
	WebElement Country;

	public WebElement Country() {
		return Country;
}
	
	@FindBy(xpath = "//span[text()='Activation Number']//parent::*//div[2]")
	WebElement Activationnumber;

	public WebElement Activationnumber() {
		return Activationnumber;
}	
	@FindBy(xpath = "//span[text()='CreatedBy']//parent::*//div[2]")
	WebElement CreatedBy;

	public WebElement CreatedBy() {
		return CreatedBy;
}	
	@FindBy(xpath = "//span[text()='Street Address 1']//parent::*//div[2]")
	WebElement StreetAdress1;

	public WebElement StreetAdress1() {
		return StreetAdress1;
}	
	
	@FindBy(xpath = "//span[text()='Business Classification']//parent::*//div[2]")
	WebElement BusinessClassification;

	public WebElement BusinessClassification() {
		return BusinessClassification;
}	
	@FindBy(xpath = "//span[text()='Attn.']//parent::*//div[2]")
	WebElement Attn;

	public WebElement Attn() {
		return Attn;
}	
	@FindBy(xpath = "//span[text()='UpdatedBy']//parent::*//div[1]")
	WebElement UpdatedBy;

	public WebElement UpdatedBy() {
		return UpdatedBy;
}	
	
	@FindBy(xpath = "//span[text()='Industry']//parent::*//div[2]")
	WebElement Industry;

	public WebElement Industry() {
		return Industry;
}	
	
	@FindBy(xpath = "//span[text()='Zip/Postal Code']//parent::*//div[2]")
	WebElement Zippostalcode;

	public WebElement Zippostalcode() {
		return Zippostalcode;
}	
	
	@FindBy(xpath = "//span[text()='SIC Code']//parent::*//div[2]")
	WebElement Siccode;

	public WebElement Siccode() {
		return Siccode;
}		
	
	@FindBy(xpath = "(//span[text()='UpdatedDate']//parent::*//div[1])[1]")
	WebElement UpadtedDate;

	public WebElement UpadtedDate() {
		return UpadtedDate;
}		
	@FindBy(xpath = "(//span[text()='Sim Sale']//parent::*//div[1])[1]")
	WebElement Simsale;

	public WebElement Simsale() {
		return Simsale;
}	
	
	@FindBy(xpath = "(//span[text()='Ownership Type']//parent::*//div[1])[1]")
	WebElement Ownership;

	public WebElement Ownership() {
		return Ownership;
}			

	@FindBy(xpath = "(//span[text()='Estimated Annual Revenue']//parent::*//div[1])[1]")
	WebElement EstimatedAnnualRev;

	public WebElement EstimatedAnnualRev() {
		return EstimatedAnnualRev;
}			
	
	@FindBy(xpath = "//span[text()='NAICS Code']//parent::*//div[2]")
	WebElement Naicscode;

	public WebElement Naicscode() {
		return Naicscode;
}	
	

	@FindBy(xpath = "//span[text()='Currency']//parent::*//div[2]")
	WebElement Currency;

	public WebElement Currency() {
		return Currency;
}	
	
	@FindBy(xpath="(//span[text()='Save'])[1]")
	WebElement btnSaveSearch;

	public WebElement SaveSS() {
		return btnSaveSearch;
	}
	
	@FindBy(xpath = "//textarea[@formcontrolname=\"description\"]")
	WebElement Notes;

	public WebElement Notes() {
		return Notes;
}			
	
	@FindBy(xpath = "//span[text()='Payment Method']//parent::*//div[2]")
	WebElement PaymentMethod;

	public WebElement PaymentMethod() {
		return PaymentMethod;
}			
	@FindBy(xpath = "//span[text()='Payment Term']//parent::*//div[2]")
	WebElement PaymentTerm;

	public WebElement PaymentTerm() {
		return PaymentTerm;
}	
	
	@FindBy(xpath = "//span[text()='Rating']//parent::*//div[2]")
	WebElement Rating;

	public WebElement Rating() {
		return Rating;
}
	
	@FindBy(xpath = "//span[text()='Street Address 2']//parent::*//div[2]")
	WebElement StreetAdress2;

	public WebElement StreetAdress2() {
		return StreetAdress2;
}	
	
	@FindBy(xpath = "//span[text()='Shipping Term']//parent::*//div[2]")
	WebElement ShippingTerm;

	public WebElement ShippingTerm() {
		return ShippingTerm;
}	
	
	
	@FindBy(xpath = "//span[text()='Shipping Method']//parent::*//div[2]")
	WebElement ShippingMethod;

	public WebElement ShippingMethod() {
		return ShippingMethod;
}	
	
	@FindBy(xpath = "(//span[@class='p-datepicker-next-icon pi pi-chevron-right ng-tns-c69-154'])[1]//parent::*")
	WebElement DateShift;

	public WebElement DateShift() {
		return DateShift;
}	
	
	@FindBy(xpath = "//input[@id='parent']")
	WebElement SearchValue;

	public WebElement SearchValue() {
		return SearchValue;
}	
	
	@FindBy(xpath = "(//tbody[@class='p-element p-datatable-tbody'])[2]")
	WebElement tabledata;

	public WebElement Tabledata() {
		return tabledata;
}	
	@FindBy(xpath = "(//span[text()='CreatedDate']//parent::*//div[1])[1]")
	WebElement CreatedDated;

	public WebElement CreatedDated() {
		return CreatedDated;
}	
	@FindBy(xpath = "")
	WebElement AccountName;

	public WebElement AccountName() {
		return AccountName;
}	
	@FindBy(xpath = "//span[text()='1XR']//parent::*//div[2]")
	WebElement oneXR;

	public WebElement oneXR() {
		return oneXR;
}	
	@FindBy(xpath = "//span[text()='Doing Business as (DBA)']//parent::*//div[2]")
	WebElement DoingBusniess;

	public WebElement DoingBusniess() {
		return DoingBusniess;
}			
	
	@FindBy(xpath = "//span[text()='Founded Year']//parent::*//div[2]")
	WebElement FondedYear;

	public WebElement FondedYear() {
		return FondedYear;
}			
	
	@FindBy(xpath = "//span[text()='Lead Email ']//following::button[1]")
	WebElement LeadEmail1;

	public WebElement LeadEmail1() {
		return LeadEmail1;
}			
	@FindBy(xpath = "//li[text()=' Lead Email ']//span//parent::*")
	WebElement  LeadEmail2;

	public WebElement LeadEmail2() {
		return  LeadEmail2;
}				
	@FindBy(xpath = "//span[text()='Lead Number']//parent::*//div[2]")
	WebElement  LeadNumber;

	public WebElement LeadNumber() {
		return  LeadNumber;
}
	@FindBy(xpath = "//span[text()='Lead Phone']//following::button[1]")
	WebElement  LeadPhone1;

	public WebElement LeadPhone1() {
		return  LeadPhone1;
}
	@FindBy(xpath = "//li[text()=' Lead Phone ']//parent::*//div[2]")
	WebElement  LeadPhone2;

	public WebElement LeadPhone2() {
		return  LeadPhone2;
}
	@FindBy(xpath = "//span[text()='Lead Source']//parent::*//div[2]")
	WebElement  LeadSource;

	public WebElement LeadSource() {
		return  LeadSource;
}
	
	@FindBy(xpath = "//span[text()='Lead Type(s)']//parent::*//div[2]")
	WebElement  LeadTypes;

	public WebElement LeadTypes() {
		return  LeadTypes;
}
	
	@FindBy(xpath = "//span[text()='Number of Employees']//parent::*//div[2]")
	WebElement  NoofEmpLead;

	public WebElement NoofEmpLead() {
		return  NoofEmpLead;
}
	@FindBy(xpath = "//span[text()='Time  zone']//parent::*//div[2]")
	WebElement  LeadTimezone;

	public WebElement LeadTimezone() {
		return  LeadTimezone;
}
	@FindBy(xpath = "//span[text()='Status']//parent::*//div[2]")
	WebElement  Satus;

	public WebElement Satus() {
		return  Satus;
	
	}	
	@FindBy(xpath = "//span[text()='Stage']//parent::*//div[2]")
	WebElement  Satage;

	public WebElement Satage() {
		return  Satage;
	
	}	
	@FindBy(xpath = "//span[text()='Sim Sale']//parent::*//div[2]")
	WebElement  Simsale1;

	public WebElement Simsale1() {
		return  Simsale1;
	
	}
	@FindBy(xpath = "//span[text()='Radius']//parent::*//div[2]")
	WebElement  Radius1;

	public WebElement Radius1() {
		return  Radius1;
	
	}	
	@FindBy(xpath = "(//td[@class='ng-star-inserted'])[1]")
	WebElement  RightClick;

	public WebElement RightClick() {
		return  RightClick;
	
	}
	
	@FindBy(xpath = "//span[text()='Edit']")
	WebElement  Edit;

	public WebElement Edit() {
		return  Edit;
	
	}
	//...................Group By............................................//
	
	@FindBy(xpath = "//span[text()='Group']")
	WebElement  GroupC;

	public WebElement GroupC() {
		return  GroupC;
	
	}
	
	@FindBy(xpath = "//p-dropdown[@optionlabel='header']//parent::p-dropdown")
	WebElement  GroupBy;

	public WebElement GroupBy() {
		return  GroupBy;
	
	}
	@FindBy(xpath = "//p-multiselect[@placeholder='Select Item']")
	WebElement  AggregateFields;

	public WebElement AggregateFields() {
		return  AggregateFields;
	
	}
	@FindBy(xpath = "(//p-dropdown[@placeholder='Select Item'])[2]//parent::p-dropdown")
	WebElement  AggregateType;

	public WebElement AggregateType() {
		return  AggregateType;
	
	}
	
	
	
	@FindBy(xpath = "//span[text()='Save']")
	WebElement  GSave;

	public WebElement GSave() {
		return  GSave;
	
	}
	//.......................opportunity..............................//
	
	
	@FindBy(xpath = "//p-dropdown[@id='accountChannels']")
	WebElement  AccountChannelopp;

	public WebElement AccountChannelopp() {
		return  AccountChannelopp;
	
	
	
	
	}	
	@FindBy(xpath = "//input[@id='parent']")
	WebElement  Oppvalue;

	public WebElement Oppvalue() {
		return  Oppvalue;
	
	}	
	@FindBy(xpath = "//span[text()='Add Rule']")
	WebElement  AddRule;

	public WebElement AddRule() {
		return  AddRule;
	
	}	
	@FindBy(xpath = "//span[text()='Contact Email']//parent::*//div[2]")
	WebElement  Contactmail;

	public WebElement Contactmail() {
		return  Contactmail;
	}
	@FindBy(xpath = "//span[text()='Contact Name']//parent::*//div[2]")
	WebElement  ContactName;

	public WebElement ContactName() {
		return  ContactName;
	}
	
	@FindBy(xpath = "//span[text()='Contact Phone']//parent::*//div[2]")
	WebElement  ContactPhone;

	public WebElement ContactPhone() {
		return  ContactPhone;
	}
	@FindBy(xpath = "//span[text()='Forecast Category']//parent::*//div[2]")
	WebElement  ForecastCat;

	public WebElement ForecastCat() {
		return  ForecastCat;
	}
	@FindBy(xpath = "//span[text()='Opportunity Details']//parent::*//div[2]")
	WebElement  OppDetails;

	public WebElement OppDetails() {
		return  OppDetails;
	}
	@FindBy(xpath = "//span[text()='Owner']//parent::*//div[2]")
	WebElement  Owner;

	public WebElement Owner() {
		return  Owner;
	}
	
	@FindBy(xpath = "//span[text()='Price']//parent::*//div[2]")
	WebElement  Price;

	public WebElement Price() {
		return  Price;
	}
	
	@FindBy(xpath = "//span[text()='Probability']//parent::*//div[2]")
	WebElement  Probability;

	public WebElement Probability() {
		return  Probability;
	}
	@FindBy(xpath = "//span[text()='Product Name']//parent::*//div[2]")
	WebElement  ProductName;

	public WebElement ProductName() {
		return  ProductName;
	}
	
	@FindBy(xpath = "//span[text()='Quality']//parent::*//div[2]")
	WebElement  Quality;

	public WebElement Quality() {
		return  Quality;
	}
	
	
	@FindBy(xpath = "//span[text()='Rep Confidence']//parent::*//div[2]")
	WebElement  RepConfidence;

	public WebElement RepConfidence() {
		return  RepConfidence;
	}
	
	@FindBy(xpath = "//span[text()='Total Amount']//parent::*//div[2]")
	WebElement  TotalAmount;

	public WebElement TotalAmount() {
		return  TotalAmount;
	}
	
	@FindBy(xpath = "//span[text()='Unit1']//parent::*//div[2]")
	WebElement  Unit1;

	public WebElement Unit1() {
		return  Unit1;
	}
	
	@FindBy(xpath = "//span[text()='UOM']//parent::*//div[2]")
	WebElement  Uom;

	public WebElement Uom() {
		return  Uom;
	}
	
	@FindBy(xpath = "//liono-treeselect[@placeholder='Select Item']")
	WebElement  UomSelectitem;

	public WebElement UomSelectitem() {
		return  UomSelectitem;
	}
	
	@FindBy(xpath = "//span[text()='UpdatedBy']//parent::*//div[2]")
	WebElement  updatedBy;

	public WebElement updatedBy() {
		return  updatedBy;
	}
	
	
	@FindBy(xpath = "//span[text()='Account Name']")
	WebElement  Filteropp;

	public WebElement Filteropp() {
		return  Filteropp;
	}
	
	
	@FindBy(xpath="//liono-treeselect[@formcontrolname='selectedUsers']")
	WebElement drpusers;

	public WebElement selectUsers() {
		return drpusers;
	}
	
	@FindBy(xpath="//p-dropdown[@formcontrolname=\"selectedModule\"]")
	WebElement drpModule;

	public WebElement SelectModule() {
		return drpModule;
	}
	
	@FindBy(xpath="//p-dropdown[@formcontrolname=\"selectedChannel\"]")
	WebElement drpChannel;

	public WebElement SelectChannel() {
		return drpChannel;
	}
	
	
	@FindBy(xpath="//span[text()='View']")
	WebElement btnview;

	public WebElement clickview() {
		return btnview;
	}
	
	@FindBy(xpath="//span[text()='View Saved Search']")
	WebElement ViewHeader;

	public WebElement ViewHeader() {
		return ViewHeader;
	}
	
//common xpath===========================================================
	
	@FindBy(xpath="(//input[@placeholder=\"Search Fields...\"])")
	WebElement btnSearch;

	public WebElement Search() {
		return btnSearch;
		}
	

	@FindBy(xpath = "//liono-treeselect[@placeholder=\"Select a field\"]")
	WebElement rulefilter;

	public WebElement RuleFilter() {
		return rulefilter;	
	}
	
	@FindBy(xpath = "//p-dropdown[@placeholder=\"select\"]")
	WebElement operator;

	public WebElement operator() {
		return operator;	
	}
	
	@FindBy(xpath = "//p-dropdown[@placeholder=\"Select Items\"]")
	WebElement valueDropdown;

	public WebElement SelectOperatorValue() {
		return valueDropdown;	
	}
	
	@FindBy(xpath="//input[@placeholder=\"Search...\"]")
	WebElement txtGlobalSearch;

	public WebElement SearchSS() {
		return txtGlobalSearch;
	}
	
	@FindBy(xpath="//tbody//tr[1]//td[1]")
	WebElement ListedSavedsearch;

	public WebElement ListedSavedsearch() {
		return ListedSavedsearch;
	}
	
	@FindBy(xpath = "(//button//span[normalize-space(.)='Save'])[2]")
	WebElement saveRules;

	public WebElement saverule() {
		return saveRules;	
	}
	
		public WebElement MassEditField(int FieldNumaber) {
			
			WebElement Filter = ldriver.findElement(By.xpath("(//p-dropdown[@formcontrolname=\"selectedField\"])["+FieldNumaber+"]"));
			return Filter;
		}
		
	public WebElement SelectSingleValue(int FieldNumaber) {
			
			WebElement Filter = ldriver.findElement(By.xpath("(//p-dropdown[@placeholder=\"Select New Value\"])["+FieldNumaber+"]"));
			return Filter;
		}

	public WebElement SelectMultivalues(int FieldNumaber) {
		
		WebElement Filter = ldriver.findElement(By.xpath("(//p-multiselect[@placeholder=\"Select New Value\"])["+FieldNumaber+"]"));
		return Filter;
	}

	
	
	
}