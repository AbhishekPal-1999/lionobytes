package com.liono360.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountActionColumnPage {

	WebDriver ldriver;

	public AccountActionColumnPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//span[contains(text(),'Accounts')]")
	WebElement btnAccount;

	public WebElement Accounts() {
		return btnAccount;
	}
	
	
	@FindBy(xpath = "(//span[@ptooltip='Documents'])[1]")
	WebElement Documentsicon;

	public WebElement Documentsicon() {
		return Documentsicon;
	}
	

	@FindBy(xpath = "(//span[normalize-space()='Upload'])[1]")
	WebElement Uploaddocuments;

	public WebElement Uploaddocuments() {
		return Uploaddocuments;
	}
	
	
	@FindBy(xpath = "//div[text()='Document is successfully uploaded!!']")
	WebElement Verifyuploaddocuments;

	public WebElement Verifyuploaddocuments() {
		return Verifyuploaddocuments;
	}
	
	
	
	
//....................................Activity Icon................................................................//
	
	@FindBy(xpath = "(//span[@ptooltip='Activity'])[1]")
	WebElement Activityicon;

	public WebElement Activityicon() {
		return Activityicon;
	}
	
	@FindBy(xpath = "(//i[@class='pi pi-plus'])[1]")
	WebElement Plusicon;

	public WebElement Plusicon() {
		return Plusicon;
	}
		
	@FindBy(xpath = "(//p-dropdown[@id='logType'])[1]")
	WebElement SelectType;

	public WebElement SelectType() {
		return SelectType;
	}
	
	@FindBy(xpath = "(//textarea[@id='comment'])[1]")
	WebElement Comments;

	public WebElement Comments() {
		return Comments;
	}
	

	@FindBy(xpath = "(//span[normalize-space()='Save'])[1]")
	WebElement Save;

	public WebElement Save() {
		return Save;
	}

	@FindBy(xpath = "(//div[@class='p-card-content'])[1]")
	WebElement Clickonlog;

	public WebElement Clickonlog() {
		return Clickonlog;
	}
	
	
	@FindBy(xpath = "(//textarea[@name='description'])[1]")
	WebElement Comments2;

	public WebElement Comments2() {
		return Comments2;
	}
	
	@FindBy(xpath = "(//span[normalize-space()='Save'])[1]")
	WebElement Save2;

	public WebElement Save2() {
		return Save2;
	}
	
	//............................Add Email..................................................................//
	
	
	@FindBy(xpath = "(//span[normalize-space()='Emails'])[1]")
	WebElement Emailtab;

	public WebElement Emailtab() {
		return Emailtab;
	}
	
	@FindBy(xpath = "(//i[@class='pi pi-plus'])[1]")
	WebElement Plusiconemail;

	public WebElement Plusiconemail() {
		return Plusiconemail;
	}
	
	
	
	@FindBy(xpath = "(//input[@name='toRecipients'])[1]")
	WebElement To;

	public WebElement To() {
		return To;
	}
	
	@FindBy(xpath = "(//span[@aria-label='Select Template'])[1]")
	WebElement Emailtemplate;

	public WebElement Emailtemplate() {
		return Emailtemplate;
	}
	
	@FindBy(xpath = "(//label[normalize-space()='From'])[1]")
	WebElement Outsideclick;

	public WebElement Outsideclick() {
		return Outsideclick;
	}
	
	
	
	
	
	
	@FindBy(xpath = "(//span[normalize-space()='Send'])[1]")
	WebElement Send;

	public WebElement Send() {
		return Send;
	}
	
	
	//........................................Add Task..............................................................//
	
	
	@FindBy(xpath = "(//span[normalize-space()='Tasks'])[1]")
	WebElement Tasktab;

	public WebElement Tasktab() {
		return Tasktab;
	}
	
	@FindBy(xpath = "//div[@ptooltip='Add Task']")
	WebElement Addtaskplus;

	public WebElement Addtaskplus() {
		return Addtaskplus;
	}
	
	@FindBy(xpath = "(//span[@class='p-inputswitch-slider'])[1]")
	WebElement Slider;

	public WebElement Slider() {
		return Slider;
	}
	
	@FindBy(xpath = "(//span[normalize-space()='Yes'])[1]")
	WebElement Yes;

	public WebElement Yes() {
		return Yes;
	}
	
	
	
	
	@FindBy(xpath = "//p-dropdown[@formcontrolname='taskCategoryId']")
	WebElement Taskcategory;

	public WebElement Taskcategory() {
		return Taskcategory;
	}
	
	
	
	@FindBy(xpath = "(//strong[@class='association-name'])[1]")
	WebElement SelectUser;

	public WebElement SelectUser() {
		return SelectUser;
	}
	
	
	
	@FindBy(xpath = "(//tbody)[3]//tr[1]")
	WebElement User1;

	public WebElement User1() {
		return User1;
	}
	
	@FindBy(xpath = "(//tbody)[3]//tr[2]")
	WebElement User2;

	public WebElement User2() {
		return User2;
	}
	
	@FindBy(xpath = "(//span[@class='p-button-label'][normalize-space()='Save'])[2]")
	WebElement Saveuser;

	public WebElement Saveuser() {
		return Saveuser;
	}
	
	
	
	@FindBy(xpath = "(//p-multiselect[@placeholder='Select Users'])[1]")
	WebElement SharedTaskWith;

	public WebElement SharedTaskWith() {
		return SharedTaskWith;
	}
	
	@FindBy(xpath = "(//input[@formcontrolname='taskTitle'])[1]")
	WebElement TaskTitle;

	public WebElement TaskTitle() {
		return TaskTitle;
	}
	
	@FindBy(xpath = "(//div[@class='ql-editor ql-blank'])[1]")
	WebElement Taskdetails;

	public WebElement Taskdetails() {
		return Taskdetails;
	}
	
	
	
	
	
	@FindBy(xpath = "(//span[normalize-space()='Save'])[1]")
	WebElement tasksave;

	public WebElement tasksave() {
		return tasksave;
	}
	
//..................................Event..............................................................//
	
	
	
	@FindBy(xpath = "(//span[normalize-space()='Event'])[1]")
	WebElement EventTab;

	public WebElement EventTab() {
		return EventTab;
	}
	
	@FindBy(xpath = "(//span[@ptooltip='Create New Event'])[1]")
	WebElement Pluseventadd;

	public WebElement Pluseventadd() {
		return Pluseventadd;
	}
	
	
	@FindBy(xpath = "(//input[@id='eventTitle'])[1]")
	WebElement Title;

	public WebElement Title() {
		return Title;
	}
	
	@FindBy(xpath = "(//input[@placeholder='Add required attendees'])[1]")
	WebElement Required;

	public WebElement Required() {
		return Required;
	}
	
	@FindBy(xpath = "(//span[normalize-space()='Optional'])[1]")
	WebElement clickonOptional;

	public WebElement clickonOptional() {
		return clickonOptional;
	}
	
	@FindBy(xpath = "(//input[@placeholder='Add optional attendees'])[1]")
	WebElement Optional;

	public WebElement Optional() {
		return Optional;
	}
	
	@FindBy(xpath = "(//img[@alt='Teams'])[1]")
	WebElement teamsicon;

	public WebElement teamsicon() {
		return teamsicon;
	}
	
	@FindBy(xpath = "//div[@data-placeholder='Add your message...']")
	WebElement Description;

	public WebElement Description() {
		return Description;
	}
	
	@FindBy(xpath = "(//span[normalize-space()='Save'])[1]")
	WebElement saveevent;

	public WebElement saveevent() {
		return saveevent;
	}
	
	//.................................Add Task..................................................................//
	
	
	
	@FindBy(xpath = "(//span[@ptooltip='Tasks'])[1]//i[1]")
	WebElement Taskicon;

	public WebElement Taskicon() {
		return Taskicon;
	}
	
	
	@FindBy(xpath = "//div[@ptooltip='Add Task']")
	WebElement Plusaddtask;

	public WebElement Plusaddtask() {
		return Plusaddtask;
	}
	
	
	@FindBy(xpath = "(//div[@class='p-radiobutton-box'])[1]")
	WebElement Multipletask;

	public WebElement Multipletask() {
		return Multipletask;
	}
	


	@FindBy(xpath = "//p-button[@ptooltip='Add Task']")
	WebElement Plusmultipletask;

	public WebElement Plusmultipletask() {
		return Plusmultipletask;
	}
	
	
	
	
	@FindBy(xpath = "(//strong[@class='association-name'])[1]")
	WebElement SelectUserM1;

	public WebElement SelectUserM1() {
		return SelectUserM1;
	}
	
	
	@FindBy(xpath = "(//span[text()='Save'])[2]")
	WebElement Usersave;

	public WebElement Usersave() {
		return Usersave;
	}
	
	
	
	
	@FindBy(xpath = "(//div[@class='ql-editor ql-blank'])[1]")
	WebElement Descriptionum1;

	public WebElement Descriptionum1() {
		return Descriptionum1;
	}
	
	
	
	
	@FindBy(xpath = "//i[@tooltipposition='right']")
	WebElement SelectUserM2;

	public WebElement SelectUserM2() {
		return SelectUserM2;
	}

	@FindBy(xpath = "(//span[@class='p-button-label'][normalize-space()='Save'])[2]")
	WebElement SaveTaskM1;

	public WebElement SaveTaskM1() {
		return SaveTaskM1;
	}
	
	
	@FindBy(xpath = "(//span[normalize-space()='Save'])[1]")
	WebElement Saveall;

	public WebElement Saveall() {
		return Saveall;
	}
	
	
	//.............................Add Reminder..........................................//
	
	
	

	@FindBy(xpath = "(//span[@ptooltip='Set a reminder'])[1]")
	WebElement Remindericon;

	public WebElement Remindericon() {
		return Remindericon;
	}
	
	
	@FindBy(xpath = "(//span[normalize-space()='New Reminder'])[1]")
	WebElement NewReminder;

	public WebElement NewReminder() {
		return NewReminder;
	}
	
	
	@FindBy(xpath = "//p-calendar[@formcontrolname='date']")
	WebElement drpClosedate;

	public WebElement selectClosedate() {
		return drpClosedate;
	}
	
	
	@FindBy(xpath = "(//p-dropdown[@placeholder='Hour'])[1]")
	WebElement Hour;

	public WebElement Hour() {
		return Hour;
	}
	
	
	
	@FindBy(xpath = "(//div[@aria-label='dropdown trigger'])[4]//chevrondownicon")
	WebElement Minutes;

	public WebElement Minutes() {
		return Minutes;
	}
	
	
	
	
	@FindBy(xpath = "(//p-dropdown[@placeholder='Select Period'])[1]")
	WebElement Meridiem;

	public WebElement Meridiem() {
		return Meridiem;
	}
	
	
	
	
	@FindBy(xpath = "(//textarea[@placeholder='Reminder message (optional)'])[1]")
	WebElement Reminderdescription;

	public WebElement Reminderdescription() {
		return Reminderdescription;
	}
	
	
	

	@FindBy(xpath = "(//span[normalize-space()='Save'])[1]")
	WebElement Savereminder;

	public WebElement Savereminder() {
		return Savereminder;
	}
	
	
	
	@FindBy(xpath = "//div[text()='Reminder created successfully!']")
	WebElement VerifyReminder;

	public WebElement VerifyReminder() {
		return VerifyReminder;
	}
	
	
}
