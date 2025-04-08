package com.liono360.pageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.liono360.loginPage.Baseclass;

public class OpportunitiesPage extends Baseclass {

	WebDriver ldriver;

	public OpportunitiesPage(WebDriver rdriver) {
		ldriver = rdriver;

		PageFactory.initElements(rdriver, this);
	}
	
	

	


	@FindBy(xpath = "(//span[contains(text(),'Opportunities')])[1]")
	WebElement btnOpportunity;

	public WebElement clickOpportunity() {
		return btnOpportunity;
	}

	@FindBy(xpath = "//tbody//tr[1]//td[1]")
	WebElement addedOpportunity;

	public WebElement AddedOpportunity() {
		return addedOpportunity;
	}
	
	@FindBy(xpath = "//tbody//tr[1]//td[2]")
	WebElement ListedOpportunity;

	public WebElement ListedOpportunity() {
		return ListedOpportunity;
	}

	@FindBy(xpath = "//span[text()='View']")
	WebElement btnViewOpportunity;

	public WebElement clickViewOpportuity() {
		return btnViewOpportunity;
	}

	@FindBy(xpath = "//h5[text()='View Opportunity']")
	WebElement txtVieHeader;

	public WebElement ViewOpportunityHeader() {
		return txtVieHeader;
	}

	@FindBy(xpath = "//span[contains(text(),'Delete')]")
	WebElement btnDeleteOpportunity;

	public WebElement clickDeleteOpportunity() {
		return btnDeleteOpportunity;
	}

	@FindBy(xpath = "//span[text()='Yes']")
	WebElement btnYes;

	public WebElement clickYesButton() {
		return btnYes;
	}

	@FindBy(xpath = "//span[text()='New']")
	WebElement btnAddOpportunity;

	public WebElement clickAddOpportunity() {
		return btnAddOpportunity;
	}

	@FindBy(xpath = "//input[@formcontrolname='name']")
	WebElement txtOpportunityName;

	public WebElement setOpportunityName() {
		return txtOpportunityName;
	}
	
	@FindBy(xpath = "//input[@formcontrolname='name']")
	WebElement ClearOpportunityName;

	public WebElement ClearOpportunityName() {
		return ClearOpportunityName;
	}
	
	

	@FindBy(xpath = "//input[@placeholder='Select Account Name']")
	WebElement txtAccountname;

	public WebElement setAccountname() {
		return txtAccountname;
	}

	@FindBy(xpath = "//p-dropdown[@formcontrolname='ownerId']")
	WebElement drpOwner;

	public WebElement selectOwner() {
		return drpOwner;
	}

	@FindBy(xpath = "//input[@placeholder='Select Contact Name']")
	WebElement txtContactNames;

	public WebElement ContactNames() {
		return txtContactNames;
	}

	@FindBy(xpath = "//input[@placeholder='Enter Contact Email']")
	WebElement txtContactEmail;

	public WebElement setContactEmail() {
		return txtContactEmail;
	}

	@FindBy(xpath = "//input[@placeholder='Enter Contact Phone']")
	WebElement txtcontactPhone;

	public WebElement setcontactPhone() {
		return txtcontactPhone;
	}

	@FindBy(xpath = "//p-dropdown[@formcontrolname=\"ratingId\"]")
	WebElement drpQuality;

	public WebElement selectQuality() {
		return drpQuality;
	}

	@FindBy(xpath = "(//p-dropdown[@formcontrolname=\"sourceId\"])[1]")
	WebElement drpSource;

	public WebElement selectSource() {
		return drpSource;
	}

	@FindBy(xpath = "(//p-calendar[@placeholder=\"dd/mm/yyyy\"])[1]")
	WebElement drpClosedate;

	public WebElement selectClosedate() {
		return drpClosedate;
	}

	@FindBy(xpath = "(//p-dropdown[@formcontrolname=\"opportunityStageId\"])[1]")
	WebElement drpStage;

	public WebElement selectStage() {
		return drpStage;
	}

	@FindBy(xpath = "//input[@placeholder=\"%\"]")
	WebElement textRepConfidence;

	public WebElement setRepConfidence() {
		return textRepConfidence;
	}

	@FindBy(xpath = "//p-inputnumber[@formcontrolname=\"totalAmount\"]//input")
	WebElement textTotalAmount;

	public WebElement setTotalAmount() {
		return textTotalAmount;
	}

	@FindBy(xpath = "(//textarea[@name='description'])[1]")
	WebElement textNotes;

	public WebElement setNotes() {
		return textNotes;
	}
	
	@FindBy(xpath = "(//textarea[@formcontrolname=\"description\"])[1]")
	WebElement opportunityDetails;

	public WebElement SetopportunityDetails() {
		return opportunityDetails;
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
	
	
	
	@FindBy(xpath = "//span[text()='Inventory Item']")
	WebElement InventoryItem;

	public WebElement InventoryItem() {
		return InventoryItem;
	}
	
	
	
	
	@FindBy(xpath = "(//p-dropdown[@placeholder=\"Select Location\"])[1]")
	WebElement drpLoactionList;

	public WebElement selectLocation() {
		return drpLoactionList;
	}

	
	
	@FindBy(xpath = "(//tbody//tr[1])[2]")
	WebElement selectItem1;

	public WebElement selectItem1() {
		return selectItem1;
	}
	
	
	
	
	@FindBy(xpath = "(//tbody//tr[3])[2]")
	WebElement selectItem2;

	public WebElement selectItem2() {
		return selectItem2;
	}
	
	
	
	@FindBy(xpath = "(//tbody//tr[5])[2]")
	WebElement selectItem3;

	public WebElement selectItem3() {
		return selectItem3;
	}
	
	
	
	
	
	@FindBy(xpath = "//input[@placeholder=\"Search...\"]")
	WebElement globalSearch;

	public WebElement GloabalSearch() {
		return globalSearch;
	}

	@FindBy(xpath = "//span[text()='Save']")
	WebElement btnSave;

	public WebElement clickSave() {
		return btnSave;
	}

	@FindBy(xpath = "//span[text()='Add']")
	WebElement btnAdd;

	public WebElement clickAdd() {
		return btnAdd;
	}

	@FindBy(xpath = "//span[text()='Edit']")
	WebElement btnEdit;

	public WebElement clickEdit() {
		return btnEdit;
	}

	@FindBy(xpath = "(//input[@placeholder='Search...'])[1]")
	WebElement search;

	public WebElement searchOpportunity() {
		return search;
	}

	@FindBy(xpath = "//span[text()='Clone']")
	WebElement btnClone;

	public WebElement ClickClone() {
		return btnClone;
	}

	@FindBy(xpath = "//textarea[@name=\"comment\"]")
	WebElement commentBox;

	public WebElement setComment() {
		return commentBox;
	}

	@FindBy(xpath = "//div[text()='Choose reason']")
	WebElement drpChooseReason;

	public WebElement selectReason() {
		return drpChooseReason;
	}

	@FindBy(xpath = "//span[text()='Inactive Opportunity']")
	WebElement btnInactive;

	public WebElement clickInactive() {
		return btnInactive;
	}

	@FindBy(xpath = "//span[text()='Active']")
	WebElement toggleActivInactive;

	public WebElement clickActiveInactive() {
		return toggleActivInactive;
	}

	@FindBy(xpath = "(//p-dropdown[@id='opportunityPipelines'])[1]")
	WebElement channelSwitch;

	public WebElement setChannel() {
		return channelSwitch;
	}

	@FindBy(xpath = "(//div[@class='p-checkbox-box'])[2]")
	WebElement checkbox;

	public WebElement ClickCustCheckbox() {
		return checkbox;
	}

	@FindBy(xpath = "(//p-dropdown[@id='Cust_dropdown'])[1]")
	WebElement drpDropdon;

	public WebElement clickCustDropdon() {
		return drpDropdon;
	}

	@FindBy(xpath = "//input[@id='Cust_inputbox']")
	WebElement txtInputbox;

	public WebElement setCustInputBox() {
		return txtInputbox;
	}

	@FindBy(xpath = "//span[text()='List']//parent::a")
	WebElement drpCanabView;

	public WebElement clickCanabView() {
		return drpCanabView;
	}

	@FindBy(xpath = "//span[text()='Cancel']")
	WebElement btnCancel;

	public WebElement clickCancel() {
		return btnCancel;
	}
	
	
	//............................. stage Changed ..............................................//
	
	
	@FindBy(xpath = "(//div[@class='step handPointer ng-star-inserted'])[1]")
	WebElement FirstStage;

	public WebElement FirstStage() {
		return FirstStage;
	}
	
	
	
	@FindBy(xpath = "(//div[@class='step handPointer ng-star-inserted'])[2]")
	WebElement SecondStage;

	public WebElement SecondStage() {
		return SecondStage;
	}
	

	
	@FindBy(xpath = "(//div[@class='step handPointer ng-star-inserted'])[3]")
	WebElement CustomStage;

	public WebElement CustomStage() {
		return CustomStage;
	}
	
	@FindBy(xpath = "(//div[@class='step handPointer ng-star-inserted'])[4]")
	WebElement ClosedStage;

	public WebElement ClosedStage() {
		return ClosedStage;
	}
	
	
	
	@FindBy(xpath = "(//p-dropdown[@id='closedStages'])[1]")
	WebElement ClosedStageReason;

	public WebElement ClosedStageReason() {
		return ClosedStageReason;
	}
	
	
	@FindBy(xpath = "(//p-multiselect[@id='closeWonQualifiedReasons'])[1]")
	WebElement WonReason;

	public WebElement CloseWonReason() {
		return WonReason;
	}
	
	
	@FindBy(xpath = "(//input[@placeholder='mm/dd/yyyy'])[1]")
	WebElement ClosedWonDate;

	public WebElement ClosedWonDate() {
		return ClosedWonDate;
	}
	
	
	
	
	//..........................Activity Time line.............................................................//
	
	@FindBy(xpath = "(//span[normalize-space()='Activity'])[1]")
	WebElement ActivityTab;

	public WebElement ActivityTab() {
		return ActivityTab;
	}

	@FindBy(xpath = "(//i[@class='pi pi-plus'])[1]")
	WebElement PlusIcon;

	public WebElement PlusIcon() {
		return PlusIcon;
	}

	@FindBy(xpath = "(//span[normalize-space()='Email'])[1]")
	WebElement EmailBox;

	public WebElement EmailBox() {
		return EmailBox;
	}
	
	//................Email....................//
	
	@FindBy(xpath = "(//p-autocomplete[@id='toRecips'])[1]")
	WebElement TO;

	public WebElement TO() {
		return TO;
	}
	
	@FindBy(xpath = "(//input[@id='subject'])[1]")
	WebElement Subject;

	public WebElement Subject() {
		return Subject;
	}
	
	@FindBy(xpath = "(//div[@class='ql-editor ql-blank'])[1]")
	WebElement EnterText;

	public WebElement EnterText() {
		return EnterText;
	}
	
	
	@FindBy(xpath = "//span[text()='Send now']")
	WebElement Option;

	public WebElement Option() {
		return Option;
	}
	
	
	@FindBy(xpath = "(//span[normalize-space()='Send'])[1]")
	WebElement Send;

	public WebElement Send() {
		return Send;
	}
	
	//...............................Logs...................................//
	
	
	
	@FindBy(xpath = "(//span[normalize-space()='Logs'])[1]")
	WebElement logs;

	public WebElement logs() {
		return logs;
	}

	@FindBy(xpath = "(//p-dropdown[@id='logType'])[1]")
	WebElement SelectType;

	public WebElement SelectType() {
		return SelectType;
	}
	
	
	@FindBy(xpath = "(//textarea[@placeholder='Enter Comment'])[1]")
	WebElement Comment;

	public WebElement LogComment() {
		return Comment;
	}
	
	
	@FindBy(xpath = "//span[text()='Save']")
	WebElement SaveLogbtn;

	public WebElement SaveLogbtn() {
		return SaveLogbtn;
	}
	
	
	@FindBy(xpath = "(//p-dropdown[@id='subLogType'])[1]")
	WebElement SelectSubType;

	public WebElement SelectSubType() {
		return SelectSubType;
	}
	
	
	//.................................Edit Logs ........................................................//
	
	
	@FindBy(xpath = "(//div[@class='p-d-flex cursor-pointer'])[1]")
	WebElement FirstLog;

	public WebElement FirstLog() {
		return FirstLog;
	}
	
	
	
	@FindBy(xpath = "(//div[@class='p-d-flex cursor-pointer'])[2]")
	WebElement SecondLog;

	public WebElement SecondLog() {
		return SecondLog;
	}
	
	
	@FindBy(xpath = "(//div[@class='p-d-flex cursor-pointer'])[3]")
	WebElement ThirdLog;

	public WebElement ThirdLog() {
		return ThirdLog;
	}
	
	@FindBy(xpath = "(//i[@class='pi pi-pencil'])[1]")
	WebElement EditLog;

	public WebElement EditLog() {
		return EditLog;
	}

	
	@FindBy(xpath = "(//textarea[@name='description'])[1]")
	WebElement Description;

	public WebElement Description1() {
		return Description;
	}
	
	@FindBy(xpath = "(//textarea[@name='description'])[2]")
	WebElement Description2;

	public WebElement Description2() {
		return Description2;
	}
	
	@FindBy(xpath = "(//span[normalize-space()='Save'])[1]")
	WebElement SaveEditLog;

	public WebElement SaveEditLog() {
		return SaveEditLog;
	}
	
//.................................Delete Log...................................................//	
	
	
	
	@FindBy(xpath = "(//i[@class='pi pi-trash'])[1]")
	WebElement DeleteLog1;

	public WebElement DeleteLog1() {
		return DeleteLog1;
	}
	
	
	@FindBy(xpath = "(//i[@class='pi pi-trash'])[2]")
	WebElement DeleteLog2;

	public WebElement DeleteLog2() {
		return DeleteLog2;
	}
	
	@FindBy(xpath = "(//i[@class='pi pi-trash'])[3]")
	WebElement DeleteLog3;

	public WebElement DeleteLog3() {
		return DeleteLog3;
	}
	
	
	
	@FindBy(xpath = "(//span[normalize-space()='Yes'])[1]")
	WebElement Yes;

	public WebElement Yes() {
		return Yes;
	}
	
	
	//.....................All Activity List................................................//
	
	
	@FindBy(xpath = "//span[@ptooltip='All Activity List']")
	WebElement AllActivityList;

	public WebElement AllActivityList() {
		return AllActivityList;
	}
	
	
	
	@FindBy(xpath = "(//p-dropdown[@placeholder='Select Activity'])[1]")
	WebElement SelectActivityFilter;

	public WebElement SelectActivityFilter() {
		return SelectActivityFilter;
	}
	
	
	//............................All Activity List Filter.......................................................//
	
	
	@FindBy(xpath = "(//span[@class='p-button-icon pi pi-filter'])[1]")
	WebElement FilterClick;

	public WebElement FilterClick() {
		return FilterClick;
	}
	
	
	
	

	@FindBy(xpath = "(//p-dropdown[@placeholder='Select Field'])[1]")
	WebElement Filter;

	public WebElement Filter() {
		return Filter;
	}
	

	@FindBy(xpath = "(//p-dropdown[@placeholder='Select Operator'])[1]")
	WebElement Operator;

	public WebElement Operator() {
		return Operator;
	}
	

	@FindBy(xpath = "(//input[@placeholder='Enter Value'])[1]")
	WebElement Value;

	public WebElement Value() {
		return Value;
	}
	
	@FindBy(xpath = "(//p-multiselect[@placeholder='Select Items'])[1]")
	WebElement Value2;

	public WebElement Value2() {
		return Value2;
	}
	
	@FindBy(xpath = "//span[text()='Add Filter']")
	WebElement AddFilter;

	public WebElement AddFilter() {
		return AddFilter;
	}
	
	@FindBy(xpath = "(//span[normalize-space()='Apply'])[1]")
	WebElement Apply;

	public WebElement Apply() {
		return Apply;
	}
	
	@FindBy(xpath = "(//span[normalize-space()='Reset'])[1]")
	WebElement Reset;

	public WebElement Reset() {
		return Reset;
	}
	
	//............................All Activity List Group By.......................................................//
	
	
	@FindBy(xpath = "//button[@ptooltip='Group by']")
	WebElement GroupBybtnClick;

	public WebElement GroupBybtnClick() {
		return GroupBybtnClick;
	}


	
	@FindBy(xpath = "(//p-dropdown[@placeholder='Select Field'])[1]")
	WebElement GroupBy;

	public WebElement GroupBy() {
		return GroupBy;
	}
	
	
	//......................................Tab Filter.......................................................//
	
	@FindBy(xpath = "//span[@ptooltip='Filter']")
	WebElement TabFilter;

	public WebElement TabFilter() {
		return TabFilter;
	}
	
	@FindBy(xpath = "(//span[normalize-space()='All Activity'])[1]")
	WebElement AllActivity;

	public WebElement AllActivity() {
		return AllActivity;
	}
	
	
	@FindBy(xpath = "(//span[normalize-space()='User Activity'])[1]")
	WebElement UserActivity;

	public WebElement UserActivity() {
		return UserActivity;
	}
	
	@FindBy(xpath = "(//span[normalize-space()='System Activity'])[1]")
	WebElement SystemActivity;

	public WebElement SystemActivity() {
		return SystemActivity;
	}
	
	
	@FindBy(xpath = "(//span[normalize-space()='Favorite'])[1]")
	WebElement Favorite;

	public WebElement Favorite() {
		return Favorite;
	}
	
	
//...............................Add Task.......................................................//	
	
	
	@FindBy(xpath = "//span[text()='Tasks']")
	WebElement AddTask;

	public WebElement AddTask() {
		return AddTask;
	}
	
	
	@FindBy(xpath = "(//i[@class='pi pi-plus'])[1]")
	WebElement AddTaskPlus;

	public WebElement AddTaskPlus() {
		return AddTaskPlus;
	}
	
	
	@FindBy(xpath = "//label[normalize-space()='Task Title']//following::input[1]")
	WebElement TaskTitle;

	public WebElement TaskTitle() {
		return TaskTitle;
	}
	
	@FindBy(xpath = "(//textarea[@name='taskName'])[1]")
	WebElement TaskDetails;

	public WebElement TaskDetails() {
		return TaskDetails;
	}
	
	@FindBy(xpath = "(//p-calendar[@placeholder='mm/dd/yyyy'])[1]")
	WebElement StartDate;

	public WebElement StartDate() {
		return StartDate;
	}
	
	@FindBy(xpath = "(//p-calendar[@placeholder='mm/dd/yyyy'])[2]")
	WebElement EndDate;

	public WebElement EndDate() {
		return EndDate;
	}
	
	@FindBy(xpath = "(//p-dropdown[@placeholder='Select Module'])[1]")
	WebElement ReleatedTo;

	public WebElement ReleatedTo() {
		return ReleatedTo;
	}
	
	@FindBy(xpath = "(//p-dropdown[@placeholder='Select Channel'])[1]")
	WebElement Channel;

	public WebElement Channel() {
		return Channel;
	}
	
	
	@FindBy(xpath = "(//p-dropdown[@placeholder='Select Users'])[1]")
	WebElement AssignedTo;

	public WebElement AssignedTo() {
		return AssignedTo;
	}
	
	
	@FindBy(xpath = "//p-dropdown[@optionlabel='category.name']")
	WebElement TaskCategory;

	public WebElement TaskCategory() {
		return TaskCategory;
	}
	
	@FindBy(xpath = "(//p-dropdown[@id='associationNames'])[1]")
	WebElement Association;

	public WebElement Association() {
		return Association;
	}
	
	@FindBy(xpath = "(//p-multiselect[@placeholder='Select Stage'])[1]")
	WebElement Stage;

	public WebElement Stage() {
		return Stage;
	}
	
	@FindBy(xpath = "(//i[@class='pi pi-plus'])[2]")
	WebElement AddCheckList;

	public WebElement AddCheckList() {
		return AddCheckList;
	}
	
	
	
	@FindBy(xpath = "//label[normalize-space()='List Item']//following::input[1]")
	WebElement AddTextInChecklist;

	public WebElement AddTextInChecklist() {
		return AddTextInChecklist;
	}
	
	@FindBy(xpath = "(//span[normalize-space()='Show More'])[1]")
	WebElement ShowMore;

	public WebElement ShowMore() {
		return ShowMore;
	}
	
	
	@FindBy(xpath = "(//p-dropdown[@placeholder='Selected Reminder Type'])[1]")
	WebElement ReminderType;

	public WebElement ReminderType() {
		return ReminderType;
	}
	
	@FindBy(xpath = "(//p-dropdown[@placeholder='Selected Reminder'])[1]")
	WebElement Reminder;

	public WebElement Reminder() {
		return Reminder;
	}
	
	
	@FindBy(xpath = "(//p-dropdown[@placeholder='Selected Repeat'])[1]")
	WebElement TaskRepeat;

	public WebElement TaskRepeat() {
		return TaskRepeat;
	}
	
	@FindBy(xpath = "(//p-dropdown[@placeholder='Selected Priority'])[1]")
	WebElement Priority;

	public WebElement Priority() {
		return Priority;
	}
	
	
	@FindBy(xpath = "(//span[@class='p-button-label'][normalize-space()='Save'])[2]")
	WebElement Save1;

	public WebElement Save1() {
		return Save1;
	}
	
	@FindBy(xpath = "(//span[normalize-space()='Save'])[1]")
	WebElement Save2;

	public WebElement Save2() {
		return Save2;
	}
	
	
//......................................Column Setting..............................................//	
	
	@FindBy(xpath = "(//span[normalize-space()='Settings'])[1]")
	WebElement Setting;

	public WebElement Setting() {
		return Setting;
	}
	
	
	@FindBy(xpath = "//span[normalize-space()='Account Name']//parent::*//p-checkbox")
	WebElement AccNameCheckboc;

	public WebElement AccNameCheckboc() {
		return AccNameCheckboc;
	}
	
	
	@FindBy(xpath = "//span[normalize-space()='Contact Name']//parent::*//p-checkbox")
	WebElement ContactName;

	public WebElement ContactName() {
		return ContactName;
	}
	
	@FindBy(xpath = "//span[normalize-space()='Contact Email']//parent::*//p-checkbox")
	WebElement ContactEmail;

	public WebElement ContactEmail() {
		return ContactEmail;
	}
	
	
	@FindBy(xpath = "//span[normalize-space()='Contact Phone']//parent::*//p-checkbox")
	WebElement ContactPhone;

	public WebElement ContactPhone() {
		return ContactPhone;
	}
	
	@FindBy(xpath = "//span[normalize-space()='Owner']//parent::*//p-checkbox")
	WebElement Owner;

	public WebElement Owner() {
		return Owner;
	}
	
	
	@FindBy(xpath = "//span[normalize-space()='Quality']//parent::*//p-checkbox")
	WebElement Quality;

	public WebElement Quality() {
		return Quality;
	}
	
	@FindBy(xpath = "//span[normalize-space()='Source']//parent::*//p-checkbox")
	WebElement Source;

	public WebElement Source() {
		return Source;
	}
	
	
	@FindBy(xpath = "//span[normalize-space()='Created By']//parent::*//p-checkbox")
	WebElement CreatedBy;

	public WebElement CreatedBy() {
		return CreatedBy;
	}
	
	@FindBy(xpath = "//span[normalize-space()='Last Updated By']//parent::*//p-checkbox")
	WebElement LastUpdatedBy;

	public WebElement LastUpdatedBy() {
		return LastUpdatedBy;
	}
	
	@FindBy(xpath = "//span[normalize-space()='Last Updated Date']//parent::*//p-checkbox")
	WebElement LastUpdatedDate;

	public WebElement LastUpdatedDate() {
		return LastUpdatedDate;
	}
	
	
	@FindBy(xpath = "(//input[@placeholder='Search for fields'])[1]")
	WebElement SearchFeilds;

	public WebElement SearchFeilds() {
		return SearchFeilds;
	}

	
	
	@FindBy(xpath = "(//span[normalize-space()='Save'])[1]")
	WebElement SaveColumnSetting;

	public WebElement SaveColumnSetting() {
		return SaveColumnSetting;
	}

	
//.......................Configuration Part..............................................................//	
	
	
	
	
	
	
	
	
	
	
	
}
