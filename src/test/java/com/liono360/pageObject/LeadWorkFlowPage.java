package com.liono360.pageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.net.UrlChecker.TimeoutException;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.liono360.loginPage.Baseclass;

public class LeadWorkFlowPage extends Baseclass {

	WebDriver ldriver;

	public LeadWorkFlowPage(WebDriver rdriver) {
		ldriver = rdriver;
		
		PageFactory.initElements(rdriver, this);
	}
	
	public void waitUntilPageLoad() throws InterruptedException {
		int maxWaitingTime = 40;
		Thread.sleep(1000); 
		float time=1;
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
	    while (time<maxWaitingTime) {
			WebElement LoaderIcon = null;
			try {
				LoaderIcon = driver.findElement(By.xpath("//div[@class=\"splash-loader\"]"));

			} catch (Exception e) {
				System.out.println("Now Page loaded fully !....");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				break; 
			}

			if (LoaderIcon!=null) {

				Thread.sleep(500); 
				time=(float) (time+.5);
				System.out.println("page loader icon is occuring till: "+time +"Seconds");
			} 
			else {
				break;
			}
		    
		}
		
	  }

	

	
	@FindBy(xpath="//span[text()='Misc.']")
	WebElement btnMisc;

	public WebElement clickMisc() {
		return btnMisc;
	}
	
	@FindBy(xpath="//span[text()='View']")
	WebElement btnview;

	public WebElement clickview() {
		return btnview;
	}
	
	@FindBy(xpath="//span[text()='Edit']")
	WebElement btnEdit;

	public WebElement btnEdit() {
		return btnEdit;
	}
	
	@FindBy(xpath="//span[text()='Delete']")
	WebElement btnDelete;

	public WebElement clickDelete() {
		return btnDelete;
	}
	
	
	@FindBy(xpath="//h5[text()='Workflow Details ']")
	WebElement btnHeaderInview;

	public WebElement HeaderInview() {
		return btnHeaderInview;
	}
	
	@FindBy(xpath="//span[text()='Workflow']")
	WebElement btnWorkFlow;

	public WebElement clickWorkFlow() {
		return btnWorkFlow;
	}
	
	@FindBy(xpath="//span[text()='New']")
	WebElement btnNew;

	public WebElement clickNew() {
		return btnNew;
	}
	
	@FindBy(xpath="//input[@formcontrolname=\"name\"]")
	WebElement txtName;

	public WebElement setName() {
		return txtName;
	}
	
	@FindBy(xpath="//input[@placeholder=\"Enter Subject\"]")
	WebElement txtSubject;

	public WebElement setSubject() {
		return txtSubject;
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

	
	@FindBy(xpath="//p-dropdown[@formcontrolname=\"selectedChannel\"]")
	WebElement radioEventBased;

	public WebElement ChooseEventBased() {
		return radioEventBased;
	}
	
	@FindBy(xpath="(//p-radiobutton[@name=\"selectedTriggerType\"])[1]")
	WebElement radioTrigger;

	public WebElement ChooseCreated() {
		return radioTrigger;
	}
	
	@FindBy(xpath="(//p-calendar[@placeholder=\"mm/dd/yyyy\"])[1]")
	WebElement drpStartDate;

	public WebElement selectStartDate() {
		return drpStartDate;
	}
	
	@FindBy(xpath="(//p-calendar[@placeholder=\"mm/dd/yyyy\"])[2]")
	WebElement drpEndDate;

	public WebElement selectEndDate() {
		return drpEndDate;
	}
	
	@FindBy(xpath="//button//span[text()='Next']")
	WebElement btnNext;

	public WebElement clickNext() {
		return btnNext;
	}
	
	@FindBy(xpath="//button[@label=\"Manual Condition\"]")
	WebElement btnManualCondition;

	public WebElement clickManualCondition() {
		return btnManualCondition;
	}
	
	@FindBy(xpath="//button[@label=\"Saved Search\"]")
	WebElement BtnSaveSearch;

	public WebElement clickSaveSearch() {
		return BtnSaveSearch;
	}
	
	@FindBy(xpath="(//i[@class='pi pi-plus'])[1]")
	WebElement btnPlus;

	public WebElement clickPlus() {
		return btnPlus;
	}
	
	@FindBy(xpath="//h6[text()=' Condition 1 (Manual Rules) ']//parent::div//i[@class=\"pi pi-plus\"]")
	WebElement btnPlusButton1;

	public WebElement PlusButton1() {
		return btnPlusButton1;
	}
	
	@FindBy(xpath="//h6[text()=' Condition 2 (Manual Rules) ']//parent::div//i[@class=\"pi pi-plus\"]")
	WebElement btnPlusButton2;

	public WebElement PlusButton2() {
		return btnPlusButton2;
	}
	@FindBy(xpath="//h6[text()=' Condition 3 (Manual Rules) ']//parent::div//i[@class=\"pi pi-plus\"]")
	WebElement btnPlusButton3;

	public WebElement PlusButton3() {
		return btnPlusButton3;
	}
	@FindBy(xpath="//h6[text()=' Condition 4 (Manual Rules) ']//parent::div//i[@class=\"pi pi-plus\"]")
	WebElement btnPlusButton4;

	public WebElement PlusButton4() {
		return btnPlusButton4;
	}
	@FindBy(xpath="//h6[text()=' Condition 5 (Manual Rules) ']//parent::div//i[@class=\"pi pi-plus\"]")
	WebElement btnPlusButton5;

	public WebElement PlusButton5() {
		return btnPlusButton5;
	}
	
	@FindBy(xpath="//button//span[text()='Select a Save Search']")
	WebElement drpSaveSearch;

	public WebElement selectSaveSearch() {
		return drpSaveSearch;
	}
	
	@FindBy(xpath="(//i[@class='pi pi-plus'])[6]")
	WebElement btnPlus2;

	public WebElement AddMoreRule() {
		return btnPlus2;
	}
	
	@FindBy(xpath="(//i[@class='pi pi-plus'])[3]")
	WebElement btnPlus3;

	public WebElement AddMoreAssociatedRule() {
		return btnPlus3;
	}
	
	@FindBy(xpath="(//liono-treeselect[@placeholder='Select a field'])[1]")
	WebElement drpFilter;

	public WebElement SelectFilter() {
		return drpFilter;
	}
	
	@FindBy(xpath="(//liono-treeselect[@placeholder='Select a field'])[2]")
	WebElement drpFilter2;

	public WebElement SelectFilter2() {
		return drpFilter2;
	}
	@FindBy(xpath="(//liono-treeselect[@placeholder='Select a field'])[3]")
	WebElement drpFilter3;

	public WebElement SelectFilter3() {
		return drpFilter3;
	}
	
	
	@FindBy(xpath="(//liono-treeselect[@placeholder='Select a field'])[4]")
	WebElement drpFilter4;

	public WebElement SelectFilter4() {
		return drpFilter4;
	}
	@FindBy(xpath="(//liono-treeselect[@placeholder='Select a field'])[5]")
	WebElement drpFilter5;

	public WebElement SelectFilter5() {
		return drpFilter5;
	}
	@FindBy(xpath="(//p-dropdown[@name='ruleFilter'])[6]")
	WebElement drpFilter6;

	public WebElement SelectFilter6() {
		return drpFilter6;
	}
	@FindBy(xpath="(//p-dropdown[@name='ruleFilter'])[7]")
	WebElement drpFilter7;

	public WebElement SelectFilter7() {
		return drpFilter7;
	}
	
	@FindBy(xpath="(//p-dropdown[@name='ruleFilter'])[8]")
	WebElement drpFilter8;

	public WebElement SelectFilter8() {
		return drpFilter8;
	}
	@FindBy(xpath="(//p-dropdown[@name='ruleFilter'])[9]")
	WebElement drpFilter9;

	public WebElement SelectFilter9() {
		return drpFilter9;
	}
	
	@FindBy(xpath="(//p-dropdown[@name='ruleFilter'])[10]")
	WebElement drpFilter10;

	public WebElement SelectFilter10() {
		return drpFilter10;
	}
	
	@FindBy(xpath="(//p-dropdown[@name='ruleFilter'])[11]")
	WebElement drpFilter11;

	public WebElement SelectFilter11() {
		return drpFilter11;
	}
	
	@FindBy(xpath="(//p-dropdown[@name='ruleFilter'])[12]")
	WebElement drpFilter12;

	public WebElement SelectFilter12() {
		return drpFilter12;
	}
	
	@FindBy(xpath="(//p-dropdown[@name='ruleFilter'])[13]")
	WebElement drpFilter13;

	public WebElement SelectFilter13() {
		return drpFilter13;
	}
	
	@FindBy(xpath="(//p-dropdown[@placeholder=\"select\"])[1]")
	WebElement drpOperator;

	public WebElement selectOperator() {
		return drpOperator;
	}
	
	@FindBy(xpath="(//p-dropdown[@placeholder=\"select\"])[3]")
	WebElement drpOperator3;

	public WebElement selectOperator3() {
		return drpOperator3;
	}
	
	@FindBy(xpath="(//p-dropdown[@placeholder=\"select\"])[2]")
	WebElement drpOperator2;

	public WebElement selectOperator2() {
		return drpOperator2;
	}
	
	@FindBy(xpath="(//p-dropdown[@placeholder=\"select\"])[4]")
	WebElement drpOperator4;

	public WebElement selectOperator4() {
		return drpOperator4;
	}
	
	@FindBy(xpath="(//p-dropdown[@placeholder=\"select\"])[5]")
	WebElement drpOperator5;

	public WebElement selectOperator5() {
		return drpOperator5;
	}
	
	@FindBy(xpath="(//p-dropdown[@placeholder=\"select\"])[11]")
	WebElement drpOperator11;

	public WebElement selectOperator11() {
		return drpOperator11;
	}
	
	@FindBy(xpath="(//input[@placeholder=\"Enter\"])[1]")
	WebElement txtvalue;

	public WebElement setConditionvalue() {
		return txtvalue;
	}
	
	@FindBy(xpath="(//input[@placeholder=\"Enter\"])[2]")
	WebElement txtvalue2;

	public WebElement setConditionvalue2() {
		return txtvalue2;
	}
	
	@FindBy(xpath="(//input[@placeholder=\"Enter\"])[3]")
	WebElement txtvalue3;

	public WebElement setConditionvalue3() {
		return txtvalue3;
	}
	@FindBy(xpath="(//input[@placeholder=\"Enter\"])[4]")
	WebElement txtvalue4;

	public WebElement setConditionvalue4() {
		return txtvalue4;
	}
	@FindBy(xpath="(//input[@placeholder=\"Enter\"])[5]")
	WebElement txtvalue5;

	public WebElement setConditionvalue5() {
		return txtvalue5;
	}
	@FindBy(xpath="(//input[@placeholder=\"Enter\"])[6]")
	WebElement txtvalue6;

	public WebElement setConditionvalue6() {
		return txtvalue6;
	}
	@FindBy(xpath="(//input[@placeholder=\"Enter\"])[7]")
	WebElement txtvalue7;

	public WebElement setConditionvalue7() {
		return txtvalue7;
	}
	
	@FindBy(xpath="(//input[@placeholder=\"Enter\"])[8]")
	WebElement txtvalue8;

	public WebElement setConditionvalue8() {
		return txtvalue8;
	}
	
	@FindBy(xpath="(//span[text()='Save'])[2]")
	WebElement btnSave;

	public WebElement clickSave2() {
		return btnSave;
	}
	
	@FindBy(xpath="(//span[text()='Save'])[1]")
	WebElement btnSaveWorkFlow;

	public WebElement clickSave1() {
		return btnSaveWorkFlow;
	}
	
	@FindBy(xpath="(//span[text()='Save'])[3]")
	WebElement clickSave3;

	public WebElement clickSave3() {
		return clickSave3;
	}
	
	@FindBy(xpath="(//p-dropdown[@placeholder=\"Add Actions\"])[1]")
	WebElement drpAddActions;

	public WebElement clickAddActions() {
		return drpAddActions;
	}
	
	@FindBy(xpath="(//p-dropdown[@placeholder=\"Add Actions\"])[2]")
	WebElement drpTimeDependentActions;

	public WebElement TimeDependentActions() {
		return drpTimeDependentActions;
	}
	
	@FindBy(xpath="//p-button[@label=\"Add Trigger Time\"]")
	WebElement btnTrigger;

	public WebElement clickTrigger() {
		return btnTrigger;
	}
	
	@FindBy(xpath="//input[@placeholder=\"0\"]")
	WebElement txtValue;

	public WebElement setValue() {
		return txtValue;
	}
	
	@FindBy(xpath="(//p-dropdown[@placeholder=\"Select\"])[1]")
	WebElement drpDays;

	public WebElement selectDays() {
		return drpDays;
	}
	
	@FindBy(xpath="(//p-dropdown[@placeholder=\"Select\"])[2]")
	WebElement drpAfter;

	public WebElement selectAfter() {
		return drpAfter;
	}
	
	@FindBy(xpath="(//p-dropdown[@placeholder=\"Select\"])[3]")
	WebElement drpExecutaionDate;

	public WebElement selectExecutaionDate() {
		return drpExecutaionDate;
	}
	
	@FindBy(xpath="//input[@placeholder=\"Enter Value\"]")
	WebElement txtTimeBasedValue;

	public WebElement setTimeBasedValue() {
		return txtTimeBasedValue;
	}
	
	@FindBy(xpath="//p-dropdown[@placeholder=\"Select Base\"]")
	WebElement drpBaseTime;

	public WebElement selectBaseTime() {
		return drpBaseTime;
	}
	
	@FindBy(xpath="(//p-dropdown[@placeholder=\"Select Assing Type\"])[1]")
	WebElement drpAssignType;

	public WebElement selectAssignType() {
		return drpAssignType;
	}
	
	@FindBy(xpath="(//p-multiselect[@placeholder=\"Select Users\"])[1]")
	WebElement drpUsers;

	public WebElement selectTaskUsers() {
		return drpUsers;
	}
	
	@FindBy(xpath="(//p-dropdown[@placeholder=\"Select Task Category\"])[1]")
	WebElement drpcatogary;

	public WebElement selectcatagory() {
		return drpcatogary;
	}
	
	@FindBy(xpath="(//p-dropdown[@placeholder=\"Select Reminder\"])[1]")
	WebElement drpReminder;

	public WebElement selectReminder() {
		return drpReminder;
	}
	
	@FindBy(xpath="(//p-dropdown[@placeholder=\"Select Reminder Type\"])[1]")
	WebElement drpReminderType;

	public WebElement selectReminderType() {
		return drpReminderType;
	}
	
	@FindBy(xpath="(//p-dropdown[@placeholder=\"Select Repeat Type\"])[1]")
	WebElement drpRepeatType;

	public WebElement selectRepeatType() {
		return drpRepeatType;
	}
	
	@FindBy(xpath="(//p-dropdown[@placeholder=\"Select Priority\"])[1]")
	WebElement drpPriority;

	public WebElement selectPriority() {
		return drpPriority;
	}
	
	@FindBy(xpath="//input[@placeholder=\"Enter Task End Days\"]")
	WebElement txtTaskEndDays;

	public WebElement setTaskEndDays() {
		return txtTaskEndDays;
	}
	
	@FindBy(xpath="//textarea[@formcontrolname=\"description\"]")
	WebElement txtDecription;

	public WebElement setDescription() {
		return txtDecription;
	}
	
	@FindBy(xpath="(//p-dropdown[@placeholder=\"Select Value\"])[1]")
	WebElement drpRuleValue;

	public WebElement selectRuleValue() {
		return drpRuleValue;
	}
	
	@FindBy(xpath="(//p-multiselect[@placeholder=\"Select Items\"])[1]")
	WebElement drpMultiRuleValue;

	public WebElement selectMultipleRuleValue() {
		return drpMultiRuleValue;
	}
	
	@FindBy(xpath="//span[text()='Lead Module Rule']")
	WebElement headerLeadModule;

	public WebElement HeaderLeadModule() {
		return headerLeadModule;
	}
	
	@FindBy(xpath="(//p-multiselect[@placeholder=\"Select Items\"])[6]")
	WebElement drpMultiRuleValue6;

	public WebElement selectMultipleRuleValue6() {
		return drpMultiRuleValue6;
	}
	
	
	@FindBy(xpath="(//p-multiselect[@placeholder=\"Select Job Function\"])")
	WebElement jobfunction;

	public WebElement selectjobfunction() {
		return jobfunction;
	}
	
	@FindBy(xpath="(//p-multiselect[@placeholder=\"Select Items\"])[2]")
	WebElement drpMultiRuleValue2;

	public WebElement selectMultipleRuleValue2() {
		return drpMultiRuleValue2;
	}
	
	@FindBy(xpath="(//p-multiselect[@placeholder=\"Select Items\"])[3]")
	WebElement drpMultiRuleValue3;

	public WebElement selectMultipleRuleValue3() {
		return drpMultiRuleValue3;
	}
	
	@FindBy(xpath="(//p-multiselect[@placeholder=\"Select Items\"])[4]")
	WebElement drpMultiRuleValue4;

	public WebElement selectMultipleRuleValue4() {
		return drpMultiRuleValue4;
	}
	
	@FindBy(xpath="(//p-multiselect[@placeholder=\"Select Items\"])[5]")
	WebElement drpMultiRuleValue5;

	public WebElement selectMultipleRuleValue5() {
		return drpMultiRuleValue5;
	}
	
	@FindBy(xpath="(//p-multiselect[@placeholder=\"Select Items\"])[7]")
	WebElement drpMultiRuleValue7;

	public WebElement selectMultipleRuleValue7() {
		return drpMultiRuleValue7;
	}
	
	@FindBy(xpath="(//p-multiselect[@placeholder=\"Select Items\"])[8]")
	WebElement drpMultiRuleValue8;

	public WebElement selectMultipleRuleValue8() {
		return drpMultiRuleValue8;
	}
	
	@FindBy(xpath="(//p-multiselect[@placeholder=\"Select Items\"])[9]")
	WebElement drpMultiRuleValue9;

	public WebElement selectMultipleRuleValue9() {
		return drpMultiRuleValue9;
	}
	
	@FindBy(xpath="//input[@placeholder=\"Search...\"]")
	WebElement txtGlobalSearch;

	public WebElement setGlobalSearch() {
		return txtGlobalSearch;
	}
	
	@FindBy(xpath="//span[text()='Active']")
	WebElement active;

	public WebElement active() {
		return active;
	}
	
	@FindBy(xpath="//span[text()='InActive']")
	WebElement inactive;

	public WebElement inactive() {
		return inactive;
	}
	
	@FindBy(xpath="//tbody//tr[1]//td[2]")
	WebElement listedWorkflow;

	public WebElement ListedWorkflow() {
		return listedWorkflow;
	}
	
	@FindBy(xpath="//span[text()='Run Scheduler']")
	WebElement btnRunScheduler;

	public WebElement clickRunScheduler() {
		return btnRunScheduler;
	}
	
	@FindBy(xpath="//span[text()='History']")
	WebElement btnHistory;

	public WebElement clickHistory() {
		return btnHistory;
	}
	
	@FindBy(xpath="//span[text()='Yes']")
	WebElement btnYes;

	public WebElement clickYes() {
		return btnYes;
	}
	
	@FindBy(xpath="//span[text()='Leads']")
	WebElement btnLeads;

	public WebElement clickLeads() {
		return btnLeads;
	}
	@FindBy(xpath="//input[@formcontrolname=\"firstName\"]")
	WebElement txtFirstname;

	public WebElement setFirstname() {
		return txtFirstname;
	}
	
	@FindBy(xpath="//input[@formcontrolname=\"leadNumber\"]")
	WebElement txtLeadNumber;

	public WebElement setLeadNumber() {
		return txtLeadNumber;
	}

	@FindBy(xpath="(//tbody//tr[1]//td[1])[1]")
	WebElement listedLeads;

	public WebElement ListedLeads() {
		return listedLeads;
	}
	
	@FindBy(xpath="//span[text()='Tasks']")
	WebElement btnTask;

	public WebElement clickTask() {
		return btnTask;
	}
	
	@FindBy(xpath="//span[text()='Refresh']")
	WebElement refresh;

	public WebElement clickRefresh() {
		return refresh;
	}
	
	@FindBy(xpath="(//tbody//tr[1])[2]//td[1]")
	WebElement listedTtask;

	public WebElement ListedTtask() {
		return listedTtask;
	}
	
	@FindBy(xpath="(//tbody//tr[3])[2]//td[1]")
	WebElement listedTtask3;

	public WebElement ListedTtask3() {
		return listedTtask;
	}
	
	@FindBy(xpath="//input[@formcontrolname=\"businessName\"]")
	WebElement txtLeadname;

	public WebElement setLeadName() {
		return txtLeadname;
	}
	
	@FindBy(xpath="//span[text()='Lead Details']")
	WebElement LeadDetails;

	public WebElement clickLeadDetails() {
		return LeadDetails;
	}
	
	@FindBy(xpath="//label[text()=' Lead Email ']//following-sibling::div//input")
	WebElement txtLeadEamil;

	public WebElement setLeadEmail() {
		return txtLeadEamil;
	}
	
	@FindBy(xpath="//label[text()=' Lead Phone ']//following-sibling::div//input")
	WebElement txtLeadPhone;

	public WebElement setLeadPhone() {
		return txtLeadPhone;
	}
	
	@FindBy(xpath="//p-dropdown[@placeholder=\"Select Lead Source\"]")
	WebElement drpLeadSource;

	public WebElement clickLeadSource() {
		return drpLeadSource;
	}
	
	@FindBy(xpath="//p-multiselect[@placeholder=\"Lead types\"]")
	WebElement drpLeadType;

	public WebElement selectLeadType() {
		return drpLeadType;
	}
	
	@FindBy(xpath="//input[@formcontrolname=\"foundedYear\"]")
	WebElement txtFoundedYear;

	public WebElement setFoundedYear() {
		return txtFoundedYear;
	}
	
	@FindBy(xpath="//label[text()=' Sim Sale ']//parent::div//input")
	WebElement txtSimSale;

	public WebElement setSimSale() {
		return txtSimSale;
	}
	
	@FindBy(xpath="//p-dropdown[@placeholder=\"Filter By Action Type\"]")
	WebElement filterActionType;

	public WebElement SelectActionTypeFilter() {
		return filterActionType;
	}
	
	
	@FindBy(xpath="//p-dropdown[@placeholder=\"Filter By Status\"]")
	WebElement filterStatus;
	public WebElement SelectfilterStatus() {
		return filterStatus;
	}
	
	@FindBy(xpath="//p-table//th[text()=' Execution Status ']//parent::tr//parent::thead//following-sibling::tbody//tr[1]//td[2]")
	WebElement listedEventInHistory;

	public WebElement executedEvent() {
		return listedEventInHistory;
	}
	
	@FindBy(xpath="//p-table//th[text()=' Execution Status ']//parent::tr//parent::thead//following-sibling::tbody//tr[2]//td[2]")
	WebElement listedEvent2InHistory;

	public WebElement executedEvent2() {
		return listedEvent2InHistory;
	}
	
	@FindBy(xpath="//p-table//th[text()=' Execution Status ']//parent::tr//parent::thead//following-sibling::tbody//tr[5]//td[2]")
	WebElement listedEvent5InHistory;

	public WebElement executedEvent5() {
		return listedEvent5InHistory;
	}
	
	@FindBy(xpath="//span[text()='Stop Scheduler']")
	WebElement btnstopScheduler;

	public WebElement stopScheduler() {
		return btnstopScheduler;
	}
	
	@FindBy(xpath="//span[text()='Overview']")
	WebElement btnOverView;

	public WebElement clickOverView() {
		return btnOverView;
	}
	
	
	@FindBy(xpath="//p-dropdown[@placeholder=\"Select Assing Type\"]")
	WebElement drpAssignType2;
	public WebElement selectAssignTypeTimeDependent() {
		return drpAssignType2;
	}
	
	@FindBy(xpath="//liono-treeselect[@placeholder=\"Select Users\"]")
	WebElement drpSentTo;
	public WebElement selectSentTo() {
		return drpSentTo;
	}
	
	@FindBy(xpath="//p-dropdown[@placeholder=\"Select Template\"]")
	WebElement drpTemplate;
	public WebElement SelectTemplate() {
		return drpTemplate;
	}
	
	
	
	@FindBy(xpath="//p-editor//p")
	WebElement txtEmailBody;
	public WebElement setEmailBody() {
		return txtEmailBody;
	}
	
	
	@FindBy(xpath="//input[@type=\"file\"]")
	WebElement setAttachment;
	public WebElement SetAttachment() {
		return setAttachment;
	}
	
	@FindBy(xpath="//i[@class=\"pi pi-refresh\"]")
	WebElement refreshWorkflow;
	public WebElement RefreshWorkflow() {
		return refreshWorkflow;
	}
	
	@FindBy(xpath="//label[text()=' Activation Number ']//parent::div//input")
	WebElement txtActivationNumber;
	
	public WebElement setActivationNumber() {
		return txtActivationNumber;
	}
	
	@FindBy(xpath="//label[text()=' Doing Business as (DBA) ']//parent::div//input")
	WebElement txtDBA;
	
	public WebElement setDBA() {
		return txtDBA;
	}
	
	@FindBy(xpath="//label[text()=' 1XR ']//parent::div//input")
	WebElement txt1XR;
	
	public WebElement set1XR() {
		return txt1XR;
	}
	
	@FindBy(xpath="//label[text()=' SIC Code ']//parent::div//input")
	WebElement txtSicCode;
	
	public WebElement setSicCode() {
		return txtSicCode;
	}
	
	@FindBy(xpath="//label[text()=' NAICS Code ']//parent::div//input")
	WebElement textNAICScode;
	
	public WebElement setNAICScode() {
		return textNAICScode;
	}
	
	@FindBy(xpath="//label[text()=' Tax ID (EIN) ']//parent::div//input")
	WebElement txtTaxID;
	
	public WebElement setTaxID() {
		return txtTaxID;
	}
	
	@FindBy(xpath="//label[text()=' Website ']//parent::div//input")
	WebElement txtWebsite;
	
	public WebElement setWebsite() {
		return txtWebsite;
	}
	

	@FindBy(xpath="//label[text()=' Twitter ']//parent::div//input")
	WebElement txtTwitter;
	
	public WebElement setTwitter() {
		return  txtTwitter ;
	}
	

	@FindBy(xpath="//label[text()=' Facebook ']//parent::div//input")
	WebElement txtFacebook;
	
	public WebElement setFacebook() {
		return  txtFacebook ;
	}
	
	@FindBy(xpath="//label[text()=' Linkedin ']//parent::div//input")
	WebElement txtLinkedin ;
	
	public WebElement setLinkedin() {
		return  txtLinkedin ;
	}
	
	
	@FindBy(xpath="//label[text()=' Instagram ']//parent::div//input")
	WebElement txtInstagram ;
	
	public WebElement setInstagram() {
		return  txtInstagram ;
	}
	
	@FindBy(xpath="//textarea[@formcontrolname=\"description\"]")
	WebElement txtNotes ;
	
	public WebElement setNotes() {
		return  txtNotes ;
	}
	
	@FindBy(xpath="//span[text()='Address Details']")
	WebElement btnAddressDetails ;
	
	public WebElement clickAddressDetails() {
		return  btnAddressDetails ;
	}
	
	@FindBy(xpath="//h5[text()=' Address Details ']//i")
	WebElement plusButton ;
	
	public WebElement plusButtonforAddress() {
		return  plusButton ;
	}
	
	@FindBy(xpath="//label[text()='Street Address 2']//parent::div//input")
	WebElement txtStreetAddress2 ;
	
	public WebElement txtStreetAddress2() {
		return  txtStreetAddress2 ;
	}
	
	@FindBy(xpath="//label[text()='Street Address 1']//parent::div//input")
	WebElement txtStreetAddress1 ;
	
	public WebElement setStreetAddress1() {
		return  txtStreetAddress1 ;
	}
	
	@FindBy(xpath="//label[text()='Zip/Postal Code']//parent::div//input")
	WebElement txtZipAddress ;
	
	public WebElement setZipAddress() {
		return  txtZipAddress ;
	}
	
	
	
	@FindBy(xpath="//p-dropdown[@placeholder='Select currency']")
	WebElement drpCurrency ;
	
	public WebElement selectCurrency() {
		return  drpCurrency ;
	}
	
	@FindBy(xpath="//p-dropdown[@placeholder=\"Select Time Zone\"]")
	WebElement drpTimeZone ;
	
	public WebElement selectTimeZone() {
		return  drpTimeZone ;
	}
	
	@FindBy(xpath="//p-dropdown[@placeholder=\"Select Employee\"]")
	WebElement drpNumberOfEmployee ;
	
	public WebElement selectNumberOfEmployee() {
		return  drpNumberOfEmployee ;
	}
	
	@FindBy(xpath="//p-dropdown[@placeholder=\"Select Revenue\"]")
	WebElement drpRevenue ;
	
	public WebElement selectRevenue() {
		return  drpRevenue ;
	}
	
	@FindBy(xpath="//p-dropdown[@placeholder=\"Select ownership\"]")
	WebElement drpOwnership ;
	
	public WebElement SelectOwnership() {
		return  drpOwnership ;
	}
	
	@FindBy(xpath="//p-dropdown[@placeholder=\"Select lead stage\"]")
	WebElement drpstage ;
	
	public WebElement selectStage() {
		return  drpstage ;
	}

	@FindBy(xpath="//p-dropdown[@placeholder=\"Select Industry\"]")
	WebElement drpIndustry ;
	
	public WebElement selectIndustry() {
		return  drpIndustry ;
	}
	
	@FindBy(xpath="//p-dropdown[@placeholder=\"Select Rating\"]")
	WebElement drpRating ;
	
	public WebElement selectRating() {
		return  drpRating ;
	}
	
	@FindBy(xpath="//p-dropdown[@placeholder=\"Select Status\"]")
	WebElement drpStatus ;
	
	public WebElement selectStatus() {
		return  drpStatus ;
	}
	
	@FindBy(xpath="//p-dropdown[@placeholder=\"Select Country\"]")
	WebElement drpCountry ;
	
	public WebElement selectdrpCountry() {
		return  drpCountry ;
	}
	
	@FindBy(xpath="(//p-radiobutton[@name=\"selectedTriggerType\"])[2]")
	WebElement craetedAndEdited ;
	
	public WebElement createdAndEveryTimeEdited() {
		return  craetedAndEdited ;
	}
	
	@FindBy(xpath="(//p-radiobutton[@name=\"selectedTriggerType\"])[3]")
	WebElement craetedAndEditedCriteria ;
	
	public WebElement craetedAndEditedCriteria() {
		return  craetedAndEditedCriteria ;
	}
	
	@FindBy(xpath="(//span[text()='Cancel'])[2]")
	WebElement btncancel2 ;
	
	public WebElement clickCancel2() {
		return  btncancel2 ;
	}
	
	@FindBy(xpath="(//span[text()='Cancel'])[1]")
	WebElement btncancel ;
	
	public WebElement clickCancel() {
		return  btncancel ;
	}
	
	@FindBy(xpath="//th[text()=' Lead Name ']//ancestor::thead//following-sibling::tbody//tr[1]//td[3]")
	WebElement listedleadsInPreview ;
	
	public WebElement listedLeadsInPreview() {
		return  listedleadsInPreview ;
	}
	
	@FindBy(xpath="(//th[text()=' Name '])[2]//ancestor::thead//following-sibling::tbody//tr[1]//td[1]")
	WebElement listedSavesearch;
	
	public WebElement ClicklistedSavesearch() {
		return  listedSavesearch ;
	}
	
	@FindBy(xpath="//button[@label='Preview Data']")
	WebElement btnPreviewdata ;
	
	public WebElement clickPreviewdata() {
		return  btnPreviewdata ;
	}
	
	
	@FindBy(xpath="(//button[@label=\"Preview Data\"])[5]")
	WebElement btnPreviewdata2 ;
	
	public WebElement clickPreviewdata2() {
		return  btnPreviewdata2 ;
	}
	
	@FindBy(xpath="(//span[text()='Contacts'])[2]")
	WebElement btnContacts ;
	
	public WebElement clickContacts() {
		return  btnContacts ;
	}
	
	@FindBy(xpath="//label[text()='Time Based']//parent::*//p-radiobutton")
	WebElement btnTimeBased ;
	
	public WebElement clickTimeBased() {
		return  btnTimeBased ;
	}
	
	@FindBy(xpath="//span[text()='Associated Module Rule']")
	WebElement btnAssociatedModule ;
	
	public WebElement ClickAssociatedModule() {
		return  btnAssociatedModule ;
	}
	
	@FindBy(xpath="//p-dropdown[@placeholder=\"Associated with\"]")
	WebElement drpAssociatedModule ;
	
	public WebElement selectAssociatedModule() {
		return  drpAssociatedModule ;
	}
	
	@FindBy(xpath="//p-dropdown[@placeholder=\"Select Template\"]")
	WebElement drpSelectTemplate ;
	
	public WebElement SelectAssociatedTemplate() {
		return  drpSelectTemplate ;
	}
	
	@FindBy(xpath="//p-dropdown[@name=\"title\"]")
	WebElement drpTitle ;
	
	public WebElement SelectTitle() {
		return  drpTitle ;
	}
	
	@FindBy(xpath="//input[@formcontrolname=\"firstName\"]")
	WebElement txtFirstName  ;
	
	public WebElement setFirstName() {
		return  txtFirstName ;
	}
	
	@FindBy(xpath="//input[@formcontrolname=\"middleName\"]")
	WebElement txtMidleName   ;
	
	public WebElement setMidleName() {
		return  txtMidleName ;
	}
	
	@FindBy(xpath="//input[@formcontrolname=\"lastName\"]")
	WebElement txtlastname   ;
	
	public WebElement setLastName() {
		return  txtlastname ;
	}
	
	@FindBy(xpath="(//input[@type=\"email\"])[1]")
	WebElement txtWorkEmail   ;
	
	public WebElement setWorkEmail() {
		return  txtWorkEmail ;
	}
	
	@FindBy(xpath="(//input[@type=\"email\"])[2]")
	WebElement txtHomeEmail   ;
	
	public WebElement setHomeEmail() {
		return  txtHomeEmail ;
	}
	
	@FindBy(xpath="//label[text()=' Social Profile ']//parent::div//following-sibling::*//input")
	WebElement txtwitter   ;
	
	public WebElement setContactTwitter() {
		return  txtwitter ;
	}
	
	@FindBy(xpath="//p-dropdown[@placeholder=\"Select Field\"]")
	WebElement drpSelectField    ;
	
	public WebElement SelectField() {
		return  drpSelectField ;
	}
	
	@FindBy(xpath="//input[@placeholder=\"Enter New Value\"]")
	WebElement txtSetFieldValue    ;
	
	public WebElement SetFieldValue() {
		return  txtSetFieldValue ;
	}
	
	@FindBy(xpath="//p-dropdown[@placeholder=\"Select New Value\"]")
	WebElement drpselectSingleField    ;
	
	public WebElement selectSingleField() {
		return  drpselectSingleField ;
	}
	
	@FindBy(xpath="//p-multiselect[@placeholder=\"Select New Value\"]")
	WebElement drpselectMultipleField    ;
	
	public WebElement selectMultipleField() {
		return  drpselectMultipleField ;
	}
	
	@FindBy(xpath="//span[text()='Add Update Field']")
	WebElement HEADER    ;
	
	public WebElement UpdateHeader() {
		return  HEADER ;
	}
	
	@FindBy(xpath="//span[text()='Lead Details']//parent::span[@class=\"p-treenode-label\"]//preceding-sibling::button")
	WebElement treeLeadDetails    ;
	
	public WebElement drpLeadDetails() {
		return  treeLeadDetails ;
	}
	
	@FindBy(xpath="//span[text()='Address Details']//parent::span[@class=\"p-treenode-label\"]//preceding-sibling::button")
	WebElement treeAddress    ;
	
	public WebElement drpAddressDetails() {
		return  treeAddress ;
	}
	
	@FindBy(xpath="//span[text()='Lead Email ']//parent::span[@class=\"p-treenode-label\"]//preceding-sibling::button")
	WebElement treeLeadEmail    ;
	
	public WebElement drpLeadEmail() {
		return  treeLeadEmail ;
	}
	
	@FindBy(xpath="//span[text()='Lead Phone']//parent::span[@class=\"p-treenode-label\"]//preceding-sibling::button")
	WebElement treeLeadPhone    ;
	
	public WebElement drpLeadPhone() {
		return  treeLeadPhone ;
	}
	
	
	@FindBy(xpath="//span[text()='Lead Social']//parent::span[@class=\"p-treenode-label\"]//preceding-sibling::button")
	WebElement treeLeadSocial    ;
	
	public WebElement drpLeadSocial() {
		return  treeLeadSocial ;
	}
	
	@FindBy(xpath="//span[@ptooltip=\"Remove Condition\"]//i")
	WebElement btnDeleteRule    ;
	
	public WebElement DeleteRule() {
		return  btnDeleteRule ;
	}
	
	@FindBy(xpath="//div[@aria-label=\"Lead Details\" and @aria-expanded=\"false\"]//button")
	WebElement drprightLeadDetails   ;
	
	public WebElement RightLeadDetails() {
		return  drprightLeadDetails ;
	}
	
	@FindBy(xpath="//div[@aria-label=\"Lead Email \" and @aria-expanded=\"false\"]//button")
	WebElement drprightLeademail   ;
	
	public WebElement RightLeadEmail() {
		return  drprightLeademail ;
	}
	
	@FindBy(xpath="//div[@aria-label=\"Lead Phone\" and @aria-expanded=\"false\"]//button")
	WebElement drprightLeadPhone    ;
	
	public WebElement RightLeadPhone() {
		return  drprightLeadPhone ;
	}
	
	@FindBy(xpath="//div[@aria-label=\"Lead Social\" and @aria-expanded=\"false\"]//button")
	WebElement drprightLeadSocial   ;
	
	public WebElement RightLeadSocial() {
		return  drprightLeadSocial ;
	}
	
	@FindBy(xpath="//div[@aria-label=\"Address Details\" and @aria-expanded=\"false\"]//button")
	WebElement drprightLeadAddres   ;
	
	public WebElement RightAddresDetails() {
		return  drprightLeadAddres ;
	}

	@FindBy(xpath="(//input[@placeholder=\"Search Fields...\"])")
	WebElement btnSearch;

	public WebElement Search() {
		return btnSearch;
		}
	

	@FindBy(xpath = "//liono-treeselect[@placeholder=\"Select a field\"]")
	WebElement Filter;

	public WebElement Filter() {
		return Filter;	
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
	
	
	@FindBy(xpath = "//button//span[normalize-space(.)='Save']")
	WebElement saveRules;

	public WebElement save() {
		return saveRules;	
	}
	
	@FindBy(xpath = "//label[text()='Checklist']//following-sibling::span//i")
	WebElement addChecklists ;

	public WebElement AddChecklists() {
		return addChecklists;	
	}
	
	@FindBy(xpath = "(//label[text()='List Item']//following-sibling::input)[1]")
	WebElement check1 ;

	public WebElement check1() {
		return check1;	
	}
	
//===========================================================
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



