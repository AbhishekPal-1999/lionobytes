package com.liono360.pageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.liono360.loginPage.Baseclass;

public class FSMroutesPage extends Baseclass{
	WebDriver ldriver;

	public FSMroutesPage(WebDriver rdriver) {
		ldriver = rdriver;
		
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//span[contains(text(),'FSM')]")
	WebElement btnFSM;

	public WebElement clickFSM() {
		return btnFSM;
	}
	
	@FindBy(xpath="//span[contains(text(),'Routes')]")
	WebElement drpRoutes;

	public WebElement selectRoutes() {
		return drpRoutes;
	}
	

	@FindBy(xpath="//tbody//tr[1]//td[1]")
	WebElement addedRoutes;

	  public WebElement AddedRoutes() {
		return addedRoutes;
	}
	
	@FindBy(xpath="//span[text()='View']")
	WebElement btnViewRoutes;
	
	public WebElement clickViewRoutes(){
		return btnViewRoutes;
	}
	
	@FindBy(xpath="//h5[normalize-space()='View Route']")
	WebElement txtVieHeader;
	
	public WebElement ViewRoutesHeader(){
		return txtVieHeader;
	}
	
	@FindBy(xpath = "//span[text()='Cancel']")
    WebElement btnCancel;

    public WebElement clickCancel() {
	return btnCancel;
    }
    
    @FindBy(xpath = "//span[contains(text(),'Delete')]")
	WebElement btnDeleteRoutes;

	public WebElement clickDeleteRoutes() {
		return btnDeleteRoutes;
	}
	

	@FindBy(xpath = "//span[text()='Yes']")
	WebElement btnYes;

	public WebElement clickYesButton() {
		return btnYes;
	}
	
	@FindBy(xpath="//span[text()='New']")
	WebElement btnAddRoutes;

	public WebElement clickAddRoutes() {
		return btnAddRoutes;
	}
	
	@FindBy(xpath="//input[@formcontrolname='routeName']")
	WebElement txtRoutesname;

	public WebElement setRouteName() {
		return txtRoutesname;
	}
	
	@FindBy(xpath="//liono-treeselect[@placeholder='Select Parent Territory']//div//div//span")
	WebElement drpTerritoryName;

	public WebElement selectParentTerritoryName() {
		return drpTerritoryName;
	}
	
	@FindBy(xpath="(//span[@class='p-tree-toggler-icon pi pi-fw pi-chevron-right'])[2]")
	WebElement selectParentTerritoryNameHirerachy;

	public WebElement selectParentTerritoryNameHirerachy() {
		return selectParentTerritoryNameHirerachy;
	}
	
	@FindBy(xpath="//p-dropdown[@placeholder='Select RepName']//div//div[@aria-label='dropdown trigger']")
	WebElement drpRepName;

	public WebElement selectRepName() {
		return drpRepName;
	}
	
	@FindBy(xpath="(//input[@placeholder='Enter a location'])[1]")
	WebElement txtLocation;

	public WebElement setLocation() {
		return txtLocation;
	}
	
	@FindBy(xpath="(//p-checkbox[@name='isSameLocation'])[1]")
	WebElement chkboxSameAsLocatioan;

	public WebElement SameAsLocation() {
		return chkboxSameAsLocatioan;
	}
	
	@FindBy(xpath="(//span[@class='pi pi-plus p-button-icon ng-star-inserted'])[1]")
	WebElement plusIcon;

	public WebElement PlusIcon() {
		return plusIcon;
	}
	

	@FindBy(xpath="(//span[text()='Save'])[1]")
	WebElement btnSave;

	public WebElement clickSave() {
		return btnSave;
	}
	
	@FindBy(xpath="(//input[@placeholder=\"Enter a location\"])[2]")
	WebElement endLoaction;

	public WebElement setEndLoaction() {
		return endLoaction;
	}
	
	@FindBy(xpath = "//span[contains(text(),'Edit')]")
	WebElement btnEditRoutes;

	public WebElement clickEditRoutes() {
		return btnEditRoutes;
	}
	
	@FindBy(xpath = "(//input[@placeholder=\"Search...\"])[1]")
	WebElement search;

	public WebElement searchRoutes() {
		return search;
	}
	
	@FindBy(xpath = "(//input[@placeholder='Global Search'])[2]")
	WebElement search2;

	public WebElement searchRoutesStore() {
		return search2;
	}
	
	@FindBy(xpath = "(//p-dropdown[@id='recentItems'])[1]")
	WebElement drpFilter;

	public WebElement selectFilter() {
		return drpFilter;
	}
	
	@FindBy(xpath = "//span[text()='Lists']")
	WebElement btnLists;

	public WebElement clickLists() {
		return btnLists;
	}
	
	@FindBy(xpath = "(//span[text()='Check in'])[1]")
	WebElement btnCheckin;

	public WebElement clickCheckin() {
		return btnCheckin;
	}
	
	@FindBy(xpath = "//span[text()='No..']")
	WebElement toggleYesNo;

	public WebElement clickToggleYesNo() {
		return toggleYesNo;
	}
	
	@FindBy(xpath = "(//p-dropdown[@placeholder='Select one'])[1]")
	WebElement drpfavMobile;

	public WebElement SelectFavMobile() {
		return drpfavMobile;
	}
	
	@FindBy(xpath = "(//p-dropdown[@placeholder='Select one'])[2]")
	WebElement drplist;

	public WebElement selectList() {
		return drplist;
	}
	
	@FindBy(xpath = "(//div[@class='p-radiobutton p-component'])[2]")
	WebElement radioRD;

	public WebElement radioRDscale() {
		return radioRD;
	}
	
	@FindBy(xpath = "//p-rating//span[5]")
	WebElement ratingButton;

	public WebElement RatingForAmazon() {
		return ratingButton;
	}
	
	@FindBy(xpath = "//div[@id=\"rating\"]//input")
	WebElement txtMonthName;

	public WebElement setMonthName() {
		return txtMonthName;
	}
	
	@FindBy(xpath = "//span[text()='Checkout']")
	WebElement btnCheckOut;

	public WebElement clickCheckOut() {
		return btnCheckOut;
	}
	
	@FindBy(xpath = "//strong[text()='Total Distance']//parent::div//following-sibling::*")
	WebElement TotalDist;

	public WebElement totalDistance() {
		return TotalDist;
	}
	@FindBy(xpath = "(//i[@class='pi pi-plus'])[1]")
	WebElement btnPlusAct;

	public WebElement clickAddActtivity() {
		return btnPlusAct;
	}
	
	@FindBy(xpath = "//span[text()='Logs']")
	WebElement btnLogs;

	public WebElement clickLogs() {
		return btnLogs;
	}
	
	@FindBy(xpath = "//span[text()='Notes']")
	WebElement btnNotes;

	public WebElement clickNotes() {
		return btnNotes;
	}
	
	@FindBy(xpath = "(//textarea[@id='comment'])[1]")
	WebElement txtComment;

	public WebElement setComment() {
		return txtComment;
	}
	
	@FindBy(xpath = "(//p-dropdown[@id='logType'])[1]")
	WebElement drpLogType;

	public WebElement selectLogType() {
		return drpLogType;
	}
	
	@FindBy(xpath = "//input[@type=\"file\"]")
	WebElement Attachment;

	public WebElement setAttachment() {
		return Attachment;
	}
	
	@FindBy(xpath = "//span[text()='Routes']")
	WebElement btnRoutes;

	public WebElement btnRoutes() {
		return btnRoutes;
	}
	
	@FindBy(xpath = "//span[text()='Static']")
	WebElement btnStatic;

	public WebElement clickStatic() {
		return btnStatic;
	}
	
	@FindBy(xpath = "(//button[text()='Details'])[1]")
	WebElement btnDetails;

	public WebElement clickDetails() {
		return btnDetails;
	}

	@FindBy(xpath = "//a[@role='tab']//span[text()='Contacts']")
	WebElement btnContacts;

	public WebElement clickContacts() {
		return btnContacts;
	}
	

	@FindBy(xpath = "//div[text()=' Contact Name ']//i")
	WebElement btnAddContacts;

	public WebElement clickAddContacts() {
		return btnAddContacts;
	}


	@FindBy(xpath = "(//input[@name='email'])[1]")
	WebElement txtEmail;

	public WebElement setEmail() {
		return txtEmail;
	}
	
	@FindBy(xpath = "(//p-dropdown[@placeholder='Select Contact Types ...'])[1]")
	WebElement drpContactType;

	public WebElement selectContactType() {
		return drpContactType;
	}
	
	@FindBy(xpath = "(//p-dropdown[@placeholder='Select Title'])[1]")
	WebElement drpTitle;

	public WebElement selectTitle() {
		return drpTitle;
	}
	
	@FindBy(xpath = "//input[@id='firstName']")
	WebElement txtFirstName;

	public WebElement setFirstName() {
		return txtFirstName;
	}
	
	@FindBy(xpath = "//span[text()='Tasks']")
	WebElement btnTasks;

	public WebElement clickTasks() {
		return btnTasks;
	}
	
	@FindBy(xpath = "//div[text()=' Tasks ']//i")
	WebElement btnAddTasks;

	public WebElement clickAddTask() {
		return btnAddTasks;
	}
	
	@FindBy(xpath = "(//textarea[@name='taskName'])[1]")
	WebElement txtTaskDetail;

	public WebElement setTaskDetails() {
		return txtTaskDetail;
	}
	
	@FindBy(xpath = "(//p-multiselect[@placeholder='Select Users'])[1]")
	WebElement drpSelectUser;

	public WebElement selectUser() {
		return drpSelectUser;
	}
	
	@FindBy(xpath = "(//div[@role='checkbox'])[1]")
	WebElement checkbox;

	public WebElement checkAllCheckbox() {
		return checkbox;
	}
	
	@FindBy(xpath = "(//button[text()='2'])[2]")
	WebElement nextPage;

	public WebElement clickNextPage() {
		return nextPage;
	}
	
	@FindBy(xpath = "//div[text()='You can select maximum 25 accounts!']")
	WebElement alert;

	public WebElement alertMessage() {
		return alert;
	}
	
	@FindBy(xpath = "(//strong[text()='Activity Logs ']//parent::span//following-sibling::span//i)[1]")
	WebElement btnAllActivity;

	public WebElement clickAllActivity() {
		return btnAllActivity;
	}
	
	@FindBy(xpath = "//input[@placeholder=\"Search by ...\"]")
	WebElement txtSearch;

	public WebElement searchActivity() {
		return txtSearch;
	}
	
	@FindBy(xpath = "(//p-calendar[@placeholder='mm/dd/yyyy'])[1]")
	WebElement startDate;

	public WebElement selectStartDate() {
		return startDate;
	}
	
	@FindBy(xpath = "(//p-calendar[@placeholder='mm/dd/yyyy'])[2]")
	WebElement endDate;

	public WebElement selectEndDate() {
		return endDate;
	}
	
	@FindBy(xpath = "//p-dropdown[@optionlabel='category.name']")
	WebElement drpTaskCatagory;

	public WebElement selectTaskCatagory() {
		return drpTaskCatagory;
	}
	
	@FindBy(xpath = "//p-dropdown[@placeholder='Select Module']")
	WebElement drpModule;

	public WebElement selectModule() {
		return drpModule;
	}
	

	@FindBy(xpath = "(//tbody)[2]//tr[1]//td[1]")
	WebElement addedContact;

	public WebElement AddedContact() {
		return addedContact;
	}
	
	@FindBy(xpath="(//span[@ptooltip=\"View\"])[1]")
	WebElement btnViewContact;
	
	public WebElement clickViewContact(){
		return btnViewContact;
	}
	
	@FindBy(xpath="//span[text()='View Contact']")
	WebElement txtViewContactHeader;
	
	public WebElement ViewContactHeader(){
		return txtViewContactHeader;
	}
	
	@FindBy(xpath="(//span[@ptooltip=\"Delete\"])[1]")
	WebElement btnDeleteContact;
	
	public WebElement clickDeleteContact(){
		return btnDeleteContact;
	}
	
	@FindBy(xpath="//span[@ptooltip=\"Edit\"]")
	WebElement btnEditContact;
	
	public WebElement clickEditContact(){
		return btnEditContact;
	}
	
	@FindBy(xpath="(//input[@name='middleName'])[1]")
	WebElement txtMiddleInitial;
	
	public WebElement setMiddleInitial(){
		return txtMiddleInitial;
	}
	
	@FindBy(xpath="(//input[@id='lastName'])[1]")
	WebElement txtLastName;
	
	public WebElement setLastName(){
		return txtLastName;
	}
	
	@FindBy(xpath="(//input[@id='email0'])[1]")
	WebElement txtCE1;
	
	public WebElement setCE1(){
		return txtCE1;
	}
	@FindBy(xpath="(//input[@id='email1'])[1]")
	WebElement txtCE2;
	
	public WebElement setCE2(){
		return txtCE2;
	}
	
	@FindBy(xpath="(//input[@id='email2'])[1]")
	WebElement txtHomeEmail;
	
	public WebElement setHomeEmail(){
		return txtHomeEmail;
	}
	
	@FindBy(xpath="(//input[@id='email3'])[1]")
	WebElement txtWorkEmail;
	
	public WebElement setWorkEmail(){
		return txtWorkEmail;
	}
	
	@FindBy(xpath="(//input[@id='phone0'])[1]")
	WebElement txtCP1;
	
	public WebElement setCP1(){
		return txtCP1;
	}
	
	@FindBy(xpath="(//input[@id='phone1'])[1]")
	WebElement txtCP2;
	
	public WebElement setCP2(){
		return txtCP2;
	}
	
	@FindBy(xpath="(//input[@id='phone2'])[1]")
	WebElement txtHomePhone;
	
	public WebElement setHomePhone(){
		return txtHomePhone;
	}
	
	@FindBy(xpath="(//input[@id='phone3'])[1]")
	WebElement txtMobilePhone;
	
	public WebElement setMobilePhone(){
		return txtMobilePhone;
	}
	@FindBy(xpath="(//input[@id='phone4'])[1]")
	WebElement txtWorkPhone;
	
	public WebElement setWorkPhone(){
		return txtWorkPhone;
	}
	
	@FindBy(xpath="(//h5//div)[1]")
	WebElement txtRouteDisc;
	
	public WebElement routeDiscription(){
		return txtRouteDisc;
	}
	
	@FindBy(xpath="(//tbody//tr[1]//td[1])[2]")
	WebElement listedContact;
	
	public WebElement ListedContact(){
		return listedContact;

	}
	
	@FindBy(xpath="//span[text()='Lead Details']//parent::div//button")
	WebElement crossButton;
	
	public WebElement ClickCrossButton(){
		return crossButton;
	}
}




