package com.liono360.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpportunitySavedSearchPage {
	WebDriver ldriver;

	public OpportunitySavedSearchPage(WebDriver rdriver) {
		ldriver = rdriver;
		//DynamicWait(ldriver);
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "//span[text()='Misc.']")
	WebElement Miscbtn;
	public WebElement MiscBtn() {
		return Miscbtn;
	}
	@FindBy(xpath = "//span[text()='Saved Searches']")
	WebElement ClickSavedS;
	public WebElement SavedSearch() {
		return ClickSavedS;
	}
	@FindBy(xpath = "//span[text()='New']")
	WebElement Newbtn;
	public WebElement New() {
		return Newbtn;
	}
	@FindBy(xpath = "//input[@formcontrolname='name']")
	WebElement Name;
	public WebElement Name1() {
		return Name;
	}
	@FindBy(xpath = "(//liono-treeselect[@placeholder='Select Users'])[1]")
	WebElement AccessPermission;

	public WebElement AccPermission() {
		return AccessPermission;
	}
	
	
	@FindBy(xpath = "(//p-dropdown[@placeholder='Select Module'])[1]")
	WebElement ModuleA;

	public WebElement Module() {
		return ModuleA;
	}
	
	
	@FindBy(xpath = "(//textarea[@name='description'])[1]")
	WebElement AddNotes;

	public WebElement AddNotes() {
		return AddNotes;
	}
	
	
	
	
	@FindBy(xpath = "(//p-dropdown[@placeholder='Select Channel'])[1]")
	WebElement Channel1;

	public WebElement Channel1() {
		return Channel1;
	}
	
	@FindBy(xpath = "(//p-dropdown[@placeholder='Select Account Channel'])[1]")
	WebElement Channel2;

	public WebElement Channel2() {
		return Channel2;
	}
	
	
	
	
	
	
	@FindBy(xpath = "(//p-dropdown[@placeholder='Select Module'])[1]")
	WebElement Module;

	public WebElement ModuleA() {
		return Module;
	}
	
	
	
	
	
	@FindBy(xpath = "//button[@data-pc-name='button']")
	WebElement PlusC;

	public WebElement Plus() {
		return PlusC;
	}
	@FindBy(xpath = "(//liono-treeselect[@placeholder='Select a field'])[1]")
	WebElement Filter;

	public WebElement Filter11() {
		return Filter;
	}
	@FindBy(xpath = "//p-multiselect[@placeholder='Select Items']")
	WebElement Value;

	public WebElement Value11() {
		return Value;
	}
	@FindBy(xpath = "(//button[@type='submit'])[1]")
	WebElement Save1;

	public WebElement Save11() {
		return Save1;
	}
	@FindBy(xpath = "(//span[@class='p-button-label'][normalize-space()='Save'])[2]")
	WebElement Save2;

	public WebElement Save22() {
		return Save2;
	}
	@FindBy(xpath = "(//p-dropdown[@placeholder='select'])[1]")
	WebElement Operator;

	public WebElement Operator11() {
		return Operator;
	}
	
	
	@FindBy(xpath = "//div[@aria-label='Activity Information']//button[@type='button']")
	WebElement ActivityInformation;

	public WebElement ActivityInformation() {
		return ActivityInformation;
	}
	
	
	
	@FindBy(xpath = "(//span[contains(text(),'Account Name')])[1]")
	WebElement ClickOnType;

	public WebElement ClickOnAccountName() {
		return ClickOnType;
	}
	
	
	
	@FindBy(xpath = "(//span[contains(text(),'Created By')])[1]")
	WebElement CreatedBy;

	public WebElement CreatedBy() {
		return CreatedBy;
	}
	
	
	
	@FindBy(xpath = "(//span[contains(text(),'Quality')])[1]")
	WebElement Quality;

	public WebElement Quality() {
		return Quality;
	}
	
	
	
	@FindBy(xpath = "(//span[contains(text(),'Source')])[1]")
	WebElement Source;

	public WebElement Source() {
		return Source;
	}
	
	
	
	
	
	@FindBy(xpath = "(//span[normalize-space()='Preview'])[1]")
	WebElement Preview;

	public WebElement Preview() {
		return Preview;
	}
	
	
	
	@FindBy(xpath = "(//span[@class='p-button-label'][normalize-space()='Cancel'])[2]")
	WebElement Cancel;

	public WebElement Cancel() {
		return Cancel;
	}
	
	@FindBy(xpath = "//span[text()='Cancel']")
	WebElement CancelButton;

	public WebElement CancelButton() {
		return CancelButton;
	}
	
	
	
	@FindBy(xpath = "(//div[contains(text(), 'A-TopSavedSearch')])[1]")
	WebElement ListedSavedSearch;

	public WebElement ListedSavedSearch() {
		return ListedSavedSearch;
	}
	
	
	//.................................View Saved Search..........................................//
	@FindBy(xpath = "(//tbody)[1]//tr[1]")
	WebElement ClickOnSavedSearch;

	public WebElement ClickOnSavedSearch() {
		return ClickOnSavedSearch;
	}
	
	
	@FindBy(xpath = "//div[@class='btnBars']//i[@class='pi pi-bars']")
	WebElement HumbergIcon;

	public WebElement HumbergIcon() {
		return HumbergIcon;
	}
	
	@FindBy(xpath = "//span[text()='View']")
	WebElement View;

	public WebElement View() {
		return View;
	}
	
	
	@FindBy(xpath = "//span[text()='View Saved Search']")
	WebElement VerifyViewSavedSearch;

	public WebElement VerifyViewSavedSearch() {
		return VerifyViewSavedSearch;
	}
	
	
	//.................................Edit Saved Search.............................................//
	
	@FindBy(xpath = "//span[text()='Edit']")
	WebElement Edit;

	public WebElement Edit() {
		return Edit;
	}
	
	
	@FindBy(xpath = "(//span[@class='btnBars p-mr-0'])[1]")
	WebElement ClickEditQuery;

	public WebElement ClickEditQuery() {
		return ClickEditQuery;
	}
	
	@FindBy(xpath = "(//div[contains(text(), ' Edited-Saved Search')])[1]")
	WebElement EditSavedSearch;

	public WebElement EditSavedSearch() {
		return EditSavedSearch;
	}
	//.................................Delete Saved Search...............................................//
	
	
	@FindBy(xpath = "//span[text()='Delete']")
	WebElement Delete;

	public WebElement Delete() {
		return Delete;
	}
	
	
	@FindBy(xpath = "(//span[normalize-space()='Yes'])[1]")
	WebElement Yes;

	public WebElement Yes() {
		return Yes;
	}
	
	
	
	//.....................Stages Related Query..............................................//
	
	
	
	@FindBy(xpath = "//div[@aria-label='Stage']//span[contains(@class, 'p-tree-toggler-icon') and contains(@class, 'pi-chevron-right')]")
	WebElement StageExpand;

	public WebElement StageExpand() {
		return StageExpand;
	}
	
	
	
	
	
	@FindBy(xpath = "(//span[contains(text(),'Current Stage')])[1]")
	WebElement CurrentStage;

	public WebElement CurrentStage() {
		return CurrentStage;
	}
	
	
	@FindBy(xpath = "(//span[contains(text(),'Previous Stage')])[1]")
	WebElement PreviousStage;

	public WebElement PreviousStage() {
		return PreviousStage;
	}
	
	
	@FindBy(xpath = "(//span[contains(text(),'Stage Changed By')])[1]")
	WebElement StageChangedBy;

	public WebElement StageChangedBy() {
		return StageChangedBy;
	}
	
	
	@FindBy(xpath = "(//span[contains(text(),'Stage Changed Date')])[1]")
	WebElement StageChangedDate;

	public WebElement StageChangedDate() {
		return StageChangedDate;
	}
	
	
	//...............................Compare Numeric fields.............................................//
	
	
	@FindBy(xpath = "(//span[contains(text(),'Item Total')])[1]")
	WebElement Itemtotal;

	public WebElement Itemtotal() {
		return Itemtotal;
	}
	
	
	@FindBy(xpath = "(//span[contains(text(),'Probability')])[1]")
	WebElement Probability;

	public WebElement Probability() {
		return Probability;
	}
	
	
	@FindBy(xpath = "(//span[contains(text(),'Rate')])[1]")
	WebElement Rate;

	public WebElement Rate() {
		return Rate;
	}
	
	
	@FindBy(xpath = "(//input[@placeholder='Enter'])[1]")
	WebElement EnterValue;

	public WebElement EnterValue() {
		return EnterValue;
	}
	

	
	@FindBy(xpath = "(//p-dropdown[@placeholder='Select Field'])[1]")
	WebElement SelectValue;

	public WebElement SelectValue() {
		return SelectValue;
	}
	
	
	@FindBy(xpath = "(//li[@aria-label='Qty'])[1]")
	WebElement SelectQty;

	public WebElement SelectQty() {
		return SelectQty;
	}


	@FindBy(xpath = "(//li[@aria-label='Opportunity Amount'])[1]")
	WebElement SelectOppAmount;

	public WebElement SelectOppAmount() {
		return SelectOppAmount;
	}

//....................Address fields Related Query................................................//
	
	
	
	
	@FindBy(xpath = "(//span[contains(text(),'Address Class')])[1]")
	WebElement AddressClass;

	public WebElement AddressClass() {
		return AddressClass;
	}
	
	@FindBy(xpath = "(//span[contains(text(),'Address Type')])[1]")
	WebElement AddressType;

	public WebElement AddressType() {
		return AddressType;
	}
	
	@FindBy(xpath = "(//span[contains(text(),'Country')])[1]")
	WebElement Country;

	public WebElement Country() {
		return Country;
	}
	
	
	
	
	@FindBy(xpath = "//div[@aria-label='Address Details']//button[@type='button']")
	WebElement AddressDetails;

	public WebElement AddressDetails() {
		return AddressDetails;
	}
	
	@FindBy(xpath = "(//span[contains(text(),'Street Address 1')])[1]")
	WebElement StreetAddress;

	public WebElement StreetAddress() {
		return StreetAddress;
	}
	
	@FindBy(xpath = "(//input[@placeholder='Enter'])[1]")
	WebElement StreetAddressValuePass;

	public WebElement StreetAddressValuePass() {
		return StreetAddressValuePass;
	}
	
	
	//............................Custom Fields Related Query..................................................//
	
	
	@FindBy(xpath = "(//span[contains(text(),'Checkbox')])[1]")
	WebElement CheckBox;

	public WebElement CheckBox() {
		return CheckBox;
	}
	
	
	@FindBy(xpath = "(//span[contains(text(),'Decimal')])[1]")
	WebElement Decimal;

	public WebElement Decimal() {
		return Decimal;
	}
	
	
	
	@FindBy(xpath = "(//span[contains(text(),'Number')])[1]")
	WebElement Number;

	public WebElement Number() {
		return Number;
	}
	
	@FindBy(xpath = "(//span[contains(text(),'MultiSelectDropdown')])[1]")
	WebElement MultiSelect;

	public WebElement MultiSelect() {
		return MultiSelect;
	}
	
	
//.......................................Result.................................................................//
	
	

	@FindBy(xpath = "(//td[@class='ng-star-inserted'])[1]")
	WebElement ClickNameopt;

	public WebElement ClickOnCreatedSavedSearch() {
		return ClickNameopt;
	}
	
	//div[@ptooltip='Maximize']
	
	
	@FindBy(xpath = "//div[@ptooltip='Maximize']")
	WebElement Maximize;

	public WebElement Maximize() {
		return Maximize;
	}
	
	
	@FindBy(xpath = "//div[@ptooltip='Refresh']")
	WebElement Refresh;

	public WebElement Refresh() {
		return Refresh;
	}
	
	
	@FindBy(xpath = "//span[text()='Query']")
	WebElement Query;

	public WebElement Query() {
		return Query;
	}	
	
	
	@FindBy(xpath = "//span[text()='Result']")
	WebElement Result;

	public WebElement Result() {
		return Result;
	}	
	
	
	
	
	@FindBy(xpath = "//i[@class='pi pi-cog']")
	WebElement Setting;

	public WebElement Setting() {
		return Setting;
}
	
	
	@FindBy(xpath = "//span[text()='Save']")
	WebElement SettingSave;

	public WebElement SettingSave() {
		return SettingSave;
}
	
	
	
	@FindBy(xpath = "//span[text()='Checkbox']//parent::*//div[2]")
	WebElement CheckBoxEnable;

	public WebElement CheckBoxEnable() {
		return CheckBoxEnable;
}
	
	
	@FindBy(xpath = "//span[text()='MultiSelectDropdown']//parent::*//div[2]")
	WebElement MultiSelectDropdown;

	public WebElement MultiSelectDropdown() {
		return MultiSelectDropdown;
}
	
	@FindBy(xpath = "//span[text()='Number']//parent::*//div[2]")
	WebElement NumberEnable;

	public WebElement NumberEnable() {
		return NumberEnable;
}
	
	
	@FindBy(xpath = "//span[text()='Decimal']//parent::*//div[2]")
	WebElement DecimalEnable;

	public WebElement DecimalEnable() {
		return DecimalEnable;
}
	
	//...............................Group By................................................................//
	
	@FindBy(xpath = "(//tr[@class='p-element p-selectable-row ng-star-inserted'])[1]")
	WebElement ClickOnTopSavedSearch;

	public WebElement ClickOnTopSavedSearch() {
		return ClickOnTopSavedSearch;
	}

	@FindBy(xpath = "(//span[normalize-space()='Group'])[1]")
	WebElement GroupBy;

	public WebElement GroupBy() {
		return GroupBy;
	}

	@FindBy(xpath = "(//span[text()='Select Field'])[1]")
	WebElement SelectGroupByFileds;

	public WebElement SelectGroupByFileds() {
		return SelectGroupByFileds;
	}
		
		
	@FindBy(xpath = "(//p-dropdown[@placeholder='Select Field'])[2]")
	WebElement SubGroupfileds;

	public WebElement SubGroupfileds() {
		return SubGroupfileds;
	}
		
		
	@FindBy(xpath = "(//p-multiselect[@placeholder='Select Fields'])[1]")
	WebElement SummaryFileds;

	public WebElement SummaryFileds() {
		return SummaryFileds;
	}
		
	@FindBy(xpath = "(//p-dropdown[@placeholder='Select Value Type'])[1]")
	WebElement SummaryValue;

	public WebElement SummaryValue() {
		return SummaryValue;
	}
	
	@FindBy(xpath = "(//span[normalize-space()='Save'])[1]")
	WebElement SaveGroup;

	public WebElement SaveGroup() {
		return SaveGroup;
	}
	
	
	@FindBy(xpath = "//i[@class='pi pi-cog']")
	WebElement ColumnSetting;

	public WebElement ColumnSetting() {
		return ColumnSetting;
}

@FindBy(xpath = "//span[text()='Item Total']//parent::*//div[2]")
WebElement ItemTotal;

public WebElement ItemTotalC() {
	return ItemTotal;
}

@FindBy(xpath = "//span[text()='Save']")
WebElement ColumnSettingSave;

public WebElement ColumnSettingSave() {
	return ColumnSettingSave;
}


//................Group By Assertion.................................................//


@FindBy(xpath = "(//span[contains(normalize-space(.), 'Opportunity ID')])[1]")
WebElement OppID;

public WebElement OppID() {
	return OppID;
}

@FindBy(xpath = "(//span[contains(normalize-space(.), 'Opportunity Name')])[1]")
WebElement OppName;

public WebElement OppName() {
	return OppName;
}


//..................................Filter By..............................................................//


@FindBy(xpath = "(//span[normalize-space()='Filter'])[1]")
WebElement ClickFilter;

public WebElement ClickFilter() {
	return ClickFilter;
}


@FindBy(xpath = "//span[text()='Select Item']")
WebElement FilterBy;

public WebElement FilterBy() {
	return FilterBy;
}


@FindBy(xpath = "//div[text()='Select Item']")
WebElement Option;

public WebElement Option() {
	return Option;
}

@FindBy(xpath = "(//span[normalize-space()='Apply'])[1]")
WebElement Apply;

public WebElement Apply() {
	return Apply;
}

@FindBy(xpath = "(//span[@class='p-button-icon pi pi-times'])[1]")
WebElement CrossSign;

public WebElement CrossSign() {
	return CrossSign;
}

//......................................Order By.........................................................//



@FindBy(xpath = "(//span[normalize-space()='Order By'])[1]")
WebElement OrderBy;

public WebElement OrderBy() {
	return OrderBy;
}


@FindBy(xpath = "(//p-dropdown[@placeholder='Select Field'])[1]")
WebElement OrderByFiled;

public WebElement OrderByFiled() {
	return OrderByFiled;
}


@FindBy(xpath = "(//p-dropdown[@placeholder='Select Order'])[1]")
WebElement AssccDecc;

public WebElement AssccDecc() {
	return AssccDecc;
}


@FindBy(xpath = "(//input[@placeholder='Leave empty for all records'])[1]")
WebElement TopNumberOfRecords;

public WebElement TopNumberOfRecords() {
	return TopNumberOfRecords;
}

@FindBy(xpath = "(//span[normalize-space()='Save'])[1]")
WebElement SaveOrderBy;

public WebElement SaveOrderBy() {
	return SaveOrderBy;
}




}
	
