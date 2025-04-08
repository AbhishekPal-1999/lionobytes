package com.liono360.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WorkflowOpportunityPage {

	WebDriver ldriver;

	public WorkflowOpportunityPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//span[text()='Misc.']")
	WebElement Misc;

	public WebElement Misc() {
		return Misc;	
	
	}	
	
	
	@FindBy(xpath = "//span[text()='Workflow']")
	WebElement Workflow;

	public WebElement Workflow() {
		return Workflow;	
	
	}	
	
	@FindBy(xpath = "//span[text()='New']")
	WebElement New;

	public WebElement New() {
		return New;	
	
	}	
	
	@FindBy(xpath = "//input[@formcontrolname='name']")
	WebElement Name;

	public WebElement Name() {
		return Name;	
	
	}	
	
	
	@FindBy(xpath = "(//liono-treeselect[@placeholder='Select Users'])[1]")
	WebElement AccessPermission;

	public WebElement AccessPermission() {
		return AccessPermission;	
	
	}	
	
	
	@FindBy(xpath = "(//p-dropdown[@placeholder='Select Module'])[1]")
	WebElement Module;

	public WebElement Module() {
		return Module;	
	
	}	

	@FindBy(xpath = "(//p-dropdown[@placeholder='Select Channel'])[1]")
	WebElement Channel;

	public WebElement Channel() {
		return Channel;	
	
	}	
	
	@FindBy(xpath = "(//p-dropdown[@placeholder='Select Account Channel'])[1]")
	WebElement AccountChannel;

	public WebElement AccountChannel() {
		return AccountChannel;	
	
	}	

	@FindBy(xpath = "(//span[@class='p-radiobutton-icon'])[1]")
	WebElement WorkflowTypeEventBased;

	public WebElement WorkflowTypeEventBased() {
		return WorkflowTypeEventBased;	
	
	}	

	@FindBy(xpath = "(//p-radiobutton[@name='workflowType'])[2]")
	WebElement WorkflowTypeTimeBased;

	public WebElement WorkflowTypeTimeBased() {
		return WorkflowTypeTimeBased;		
	}	

	@FindBy(xpath = "(//p-radiobutton[@name='selectedTriggerType'])[1]")
	WebElement EvaluateCriteria;

	public WebElement EvaluateCriteria1() {
		return EvaluateCriteria;		
	}	
	@FindBy(xpath = "(//p-radiobutton[@name='selectedTriggerType'])[2]")
	WebElement EvaluateCriteria2;

	public WebElement EvaluateCriteria2() {
		return EvaluateCriteria2;	
	
	}	
	@FindBy(xpath = "(//p-radiobutton[@name='selectedTriggerType'])[3]")
	WebElement EvaluateCriteria3;

	public WebElement EvaluateCriteria3() {
		return EvaluateCriteria3;	
	
	}		
	@FindBy(xpath = "(//input[@placeholder='mm/dd/yyyy'])[1]")
	WebElement StartDate;

	public WebElement StartDate() {
		return StartDate;	
	
	}	
	@FindBy(xpath = "(//input[@placeholder='mm/dd/yyyy'])[2]")
	WebElement EndDate;

	public WebElement EndDate() {
		return EndDate;	
	
	}	
	@FindBy(xpath = "(//span[normalize-space()='Next'])[1]")
	WebElement Next;

	public WebElement Next() {
		return Next;	
	
	}	
	
	
	@FindBy(xpath = "//span[text()='Cancel']")
	WebElement Cancel;

	public WebElement Cancel() {
		return Cancel;	
	
	}	
	
	
	
	@FindBy(xpath = "(//span[normalize-space()='Manual Condtion'])[1]")
	WebElement ManuuelCondition;

	public WebElement ManuuelCondition() {
		return ManuuelCondition;		
	}	
	
	@FindBy(xpath = "(//i[@class='pi pi-plus'])[1]")
	WebElement Plus;
	public WebElement Plus() {
		return Plus;	
	}	
	
	@FindBy(xpath = "(//liono-treeselect[@placeholder='Select a field'])[1]")
	WebElement Filter;
	public WebElement Filter() {
		return Filter;	
	}	

	@FindBy(xpath = "(//p-dropdown[@placeholder='select'])[1]")
	WebElement Operator;

	public WebElement Operator() {
		return Operator;	
	
	}	

	@FindBy(xpath = "(//p-autocomplete[@id='parent'])[1]")
	WebElement Value;

	public WebElement Value() {
		return Value;	
	
	}	

	@FindBy(xpath = "//span[text()='Add Actions']")
	WebElement AddActions;

	public WebElement AddActions() {
		return AddActions;	
	
	}	
	
	
	@FindBy(xpath = "(//span[normalize-space()='Add Task'])[1]")
	WebElement AddTask;

	public WebElement AddTask() {
		return AddTask;	
	
	}	
	@FindBy(xpath = "(//span[normalize-space()='Update Field'])[1]")
	WebElement UpdateFiled;

	public WebElement UpdateFiled() {
		return UpdateFiled;	
	
	}	
	
	@FindBy(xpath = "(//span[normalize-space()='Add E-mail Alert'])[1]")
	WebElement AddEmailAlert;

	public WebElement AddEmailAlert() {
		return AddEmailAlert;	
	
	}	
	
	
	@FindBy(xpath = "//span[text()='Add Trigger Time']")
	WebElement AddTriggerTime;

	public WebElement AddTriggerTime() {
		return AddTriggerTime;	
	
	}	
	
	
	
	@FindBy(xpath = "(//input[@id='withoutgrouping'])[1]")
	WebElement InputBox;

	public WebElement InputBox1() {
		return InputBox;	
	
	}	
	@FindBy(xpath = "//p-dropdown[@formcontrolname='occurrenceBase']")
	WebElement InputBox2;

	public WebElement InputBox2() {
		return InputBox2;	
	
	}	
	
	@FindBy(xpath = "//p-dropdown[@formcontrolname='selectedAddOrSubstractBase']")
	WebElement InputBox3;

	public WebElement InputBox3() {
		return InputBox3;	
	
	}	
	@FindBy(xpath = "//p-dropdown[@formcontrolname='startDateBaseField']")
	WebElement InputBox4;

	public WebElement InputBox4() {
		return InputBox4;	
	
	}	
	
	
	@FindBy(xpath = "(//span[@class='p-button-label'][normalize-space()='Save'])[2]")
	WebElement Save2;

	public WebElement Save2() {
		return Save2;	
	
	}	
	
	@FindBy(xpath = "(//span[normalize-space()='Save'])[1]")
	WebElement Save;

	public WebElement Save() {
		return Save;	
	
	}	
	
	
	@FindBy(xpath = "(//div[contains(text(), 'WF-Jenifer')])[1]")
	WebElement Listedworkflow;

	public WebElement Listedworkflow() {
		return Listedworkflow;	
	
	}	
	
	@FindBy(xpath = "(//div[contains(text(), 'WF-Edited')])[1]")
	WebElement Editedworkflow;

	public WebElement Editedworkflow() {
		return Editedworkflow;	
	
	}	
	
	//..................................Add Task.......................................//
	
	@FindBy(xpath = "(//p-dropdown[@placeholder='Select Assing Type'])[1]")
	WebElement AssignType;

	public WebElement AssignType() {
		return AssignType;	
	
	}	
	
	//
	
	
	
	
	
	
	@FindBy(xpath = "(//p-multiselect[@placeholder='Select Users'])[1]")
	WebElement AssignTo;

	public WebElement AssignTo() {
		return AssignTo;	
	
	}	
	@FindBy(xpath = "(//p-dropdown[@placeholder='Select Task Category'])[1]")
	WebElement TaskCategory;

	public WebElement TaskCategory() {
		return TaskCategory;	
	
	}		
	@FindBy(xpath = "(//p-dropdown[@placeholder='Select Reminder Type'])[1]")
	WebElement ReminderType;

	public WebElement ReminderType() {
		return ReminderType;	
	}	
	
	
	@FindBy(xpath = "(//p-dropdown[@placeholder='Select Reminder'])[1]")
	WebElement Reminder;

	public WebElement Reminder() {
		return Reminder;	
	}	
	
	@FindBy(xpath = "(//p-dropdown[@placeholder='Select Repeat Type'])[1]")
	WebElement TaskRepeat;

	public WebElement TaskRepeat() {
		return TaskRepeat;	
	}	
	@FindBy(xpath = "(//p-dropdown[@placeholder='Select Priority'])[1]")
	WebElement Priority;

	public WebElement Priority() {
		return Priority;	
	
	}		
	@FindBy(xpath = "(//input[@placeholder='Enter Task End Days'])[1]")
	WebElement DueDays;

	public WebElement DueDays() {
		return DueDays;	
	
	}	
	@FindBy(xpath = "//textarea[@formcontrolname='description']")
	WebElement Description;

	public WebElement Description() {
		return Description;	
	
	}	
	
	
	@FindBy(xpath = "(//span[@class='btnBars p-ml-3 ng-star-inserted'])[1]")
	WebElement ChecklistPlus;

	public WebElement ChecklistPlus() {
		return ChecklistPlus;	
	
	}	
	
	
	@FindBy(xpath = "//label[text()='List Item']/following-sibling::input")
	WebElement ListItem;

	public WebElement ListItem() {
		return ListItem;	
	
	}	
	
	
	@FindBy(xpath = "(//span[@class='p-button-label'][normalize-space()='Save'])[3]")
	WebElement Save1;

	public WebElement Save1() {
		return Save1;	
	
	}	
	
	
	
	@FindBy(xpath = "(//span[@class='p-button-label'][normalize-space()='Save'])[2]")
	WebElement Save22;

	public WebElement Save22() {
		return Save22;	
	
	}	
	
	
	
	@FindBy(xpath = "(//span[normalize-space()='Save'])[1]")
	WebElement Save3;

	public WebElement Save3() {
		return Save3;	
	
	}	
	
	//...................................Add Email.............................................................//
	
	@FindBy(xpath = "(//p-dropdown[@placeholder='Select From User'])[1]")
	WebElement From;

	public WebElement From() {
		return From;	
	
	}	
	
	@FindBy(xpath = "(//p-dropdown[@placeholder='Select Assing Type'])[1]")
	WebElement AssignType2;

	public WebElement AssignType2() {
		return AssignType2;	
	
	}	
	
	@FindBy(xpath = "")
	WebElement SentTo;

	public WebElement SentTo() {
		return SentTo;	
	
	}	
	@FindBy(xpath = "(//p-dropdown[@placeholder='Select Template'])[1]")
	WebElement EmailTemplate;

	public WebElement EmailTemplate() {
		return EmailTemplate;	
	
	}	
	
	//...................................Update Filed..............................................//
	
	
	@FindBy(xpath = "(//p-dropdown[@placeholder='Select Field'])[1]")
	WebElement FiledToUpdate;

	public WebElement FiledToUpdate() {
		return FiledToUpdate;		
	}
	
	@FindBy(xpath = "//input[@placeholder='Enter New Value']")
	WebElement NewFiledValue;

	public WebElement NewFiledValue() {
		return NewFiledValue;		
	}
	
	
	
	
	
	
	@FindBy(xpath = "//input[@placeholder='Enter New Value']")
	WebElement EnterValue;

	public WebElement EnterValue() {
		return EnterValue;		
	}

	//(//p-dropdown[@placeholder='Select New Value'])[1]
	///.........................................View,Edit & Delete Workflow.......................................................//
	
	
	
	@FindBy(xpath = "(//tbody)[1]")
	WebElement ClickOnWorkflow;

	public WebElement ClickOnWorkflow() {
		return ClickOnWorkflow;		
	}

	
	@FindBy(xpath = "(//div[@class='btnBars'])[2]")
	WebElement HumbergIcon;

	public WebElement HumbergIcon() {
	return HumbergIcon;	
		
	}	
		
	@FindBy(xpath = "(//span[text()='View'])[2]")
	WebElement ViewBtn1;

	public WebElement ViewBtn1() {
	return ViewBtn1;		
		
	}
	@FindBy(xpath = "(//span[text()='Edit'])[2]")
	WebElement Edit;

	public WebElement Edit() {
	return Edit;
	
	}
	
	@FindBy(xpath = "(//span[text()='Delete'])[2]")
	WebElement Delete;

	public WebElement Delete() {
	return Delete;
	
	}
	@FindBy(xpath = "(//h5[normalize-space()='Workflow Details'])[1]")
	WebElement ViewWorkflow;

	public WebElement ViewWorkflow() {
	return ViewWorkflow;
	
	}
	
}
