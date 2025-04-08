package com.liono360.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StreamPage {

	WebDriver ldriver;

	public StreamPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "//span[text()='Stream']")
	WebElement Stream;

	public WebElement Stream() {
		return Stream;
	}
	
	@FindBy(xpath = "(//p-dropdown[@id='recentItems'])[1]")
	WebElement DropdownOption;

	public WebElement DropdownOption() {
		return DropdownOption;
	}
	
	
	
	
	@FindBy(xpath = "//span[text()='New']")
	WebElement New;

	public WebElement New() {
		return New;
	}
	
	
	
	@FindBy(xpath = "//span[text()='Cancel']")
	WebElement Cancel;

	public WebElement Cancel() {
		return Cancel;
	}
	
	
	
	@FindBy(xpath = "//span[text()='Message']")
	WebElement Message;

	public WebElement Message() {
		return Message;
	}
	

	@FindBy(xpath = "//span[text()='Event']")
	WebElement Event;

	public WebElement Event() {
		return Event;
	}
	
	@FindBy(xpath = "//span[text()='Appreciation']")
	WebElement Appreciation;

	public WebElement Appreciation() {
		return Appreciation;
	}
	@FindBy(xpath = "(//span[text()='Announcement'])[1]")
	WebElement Announcement;

	public WebElement Announcement() {
		return Announcement;
	}
	
	//............................Message...........................//
	
	
	@FindBy(xpath = "//input[@placeholder='Enter Title']")
	WebElement ClickTitle;

	public WebElement ClickTitle() {
		return ClickTitle;
	}
	
	
	@FindBy(xpath = "//div[@class='ql-editor ql-blank']")
	WebElement TypeMessage;

	public WebElement TypeMessage() {
		return TypeMessage;
	}
	
	@FindBy(xpath = "//p-multiselect[@placeholder=\"Select User\"]")
	WebElement SelectUser;

	public WebElement SelectUser() {
		return SelectUser;
	}
	
	
	@FindBy(xpath = "//span[text()='Post']")
	WebElement Post;

	public WebElement Post() {
		return Post;
	}
	
	@FindBy(xpath = "//span[contains(text(), 'Post')]")
	WebElement Post1;

	public WebElement Post1() {
		return Post1;
	}
	
	
	@FindBy(xpath = "(//span[normalize-space()='Post'])[1]")
	WebElement PostApp;

	public WebElement PostApp() {
		return PostApp;
	}
	
	
	@FindBy(xpath = "(//button[normalize-space()='Like'])[1]")
	WebElement Like;

	public WebElement Like() {
		return Like;
	}
	
	
	@FindBy(xpath = "(//button[normalize-space()='Comment'])[1]")
	WebElement Comment;

	public WebElement Comment() {
		return Comment;
	}
	
	
	@FindBy(xpath = "//div[@data-placeholder='Add a comment']")
	WebElement AddComment;

	public WebElement AddComment() {
		return AddComment;
	}
	
	
	
	
	//...........................Event.......................................//
	
	
	
	
	@FindBy(xpath = "//input[@id='eventTitle']")
	WebElement EventTitle;

	public WebElement EventTitle() {
		return EventTitle;
	}
	
	
	@FindBy(xpath = "//input[@placeholder='Enter Title']")
	WebElement EventTitle2;

	public WebElement EventTitle2() {
		return EventTitle2;
	}
	
	
	
	@FindBy(xpath = "(//p-calendar[@hourformat='12'])[1]")
	WebElement StartDate;

	public WebElement StartDate() {
		return StartDate;
	}
	
	@FindBy(xpath = "(//p-calendar[@hourformat='12'])[2]")
	WebElement EndDate;

	public WebElement EndDate() {
		return EndDate;
	}
	
	
	@FindBy(xpath = "//div[@class='p-checkbox-box']")
	WebElement AllDay;

	public WebElement AllDay() {
		return AllDay;
	}
	
	
	
	@FindBy(xpath = "//span[text()='Never']")
	WebElement Repeat;

	public WebElement Repeat() {
		return Repeat;
	}
	
	
	@FindBy(xpath = "//span[text()='30 minutes']")
	WebElement Reminder;

	public WebElement Reminder() {
		return Reminder;
	}
	
	@FindBy(xpath = "(//input[contains(@class,'p-inputtext p-component p-element ')])[3]")
	WebElement Location;

	public WebElement Location() {
		return Location;
	}
	
	
	@FindBy(xpath = "(//h5[normalize-space()='Create New Event'])[1]")
	WebElement CreateNewEvent;

	public WebElement CreateNewEvent() {
		return CreateNewEvent;
	}
	
	
	
	@FindBy(xpath = "//div[@class='ql-editor ql-blank']")
	WebElement Description;

	public WebElement Description() {
		return Description;
	}
	
	@FindBy(xpath="//div[@class='ql-editor']")
	WebElement txtDescriptionOnEdit;
	
	public WebElement setDescriptionOnEdit() {
		return txtDescriptionOnEdit;
	}
	
	@FindBy(xpath = "//p-multiselect[@placeholder='Select User']")
	WebElement ShareWith;

	public WebElement ShareWith() {
		return ShareWith;
	}
	
	
	@FindBy(xpath = "//span[text()='Save']")
	WebElement Save;

	public WebElement Save() {
		return Save;
	}
	
	@FindBy(xpath = "(//p-checkbox[@value='Week Days'])[1]")
	WebElement Monday;

	public WebElement Monday() {
		return Monday;
	}
	@FindBy(xpath = "(//p-checkbox[@value='Week Days'])[2]")
	WebElement Tuesday;

	public WebElement Tuesday() {
		return Tuesday;
	}
	
	//...............Appreciation....................................//
	
	
	
	
	@FindBy(xpath = "//input[@placeholder='Enter Title']")
	WebElement AppTitle;

	public WebElement AppTitle() {
		return AppTitle;
	}
	
	
	@FindBy(xpath = "//p-dropdown[@id='appreciationList']")
	WebElement AppList;

	public WebElement AppList() {
		return AppList;
	}
	
	
	@FindBy(xpath = "//span[contains(text(), 'Create New Appreciation')]")
	WebElement CreateNewAppreciation;

	public WebElement CreateNewAppreciation() {
		return CreateNewAppreciation;
	}
	
	@FindBy(xpath = "//div[@class='ql-editor ql-blank']")
	WebElement AppDesc;

	public WebElement AppDesc() {
		return AppDesc;
	}
	
	
	@FindBy(xpath = "(//div[text()='Select User'])[1]")
	WebElement AppSharewith;

	public WebElement AppSharewith() {
		return AppSharewith;
	}
	
	
	@FindBy(xpath = "(//p-multiselect[@name='appreciateTolist'])/div")
	WebElement AppTo;

	public WebElement AppTo() {
		return AppTo;
	}
	
	
	//.........................Announcement..........................//
	
	
	
	@FindBy(xpath = "//input[@placeholder='Enter Title']")
	WebElement AnnouncementTitle;

	public WebElement AnnouncementTitle() {
		return AnnouncementTitle;
	}
	
	@FindBy(xpath = "//div[@class='ql-editor ql-blank']")
	WebElement AnnouncementDesc;

	public WebElement AnnouncementDesc() {
		return AnnouncementDesc;
	}
	
	
	
	@FindBy(xpath = "//div[text()='Select User']")
	WebElement SelectUserAnno;

	public WebElement SelectUserAnno() {
		return SelectUserAnno;
	}
	
	//..................Favorite,read ,pin, edit ,delete..............//
	
	@FindBy(xpath = "(//i[@title='Add to Favourites'])[1]")
	WebElement StarFavourite;

	public WebElement StarFavourite() {
		return StarFavourite;
	}
	
	
	@FindBy(xpath = "(//i[@title='I have read this'])[1]")
	WebElement Read;

	public WebElement Read() {
		return Read;
	}
	
	
	@FindBy(xpath = "(//i[@class='fa fa-1x fa-thumb-tack ng-star-inserted'])[1]")
	WebElement Pin;

	public WebElement Pin() {
		return Pin;
	}
	
	@FindBy(xpath = "(//i[@class='fa fa-ellipsis-v'])[1]")
	WebElement Line;

	public WebElement Line() {
		return Line;
	}
	
	@FindBy(xpath = "//span[text()='Edit']")
	WebElement Edit;

	public WebElement Edit() {
		return Edit;
	}
	
	@FindBy(xpath = "//span[text()='Delete']")
	WebElement Delete;

	public WebElement Delete() {
		return Delete;
	}
	
	
//..........................................................//	
	
	@FindBy(xpath = "//span[text()='Yes']")
	WebElement Yes;

	public WebElement Yes() {
		return Yes;
	}
		
	@FindBy(xpath = "//p-dropdown[@id='recentItems']")
	WebElement ChannelAll;

	public WebElement ChannelAll() {
		return ChannelAll;
	}
	
	
}
