package com.liono360.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SavedSearchActivity {

	WebDriver ldriver;

	public SavedSearchActivity(WebDriver rdriver) {
		ldriver = rdriver;
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
	WebElement Module;

	public WebElement ModuleA() {
		return Module;
	}
	
	@FindBy(xpath = "(//p-button[@class='p-element'])[1]")
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
	
	
	
	@FindBy(xpath = "(//span[@class='ng-star-inserted'][normalize-space()='Type'])[1]")
	WebElement ClickOnType;

	public WebElement ClickOnType() {
		return ClickOnType;
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
	
	
	
	
	@FindBy(xpath = "(//div[contains(text(), 'SAVED S-Opp')])[1]")
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
	
	@FindBy(xpath = "(//span[text()='View'])[2]")
	WebElement View;

	public WebElement View() {
		return View;
	}
	
	
	@FindBy(xpath = "//span[text()='View Saved Search']")
	WebElement VerifyViewSavedSearch;

	public WebElement VerifyViewSavedSearch() {
		return VerifyViewSavedSearch;
	}
	@FindBy(xpath = "//span[text()='Cancel']")
	WebElement CancelButton;

	public WebElement CancelButton() {
		return CancelButton;
	}
	
	//.................................Edit Saved Search.............................................//
	
	@FindBy(xpath = "(//span[text()='Edit'])[2]")
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
	
	
	@FindBy(xpath = "(//span[text()='Delete'])[2]")
	WebElement Delete;

	public WebElement Delete() {
		return Delete;
	}
	
	
	@FindBy(xpath = "(//span[normalize-space()='Yes'])[1]")
	WebElement Yes;

	public WebElement Yes() {
		return Yes;
	}
	
	
	
	//..........................Activity Information .....................................//
	
	@FindBy(xpath = "(//span[@class='pi pi-plus p-button-icon ng-star-inserted'])[1]")
	WebElement Plus1;

	public WebElement Plus1() {
		return PlusC;
	}
	@FindBy(xpath = "(//liono-treeselect[@placeholder='Select a field'])[1]")
	WebElement Filter1;

	public WebElement Filter() {
		return Filter;
	}
	
	@FindBy(xpath = "(//span[contains(text(),'Created By')])[1]")
	WebElement CreatedBy;

	public WebElement CreatedBy() {
		return CreatedBy;
	}
	
	@FindBy(xpath = "(//span[contains(text(),'Created Date')])[1]")
	WebElement CreatedDate;

	public WebElement CreatedDate() {
		return CreatedDate;
	}
	
	
	@FindBy(xpath = "(//span[contains(text(),'Last Updated By')])[1]")
	WebElement LastUpdatedBy;

	public WebElement LastUpdatedBy() {
		return LastUpdatedBy;
	}
	
	
	
	@FindBy(xpath = "(//span[contains(text(),'Last Updated Date')])[1]")
	WebElement LastUpdatedDate;

	public WebElement LastUpdatedDate() {
		return LastUpdatedDate;
	}
	
	
	
	//................Associated Module Information........................................//
	
	@FindBy(xpath = "//div[@aria-label='Association Information']//button[@type='button']")
	WebElement AssociationInformation;

	public WebElement AssociationInformation() {
		return AssociationInformation;
	}
	
	
	
	@FindBy(xpath = "(//span[contains(text(),'Associated Module')])[1]")
	WebElement AssociationModule;

	public WebElement AssociationModule() {
		return AssociationModule;
	}
	
	
	@FindBy(xpath = "//span[text()='Select Item']")
	WebElement ValueAssociationModule;

	public WebElement ValueAssociationModule() {
		return AssociationModule;
	}
	
	//(//span[normalize-space()='Opportunity'])[1]
	
	
	
	@FindBy(xpath = "")
	WebElement OpportunitySelect;

	public WebElement OpportunitySelect() {
		return OpportunitySelect;
	}
	
	
	
	//............Add Saved Search Report.............................................//
	
	
	
	//.................Filter By.......................................................//
	
	
	@FindBy(xpath = "")
	WebElement FilterBy;

	public WebElement FilterBy() {
		return FilterBy;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
